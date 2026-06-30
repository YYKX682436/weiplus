package mh2;

/* loaded from: classes3.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f326440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f326441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f326442f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(int i17, mh2.f1 f1Var, int i18) {
        super(0);
        this.f326440d = i17;
        this.f326441e = f1Var;
        this.f326442f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f326440d;
        boolean z17 = i17 < 85 && 70 <= i17;
        int i18 = this.f326442f;
        mh2.f1 f1Var = this.f326441e;
        if (z17) {
            f1Var.f326347v = 0;
            mh2.f1.g(f1Var, mh2.p0.f326435d, i18);
        } else if (i17 >= 85) {
            int i19 = f1Var.f326347v + 1;
            f1Var.f326347v = i19;
            android.widget.TextView textView = f1Var.f326335j;
            if (i19 > 1) {
                textView.setText("x" + i19);
                textView.setVisibility(0);
                textView.setScaleX(0.2f);
                textView.setScaleY(0.2f);
                textView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(240L).start();
            } else {
                textView.setText("");
                textView.setVisibility(8);
            }
            mh2.f1.g(f1Var, mh2.p0.f326436e, i18);
        } else {
            f1Var.f326347v = 0;
        }
        return jz5.f0.f302826a;
    }
}
