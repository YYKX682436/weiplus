package zl2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.g f473770a = new zl2.g();

    public final void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.autogen.mmdata.rpt.LiveAudienceCommodityLogStruct liveAudienceCommodityLogStruct = new com.tencent.mm.autogen.mmdata.rpt.LiveAudienceCommodityLogStruct();
        liveAudienceCommodityLogStruct.f58570l = liveAudienceCommodityLogStruct.b("Event", str, true);
        liveAudienceCommodityLogStruct.f58571m = liveAudienceCommodityLogStruct.b("Params", r26.i0.t(str2, ",", ";", false), true);
        liveAudienceCommodityLogStruct.k();
    }

    public final void b(java.lang.String coupon_id, java.lang.String noticeid, int i17) {
        kotlin.jvm.internal.o.g(coupon_id, "coupon_id");
        kotlin.jvm.internal.o.g(noticeid, "noticeid");
        cl0.g gVar = new cl0.g();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gVar.h("finderuin", xy2.c.e(context));
        gVar.h("coupon_id", coupon_id);
        gVar.h("noticeid", noticeid);
        gVar.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        a("click_get_coupon_btn_after_reserve", gVar2);
    }

    public final void c(java.lang.String coupon_id, java.lang.String noticeid, boolean z17) {
        kotlin.jvm.internal.o.g(coupon_id, "coupon_id");
        kotlin.jvm.internal.o.g(noticeid, "noticeid");
        cl0.g gVar = new cl0.g();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gVar.h("finderuin", xy2.c.e(context));
        gVar.h("coupon_id", coupon_id);
        gVar.h("noticeid", noticeid);
        gVar.o("ui_position", z17 ? 2 : 1);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        a("click_get_coupon_btn_after_reserve_of_profile", gVar2);
    }

    public final void d(java.lang.String coupon_id, java.lang.String noticeid, boolean z17) {
        kotlin.jvm.internal.o.g(coupon_id, "coupon_id");
        kotlin.jvm.internal.o.g(noticeid, "noticeid");
        cl0.g gVar = new cl0.g();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gVar.h("finderuin", xy2.c.e(context));
        gVar.h("coupon_id", coupon_id);
        gVar.h("noticeid", noticeid);
        gVar.o("ui_position", z17 ? 2 : 1);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        a("expose_get_coupon_btn_after_reserve_of_profile", gVar2);
    }
}
