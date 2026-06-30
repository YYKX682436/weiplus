package dx1;

/* loaded from: classes4.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public static void b(dx1.f fVar, java.lang.String sessionId, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            z18 = true;
        }
        fVar.getClass();
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        fVar.c((dx1.c) dx1.g.f244490b.get(sessionId), z17, z18);
    }

    public static int n(dx1.f fVar, java.lang.String sessionId, java.lang.String key, java.lang.String valueKey, java.lang.Object value, bx1.u opeartionState, boolean z17, java.lang.String tdName, java.lang.String divider, int i17, java.lang.Object obj) {
        org.json.JSONObject optJSONObject;
        if ((i17 & 16) != 0) {
            opeartionState = bx1.u.f36309d;
        }
        if ((i17 & 32) != 0) {
            z17 = false;
        }
        if ((i17 & 64) != 0) {
            tdName = "td";
        }
        if ((i17 & 128) != 0) {
            divider = "#";
        }
        fVar.getClass();
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(valueKey, "valueKey");
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(opeartionState, "opeartionState");
        kotlin.jvm.internal.o.g(tdName, "tdName");
        kotlin.jvm.internal.o.g(divider, "divider");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = fVar.e(sessionId).f244478b;
        if (concurrentHashMap.get(key) == null) {
            concurrentHashMap.put(key, new org.json.JSONArray());
        }
        java.lang.Object obj2 = concurrentHashMap.get(key);
        if (obj2 == null) {
            return 0;
        }
        org.json.JSONArray jSONArray = obj2 instanceof org.json.JSONArray ? (org.json.JSONArray) obj2 : null;
        if (jSONArray == null) {
            return 0;
        }
        if (z17) {
            optJSONObject = new org.json.JSONObject();
            jSONArray.put(optJSONObject);
            optJSONObject.put(tdName, jSONArray.length());
        } else {
            optJSONObject = jSONArray.optJSONObject(jSONArray.length() - 1);
        }
        if (optJSONObject != null) {
            if (opeartionState == bx1.u.f36310e) {
                dx1.f fVar2 = dx1.g.f244489a;
                java.lang.Object opt = optJSONObject.opt(valueKey);
                if (opt == null) {
                    opt = 0;
                }
                if (fVar2.f(opt) && fVar2.f(value)) {
                    java.lang.Object opt2 = optJSONObject.opt(valueKey);
                    if (opt2 == null) {
                        opt2 = 0;
                    }
                    optJSONObject.put(valueKey, fVar2.r(opt2) + fVar2.r(value));
                } else if (value instanceof java.lang.String) {
                    if (optJSONObject.opt(valueKey) instanceof java.lang.String) {
                        optJSONObject.put(valueKey, optJSONObject.opt(valueKey) + divider + value);
                    } else {
                        optJSONObject.put(valueKey, java.lang.String.valueOf(value));
                    }
                }
            } else {
                optJSONObject.put(valueKey, value);
            }
        }
        return jSONArray.length();
    }

    public final void a(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = dx1.g.f244491c;
        if (concurrentHashMap.containsKey(sessionId)) {
            concurrentHashMap.remove(sessionId);
        }
    }

    public final void c(dx1.c cVar, boolean z17, boolean z18) {
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StaticKvStat", "commit  session is null ");
            return;
        }
        if (!z17 && cVar.f244479c.size() != 0) {
            int i17 = cVar.f244480d + 1;
            cVar.f244480d = i17;
            if (i17 > 20) {
                c(cVar, true, z18);
                return;
            } else {
                ((ku5.t0) ku5.t0.f312615d).k(new dx1.d(cVar, z17, z18), 100L);
                return;
            }
        }
        if (cVar.f244477a != null) {
            try {
                for (java.util.Map.Entry entry : cVar.f244478b.entrySet()) {
                    jx3.a aVar = cVar.f244477a;
                    kotlin.jvm.internal.o.d(aVar);
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.lang.Object value = entry.getValue();
                    aVar.j(str, value instanceof dx1.a ? r26.i0.v(entry.getValue().toString(), ",", "#", false, 4, null) : value instanceof java.lang.String ? r26.i0.v(entry.getValue().toString(), ",", "#", false, 4, null) : value instanceof org.json.JSONArray ? r26.i0.v(entry.getValue().toString(), ",", ";", false, 4, null) : entry.getValue());
                }
                for (java.util.Map.Entry entry2 : cVar.f244481e.entrySet()) {
                    jx3.a aVar2 = cVar.f244477a;
                    kotlin.jvm.internal.o.d(aVar2);
                    java.lang.String str2 = (java.lang.String) entry2.getKey();
                    java.lang.String jSONArray = ((org.json.JSONArray) entry2.getValue()).toString();
                    kotlin.jvm.internal.o.f(jSONArray, "toString(...)");
                    aVar2.j(str2, r26.i0.t(jSONArray, ",", ";", false));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StaticKvStat", e17, " writeValue  error", new java.lang.Object[0]);
            }
            jx3.a aVar3 = cVar.f244477a;
            kotlin.jvm.internal.o.d(aVar3);
            aVar3.k();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = cVar.f244479c;
        if (concurrentHashMap.size() > 0) {
            for (java.util.Map.Entry entry3 : concurrentHashMap.entrySet()) {
                if (((wu5.c) entry3.getValue()).isDone()) {
                    ((wu5.c) entry3.getValue()).cancel(true);
                }
            }
        }
        for (java.util.Map.Entry entry4 : dx1.g.f244490b.entrySet()) {
            if (kotlin.jvm.internal.o.b(entry4.getValue(), cVar)) {
                dx1.g.f244490b.remove(entry4.getKey());
                return;
            }
        }
    }

    public final java.lang.Object d(java.lang.String sessionId, java.lang.String key) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(key, "key");
        return e(sessionId).f244478b.get(key);
    }

    public final dx1.c e(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        java.util.concurrent.locks.ReentrantLock reentrantLock = dx1.g.f244492d;
        reentrantLock.lock();
        dx1.c cVar = (dx1.c) dx1.g.f244490b.get(sessionId);
        if (cVar == null) {
            cVar = (dx1.c) dx1.g.f244491c.get(sessionId);
        }
        if (cVar == null) {
            cVar = new dx1.c();
            dx1.g.f244491c.put(sessionId, cVar);
        }
        reentrantLock.unlock();
        return cVar;
    }

    public final boolean f(java.lang.Object obj) {
        return (obj instanceof java.lang.Long) || (obj instanceof java.lang.Integer);
    }

    public final void g(java.lang.String sessionId, java.lang.String clazz) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = dx1.g.f244491c;
        dx1.c cVar = concurrentHashMap.containsKey(sessionId) ? (dx1.c) concurrentHashMap.get(sessionId) : new dx1.c();
        if (concurrentHashMap.containsKey(sessionId)) {
            concurrentHashMap.remove(sessionId);
        }
        java.lang.Object newInstance = java.lang.Class.forName(clazz).newInstance();
        if (!(newInstance instanceof jx3.a)) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return;
        }
        kotlin.jvm.internal.o.d(cVar);
        cVar.f244477a = (jx3.a) newInstance;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = dx1.g.f244490b;
        if (concurrentHashMap2.containsKey(sessionId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StaticKvStat", "sessionid " + sessionId + " is duplicate, should remove it");
            concurrentHashMap2.remove(sessionId);
        }
        concurrentHashMap2.put(sessionId, cVar);
    }

    public final void h(dx1.c session, java.lang.String key, java.lang.Object value, bx1.u opeartionState, java.lang.String separator) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(opeartionState, "opeartionState");
        kotlin.jvm.internal.o.g(separator, "separator");
        int ordinal = opeartionState.ordinal();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = session.f244478b;
        if (ordinal == 0) {
            concurrentHashMap.put(key, value);
            return;
        }
        if (ordinal == 1) {
            java.lang.Object obj = concurrentHashMap.get(key);
            if (obj == null) {
                concurrentHashMap.put(key, value);
                return;
            }
            if (f(obj) && f(value)) {
                value = java.lang.Long.valueOf(r(obj) + r(value));
            } else if ((obj instanceof java.lang.String) && (value instanceof java.lang.String)) {
                value = obj + separator + value;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.StaticKvStat", "report sessionid: key:" + key + " value:" + value + " is not long value,append failed");
            }
            concurrentHashMap.put(key, value);
            return;
        }
        if (ordinal == 2) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = session.f244481e;
            org.json.JSONArray jSONArray = (org.json.JSONArray) concurrentHashMap2.get(key);
            if (jSONArray == null) {
                jSONArray = new org.json.JSONArray();
                concurrentHashMap2.put(key, jSONArray);
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("aid", value);
            jSONObject.put("td", jSONArray.length() + 1);
            jSONArray.put(jSONObject);
            return;
        }
        if (ordinal != 3) {
            if (ordinal != 4) {
                return;
            }
            if (concurrentHashMap.get(key) == null) {
                concurrentHashMap.put(key, new java.util.HashMap());
            }
            java.lang.Object obj2 = concurrentHashMap.get(key);
            if (obj2 instanceof java.util.HashMap) {
                java.util.HashMap hashMap = (java.util.HashMap) obj2;
                java.lang.Integer num = (java.lang.Integer) hashMap.get(value);
                hashMap.put(value, java.lang.Integer.valueOf(num != null ? java.lang.Integer.valueOf(num.intValue() + 1).intValue() : 1));
                return;
            }
            return;
        }
        java.lang.Object obj3 = concurrentHashMap.get(key);
        if (obj3 == null) {
            concurrentHashMap.put(key, value);
            return;
        }
        if (f(obj3) && f(value)) {
            value = java.lang.Long.valueOf(r(value) - r(obj3));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.StaticKvStat", "report sessionid: key:" + key + " value:" + value + " is not long value,elapse failed");
        }
        concurrentHashMap.put(key, value);
    }

    public final void i(java.lang.String sessionId, java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        k(sessionId, key, value, bx1.u.f36309d, "#");
    }

    public final void j(java.lang.String sessionId, java.lang.String key, java.lang.Object value, bx1.u opeartionState) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(opeartionState, "opeartionState");
        k(sessionId, key, value, opeartionState, "#");
    }

    public final void k(java.lang.String sessionId, java.lang.String key, java.lang.Object value, bx1.u opeartionState, java.lang.String separator) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(opeartionState, "opeartionState");
        kotlin.jvm.internal.o.g(separator, "separator");
        h(e(sessionId), key, value, opeartionState, separator);
    }

    public final void l(java.lang.String sessionId, java.lang.String key, java.lang.Object valueKey, java.lang.Object value, bx1.u opeartionState) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(valueKey, "valueKey");
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(opeartionState, "opeartionState");
        m(sessionId, key, valueKey, value, opeartionState, ";");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(java.lang.String sessionId, java.lang.String key, java.lang.Object valueKey, java.lang.Object value, bx1.u opeartionState, java.lang.String separator) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(valueKey, "valueKey");
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(opeartionState, "opeartionState");
        kotlin.jvm.internal.o.g(separator, "separator");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = e(sessionId).f244478b;
        if (concurrentHashMap.get(key) == null) {
            concurrentHashMap.put(key, new dx1.a(separator));
        }
        java.lang.Object obj = concurrentHashMap.get(key);
        if (obj instanceof dx1.a) {
            dx1.a aVar = (dx1.a) obj;
            if (!aVar.containsKey(valueKey)) {
                aVar.put(valueKey, value);
                return;
            }
            if (bx1.u.f36314i == opeartionState) {
                aVar.put(valueKey, value);
                return;
            }
            if (bx1.u.f36310e == opeartionState) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                V v17 = aVar.get(valueKey);
                sb6.append(v17 instanceof java.lang.String ? (java.lang.String) v17 : null);
                sb6.append(separator);
                sb6.append(value);
                aVar.put(valueKey, sb6.toString());
            }
        }
    }

    public final void o(java.lang.String sessionKey, java.lang.String sessionId, java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.o.g(sessionKey, "sessionKey");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        p(sessionKey, sessionId, key, value, bx1.u.f36309d, "#");
    }

    public final void p(java.lang.String sessionKey, java.lang.String sessionId, java.lang.String key, java.lang.Object value, bx1.u opeartionState, java.lang.String separator) {
        kotlin.jvm.internal.o.g(sessionKey, "sessionKey");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(opeartionState, "opeartionState");
        kotlin.jvm.internal.o.g(separator, "separator");
        java.util.concurrent.locks.ReentrantLock reentrantLock = dx1.g.f244493e;
        reentrantLock.lock();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = dx1.g.f244494f;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(sessionKey);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
            concurrentHashMap.put(sessionKey, concurrentHashMap2);
        }
        dx1.c cVar = (dx1.c) concurrentHashMap2.get(sessionId);
        if (cVar == null) {
            cVar = new dx1.c();
            concurrentHashMap2.put(sessionId, cVar);
        }
        reentrantLock.unlock();
        h(cVar, key, value, opeartionState, separator);
    }

    public final void q(java.lang.String sessionId, java.lang.String key, yz5.a callback) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(callback, "callback");
        dx1.c cVar = (dx1.c) dx1.g.f244490b.get(sessionId);
        if (cVar == null || (concurrentHashMap = cVar.f244479c) == null) {
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        dx1.e eVar = new dx1.e(sessionId, key, callback, concurrentHashMap);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c k17 = t0Var.k(eVar, 0L);
        kotlin.jvm.internal.o.f(k17, "execute(...)");
        concurrentHashMap.put(key, k17);
    }

    public final long r(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Number) obj).intValue();
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
        return ((java.lang.Long) obj).longValue();
    }
}
