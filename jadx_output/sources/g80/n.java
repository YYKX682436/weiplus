package g80;

/* loaded from: classes12.dex */
public final class n extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f269508d;

    /* renamed from: e, reason: collision with root package name */
    public long f269509e;

    /* renamed from: f, reason: collision with root package name */
    public int f269510f;

    /* renamed from: g, reason: collision with root package name */
    public int f269511g;

    /* renamed from: h, reason: collision with root package name */
    public int f269512h;

    /* renamed from: i, reason: collision with root package name */
    public int f269513i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g80.o f269514m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f269515n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j15.d f269516o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ s70.g f269517p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f269518q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g80.o oVar, com.tencent.mm.vfs.r6 r6Var, j15.d dVar, s70.g gVar, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f269514m = oVar;
        this.f269515n = r6Var;
        this.f269516o = dVar;
        this.f269517p = gVar;
        this.f269518q = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new g80.n(this.f269514m, this.f269515n, this.f269516o, this.f269517p, this.f269518q, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((g80.n) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0716  */
    /* JADX WARN: Type inference failed for: r0v127, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x06e9 -> B:18:0x06eb). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 1989
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g80.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
