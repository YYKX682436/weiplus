package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes11.dex */
class ZIDL_GNpdI8iE4B extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.mm.plugin.voipmp.platform.r {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.voipmp.platform.s f177197a;

    private native void ZIDL_AX(long j17, long j18, boolean z17);

    public void ZIDL_AV(long j17, int i17) {
        com.tencent.mm.plugin.voipmp.platform.r rVar;
        com.tencent.mm.plugin.voipmp.platform.r rVar2;
        com.tencent.mm.plugin.voipmp.platform.s sVar = this.f177197a;
        er4.u uVar = i17 != 0 ? i17 != 1 ? i17 != 2 ? null : er4.u.VoIPMPSystemAuthRequestTypeCamera : er4.u.VoIPMPSystemAuthRequestTypeMicrophone : er4.u.VoIPMPSystemAuthRequestTypeUnknown;
        co5.m0 m0Var = (co5.m0) sVar;
        m0Var.getClass();
        com.tencent.mars.xlog.Log.i("voipmp.systemauth", "requestAsync ... (type=" + uVar + ')');
        int i18 = uVar == null ? -1 : co5.z.f43899a[uVar.ordinal()];
        if (i18 == 1) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            boolean Bi = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context, "android.permission.RECORD_AUDIO", 82, "", "", new co5.l0(m0Var, j17, context));
            com.tencent.mars.xlog.Log.i("voipmp.systemauth", "check microphone (checkMicroPhone=" + Bi + ')');
            if (!Bi || (rVar = m0Var.f43868a) == null) {
                return;
            }
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_GNpdI8iE4B) rVar).f0(j17, true);
            return;
        }
        if (i18 != 2) {
            com.tencent.mars.xlog.Log.e("voipmp.systemauth", "unknonw type");
            return;
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        boolean Bi2 = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context2, "android.permission.CAMERA", 19, "", "", new co5.f0(m0Var, j17, context2));
        com.tencent.mars.xlog.Log.i("voipmp.systemauth", "check camera (checkCamera=" + Bi2 + ')');
        if (!Bi2 || (rVar2 = m0Var.f43868a) == null) {
            return;
        }
        ((com.tencent.mm.plugin.voipmp.platform.ZIDL_GNpdI8iE4B) rVar2).f0(j17, true);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.mm.plugin.voipmp.platform.s sVar = (com.tencent.mm.plugin.voipmp.platform.s) obj;
        this.f177197a = sVar;
        co5.m0 m0Var = (co5.m0) sVar;
        m0Var.getClass();
        com.tencent.mars.xlog.Log.i("voipmp.systemauth", "setCallback ... (callback=" + this + ')');
        m0Var.f43868a = this;
    }

    @Override // com.tencent.mm.plugin.voipmp.platform.r
    public void f0(long j17, boolean z17) {
        ZIDL_AX(this.nativeHandler, j17, z17);
    }
}
