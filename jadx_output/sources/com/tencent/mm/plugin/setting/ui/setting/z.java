package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.i0 f161801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f161802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.setting.ui.setting.i0 i0Var, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f161801d = i0Var;
        this.f161802e = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.setting.ui.setting.z(this.f161801d, this.f161802e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.setting.ui.setting.z zVar = (com.tencent.mm.plugin.setting.ui.setting.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.setting.ui.setting.i0 i0Var = this.f161801d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = i0Var.f161132r;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        i0Var.f161132r = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "dealNetSceneQrCode done, updateQrCode");
        this.f161802e.f310112d = false;
        i0Var.Z6(true, 2);
        return jz5.f0.f302826a;
    }
}
