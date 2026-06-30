package un0;

/* loaded from: classes14.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f429391d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f429392e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f429393f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f429394g;

    /* renamed from: h, reason: collision with root package name */
    public int f429395h;

    /* renamed from: i, reason: collision with root package name */
    public int f429396i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f429397m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429398n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ un0.h f429399o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(kotlin.jvm.internal.h0 h0Var, un0.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f429398n = h0Var;
        this.f429399o = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        un0.n nVar = new un0.n(this.f429398n, this.f429399o, continuation);
        nVar.f429397m = obj;
        return nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((un0.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0134 -> B:5:0x0137). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: un0.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
