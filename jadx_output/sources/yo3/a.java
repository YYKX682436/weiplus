package yo3;

/* loaded from: classes9.dex */
public final class a implements yo3.d {
    @Override // yo3.d
    public void a() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard c17 = at4.l1.c(true);
        if (c17 != null) {
            yo3.m.s(c17.field_bindSerial);
            to3.c0.Ai().wi().f420970b = c17.field_bindSerial;
        }
    }

    @Override // yo3.d
    public java.lang.String b() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard c17 = at4.l1.c(false);
        if (c17 == null) {
            return "";
        }
        to3.n wi6 = to3.c0.Ai().wi();
        java.lang.String str = c17.field_bindSerial;
        wi6.f420970b = str;
        return str;
    }

    @Override // yo3.d
    public com.tencent.mm.plugin.wallet_core.model.Bankcard c(boolean z17) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard c17 = at4.l1.c(false);
        if (c17 != null) {
            to3.c0.Ai().wi().f420970b = c17.field_bindSerial;
        }
        return c17;
    }

    @Override // yo3.d
    public void d(java.lang.String bindSerial) {
        kotlin.jvm.internal.o.g(bindSerial, "bindSerial");
        yo3.m.s(bindSerial);
        to3.c0.Ai().wi().f420970b = bindSerial;
    }

    @Override // yo3.d
    public void reload() {
    }
}
