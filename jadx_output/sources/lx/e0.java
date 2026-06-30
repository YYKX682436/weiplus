package lx;

/* loaded from: classes11.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f321730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.FinderVideoPlayInfo f321731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f321732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin f321733g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f321734h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321735i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f321736m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.pigeon.biz_base.FinderVideoPlayInfo finderVideoPlayInfo, long j17, com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin flutterBizFinderVideoPlayerPlugin, java.lang.ref.WeakReference weakReference, yz5.l lVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f321731e = finderVideoPlayInfo;
        this.f321732f = j17;
        this.f321733g = flutterBizFinderVideoPlayerPlugin;
        this.f321734h = weakReference;
        this.f321735i = lVar;
        this.f321736m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lx.e0(this.f321731e, this.f321732f, this.f321733g, this.f321734h, this.f321735i, this.f321736m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lx.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
