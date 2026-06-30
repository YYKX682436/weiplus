package vv3;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d f440433a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.yv0 f440434b;

    /* renamed from: c, reason: collision with root package name */
    public final im5.b f440435c;

    /* renamed from: d, reason: collision with root package name */
    public final long f440436d;

    /* renamed from: e, reason: collision with root package name */
    public jv3.a f440437e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f440438f;

    public b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d searchComponent, r45.yv0 finderCgiType, im5.b lifeCycleKeeper, long j17, int i17, kotlin.jvm.internal.i iVar) {
        finderCgiType = (i17 & 2) != 0 ? r45.yv0.kFinderBgmListTypeSprSearch : finderCgiType;
        j17 = (i17 & 8) != 0 ? 0L : j17;
        kotlin.jvm.internal.o.g(searchComponent, "searchComponent");
        kotlin.jvm.internal.o.g(finderCgiType, "finderCgiType");
        kotlin.jvm.internal.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        this.f440433a = searchComponent;
        this.f440434b = finderCgiType;
        this.f440435c = lifeCycleKeeper;
        this.f440436d = j17;
    }
}
