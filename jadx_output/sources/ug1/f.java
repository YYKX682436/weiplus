package ug1;

/* loaded from: classes7.dex */
public final class f extends com.tencent.mm.plugin.appbrand.networking.d {

    /* renamed from: o, reason: collision with root package name */
    public final r45.mb5 f427491o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f427492p;

    public f(r45.mb5 req, java.lang.String str) {
        kotlin.jvm.internal.o.g(req, "req");
        this.f427491o = req;
        this.f427492p = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/pregetwxadownloadurl";
        lVar.f70667d = 1189;
        lVar.f70664a = req;
        lVar.f70665b = new r45.nb5();
        p(lVar.a());
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String B() {
        java.lang.String str = this.f427492p;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String C() {
        java.lang.String str = this.f427491o.f380329d;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String y() {
        java.lang.String str = this.f427491o.f380330e;
        return str == null ? "" : str;
    }
}
