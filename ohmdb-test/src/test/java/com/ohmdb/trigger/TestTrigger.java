package com.ohmdb.trigger;

/*
 * #%L
 * ohmdb-test
 * %%
 * Copyright (C) 2013 - 2014 Nikolche Mihajlovski
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.ohmdb.api.Trigger;
import com.ohmdb.api.TriggerAction;

public class TestTrigger<E> implements Trigger<E> {

	private int n;

	@Override
	public void process(TriggerAction action, long id, E oldEntity, E newEntity) {
		System.out.println("TRIGGER " + action + " #" + id + " " + oldEntity + " => " + newEntity);
		n++;
	}

	public int counter() {
		return n;
	}

}
