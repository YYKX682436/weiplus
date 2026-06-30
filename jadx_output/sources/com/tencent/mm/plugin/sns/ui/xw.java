package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class xw implements zy2.r9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.f96 f171587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f171588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f171589c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f171590d;

    public xw(r45.f96 f96Var, android.content.Intent intent, android.content.Context context, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        this.f171587a = f96Var;
        this.f171588b = intent;
        this.f171589c = context;
        this.f171590d = timeLineObject;
    }

    @Override // zy2.r9
    public void a(zy2.p9 p9Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$1");
        zy2.p9 p9Var2 = zy2.p9.f477528d;
        r45.f96 f96Var = this.f171587a;
        boolean z17 = p9Var == p9Var2 ? !com.tencent.mm.sdk.platformtools.t8.K0(f96Var.getString(5)) : p9Var != zy2.p9.f477529e;
        android.content.Context context = this.f171589c;
        android.content.Intent intent = this.f171588b;
        if (z17) {
            intent.putExtra("rawUrl", com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsPOICommentFeedNewUrlSwitch"), 0) == 0 ? java.lang.String.format(o45.yf.f343037a, f96Var.getString(5)) : java.lang.String.format(o45.yf.f343038b, f96Var.getString(5), this.f171590d.Id));
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, context);
        } else {
            intent.putExtra("map_view_type", 7);
            intent.putExtra("kwebmap_slat", f96Var.getFloat(1));
            intent.putExtra("kwebmap_lng", f96Var.getFloat(0));
            intent.putExtra("kPoiName", f96Var.getString(3));
            intent.putExtra("Kwebmap_locaion", f96Var.getString(4));
            j45.l.j(context, ya.b.LOCATION, ".ui.RedirectUI", intent, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$1");
    }
}
