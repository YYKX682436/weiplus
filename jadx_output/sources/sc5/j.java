package sc5;

/* loaded from: classes9.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f406582d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f406583e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f406584f;

    /* renamed from: g, reason: collision with root package name */
    public int f406585g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f406586h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f406587i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f406588m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yz5.l lVar, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f406587i = lVar;
        this.f406588m = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        sc5.j jVar = new sc5.j(this.f406587i, this.f406588m, continuation);
        jVar.f406586h = obj;
        return jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sc5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0146 A[Catch: Exception -> 0x0177, TryCatch #1 {Exception -> 0x0177, blocks: (B:11:0x013c, B:13:0x0146, B:14:0x014a, B:16:0x015a, B:17:0x0162, B:45:0x0120), top: B:44:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x015a A[Catch: Exception -> 0x0177, TryCatch #1 {Exception -> 0x0177, blocks: (B:11:0x013c, B:13:0x0146, B:14:0x014a, B:16:0x015a, B:17:0x0162, B:45:0x0120), top: B:44:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0092 -> B:27:0x009a). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc5.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
