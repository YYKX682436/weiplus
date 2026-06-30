package n72;

/* loaded from: classes14.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f335260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n72.q f335261e;

    public i(n72.q qVar, double d17) {
        this.f335261e = qVar;
        this.f335260d = d17;
    }

    @Override // java.lang.Runnable
    public void run() {
        n72.q qVar = this.f335261e;
        int i17 = qVar.A.getContext().getResources().getDisplayMetrics().widthPixels;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) qVar.A.getLayoutParams();
        int i18 = (int) (i17 * 0.7d);
        layoutParams.width = i18;
        double d17 = this.f335260d;
        layoutParams.height = (int) (i18 * d17);
        layoutParams.addRule(13, -1);
        qVar.A.setLayoutParams(layoutParams);
        qVar.A.setAspectRatio(d17);
        qVar.A.getmAspectRatio();
    }
}
