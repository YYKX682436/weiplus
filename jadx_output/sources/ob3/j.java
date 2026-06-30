package ob3;

/* loaded from: classes5.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ob3.k f344063d;

    public j(ob3.k kVar) {
        this.f344063d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ob3.k kVar = this.f344063d;
        kVar.f344067g.hideTenpayKB();
        ((android.view.inputmethod.InputMethodManager) kVar.f344067g.getContext().getSystemService("input_method")).showSoftInput(kVar.f344066f, 0);
    }
}
