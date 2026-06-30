package wc1;

/* loaded from: classes7.dex */
public class m implements ph1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f444485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wc1.q f444489e;

    public m(wc1.q qVar, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f444489e = qVar;
        this.f444485a = d0Var;
        this.f444486b = str;
        this.f444487c = str2;
        this.f444488d = str3;
    }

    @Override // ph1.d
    public void a(ph1.g gVar) {
        this.f444489e.D(this.f444485a, this.f444486b, gVar, this.f444487c, this.f444488d);
    }
}
