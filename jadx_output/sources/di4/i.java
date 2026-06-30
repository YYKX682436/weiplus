package di4;

/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final di4.i f232782a = new di4.i();

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.lifecycle.j0 f232783b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f232784c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f232785d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f232786e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f232787f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f232788g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f232789h;

    static {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(bool);
        f232783b = j0Var;
        jz5.h.b(di4.f.f232779d);
        jz5.h.b(di4.e.f232778d);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusLogicConfig", "BtnMoreRedDot publish:false kv:" + com.tencent.mm.sdk.platformtools.o4.M("status.kv_name").i("status.btn_more_red", true));
        if (bool != null) {
            j0Var.postValue(bool);
        }
        f232784c = jz5.h.b(di4.d.f232777d);
        f232785d = jz5.h.b(di4.h.f232781d);
        f232786e = jz5.h.b(di4.a.f232775d);
        f232787f = jz5.h.b(di4.g.f232780d);
        f232788g = jz5.h.b(k0.n1.C);
        f232789h = jz5.h.b(di4.c.f232776d);
    }

    public static final boolean a(di4.i iVar, e65.a aVar, java.lang.String str) {
        iVar.getClass();
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean z17 = false;
        boolean z18 = z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c;
        int h17 = z18 ? bm5.o1.f22719a.h(aVar) : -1;
        java.lang.String str3 = "repairerConfig";
        if (z18 && h17 == 1) {
            z17 = true;
        } else if (!z18 || h17 != 2) {
            z17 = j62.e.g().l(aVar.k(), false, true, true);
            str3 = "expt";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusLogicConfig", str + " enable=" + z17 + ", source=" + str3 + ", useRepairer=" + z18 + ", repairerConfig=" + h17);
        return z17;
    }

    public static final boolean d() {
        f232782a.getClass();
        return ((java.lang.Boolean) f232784c.getValue()).booleanValue();
    }

    public final boolean c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusLogicConfig", "DialogRedDot publish:false kv:" + com.tencent.mm.sdk.platformtools.o4.M("status.kv_name").i("status.dialog_red", true));
        return false;
    }

    public final boolean e() {
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.textstatus.RepairerConfigTextStatusCgiOpt()) == 1 && ai4.b0.f5126d;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusLogicConfig", "isUseCgiOptConfig %b", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public final void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusLogicConfig", "updateDialogRedDot:" + z17);
        com.tencent.mm.sdk.platformtools.o4.M("status.kv_name").G("status.dialog_red", z17);
    }

    public final void g(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusLogicConfig", "updateProfileBtnMoreRedDot:" + z17);
        com.tencent.mm.sdk.platformtools.o4.M("status.kv_name").G("status.btn_more_red", z17);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        if (valueOf != null) {
            valueOf.booleanValue();
            f232783b.postValue(valueOf);
        }
    }
}
