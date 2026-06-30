package kt2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.reward.view.MagicRewardView f311976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView) {
        super(0);
        this.f311976d = magicRewardView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rs5.f service;
        service = this.f311976d.getService();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((it2.x) service).Bi() != null);
        com.tencent.mars.xlog.Log.i("MagicRewardView", "initialize service available " + valueOf.booleanValue());
        return valueOf;
    }
}
