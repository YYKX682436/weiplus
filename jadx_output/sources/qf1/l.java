package qf1;

/* loaded from: classes7.dex */
public class l extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f362277e;

    public l(qf1.m mVar, android.content.Context context, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f362276d = context;
        this.f362277e = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        rf1.d.b(this.f362276d);
        qf1.m.f362278g = false;
        com.tencent.mm.plugin.appbrand.x0.e(this.f362277e.getAppId(), this);
    }
}
