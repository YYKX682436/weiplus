package pa1;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pa1.o f352961e;

    public k(pa1.o oVar, java.lang.String str) {
        this.f352961e = oVar;
        this.f352960d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.Window window;
        boolean z17 = al1.j0.a(this.f352960d) == al1.j0.BLACK;
        pa1.o oVar = this.f352961e;
        oVar.f352964m2 = z17;
        if (!(oVar.getContext() instanceof android.app.Activity) || (window = ((android.app.Activity) oVar.getContext()).getWindow()) == null) {
            return;
        }
        com.tencent.mm.ui.v9.c(window, oVar.f352964m2);
    }
}
