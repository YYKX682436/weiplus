package fk2;

/* loaded from: classes3.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fk2.g0 f263372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f263374g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.yh1 f263375h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263376i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f263377m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f263378n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.lang.String str, fk2.g0 g0Var, android.content.Context context, bm2.h1 h1Var, r45.yh1 yh1Var, java.lang.String str2, dk2.zf zfVar, boolean z17) {
        super(3);
        this.f263371d = str;
        this.f263372e = g0Var;
        this.f263373f = context;
        this.f263374g = h1Var;
        this.f263375h = yh1Var;
        this.f263376i = str2;
        this.f263377m = zfVar;
        this.f263378n = z17;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.pluginsdk.ui.span.f0 userMessage = (com.tencent.mm.pluginsdk.ui.span.f0) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(userMessage, "userMessage");
        jz5.f0 f0Var = jz5.f0.f302826a;
        jz5.f0 f0Var2 = null;
        java.lang.String str = this.f263371d;
        if (str != null) {
            android.content.Context context = this.f263373f;
            bm2.h1 h1Var = this.f263374g;
            java.lang.String str2 = this.f263376i;
            boolean z17 = this.f263378n;
            java.lang.String string = this.f263375h.getString(4);
            java.lang.String u17 = this.f263377m.u();
            fk2.g0 g0Var = this.f263372e;
            g0Var.getClass();
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.n(str, null, 2, null));
            a17.f447873d = new fk2.a0(h1Var, string, context, userMessage, intValue, intValue2, z17, g0Var, str2, u17);
            a17.f();
            f0Var2 = f0Var;
        }
        if (f0Var2 == null) {
            com.tencent.mars.xlog.Log.w("CommentItemComboLiveReward", "null giftThumbUrl");
        }
        return f0Var;
    }
}
