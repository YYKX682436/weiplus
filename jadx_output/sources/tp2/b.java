package tp2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tp2.f f421119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f421120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f421121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f421122g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f421123h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421124i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421125m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f421126n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f421127o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f421128p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ jq2.a f421129q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f421130r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.util.List f421131s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tp2.f fVar, int i17, so2.j5 j5Var, java.util.ArrayList arrayList, android.view.View view, java.lang.String str, java.lang.String str2, int i18, android.os.Bundle bundle, so2.j5 j5Var2, jq2.a aVar, long j17, java.util.List list) {
        super(2);
        this.f421119d = fVar;
        this.f421120e = i17;
        this.f421121f = j5Var;
        this.f421122g = arrayList;
        this.f421123h = view;
        this.f421124i = str;
        this.f421125m = str2;
        this.f421126n = i18;
        this.f421127o = bundle;
        this.f421128p = j5Var2;
        this.f421129q = aVar;
        this.f421130r = j17;
        this.f421131s = list;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        tp2.f fVar = this.f421119d;
        int i17 = this.f421120e;
        so2.j5 j5Var = this.f421121f;
        java.util.ArrayList arrayList = this.f421122g;
        android.view.View view = this.f421123h;
        java.lang.String str = this.f421124i;
        java.lang.String str2 = this.f421125m;
        int i18 = this.f421126n;
        android.os.Bundle bundle = this.f421127o;
        so2.j5 j5Var2 = this.f421128p;
        jq2.a aVar = this.f421129q;
        long j17 = this.f421130r;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        tp2.f.b(fVar, i17, j5Var, arrayList, view, str, str2, booleanValue, i18, bundle, j5Var2, 0L, aVar, j17, intent, this.f421131s, 1024, null);
        return jz5.f0.f302826a;
    }
}
