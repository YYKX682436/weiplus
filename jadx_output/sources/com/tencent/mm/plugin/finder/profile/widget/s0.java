package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f124713f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f124714g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124715h;

    public s0(com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, java.lang.String str, r45.h32 h32Var, ya2.b2 b2Var, java.lang.String str2) {
        this.f124711d = s1Var;
        this.f124712e = str;
        this.f124713f = h32Var;
        this.f124714g = b2Var;
        this.f124715h = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.f124711d;
        boolean z17 = s1Var.f124720d;
        java.lang.String str2 = this.f124712e;
        r45.h32 h32Var = this.f124713f;
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity = s1Var.f124718b;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.finder.member.preview.c0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.member.preview.c0.class)).X6(str2, h32Var, s1Var.f124728l);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (s1Var.B) {
            s1Var.f124728l.performClick();
        } else {
            android.content.Intent intent = new android.content.Intent();
            ya2.b2 b2Var = this.f124714g;
            if (b2Var != null) {
                str2 = b2Var.D0();
            }
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", str2);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", h32Var.toByteArray());
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VIP", h32Var.getInteger(14) == 1);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Hj(s1Var.f124718b, intent, 10011);
            cl0.g gVar = new cl0.g();
            gVar.s("source_type", 0);
            gVar.s("ref_page_type", this.f124715h);
            cl0.g gVar2 = new cl0.g();
            r45.ov2 a17 = zl2.t.a(h32Var);
            gVar2.h("coupon_id", a17 != null ? a17.getString(1) : null);
            gVar2.o("ui_position", 1);
            gVar.o("notice_type", 1);
            i95.m c17 = i95.n0.c(c50.c1.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c50.c1 c1Var = (c50.c1) c17;
            ml2.i5 i5Var = ml2.i5.f327579q;
            java.lang.String str3 = this.f124712e;
            java.lang.String str4 = s1Var.f124722f;
            if (h32Var == null || (str = h32Var.getString(3)) == null) {
                str = "";
            }
            c50.c1.l9(c1Var, i5Var, str3, 0L, 0, str4, null, null, null, null, str, gVar.toString(), h32Var.getString(4), gVar2.toString(), s1Var.e(), s1Var.d(), null, 33248, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
