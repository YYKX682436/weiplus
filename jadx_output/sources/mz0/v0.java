package mz0;

/* loaded from: classes5.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333070d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(mz0.b2 b2Var) {
        super(0);
        this.f333070d = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz0.b2 b2Var = this.f333070d;
        android.content.ComponentCallbacks2 context = b2Var.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        androidx.lifecycle.y yVar = (androidx.lifecycle.y) context;
        mz0.r0 r0Var = new mz0.r0(b2Var);
        android.app.Activity context2 = b2Var.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.mj_template.album_template.widget.MusicV2State musicV2State = new com.tencent.mm.mj_template.album_template.widget.MusicV2State(yVar, r0Var, ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(dz0.l.class))).f69789m.f245052c);
        musicV2State.f69763g = new mz0.u0(b2Var, musicV2State);
        return musicV2State;
    }
}
