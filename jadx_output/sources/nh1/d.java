package nh1;

/* loaded from: classes7.dex */
public class d implements nh1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f337085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f337086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f337087c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337088d;

    public d(nh1.e eVar, java.util.List list, android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        this.f337085a = list;
        this.f337086b = context;
        this.f337087c = v5Var;
        this.f337088d = str;
    }

    @Override // nh1.g
    public void a(android.view.View view, int i17) {
        ((nh1.b) this.f337085a.get(i17)).a(this.f337086b, this.f337087c, this.f337088d);
    }
}
