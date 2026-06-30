package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class d1 implements zy2.r9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ed4 f169769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f169770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f169771c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.e1 f169772d;

    public d1(com.tencent.mm.plugin.sns.ui.listener.e1 e1Var, r45.ed4 ed4Var, android.content.Intent intent, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        this.f169772d = e1Var;
        this.f169769a = ed4Var;
        this.f169770b = intent;
        this.f169771c = timeLineObject;
    }

    @Override // zy2.r9
    public void a(zy2.p9 p9Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7$1");
        zy2.p9 p9Var2 = zy2.p9.f477528d;
        r45.ed4 ed4Var = this.f169769a;
        boolean z17 = true;
        if (p9Var == p9Var2) {
            z17 = true ^ com.tencent.mm.sdk.platformtools.t8.K0(ed4Var.f373316i);
        } else if (p9Var == zy2.p9.f477529e) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.listener.e1 e1Var = this.f169772d;
        android.content.Intent intent = this.f169770b;
        if (z17) {
            com.tencent.mm.plugin.sns.ui.listener.i iVar = e1Var.f169775d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            int i17 = iVar.U;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            intent.putExtra("rawUrl", i17 == 0 ? java.lang.String.format(o45.yf.f343037a, ed4Var.f373316i) : java.lang.String.format(o45.yf.f343038b, ed4Var.f373316i, this.f169771c.Id));
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, com.tencent.mm.plugin.sns.ui.listener.i.e(e1Var.f169775d));
        } else {
            intent.putExtra("map_view_type", 7);
            intent.putExtra("kwebmap_slat", ed4Var.f373312e);
            intent.putExtra("kwebmap_lng", ed4Var.f373311d);
            intent.putExtra("kPoiName", ed4Var.f373314g);
            intent.putExtra("Kwebmap_locaion", ed4Var.f373315h);
            j45.l.j(com.tencent.mm.plugin.sns.ui.listener.i.e(e1Var.f169775d), ya.b.LOCATION, ".ui.RedirectUI", intent, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7$1");
    }
}
