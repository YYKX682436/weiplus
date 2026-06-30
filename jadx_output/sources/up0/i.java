package up0;

/* loaded from: classes13.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f429776d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f429777e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f429778f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f429779g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f429780h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f429781i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f429782m;

    /* renamed from: n, reason: collision with root package name */
    public int f429783n;

    /* renamed from: o, reason: collision with root package name */
    public int f429784o;

    /* renamed from: p, reason: collision with root package name */
    public int f429785p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f429786q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f429787r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f429788s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.u1 f429789t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f429790u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.view.MMPAGView mMPAGView, org.json.JSONObject jSONObject, org.json.JSONArray jSONArray, com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f429786q = mMPAGView;
        this.f429787r = jSONObject;
        this.f429788s = jSONArray;
        this.f429789t = u1Var;
        this.f429790u = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new up0.i(this.f429786q, this.f429787r, this.f429788s, this.f429789t, this.f429790u, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((up0.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0226  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x021f -> B:6:0x0222). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0285 -> B:12:0x029c). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: up0.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
