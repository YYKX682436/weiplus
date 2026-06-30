package gf;

/* loaded from: classes5.dex */
public final class x1 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f271187d;

    public x1(yz5.l lVar) {
        this.f271187d = lVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View v17, android.view.WindowInsets insets) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(insets, "insets");
        this.f271187d.invoke("onApplyWindowInsets");
        return insets;
    }
}
