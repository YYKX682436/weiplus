package gv4;

/* loaded from: classes8.dex */
public final class c implements hv4.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hv4.a f276114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f276115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f276116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276117g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276118h;

    public c(hv4.a aVar, kotlin.jvm.internal.h0 h0Var, int i17, java.lang.String str, java.lang.String str2) {
        this.f276114d = aVar;
        this.f276115e = h0Var;
        this.f276116f = i17;
        this.f276117g = str;
        this.f276118h = str2;
    }

    @Override // hv4.a
    public void a(java.lang.String tag, int i17) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f276114d.a(tag, i17);
    }

    @Override // hv4.a
    public void b(r45.sn3 shareContent) {
        kotlin.jvm.internal.o.g(shareContent, "shareContent");
        this.f276114d.b(shareContent);
        ((r45.ck6) this.f276115e.f310123d).f371632q = 1;
    }

    @Override // hv4.a
    public void onDismiss() {
        this.f276114d.onDismiss();
        com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchVCActionReportStruct wCTopicSearchVCActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchVCActionReportStruct();
        wCTopicSearchVCActionReportStruct.f62186d = 2L;
        kotlin.jvm.internal.h0 h0Var = this.f276115e;
        if (((r45.ck6) h0Var.f310123d).f371632q == 1) {
            wCTopicSearchVCActionReportStruct.f62187e = 1L;
        } else {
            wCTopicSearchVCActionReportStruct.f62187e = 2L;
        }
        wCTopicSearchVCActionReportStruct.f62188f = this.f276116f;
        wCTopicSearchVCActionReportStruct.f62189g = c01.id.e();
        java.lang.String str = this.f276117g;
        wCTopicSearchVCActionReportStruct.f62190h = com.tencent.mm.storage.z3.R4(str) ? 2L : 1L;
        wCTopicSearchVCActionReportStruct.f62191i = wCTopicSearchVCActionReportStruct.b("EnterSceneId", str, true);
        wCTopicSearchVCActionReportStruct.f62192j = wCTopicSearchVCActionReportStruct.b("SessionId", this.f276118h, true);
        wCTopicSearchVCActionReportStruct.f62193k = wCTopicSearchVCActionReportStruct.b("QueryKey", ((r45.ck6) h0Var.f310123d).f371627i, true);
        wCTopicSearchVCActionReportStruct.k();
        su4.k3.m(wCTopicSearchVCActionReportStruct);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.TagSearchUILogic", "stopTagSearchDialog url:" + ((r45.ck6) h0Var.f310123d).f371625g);
    }
}
