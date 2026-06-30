package vh0;

/* loaded from: classes11.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f436901d;

    /* renamed from: e, reason: collision with root package name */
    public long f436902e;

    /* renamed from: f, reason: collision with root package name */
    public int f436903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436904g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436905h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vh0.k1 f436906i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vh0.f3 f436907m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f436908n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f436909o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f436910p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(java.lang.String str, java.lang.String str2, vh0.k1 k1Var, vh0.f3 f3Var, android.content.Context context, android.os.Bundle bundle, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436904g = str;
        this.f436905h = str2;
        this.f436906i = k1Var;
        this.f436907m = f3Var;
        this.f436908n = context;
        this.f436909o = bundle;
        this.f436910p = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vh0.m2(this.f436904g, this.f436905h, this.f436906i, this.f436907m, this.f436908n, this.f436909o, this.f436910p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vh0.m2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh0.m2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
