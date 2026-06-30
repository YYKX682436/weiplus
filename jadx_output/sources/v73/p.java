package v73;

/* loaded from: classes.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v73.n f433723d;

    public p(v73.n nVar) {
        this.f433723d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f433723d.findViewById(com.tencent.mm.R.id.h3j);
        if (viewGroup != null) {
            viewGroup.sendAccessibilityEvent(8);
        }
    }
}
