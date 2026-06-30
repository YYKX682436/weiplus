package eo2;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final eo2.f f255565a = new eo2.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f255566b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f255567c = new java.util.HashSet();

    static {
        ki.i.f308101c.c(new eo2.c());
    }

    public final boolean a(r45.om2 objectInfo) {
        kotlin.jvm.internal.o.g(objectInfo, "objectInfo");
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberStatusManager", "checkFeed preview %d, status %d", java.lang.Integer.valueOf(objectInfo.getInteger(0)), java.lang.Integer.valueOf(objectInfo.getInteger(1)));
        return objectInfo.getInteger(0) == 1 || d(java.lang.Integer.valueOf(objectInfo.getInteger(1)));
    }

    public final synchronized eo2.d b(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        java.util.Map map = f255566b;
        eo2.d dVar = (eo2.d) ((java.util.HashMap) map).get(name);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(dVar != null ? dVar.f255561c : -1);
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberStatusManager", "checkMember %d", objArr);
        if (dVar == null) {
            e(name);
        } else {
            if (dVar.f255559a) {
                if (c01.id.c() / 1000 <= dVar.f255562d || dVar.f255561c == 2) {
                    return dVar;
                }
                ((java.util.HashMap) map).remove(name);
                e(name);
                return null;
            }
            int i17 = dVar.f255563e;
            if (i17 >= 2) {
                com.tencent.mars.xlog.Log.i("Finder.FinderMemberStatusManager", "ignore repeat");
                return dVar;
            }
            dVar.f255563e = i17 + 1;
            e(name);
        }
        return null;
    }

    public final synchronized eo2.d c(java.lang.String name) {
        eo2.d dVar;
        kotlin.jvm.internal.o.g(name, "name");
        dVar = (eo2.d) ((java.util.HashMap) f255566b).get(name);
        boolean z17 = false;
        if (dVar != null) {
            if (dVar.f255559a) {
                z17 = true;
            }
        }
        if (!z17) {
            dVar = null;
        }
        return dVar;
    }

    public final boolean d(java.lang.Integer num) {
        return (num != null && num.intValue() == 1) || (num != null && num.intValue() == 2);
    }

    public final synchronized void e(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.e2().r()).intValue() == 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderMemberStatusManager", "request disable");
            return;
        }
        java.util.Set set = f255567c;
        if (((java.util.HashSet) set).contains(name)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderMemberStatusManager", "request pending request");
        } else {
            ((java.util.HashSet) set).add(name);
            com.tencent.mars.xlog.Log.i("Finder.FinderMemberStatusManager", "do request");
            new ho2.c(null, name, 0, 4, null).l().H(new eo2.e(name));
        }
    }

    public final synchronized void f(java.lang.String finderUsername, com.tencent.mm.modelbase.f cgiBack) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.e2().r()).intValue() != 0) {
            r45.tr0 tr0Var = (r45.tr0) cgiBack.f70618d;
            if (d(tr0Var != null ? java.lang.Integer.valueOf(tr0Var.f386726g) : null)) {
                com.tencent.mars.xlog.Log.i("Finder.FinderMemberStatusManager", "updateMemberStatus %s", finderUsername);
                long c17 = (c01.id.c() / 1000) + 86400;
                boolean z17 = cgiBack.b() && cgiBack.f70618d != null;
                com.tencent.mm.protobuf.f fVar = cgiBack.f70618d;
                r45.tr0 tr0Var2 = (r45.tr0) fVar;
                int i17 = tr0Var2 != null ? tr0Var2.f386723d : -1;
                r45.tr0 tr0Var3 = (r45.tr0) fVar;
                int i18 = tr0Var3 != null ? tr0Var3.f386726g : -1;
                ((java.util.HashMap) f255566b).put(finderUsername, new eo2.d(z17, i17, i18, c17, 0, 16, null));
                com.tencent.mm.autogen.events.MemberStatusEvent memberStatusEvent = new com.tencent.mm.autogen.events.MemberStatusEvent();
                am.rj rjVar = memberStatusEvent.f54494g;
                rjVar.f7822a = z17;
                rjVar.f7824c = i18;
                rjVar.f7823b = finderUsername;
                memberStatusEvent.b(android.os.Looper.getMainLooper());
            }
        }
    }

    public final synchronized void g(java.lang.String finderUsername, com.tencent.mm.modelbase.f cgiBack) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.e2().r()).intValue() == 0) {
            return;
        }
        r45.xr0 xr0Var = (r45.xr0) cgiBack.f70618d;
        long j17 = xr0Var != null ? xr0Var.f390353f : 0L;
        long c17 = c01.id.c() / 1000;
        boolean z17 = cgiBack.b() && cgiBack.f70618d != null;
        com.tencent.mm.protobuf.f fVar = cgiBack.f70618d;
        r45.xr0 xr0Var2 = (r45.xr0) fVar;
        int i17 = xr0Var2 != null ? xr0Var2.f390351d : -1;
        r45.xr0 xr0Var3 = (r45.xr0) fVar;
        int i18 = xr0Var3 != null ? xr0Var3.f390352e : -1;
        boolean z18 = z17;
        eo2.d dVar = new eo2.d(z17, i17, i18, (j17 <= 0 || j17 - c17 <= 120) ? 86400 + c17 : j17, 0, 16, null);
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberStatusManager", "success %b updateStatus %s status %d curTime %d validTime %d", java.lang.Boolean.valueOf(z18), finderUsername, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(c17), java.lang.Long.valueOf(j17));
        if (!z18) {
            eo2.d dVar2 = (eo2.d) ((java.util.HashMap) f255566b).get(finderUsername);
            int i19 = dVar2 != null ? dVar2.f255563e : 0;
            dVar.f255563e = i19;
            if (i19 > 2) {
                dVar.f255562d = 120L;
            }
        }
        ((java.util.HashMap) f255566b).put(finderUsername, dVar);
        com.tencent.mm.autogen.events.MemberStatusEvent memberStatusEvent = new com.tencent.mm.autogen.events.MemberStatusEvent();
        am.rj rjVar = memberStatusEvent.f54494g;
        rjVar.f7822a = z18;
        rjVar.f7824c = i18;
        rjVar.f7823b = finderUsername;
        memberStatusEvent.b(android.os.Looper.getMainLooper());
    }

    public final boolean h(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberStatusManager", "checkScene %d", java.lang.Integer.valueOf(i17));
        return i17 == 17 || i17 == 18 || i17 == 20;
    }
}
