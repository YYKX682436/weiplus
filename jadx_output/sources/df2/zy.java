package df2;

/* loaded from: classes3.dex */
public final class zy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f232005d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f232006e;

    /* renamed from: f, reason: collision with root package name */
    public int f232007f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f232008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f232009h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ df2.lz f232010i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy(java.util.List list, df2.lz lzVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f232009h = list;
        this.f232010i = lzVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        df2.zy zyVar = new df2.zy(this.f232009h, this.f232010i, continuation);
        zyVar.f232008g = obj;
        return zyVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.zy) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0094 -> B:5:0x009b). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.zy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
