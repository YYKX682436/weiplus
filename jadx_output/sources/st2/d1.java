package st2;

/* loaded from: classes3.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f412253d;

    /* renamed from: e, reason: collision with root package name */
    public int f412254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f412256g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f412257h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f412258i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f412259m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(st2.h1 h1Var, int i17, boolean z17, android.os.Bundle bundle, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f412255f = h1Var;
        this.f412256g = i17;
        this.f412257h = z17;
        this.f412258i = bundle;
        this.f412259m = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new st2.d1(this.f412255f, this.f412256g, this.f412257h, this.f412258i, this.f412259m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((st2.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0128  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
