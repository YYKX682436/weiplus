package yo3;

/* loaded from: classes9.dex */
public final class c implements yo3.d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f464144a = "";

    @Override // yo3.d
    public void a() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard f17 = vr4.f1.wi().Ai().f(this.f464144a);
        if (f17 == null || at4.l1.b(f17)) {
            return;
        }
        reload();
    }

    @Override // yo3.d
    public java.lang.String b() {
        return this.f464144a;
    }

    @Override // yo3.d
    public com.tencent.mm.plugin.wallet_core.model.Bankcard c(boolean z17) {
        return vr4.f1.wi().Ai().f(this.f464144a);
    }

    @Override // yo3.d
    public void d(java.lang.String bindSerial) {
        kotlin.jvm.internal.o.g(bindSerial, "bindSerial");
        this.f464144a = bindSerial;
        to3.c0.Ai().wi().f420970b = bindSerial;
        com.tencent.mm.plugin.wallet_core.model.Bankcard f17 = vr4.f1.wi().Ai().f(bindSerial);
        if (f17 != null) {
            if (at4.l1.b(f17)) {
                at4.x1 Ai = vr4.f1.wi().Ai();
                java.lang.String str = f17.field_bindSerial;
                Ai.getClass();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, str);
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.OfflinePriorBankcardLogic", "can't set as default card: " + f17.field_bindSerial + ", " + f17.field_bankcardType);
        }
    }

    @Override // yo3.d
    public void reload() {
        this.f464144a = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, null);
        to3.c0.Ai().wi().f420970b = this.f464144a;
    }
}
