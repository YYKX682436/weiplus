package sj3;

/* loaded from: classes14.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.m1 f408598d;

    public j1(sj3.m1 m1Var) {
        this.f408598d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        sj3.m1 m1Var = this.f408598d;
        int i17 = ((android.view.ViewGroup.MarginLayoutParams) m1Var.f408635h.getLayoutParams()).bottomMargin;
        int height = (int) (m1Var.f408638n.getHeight() - ((r1.getHeight() + i17) + r2.topMargin));
        androidx.recyclerview.widget.RecyclerView recyclerView = m1Var.f408637m;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) recyclerView.getLayoutParams();
        int i18 = (sj3.i1.f408564i * 3) + (sj3.i1.f408559d * 2);
        if (height >= i18) {
            layoutParams.height = i18;
        } else {
            layoutParams.height = height;
        }
        recyclerView.setLayoutParams(layoutParams);
    }
}
