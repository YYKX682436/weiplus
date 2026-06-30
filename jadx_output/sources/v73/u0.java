package v73;

/* loaded from: classes.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v73.v0 f433747d;

    public u0(v73.v0 v0Var) {
        this.f433747d = v0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f433747d.findViewById(com.tencent.mm.R.id.h4j);
        if (viewGroup != null) {
            viewGroup.sendAccessibilityEvent(8);
        }
    }
}
