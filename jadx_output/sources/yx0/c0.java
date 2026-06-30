package yx0;

/* loaded from: classes5.dex */
public final class c0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467207a;

    public c0(yx0.b8 b8Var) {
        this.f467207a = b8Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        yx0.b8 b8Var = this.f467207a;
        b8Var.I = false;
        if (b8Var.Z()) {
            ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) b8Var.f467177d).y0();
            ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) b8Var.f467177d).J0();
        } else {
            b8Var.f0("onAIGCRequestConditionNotMet");
            b8Var.n0();
        }
    }
}
