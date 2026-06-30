package uc4;

/* loaded from: classes4.dex */
public final class h implements zy2.r9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.f96 f426413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f426414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uc4.i f426415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f426416d;

    public h(r45.f96 f96Var, android.content.Intent intent, uc4.i iVar, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        this.f426413a = f96Var;
        this.f426414b = intent;
        this.f426415c = iVar;
        this.f426416d = timeLineObject;
    }

    @Override // zy2.r9
    public void a(zy2.p9 type) {
        java.lang.String format;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAddressClick$click$1");
        kotlin.jvm.internal.o.g(type, "type");
        zy2.p9 p9Var = zy2.p9.f477528d;
        r45.f96 f96Var = this.f426413a;
        boolean z17 = type == p9Var ? !com.tencent.mm.sdk.platformtools.t8.K0(f96Var.getString(5)) : type != zy2.p9.f477529e;
        uc4.i iVar = this.f426415c;
        android.content.Intent intent = this.f426414b;
        if (z17) {
            if (com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsPOICommentFeedNewUrlSwitch"), 0) == 0) {
                java.lang.String MM_NEAR_LIFE_URI = o45.yf.f343037a;
                kotlin.jvm.internal.o.f(MM_NEAR_LIFE_URI, "MM_NEAR_LIFE_URI");
                format = java.lang.String.format(MM_NEAR_LIFE_URI, java.util.Arrays.copyOf(new java.lang.Object[]{f96Var.getString(5)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
            } else {
                java.lang.String MM_NEAR_LIFE_URI_DETAIL = o45.yf.f343038b;
                kotlin.jvm.internal.o.f(MM_NEAR_LIFE_URI_DETAIL, "MM_NEAR_LIFE_URI_DETAIL");
                format = java.lang.String.format(MM_NEAR_LIFE_URI_DETAIL, java.util.Arrays.copyOf(new java.lang.Object[]{f96Var.getString(5), this.f426416d.Id}, 2));
                kotlin.jvm.internal.o.f(format, "format(...)");
            }
            intent.putExtra("rawUrl", format);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, iVar.b());
        } else {
            intent.putExtra("map_view_type", 7);
            intent.putExtra("kwebmap_slat", f96Var.getFloat(1));
            intent.putExtra("kwebmap_lng", f96Var.getFloat(0));
            intent.putExtra("kPoiName", f96Var.getString(3));
            intent.putExtra("Kwebmap_locaion", f96Var.getString(4));
            j45.l.j(iVar.b(), ya.b.LOCATION, ".ui.RedirectUI", intent, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAddressClick$click$1");
    }
}
