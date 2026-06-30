package ws2;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout f449057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout) {
        super(0);
        this.f449057d = finderLiveReplayPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new ws2.k2(new java.lang.ref.WeakReference(this.f449057d));
    }
}
