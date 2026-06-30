package hr3;

/* loaded from: classes11.dex */
public final class fg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f283555d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f283556e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f283557f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f283558g;

    /* renamed from: h, reason: collision with root package name */
    public int f283559h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f283560i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ hr3.gg f283561m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283562n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.a f283563o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(hr3.gg ggVar, java.lang.String str, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f283561m = ggVar;
        this.f283562n = str;
        this.f283563o = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        hr3.fg fgVar = new hr3.fg(this.f283561m, this.f283562n, this.f283563o, continuation);
        fgVar.f283560i = obj;
        return fgVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.fg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01c8, code lost:
    
        if (r11 == null) goto L116;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0149 A[Catch: Exception -> 0x016e, TryCatch #1 {Exception -> 0x016e, blocks: (B:68:0x011d, B:70:0x0127, B:72:0x012a, B:74:0x0130, B:75:0x0138, B:77:0x013c, B:83:0x0149, B:85:0x014d, B:87:0x015c, B:92:0x0168, B:94:0x0154), top: B:67:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0168 A[Catch: Exception -> 0x016e, TRY_LEAVE, TryCatch #1 {Exception -> 0x016e, blocks: (B:68:0x011d, B:70:0x0127, B:72:0x012a, B:74:0x0130, B:75:0x0138, B:77:0x013c, B:83:0x0149, B:85:0x014d, B:87:0x015c, B:92:0x0168, B:94:0x0154), top: B:67:0x011d }] */
    /* JADX WARN: Type inference failed for: r10v1, types: [hr3.gg] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [yz5.a] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr3.fg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
