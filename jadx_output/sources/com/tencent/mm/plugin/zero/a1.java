package com.tencent.mm.plugin.zero;

/* loaded from: classes11.dex */
public class a1 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile pq5.d f188619b;

    /* renamed from: a, reason: collision with root package name */
    public final a25.u f188620a;

    public a1() {
        if (f188619b != null) {
            this.f188620a = (a25.u) f188619b.get();
        } else {
            this.f188620a = null;
        }
    }

    public void a(java.lang.Object obj) {
        a25.u uVar = this.f188620a;
        if (uVar != null) {
            com.tencent.mm.plugin.messenger.foundation.z2 z2Var = (com.tencent.mm.plugin.messenger.foundation.z2) uVar;
            z2Var.getClass();
            boolean z17 = obj instanceof w11.z0;
            com.tencent.mm.plugin.messenger.foundation.v2 v2Var = com.tencent.mm.plugin.messenger.foundation.z2.f148769b;
            if (z17) {
                z2Var.f148770a.a();
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Pa(((w11.z0) obj).f442182d);
                v2Var.x(obj);
            } else if ((obj instanceof java.lang.String) && obj.equals("NetSceneInit")) {
                z2Var.f148770a.a();
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Pa((java.lang.String) obj);
                v2Var.x(obj);
            } else if (obj instanceof w11.u) {
                z2Var.f148770a.a();
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Pa(obj.toString());
                v2Var.x(obj);
            }
        }
    }

    public void b(java.lang.Object obj) {
        a25.u uVar = this.f188620a;
        if (uVar != null) {
            com.tencent.mm.plugin.messenger.foundation.z2 z2Var = (com.tencent.mm.plugin.messenger.foundation.z2) uVar;
            z2Var.getClass();
            pq5.d dVar = vg3.b5.f436650b;
            if (dVar != null) {
                z2Var.f148770a = (vg3.z4) dVar.get();
            }
            if (z2Var.f148770a == null) {
                z2Var.f148770a = new com.tencent.mm.plugin.messenger.foundation.u2();
            }
            boolean z17 = obj instanceof w11.z0;
            com.tencent.mm.plugin.messenger.foundation.v2 v2Var = com.tencent.mm.plugin.messenger.foundation.z2.f148769b;
            if (z17) {
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().aa(((w11.z0) obj).f442182d);
                v2Var.y(obj);
            } else {
                if (obj instanceof java.lang.String) {
                    if (obj.equals("NetSceneInit")) {
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().aa((java.lang.String) obj);
                        v2Var.y(obj);
                        return;
                    }
                    return;
                }
                if (obj instanceof w11.u) {
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().aa(obj.toString());
                    v2Var.y(obj);
                }
            }
        }
    }

    public void c(java.lang.Object obj) {
        a25.u uVar = this.f188620a;
        if (uVar != null) {
            ((com.tencent.mm.plugin.messenger.foundation.z2) uVar).getClass();
            if (obj instanceof w11.z0) {
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Pa(((w11.z0) obj).f442182d);
            }
        }
    }

    public boolean d(java.lang.Object obj, int i17, int i18, r45.b50 b50Var, boolean z17, r45.cx4 cx4Var, int i19) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncDoCmdDelegate", "account storage disabled, discard all commands");
            return false;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        byte[] d17 = x51.j1.d(b50Var.f370531e);
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Long.valueOf(currentTimeMillis);
        objArr[1] = java.lang.Integer.valueOf(b50Var.f370530d);
        objArr[2] = java.lang.Integer.valueOf(d17 == null ? -1 : d17.length);
        objArr[3] = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        objArr[4] = java.lang.Integer.valueOf(i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncDoCmdDelegate", "doCmd %d cmdid:%d buf:%d thr:[%d] callSource:%s", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.M0(d17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncDoCmdDelegate", "docmd: no protobuf found.");
            return false;
        }
        try {
            a25.u uVar = this.f188620a;
            if (uVar != null) {
                ((com.tencent.mm.plugin.messenger.foundation.z2) uVar).a(obj, i17, i18, b50Var, d17, z17, cx4Var);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SyncDoCmdDelegate", "doCmd FIN %d cmdid:%d Time:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(b50Var.f370530d), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            return true;
        } catch (java.lang.Error | java.lang.Exception e17) {
            w11.k.f442068a.b(b50Var, e17, i19);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SyncDoCmdDelegate", e17, "", new java.lang.Object[0]);
            return false;
        }
    }
}
