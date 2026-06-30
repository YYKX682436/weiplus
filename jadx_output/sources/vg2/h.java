package vg2;

/* loaded from: classes3.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.m f436514d;

    public h(vg2.m mVar) {
        this.f436514d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.m mVar = this.f436514d;
        com.tencent.mm.plugin.finder.live.plugin.nl nlVar = (com.tencent.mm.plugin.finder.live.plugin.nl) mVar.H;
        nlVar.getClass();
        r45.gb2 gb2Var = new r45.gb2();
        gb2Var.set(1, db2.t4.f228171a.a(8655));
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
            byte[] bArr = e1Var.f328985o;
            gb2Var.set(2, bArr != null ? new com.tencent.mm.protobuf.g(bArr, 0, bArr.length) : null);
            gb2Var.set(3, java.lang.Long.valueOf(e1Var.f328988r.getLong(0)));
            gb2Var.set(4, java.lang.Long.valueOf(e1Var.f328983m));
            if (zl2.r4.f473950a.g0() == 3) {
                android.content.Context context = nlVar.f113646a.f365323d.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                str = xy2.c.e(context);
            } else {
                str = "";
            }
            gb2Var.set(5, str);
        }
        gb2Var.set(6, mVar.I.field_rewardProductId);
        gb2Var.set(11, 2);
        gb2Var.set(9, 2);
        az2.j jVar = (az2.j) gb2Var.d();
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = nlVar.f113646a;
        com.tencent.mm.plugin.finder.live.util.y.m(hmVar, null, null, new com.tencent.mm.plugin.finder.live.plugin.kl(jVar, hmVar, mVar, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
