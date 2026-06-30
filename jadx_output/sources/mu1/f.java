package mu1;

/* loaded from: classes15.dex */
public class f extends mu1.a {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f331360g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f331361h;

    @Override // mu1.a, mu1.j
    public void d(boolean z17, boolean z18) {
    }

    @Override // mu1.a
    public void g() {
        this.f331361h = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.b7t);
        this.f331360g = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.bc7);
    }

    @Override // mu1.a
    public void h() {
        if (this.f331334a.s0().f388560s == null || this.f331334a.s0().f388560s.size() <= 0) {
            return;
        }
        r45.w50 w50Var = (r45.w50) this.f331334a.s0().f388560s.get(0);
        android.widget.TextView textView = this.f331338e;
        if (textView != null) {
            textView.setText(w50Var.f388878d);
        }
        if (this.f331360g != null) {
            if (android.text.TextUtils.isEmpty(w50Var.f388879e)) {
                this.f331360g.setVisibility(8);
            } else {
                this.f331360g.setText(w50Var.f388879e);
            }
        }
        if (this.f331361h != null) {
            if (android.text.TextUtils.isEmpty(w50Var.f388880f)) {
                this.f331361h.setVisibility(8);
            } else {
                this.f331361h.setText(w50Var.f388880f);
            }
        }
    }
}
