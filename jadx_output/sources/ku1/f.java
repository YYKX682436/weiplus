package ku1;

/* loaded from: classes15.dex */
public class f extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f312077b;

    @Override // ku1.m
    public void c() {
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f312077b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAnnoucementView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAnnoucementView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ku1.m
    public void e() {
        tt1.j jVar = ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).E;
        r45.ju juVar = jVar.s0().I;
        if (juVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardAnnoucementView", "card tp annoucement  endtime: " + juVar.f378106g);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardAnnoucementView", "card tp annoucement  text: " + juVar.f378104e);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardAnnoucementView", "card tp annoucement  thumb_url: " + juVar.f378108i);
        }
        if (juVar != null && !android.text.TextUtils.isEmpty(juVar.f378104e) && jVar.n()) {
            if (this.f312077b == null) {
                this.f312077b = ((android.view.ViewStub) b(com.tencent.mm.R.id.b7r)).inflate();
            }
            ((android.widget.TextView) this.f312077b.findViewById(com.tencent.mm.R.id.lcr)).setText(juVar.f378104e);
            this.f312077b.setOnClickListener(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X);
            return;
        }
        android.view.View view = this.f312077b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAnnoucementView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAnnoucementView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
