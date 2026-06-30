package sm2;

/* loaded from: classes3.dex */
public final class l3 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f409550b;

    public l3(sm2.o4 o4Var, int i17) {
        this.f409549a = o4Var;
        this.f409550b = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL", true);
        sm2.o4 o4Var = this.f409549a;
        fm2.a aVar = o4Var.f19595c;
        if (aVar != null) {
            aVar.statusChange(qo0.b.H, bundle);
        }
        com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
        com.tencent.mm.plugin.finder.assist.n8.f102409b = 0;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.p8.f102463d, 1121L);
        com.tencent.mm.plugin.finder.assist.u8.f102599a.b(o4Var.f19609a, com.tencent.soter.core.biometric.FaceManager.FACE_ACQUIRED_MULTI_FACE, this.f409550b, "anchorErrorClose", "0-vBitrate:" + hn0.v.f282442c);
    }
}
