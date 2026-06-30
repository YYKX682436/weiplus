package f40;

/* loaded from: classes12.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f259449d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f259450e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f259451f;

    /* renamed from: g, reason: collision with root package name */
    public int f259452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f259453h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f259454i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f40.v f259455m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.p f259456n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.util.Collection collection, java.lang.Integer num, f40.v vVar, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f259453h = collection;
        this.f259454i = num;
        this.f259455m = vVar;
        this.f259456n = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f40.r(this.f259453h, this.f259454i, this.f259455m, this.f259456n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f40.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0094 -> B:5:0x009b). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f40.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
