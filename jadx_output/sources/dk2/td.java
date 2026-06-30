package dk2;

/* loaded from: classes3.dex */
public final class td extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f234130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(kotlin.jvm.internal.g0 g0Var) {
        super(0);
        this.f234130d = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17 = this.f234130d.f310121d;
        gk2.e eVar = gk2.e.f272471n;
        if (eVar != null) {
            mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("keepAliveGuard it.isLiveStarted():");
            sb6.append(((mm2.c1) e1Var.business(mm2.c1.class)).a8());
            sb6.append(" heartbeatGuardEnable:");
            sb6.append(dk2.x7.f234334a > 0);
            sb6.append(" liveId:");
            r45.nw1 nw1Var = e1Var.f328988r;
            sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.getLong(0)) : null);
            sb6.append(" HEART_BEAT_GUARD_INTERVAL:");
            sb6.append(dk2.x7.f234334a);
            com.tencent.mars.xlog.Log.i("FinderLiveGuard", sb6.toString());
            if (dk2.x7.f234336c) {
                if (((mm2.c1) e1Var.business(mm2.c1.class)).a8()) {
                    dk2.zc zcVar = new dk2.zc(e1Var.f328988r.getLong(0));
                    wu5.c cVar = dk2.x7.f234337d;
                    if (cVar != null) {
                        cVar.cancel(false);
                    }
                    ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
                    t0Var.getClass();
                    dk2.x7.f234337d = t0Var.z(zcVar, j17 + com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, false);
                } else {
                    wu5.c cVar2 = dk2.x7.f234337d;
                    if (cVar2 != null) {
                        cVar2.cancel(false);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
