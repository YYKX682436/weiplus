package rk4;

/* loaded from: classes11.dex */
public final class x7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397081d;

    /* renamed from: e, reason: collision with root package name */
    public int f397082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f397083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f397084g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f397085h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397086i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397087m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(rk4.k8 k8Var, int i17, java.lang.Integer num, java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397083f = k8Var;
        this.f397084g = i17;
        this.f397085h = num;
        this.f397086i = str;
        this.f397087m = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.x7(this.f397083f, this.f397084g, this.f397085h, this.f397086i, this.f397087m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.x7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c2 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.x7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
