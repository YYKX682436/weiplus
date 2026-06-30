package ku1;

/* loaded from: classes15.dex */
public class h0 extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f312090b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f312091c;

    /* renamed from: d, reason: collision with root package name */
    public tt1.j f312092d;

    @Override // ku1.m
    public void c() {
        this.f312091c = ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).f94936e;
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f312090b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardStatusView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardStatusView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ku1.m
    public void e() {
        this.f312092d = ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).E;
        if (this.f312090b == null) {
            this.f312090b = ((android.view.ViewStub) b(com.tencent.mm.R.id.f483588bc5)).inflate();
        }
        if (this.f312092d.X()) {
            android.view.View view = this.f312090b;
            com.tencent.mm.ui.MMActivity mMActivity = this.f312091c;
            view.setBackgroundDrawable(lu1.a0.m(mMActivity, mMActivity.getResources().getColor(com.tencent.mm.R.color.f478782h2)));
        }
        android.widget.TextView textView = (android.widget.TextView) this.f312090b.findViewById(com.tencent.mm.R.id.bc6);
        if (this.f312092d.i0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardStatusView", "updateState() mCardInfo.getDataInfo() == null");
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setTextColor(this.f312091c.getResources().getColor(com.tencent.mm.R.color.f479211sz));
        if (android.text.TextUtils.isEmpty(this.f312092d.s0().T)) {
            lu1.g0.e(textView, this.f312092d.i0().f385181d);
        } else {
            textView.setText(this.f312092d.s0().T);
        }
    }
}
