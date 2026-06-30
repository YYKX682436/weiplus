package vr3;

/* loaded from: classes8.dex */
public final class a implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.el5 f439619d;

    /* renamed from: e, reason: collision with root package name */
    public final as3.b f439620e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f439621f;

    public a(r45.el5 info, as3.b baseReportInfo) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(baseReportInfo, "baseReportInfo");
        this.f439619d = info;
        this.f439620e = baseReportInfo;
        this.f439621f = "MicroMsg.BizFollowMoreItemData";
    }

    public final cl0.g a() {
        cl0.g gVar = new cl0.g();
        as3.b bVar = this.f439620e;
        gVar.h("BizUin", bVar.f13489a);
        gVar.o("Scene", bVar.f13490b);
        gVar.o("subscene", 1);
        r45.el5 el5Var = this.f439619d;
        gVar.h("RecReason", el5Var.f373594e);
        gVar.o("Rec_BizUin", el5Var.f373593d.f370071h);
        gVar.h("RecInfo", el5Var.f373595f);
        gVar.h("sessionid_", bVar.f13491c);
        gVar.o("log_id", 25574);
        return gVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (obj instanceof vr3.a) {
            return kotlin.jvm.internal.o.i(this.f439619d.f373593d.f370068e.hashCode(), ((vr3.a) obj).f439619d.f373593d.f370068e.hashCode());
        }
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f439619d.f373593d.f370068e.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
