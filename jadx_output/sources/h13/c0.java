package h13;

@j95.b
/* loaded from: classes8.dex */
public final class c0 extends i95.w implements i50.q {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f278117d = "ForceNotifyReport";

    public void Ai(java.lang.String str, java.lang.String sessionId, int i17, long j17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        try {
            kotlin.jvm.internal.o.d(str);
            int i18 = 0;
            java.lang.String t17 = r26.i0.t(str, "@wxcontact", "", false);
            com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(t17);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = t17;
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = java.lang.Long.valueOf(q57.getCreateTime() / 1000);
            if (!q57.Z2() && !q57.O2()) {
                i18 = q57.A0() == 1 ? 1 : 2;
            }
            objArr[3] = java.lang.Integer.valueOf(i18);
            objArr[4] = sessionId;
            objArr[5] = java.lang.Long.valueOf(j17);
            g0Var.d(16505, objArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f278117d, "[_16505] " + e17);
        }
    }

    public void Bi(java.lang.String str, int i17, long j17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16506, str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
    }

    public void Di(java.lang.String str, int i17, int i18, java.lang.String forcePushId, boolean z17, java.lang.String str2) {
        kotlin.jvm.internal.o.g(forcePushId, "forcePushId");
        int i19 = z17 ? 1 : !com.tencent.mm.app.w.INSTANCE.f53889n ? 2 : 3;
        long c17 = c01.id.c() / 1000;
        java.lang.String str3 = str2 == null ? "" : str2;
        com.tencent.mars.xlog.Log.i(this.f278117d, "report16507 toUsername=" + str + ", noticeState=" + i17 + ", receiveTime=" + c17 + ", msgType=" + i18 + ", forcePushId=" + forcePushId + ", receiveState=" + i19 + ", chnlExtra=" + str2);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16507, str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(c17), java.lang.Integer.valueOf(i18), forcePushId, java.lang.Integer.valueOf(i19), r26.i0.t(str3, ",", ";", false));
    }

    public void Ni(int i17, int i18, java.lang.String username, int i19, java.lang.String forcePushId) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(forcePushId, "forcePushId");
        long c17 = c01.id.c() / 1000;
        com.tencent.mars.xlog.Log.i(this.f278117d, "report22430 actionTimeMs=" + c17 + " actType=" + i17 + " msgType=" + i18 + " username=" + username + " msgCount=" + i19 + " forcePushId=" + forcePushId);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22430, java.lang.Long.valueOf(c17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), username, java.lang.Integer.valueOf(i19), forcePushId);
    }

    public void wi(java.lang.String str, int i17, long j17) {
        i13.j jVar = new i13.j();
        jVar.field_ForcePushId = str;
        if (j13.a.f297177d.get(jVar, new java.lang.String[0])) {
            Ai(str, (jVar.field_CreateTime / 1000) + jVar.field_UserName, i17, j17);
        }
    }
}
