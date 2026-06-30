package zk;

/* loaded from: classes12.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f473375d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f473376e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f473377f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f473378g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f473379h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f473380i;

    /* renamed from: m, reason: collision with root package name */
    public int f473381m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473382n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.List f473383o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ co.f f473384p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.provider.ShareableChatRecordsProvider f473385q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List list, co.f fVar, com.tencent.mm.app.provider.ShareableChatRecordsProvider shareableChatRecordsProvider, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473383o = list;
        this.f473384p = fVar;
        this.f473385q = shareableChatRecordsProvider;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        zk.f fVar = new zk.f(this.f473383o, this.f473384p, this.f473385q, continuation);
        fVar.f473382n = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zk.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ce  */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008c -> B:9:0x00fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00bf -> B:5:0x00ca). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
