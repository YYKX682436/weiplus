package ky0;

/* loaded from: classes5.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f313469d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f313470e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f313471f;

    /* renamed from: g, reason: collision with root package name */
    public int f313472g;

    /* renamed from: h, reason: collision with root package name */
    public long f313473h;

    /* renamed from: i, reason: collision with root package name */
    public int f313474i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f313475m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.List f313476n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ly0.p f313477o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ly0.o f313478p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.List list, ly0.p pVar, ly0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f313476n = list;
        this.f313477o = pVar;
        this.f313478p = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ky0.g gVar = new ky0.g(this.f313476n, this.f313477o, this.f313478p, continuation);
        gVar.f313475m = obj;
        return gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ky0.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:(1:68)(1:138)|(1:70)|71|72|73|74|75|78|79|81|82|83|(1:119)(1:(1:118)(2:86|(1:88)(1:117)))|89|90|91|(1:93)(1:114)|94|(1:96)(1:113)|(4:(1:112)(1:(1:102)(1:111))|103|(1:110)(2:(1:106)(1:109)|107)|108)(1:99)|48|(0)|51|(0)(0)|54|(0)(0)|59|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(29:(1:68)(1:138)|(1:70)|71|72|73|74|75|78|79|80|81|82|83|(1:119)(1:(1:118)(2:86|(1:88)(1:117)))|89|90|91|(1:93)(1:114)|94|(1:96)(1:113)|(4:(1:112)(1:(1:102)(1:111))|103|(1:110)(2:(1:106)(1:109)|107)|108)(1:99)|48|(0)|51|(0)(0)|54|(0)(0)|59|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:(1:68)(1:138)|(1:70)|71|72|73|74|75|76|78|79|80|81|82|83|(1:119)(1:(1:118)(2:86|(1:88)(1:117)))|89|90|91|(1:93)(1:114)|94|(1:96)(1:113)|(4:(1:112)(1:(1:102)(1:111))|103|(1:110)(2:(1:106)(1:109)|107)|108)(1:99)|48|(0)|51|(0)(0)|54|(0)(0)|59|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02ce, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02d0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x040c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0421  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x040d -> B:5:0x0416). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ky0.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
