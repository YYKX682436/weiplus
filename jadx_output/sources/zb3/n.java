package zb3;

/* loaded from: classes9.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zb3.o f471278d;

    public n(zb3.o oVar) {
        this.f471278d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        zb3.o oVar = this.f471278d;
        oVar.f471282g.hideTenpayKB();
        ((android.view.inputmethod.InputMethodManager) oVar.f471282g.getContext().getSystemService("input_method")).showSoftInput(oVar.f471281f, 0);
    }
}
