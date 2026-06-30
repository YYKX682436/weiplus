package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class on extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f113770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.tn f113771e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(com.tencent.mm.plugin.finder.live.plugin.ap apVar, com.tencent.mm.plugin.finder.live.plugin.tn tnVar) {
        super(0);
        this.f113770d = apVar;
        this.f113771e = tnVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f113770d.E.remove(this.f113771e.f114441h);
        this.f113770d.E.offerLast(this.f113771e.f114441h);
        while (this.f113770d.E.size() > 1000) {
            java.lang.String str = (java.lang.String) this.f113770d.E.pollFirst();
            if (str != null) {
                com.tencent.mm.plugin.finder.live.plugin.ap apVar = this.f113770d;
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "comboIdBackToLiveMap remove: comboId=".concat(str));
            }
        }
        return jz5.f0.f302826a;
    }
}
