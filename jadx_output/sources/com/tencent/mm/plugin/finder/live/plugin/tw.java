package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.vw f114480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.uy2 f114481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(com.tencent.mm.plugin.finder.live.plugin.vw vwVar, r45.uy2 uy2Var) {
        super(0);
        this.f114480d = vwVar;
        this.f114481e = uy2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qo0.c cVar = this.f114480d.f114825p;
        qo0.b bVar = qo0.b.P4;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("PARAM_FINDER_LIVE_RECEIVE_LOGO_RESP_KEY", this.f114481e.toByteArray());
        cVar.statusChange(bVar, bundle);
        return jz5.f0.f302826a;
    }
}
