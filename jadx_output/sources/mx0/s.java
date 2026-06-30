package mx0;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final mx0.s f332297a = new mx0.s();

    /* renamed from: b, reason: collision with root package name */
    public static final r45.wt4 f332298b;

    static {
        r45.sr5 sr5Var;
        r45.wt4 wt4Var = new r45.wt4();
        wt4Var.set(1, "Android");
        wt4Var.set(0, com.tencent.maas.MJMaasVersion.VERSION_NUMBER);
        wt4Var.set(2, "0");
        ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
        wt4Var.set(4, java.lang.Boolean.valueOf(d11.s.Di(4)));
        rg.c w17 = com.tencent.maas.camstudio.MJCamoSession.w();
        int i17 = w17 == null ? -1 : mx0.o.f332176a[w17.ordinal()];
        if (i17 != 1) {
            sr5Var = r45.sr5.Resolution_720p;
            if (i17 != 2 && i17 == 3) {
                sr5Var = r45.sr5.Resolution_1080p;
            }
        } else {
            sr5Var = r45.sr5.Resolution_540p;
        }
        wt4Var.set(5, java.lang.Integer.valueOf(sr5Var.f385950d));
        f332298b = wt4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.tencent.maas.camstudio.MJAIGCTaskInfo r9, com.tencent.maas.camstudio.MJAIGCCancelReason r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.s.a(com.tencent.maas.camstudio.MJAIGCTaskInfo, com.tencent.maas.camstudio.MJAIGCCancelReason, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean b() {
        i95.m c17 = i95.n0.c(e42.e0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return ((h62.d) ((e42.e0) c17)).nj(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigAIGCErrTipsOpt()) == 1;
    }

    public final com.tencent.maas.instamovie.base.MJError c(int i17, int i18, java.lang.String str, java.lang.String str2) {
        boolean b17 = b();
        com.tencent.mars.xlog.Log.i("Finder.FinderAIMediaGenerate", "[makeMJError] source:" + str2 + " errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " isErrTipsOpt:" + b17);
        if (b17) {
            return new com.tencent.maas.instamovie.base.MJError(i18, str);
        }
        return new com.tencent.maas.instamovie.base.MJError(com.tencent.maas.instamovie.base.MJError.MaasEC.GeneralError.getErrorCode(), "cgi error: " + i17 + ' ' + i18 + ' ' + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.tencent.maas.camstudio.MJAIGCSubmitRequest r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.s.d(com.tencent.maas.camstudio.MJAIGCSubmitRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.maas.camstudio.f e(int i17) {
        mx0.n[] nVarArr = mx0.n.f332161d;
        if (i17 == 40001) {
            return com.tencent.maas.camstudio.f.nMJAIGCResultCodeReject;
        }
        mx0.n[] nVarArr2 = mx0.n.f332161d;
        if (i17 == 40003) {
            return com.tencent.maas.camstudio.f.nMJAIGCResultCodeTimeout;
        }
        mx0.n[] nVarArr3 = mx0.n.f332161d;
        if (i17 == 40002) {
            return com.tencent.maas.camstudio.f.nMJAIGCResultCodeFailed;
        }
        mx0.n[] nVarArr4 = mx0.n.f332161d;
        if (i17 == 40004) {
            return com.tencent.maas.camstudio.f.nMJAIGCResultCodeInsecurity;
        }
        mx0.n[] nVarArr5 = mx0.n.f332161d;
        if (i17 == 40005) {
            return com.tencent.maas.camstudio.f.nMJAIGCResultCodeNoFace;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.tencent.maas.camstudio.MJAIGCTaskInfo r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.s.f(com.tencent.maas.camstudio.MJAIGCTaskInfo, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
