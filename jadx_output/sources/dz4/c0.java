package dz4;

/* loaded from: classes9.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f245178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f245179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.app.Activity activity, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f245178d = activity;
        this.f245179e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.span.o a17 = com.tencent.mm.pluginsdk.ui.span.n.a();
        android.app.Activity activity = this.f245178d;
        ((com.tencent.mm.app.plugin.s) a17).h(activity, new android.view.View(activity), (r35.m3) this.f245179e.f310123d, null);
        return jz5.f0.f302826a;
    }
}
