package df2;

/* loaded from: classes.dex */
public final class xx extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231819d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f231820e;

    /* renamed from: f, reason: collision with root package name */
    public int f231821f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f231822g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.cy f231823h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231824i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f231825m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.v12 f231826n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(android.content.Context context, df2.cy cyVar, java.lang.String str, kotlin.jvm.internal.h0 h0Var, r45.v12 v12Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231822g = context;
        this.f231823h = cyVar;
        this.f231824i = str;
        this.f231825m = h0Var;
        this.f231826n = v12Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.xx(this.f231822g, this.f231823h, this.f231824i, this.f231825m, this.f231826n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.xx) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0121  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.xx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
