package lh4;

/* loaded from: classes8.dex */
public final class m {
    public m(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(int i17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            return false;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                if ((i17 != 21 && i17 != 22 && i17 != 25) || ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() != 2) {
                    return false;
                }
            } else if (((uh4.c0) i95.n0.c(uh4.c0.class)).h4() != 2) {
                return false;
            }
        } else if (((uh4.c0) i95.n0.c(uh4.c0.class)).hd() != 2) {
            return false;
        }
        return true;
    }

    public final boolean b(int i17) {
        boolean z17;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_taskbar_disable_snapshot_show, "-1", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionViewModel", "block expt: " + Zi);
        try {
            kotlin.jvm.internal.o.d(Zi);
            java.util.Iterator it = r26.n0.f0(Zi, new java.lang.String[]{","}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                if (i17 == java.lang.Integer.parseInt((java.lang.String) it.next())) {
                    z17 = true;
                    break;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionViewModel", com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, th6);
        }
        z17 = false;
        if (!z17) {
            if (i17 == 2 || i17 == 3 || i17 == 4) {
                return true;
            }
        }
        return false;
    }

    public final java.util.ArrayList c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_taskbar_disable_other_type_show, "-1", true);
        try {
            kotlin.jvm.internal.o.d(Zi);
            java.util.Iterator it = r26.n0.f0(Zi, new java.lang.String[]{","}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it.next())));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionViewModel", com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, th6);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionViewModel", "block expt: " + Zi);
        return arrayList;
    }
}
