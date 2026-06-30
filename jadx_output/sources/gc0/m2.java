package gc0;

/* loaded from: classes5.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270217d;

    /* renamed from: e, reason: collision with root package name */
    public int f270218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kl5 f270219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270220g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270221h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f270222i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f270223m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270224n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(r45.kl5 kl5Var, java.lang.String str, gc0.p2 p2Var, java.util.List list, android.view.View view, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270219f = kl5Var;
        this.f270220g = str;
        this.f270221h = p2Var;
        this.f270222i = list;
        this.f270223m = view;
        this.f270224n = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gc0.m2(this.f270219f, this.f270220g, this.f270221h, this.f270222i, this.f270223m, this.f270224n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gc0.m2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gc0.m2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
