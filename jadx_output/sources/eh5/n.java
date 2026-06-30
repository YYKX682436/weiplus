package eh5;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh5.y f252967d;

    public n(eh5.y yVar) {
        this.f252967d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh5.y yVar = this.f252967d;
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = yVar.f252982n;
        if (roundCornerFrameLayout == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        roundCornerFrameLayout.invalidateOutline();
        yz5.a aVar = yVar.f252986r;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
