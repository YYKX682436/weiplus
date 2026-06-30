package u;

/* loaded from: classes16.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC f423393d;

    public f(com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC combineFooterBarUIC) {
        this.f423393d = combineFooterBarUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/combine/uic/CombineFooterBarUIC$initClick$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC.a(this.f423393d);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("button_50479", "view_clk", kz5.c1.k(new jz5.l("post_session_id", ca4.z0.l()), new jz5.l("50479_btn_type", 4)), 36244);
        yj0.a.h(this, "com/tencent/mm/plugin/combine/uic/CombineFooterBarUIC$initClick$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
