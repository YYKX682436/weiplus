package ku1;

/* loaded from: classes15.dex */
public class o extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f312133b;

    @Override // ku1.m
    public void c() {
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f312133b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ku1.m
    public void e() {
        if (this.f312133b == null) {
            this.f312133b = ((android.view.ViewStub) b(com.tencent.mm.R.id.b9m)).inflate();
        }
        if (((com.tencent.mm.plugin.card.ui.b0) this.f312132a).E.d()) {
            this.f312133b.setBackgroundResource(com.tencent.mm.R.drawable.f481118l8);
        }
        this.f312133b.setOnClickListener(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X);
        r45.de0 de0Var = ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).E.s0().M;
        if (android.text.TextUtils.isEmpty(de0Var.f372344h)) {
            android.view.View b17 = b(com.tencent.mm.R.id.b9h);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((android.widget.TextView) b(com.tencent.mm.R.id.b9g)).setText(de0Var.f372344h);
            android.view.View b18 = b(com.tencent.mm.R.id.b9h);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b18, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(b18, "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = (android.widget.ImageView) b(com.tencent.mm.R.id.b9l);
        java.util.LinkedList linkedList = de0Var.f372343g;
        if (linkedList == null || linkedList.size() <= 0 || android.text.TextUtils.isEmpty((java.lang.CharSequence) de0Var.f372343g.get(0))) {
            imageView.setVisibility(8);
            return;
        }
        java.lang.String str = (java.lang.String) de0Var.f372343g.get(0);
        imageView.setVisibility(0);
        o11.f fVar = new o11.f();
        fVar.f342083g = lp0.b.D();
        fVar.f342082f = xt1.q.m(str);
        fVar.f342078b = true;
        fVar.f342096t = false;
        fVar.f342077a = true;
        n11.a.b().h(str, imageView, fVar.a());
    }
}
