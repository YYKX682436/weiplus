package du2;

@j95.b
/* loaded from: classes2.dex */
public final class n extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public du2.w f243484d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f243485e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f243486f;

    /* renamed from: g, reason: collision with root package name */
    public android.support.v4.media.session.r f243487g;

    /* renamed from: h, reason: collision with root package name */
    public android.support.v4.media.m f243488h;

    /* renamed from: i, reason: collision with root package name */
    public volatile du2.l f243489i = du2.l.f243480d;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f243490m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Bundle f243491n = new android.os.Bundle();

    public static /* synthetic */ fu2.c Ai(du2.n nVar, du2.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = nVar.f243489i;
        }
        return nVar.wi(lVar);
    }

    public final void Bi() {
        fu2.c Ai = Ai(this, null, 1, null);
        if (Ai != null) {
            eu2.j jVar = (eu2.j) Ai;
            jVar.f256793d.f256767q = true;
            jVar.b(false);
        }
    }

    public final void Di() {
        fu2.c Ai = Ai(this, null, 1, null);
        if (Ai != null) {
            eu2.j jVar = (eu2.j) Ai;
            eu2.b0 b0Var = jVar.f256793d;
            if (b0Var.f256760g == eu2.k.f256794d) {
                f25.m0 m0Var = b0Var.f256770t;
                if (!(m0Var != null && ((g25.e) m0Var).f267980c)) {
                    b0Var.wi();
                    i95.m c17 = i95.n0.c(f25.n0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    b0Var.f256770t = ((f25.n0) c17).m9(f25.n.f259107c, new eu2.i(jVar));
                    jVar.b(true);
                    return;
                }
            }
            jVar.b(true);
        }
    }

    public final boolean Ni(du2.l lVar) {
        if (lVar != null) {
            this.f243489i = lVar;
        }
        if (Ai(this, null, 1, null) == null) {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "depend is null, currentBusinessType = " + this.f243489i + ", businessMap = " + this.f243490m);
            return false;
        }
        if (this.f243487g != null) {
            Ri();
            return true;
        }
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "service is not ready, try to connect service, businessType = " + lVar + ", businessMap = " + this.f243490m);
        android.support.v4.media.m mVar = this.f243488h;
        if (mVar != null && ((android.support.v4.media.g) mVar.f8937a).f8927b.isConnected()) {
            Ri();
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "[connectService] Already connected, skip");
            return true;
        }
        fu2.c Ai = Ai(this, null, 1, null);
        if ((Ai != null ? ((eu2.j) Ai).f256793d.f256758e : null) == null) {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "[connectService], currentMediaInfo is null");
            return false;
        }
        if (this.f243486f) {
            return true;
        }
        this.f243486f = true;
        du2.m mVar2 = new du2.m(this);
        this.f243485e = true;
        this.f243488h = new android.support.v4.media.m(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService.class), mVar2, null);
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "connectService");
        android.support.v4.media.m mVar3 = this.f243488h;
        if (mVar3 == null) {
            return true;
        }
        ((android.support.v4.media.g) mVar3.f8937a).f8927b.connect();
        return true;
    }

    public final void Ri() {
        boolean z17;
        android.support.v4.media.session.r rVar = this.f243487g;
        if (rVar != null) {
            rVar.a("COMMAND_UPDATE_INFO", null, null);
        }
        boolean z18 = true;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18) {
            com.tencent.mm.sdk.platformtools.Log.c("FinderSystemPlayerManager", "[sendUpdateInfoCommand] update successfully!", new java.lang.Object[0]);
        } else {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "[sendUpdateInfoCommand] update successfully!");
        }
    }

    public final void Ui(boolean z17, du2.l type) {
        kotlin.jvm.internal.o.g(type, "type");
        if (type != this.f243489i) {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "[setMediaSessionActive] failed, isActive = " + z17 + ", type = " + type + ", currentBusinessType = " + this.f243489i);
            return;
        }
        android.os.Bundle bundle = this.f243491n;
        bundle.putBoolean("key_set_session_active", z17);
        bundle.putBoolean("key_need_cancel_notification", false);
        android.support.v4.media.session.r rVar = this.f243487g;
        if (rVar != null) {
            rVar.a("COMMAND_SET_ACTIVE_AND_CANCEL_NOTIFICATION", this.f243491n, null);
        }
    }

    public final fu2.c wi(du2.l businessType) {
        kotlin.jvm.internal.o.g(businessType, "businessType");
        return (fu2.c) this.f243490m.get(businessType);
    }
}
