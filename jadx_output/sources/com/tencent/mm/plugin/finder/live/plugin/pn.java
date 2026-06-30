package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.tn f113920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f113921e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(com.tencent.mm.plugin.finder.live.plugin.tn tnVar, java.lang.Integer num) {
        super(0);
        this.f113920d = tnVar;
        this.f113921e = num;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView = this.f113920d.f114447n.f114597g;
        if (finderLiveGiftTextView != null) {
            finderLiveGiftTextView.setText("x" + this.f113921e);
        }
        return jz5.f0.f302826a;
    }
}
