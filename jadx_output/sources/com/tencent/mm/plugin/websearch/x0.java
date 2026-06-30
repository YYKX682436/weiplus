package com.tencent.mm.plugin.websearch;

/* loaded from: classes11.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f181715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.websearch.SearchResultFinderVideoPlayInfo f181716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f181717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin f181718g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f181719h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f181720i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f181721m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.pigeon.websearch.SearchResultFinderVideoPlayInfo searchResultFinderVideoPlayInfo, long j17, com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin flutterSearchFinderVideoPlayerPlugin, java.lang.ref.WeakReference weakReference, yz5.l lVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f181716e = searchResultFinderVideoPlayInfo;
        this.f181717f = j17;
        this.f181718g = flutterSearchFinderVideoPlayerPlugin;
        this.f181719h = weakReference;
        this.f181720i = lVar;
        this.f181721m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.websearch.x0(this.f181716e, this.f181717f, this.f181718g, this.f181719h, this.f181720i, this.f181721m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.websearch.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.websearch.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
