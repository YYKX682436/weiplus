package eh5;

/* loaded from: classes10.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh5.y f252975d;

    public w(eh5.y yVar) {
        this.f252975d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh5.y yVar = this.f252975d;
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = yVar.f252982n;
        if (roundCornerFrameLayout == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        roundCornerFrameLayout.invalidateOutline();
        yVar.f252984p = false;
        if (yVar.f252985q) {
            yVar.f252985q = false;
            yVar.dismiss();
        }
    }
}
