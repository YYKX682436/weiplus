package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f124696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f124698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124699h;

    public r0(com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, ya2.b2 b2Var, java.lang.String str, r45.h32 h32Var, java.lang.String str2) {
        this.f124695d = s1Var;
        this.f124696e = b2Var;
        this.f124697f = str;
        this.f124698g = h32Var;
        this.f124699h = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.f124695d;
        if (s1Var.f124720d) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = s1Var.f124718b;
            db5.t7.m(appCompatActivity, appCompatActivity.getString(com.tencent.mm.R.string.dzx));
            yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        ya2.b2 b2Var = this.f124696e;
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", b2Var != null ? b2Var.D0() : this.f124697f);
        r45.h32 h32Var = this.f124698g;
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", h32Var.toByteArray());
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", false);
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VIP", h32Var.getInteger(14) == 1);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Hj(s1Var.f124718b, intent, 10011);
        cl0.g gVar = new cl0.g();
        gVar.s("source_type", 0);
        gVar.s("ref_page_type", this.f124699h);
        cl0.g gVar2 = new cl0.g();
        r45.ov2 a17 = zl2.t.a(h32Var);
        gVar2.h("coupon_id", a17 != null ? a17.getString(1) : null);
        gVar2.o("ui_position", 1);
        gVar.o("notice_type", 1);
        i95.m c17 = i95.n0.c(c50.c1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c50.c1 c1Var = (c50.c1) c17;
        ml2.i5 i5Var = ml2.i5.f327579q;
        java.lang.String str2 = this.f124697f;
        java.lang.String str3 = s1Var.f124722f;
        if (h32Var == null || (str = h32Var.getString(3)) == null) {
            str = "";
        }
        c50.c1.l9(c1Var, i5Var, str2, 0L, 0, str3, null, null, null, null, str, gVar.toString(), h32Var.getString(4), gVar2.toString(), s1Var.e(), s1Var.d(), null, 33248, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
