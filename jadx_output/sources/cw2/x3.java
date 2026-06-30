package cw2;

/* loaded from: classes10.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLivePlayView f224104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView) {
        super(0);
        this.f224104d = finderLivePlayView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLivePlayView, live url=");
        cw2.wa waVar = this.f224104d.f130607n;
        sb6.append(waVar != null ? waVar.f224094a : null);
        return sb6.toString();
    }
}
