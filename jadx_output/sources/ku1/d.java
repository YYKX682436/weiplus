package ku1;

/* loaded from: classes15.dex */
public class d extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f312070b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f312071c;

    @Override // ku1.m
    public void c() {
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f312070b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdTitleView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAdTitleView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ku1.m
    public void e() {
        if (this.f312070b == null) {
            android.view.View inflate = ((android.view.ViewStub) b(com.tencent.mm.R.id.b7n)).inflate();
            this.f312070b = inflate;
            this.f312071c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b7o);
        }
        android.view.View view = this.f312070b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdTitleView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAdTitleView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f312070b.setOnClickListener(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X);
        tt1.j jVar = ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).E;
        if (android.text.TextUtils.isEmpty(jVar.s0().M.f372345i)) {
            this.f312071c.setText(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).h(com.tencent.mm.R.string.au6));
        } else {
            this.f312071c.setText(jVar.s0().M.f372345i);
        }
    }
}
