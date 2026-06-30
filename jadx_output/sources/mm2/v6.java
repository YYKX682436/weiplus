package mm2;

/* loaded from: classes3.dex */
public final class v6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f329490d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f329491e;

    /* renamed from: f, reason: collision with root package name */
    public int f329492f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f329493g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mm2.w6 f329494h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(mm2.w6 w6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f329494h = w6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mm2.v6 v6Var = new mm2.v6(this.f329494h, continuation);
        v6Var.f329493g = obj;
        return v6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.v6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00f8 -> B:19:0x011f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e1 -> B:16:0x00f6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ed -> B:13:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00fb -> B:17:0x00fd). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.v6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
