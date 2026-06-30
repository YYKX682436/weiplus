package pa1;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa1.o f352962d;

    public l(pa1.o oVar) {
        this.f352962d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.Window window;
        pa1.o oVar = this.f352962d;
        if (!(oVar.getContext() instanceof android.app.Activity) || (window = ((android.app.Activity) oVar.getContext()).getWindow()) == null) {
            return;
        }
        com.tencent.mm.ui.v9.c(window, oVar.f352964m2);
    }
}
