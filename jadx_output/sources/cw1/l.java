package cw1;

/* loaded from: classes3.dex */
public final class l implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f223093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f223094b;

    public l(com.tencent.mm.ui.widget.dialog.z2 z2Var, java.lang.Runnable runnable) {
        this.f223093a = z2Var;
        this.f223094b = runnable;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        this.f223093a.B();
        this.f223094b.run();
    }
}
