package ts3;

/* loaded from: classes9.dex */
public class y implements r35.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f421704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ts3.a0 f421705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ts3.d0 f421706c;

    public y(ts3.d0 d0Var, boolean z17, ts3.a0 a0Var) {
        this.f421706c = d0Var;
        this.f421704a = z17;
        this.f421705b = a0Var;
    }

    @Override // r35.q3
    public void onFinish() {
        boolean z17 = this.f421704a;
        ts3.a0 a0Var = this.f421705b;
        if (!z17) {
            a0Var.f421630i.setTextColor(this.f421706c.B.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            a0Var.f421630i.setBackgroundResource(com.tencent.mm.R.drawable.f480982gv);
        }
        a0Var.f421631j.setVisibility(0);
    }

    @Override // r35.q3
    public void onStart() {
    }
}
