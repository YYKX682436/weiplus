package zc5;

/* loaded from: classes12.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f471473d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f471474e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f471475f;

    /* renamed from: g, reason: collision with root package name */
    public int f471476g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f471477h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f471478i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f471479m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f471480n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f471481o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.util.List list, boolean z17, boolean z18, android.content.Context context, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f471477h = list;
        this.f471478i = z17;
        this.f471479m = z18;
        this.f471480n = context;
        this.f471481o = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zc5.l(this.f471477h, this.f471478i, this.f471479m, this.f471480n, this.f471481o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zc5.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x019a, code lost:
    
        if (r0 == false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00bf -> B:5:0x0024). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zc5.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
