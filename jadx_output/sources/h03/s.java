package h03;

/* loaded from: classes10.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f277917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f277918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flutter.plugin.LVNativePlugin f277919g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f277920h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277921i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f277922m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ bw5.id0 f277923n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z17, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.flutter.plugin.LVNativePlugin lVNativePlugin, java.util.Map map, java.lang.String str, kotlin.jvm.internal.c0 c0Var, bw5.id0 id0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277917e = z17;
        this.f277918f = h0Var;
        this.f277919g = lVNativePlugin;
        this.f277920h = map;
        this.f277921i = str;
        this.f277922m = c0Var;
        this.f277923n = id0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h03.s(this.f277917e, this.f277918f, this.f277919g, this.f277920h, this.f277921i, this.f277922m, this.f277923n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h03.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0087  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h03.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
