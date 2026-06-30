package vh0;

/* loaded from: classes11.dex */
public final class q2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436943d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f436944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vh0.f3 f436945f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f436946g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m11.b0 f436947h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f436948i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436949m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(vh0.f3 f3Var, com.tencent.mm.storage.f9 f9Var, m11.b0 b0Var, android.content.Context context, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436945f = f3Var;
        this.f436946g = f9Var;
        this.f436947h = b0Var;
        this.f436948i = context;
        this.f436949m = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        vh0.q2 q2Var = new vh0.q2(this.f436945f, this.f436946g, this.f436947h, this.f436948i, this.f436949m, continuation);
        q2Var.f436944e = obj;
        return q2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vh0.q2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bd  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh0.q2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
