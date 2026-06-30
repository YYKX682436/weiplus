package p81;

/* loaded from: classes7.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p81.j f352721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p81.j jVar) {
        super(1);
        this.f352721d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.p6 it = (com.tencent.mm.plugin.appbrand.launching.p6) obj;
        kotlin.jvm.internal.o.g(it, "it");
        p81.j jVar = this.f352721d;
        jVar.a(4, "onSuccess");
        t81.c cVar = jVar.f352723a;
        ((t81.d) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.d.class)).delete(cVar, new java.lang.String[0]);
        s81.b bVar = (s81.b) com.tencent.mm.plugin.appbrand.app.r9.fj(s81.b.class);
        java.lang.String str = cVar.field_appId;
        int i17 = cVar.field_version;
        int i18 = cVar.field_packageType;
        java.lang.String str2 = cVar.field_packageKey;
        int i19 = cVar.field_reportId;
        bVar.getClass();
        s81.c cVar2 = new s81.c();
        cVar2.field_appId = str;
        cVar2.field_version = i17;
        cVar2.field_packageType = i18;
        cVar2.field_packageKey = str2;
        cVar2.field_reportId = i19;
        boolean z17 = bVar.get(cVar2, new java.lang.String[0]);
        cVar2.field_source = 1;
        cVar2.field_hitCount = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PredownloadGetCodeStatStorage", "setSource(" + bVar.y0(cVar2) + "), applied:" + (z17 ? bVar.update(cVar2, new java.lang.String[0]) : bVar.insert(cVar2)) + " update:" + z17);
        p81.j.b(jVar, true);
        jVar.f352724b.invoke(java.lang.Boolean.TRUE);
        return jz5.f0.f302826a;
    }
}
