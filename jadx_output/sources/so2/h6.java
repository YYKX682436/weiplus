package so2;

/* loaded from: classes2.dex */
public final class h6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f410402d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f410403e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f410404f;

    /* renamed from: g, reason: collision with root package name */
    public int f410405g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f410406h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f410407i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ so2.m6 f410408m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f410409n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ so2.z5 f410410o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(java.util.List list, so2.m6 m6Var, android.content.Context context, so2.z5 z5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410407i = list;
        this.f410408m = m6Var;
        this.f410409n = context;
        this.f410410o = z5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        so2.h6 h6Var = new so2.h6(this.f410407i, this.f410408m, this.f410409n, this.f410410o, continuation);
        h6Var.f410406h = obj;
        return h6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((so2.h6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0079 -> B:5:0x0080). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.h6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
