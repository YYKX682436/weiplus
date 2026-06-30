package ww1;

/* loaded from: classes15.dex */
public class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.q2 f450269d;

    public p2(ww1.q2 q2Var) {
        this.f450269d = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ww1.q2 q2Var = this.f450269d;
        android.view.ViewGroup.LayoutParams layoutParams = q2Var.f450271d.O.getLayoutParams();
        layoutParams.height = q2Var.f450271d.f450137i.getHeight();
        q2Var.f450271d.O.setLayoutParams(layoutParams);
    }
}
