package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class hm extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.km f132252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout f132253e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(com.tencent.mm.plugin.finder.view.km kmVar, com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout) {
        super(3);
        this.f132252d = kmVar;
        this.f132253e = mMTPEffectVideoLayout;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        com.tencent.mm.plugin.finder.view.km kmVar = this.f132252d;
        com.tencent.mars.xlog.Log.i(kmVar.f132509q, "onFirstFrameAvailable");
        pj4.t tVar = kmVar.f133273g;
        if (tVar.f355289e == 1 && !tVar.f355290f) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onPlayStarted] isViewOpen=");
            sb6.append(kmVar.f132514v);
            sb6.append(" width=");
            sb6.append(intValue);
            sb6.append(" height=");
            sb6.append(intValue2);
            sb6.append(" isPlaying=");
            kk4.b player = this.f132253e.getPlayer();
            sb6.append(player != null ? java.lang.Boolean.valueOf(((kk4.v) player).s()) : null);
            com.tencent.mars.xlog.Log.i(kmVar.f132509q, sb6.toString());
            if (!kmVar.f132514v) {
                kmVar.r();
            }
        }
        kmVar.f132511s.setVisibility(8);
        return jz5.f0.f302826a;
    }
}
