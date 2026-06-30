package kc2;

/* loaded from: classes15.dex */
public class c0 implements zy2.v7 {

    /* renamed from: a, reason: collision with root package name */
    public final kc2.g1 f306331a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f306332b;

    /* renamed from: c, reason: collision with root package name */
    public final zy2.fa f306333c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f306334d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f306335e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f306336f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f306337g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f306338h;

    /* renamed from: i, reason: collision with root package name */
    public final kc2.x1 f306339i;

    /* renamed from: j, reason: collision with root package name */
    public final kc2.x1 f306340j;

    /* renamed from: k, reason: collision with root package name */
    public final kc2.x1 f306341k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f306342l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f306343m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f306344n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.storage.u3 f306345o;

    /* renamed from: p, reason: collision with root package name */
    public int f306346p;

    /* renamed from: q, reason: collision with root package name */
    public int f306347q;

    /* renamed from: r, reason: collision with root package name */
    public int f306348r;

    public c0(kc2.g1 manager, com.tencent.mm.sdk.platformtools.n3 handler, zy2.fa redDotManager, java.lang.String leftEntrancePath, java.lang.String rightEntrancePath, java.util.List findTabPreferenceKey) {
        kotlin.jvm.internal.o.g(manager, "manager");
        kotlin.jvm.internal.o.g(handler, "handler");
        kotlin.jvm.internal.o.g(redDotManager, "redDotManager");
        kotlin.jvm.internal.o.g(leftEntrancePath, "leftEntrancePath");
        kotlin.jvm.internal.o.g(rightEntrancePath, "rightEntrancePath");
        kotlin.jvm.internal.o.g(findTabPreferenceKey, "findTabPreferenceKey");
        this.f306331a = manager;
        this.f306332b = handler;
        this.f306333c = redDotManager;
        this.f306334d = leftEntrancePath;
        this.f306335e = rightEntrancePath;
        this.f306336f = findTabPreferenceKey;
        this.f306337g = jz5.h.b(kc2.x.f306518d);
        this.f306338h = "FinderKaraInfoManager.Finder";
        this.f306339i = kc2.x1.f306526n;
        this.f306340j = kc2.x1.f306525m;
        this.f306341k = kc2.x1.f306527o;
        this.f306342l = jz5.h.b(new kc2.v(this));
        this.f306343m = jz5.h.b(new kc2.w(this));
        this.f306344n = jz5.h.b(new kc2.b0(this));
        this.f306345o = com.tencent.mm.storage.u3.USERINFO_FINDER_KARA_FINDER_LAST_EXIT_STRING_SYNC;
        handler.post(new kc2.u(this));
    }

    public kc2.x1 b() {
        return this.f306339i;
    }

    public final kc2.a2 c() {
        return (kc2.a2) ((jz5.n) this.f306342l).getValue();
    }

    public kc2.x1 d() {
        return this.f306340j;
    }

    public final kc2.a2 e() {
        return (kc2.a2) ((jz5.n) this.f306343m).getValue();
    }

    public final float f(int i17, int i18) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0.0f;
        }
        valueOf.intValue();
        return i18 - i17;
    }

    public com.tencent.mm.storage.u3 g() {
        return this.f306345o;
    }

    public com.tencent.mm.plugin.finder.extension.reddot.jb h() {
        if (this.f306334d.length() == 0) {
            return null;
        }
        return zy2.ia.S0(this.f306333c, this.f306334d, null, false, false, 2, null);
    }

    public kc2.x1 i() {
        return this.f306341k;
    }

    public final kc2.a2 j() {
        return (kc2.a2) ((jz5.n) this.f306344n).getValue();
    }

    public org.json.JSONObject k() {
        r45.f03 I0;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (n()) {
            int e17 = c01.id.e();
            jSONObject.put("is_open", 1);
            jSONObject.put("location_index", this.f306331a.f().b(this.f306336f));
            int i17 = this.f306346p;
            if (i17 > 0) {
                jSONObject.put("exit_interval", e17 - i17);
            }
            int i18 = this.f306347q;
            if (i18 > 0) {
                jSONObject.put("consume_reddot_interval", e17 - i18);
            }
            int i19 = this.f306348r;
            if (i19 > 0) {
                jSONObject.put("exopse_reddot_interval", e17 - i19);
            }
            java.util.List b17 = c().b(e17);
            int i27 = 0;
            jSONObject.put("click_with_reddot_count", kc2.l1.f(b17, (char) 0, 1, null));
            jSONObject.put("click_without_reddot_count", e().d());
            java.util.List b18 = j().b(e17);
            jSONObject.put("reddot_expose_count", kc2.l1.f(b18, (char) 0, 1, null));
            jSONObject.put("reddot_ctr_value", kc2.l1.f(kc2.l1.a(b17, b18), (char) 0, 1, null));
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            com.tencent.mm.plugin.finder.extension.reddot.jb a17 = zy2.v7.a(this, false, false, 3, null);
            r45.f03 I02 = a17 != null ? a17.I0(this.f306335e) : null;
            jSONObject2.put("has", a17 != null ? 1 : 0);
            jSONObject2.put("type", a17 != null ? a17.field_ctrType : 0);
            jSONObject2.put("showtype", I02 != null ? java.lang.Integer.valueOf(I02.f373887d) : null);
            jSONObject2.put("receive_time", a17 != null ? java.lang.Long.valueOf(a17.field_time) : null);
            jSONObject2.put("is_ignore", (I02 == null || I02.f373899s != 1) ? 0 : 1);
            com.tencent.mm.plugin.finder.extension.reddot.jb h17 = h();
            if (h17 != null && (I0 = h17.I0(this.f306334d)) != null) {
                i27 = I0.f373888e;
            }
            jSONObject2.put("count", i27);
            jSONObject.put("reddot_info", jSONObject2);
        }
        return jSONObject;
    }

    public com.tencent.mm.plugin.finder.extension.reddot.jb l(boolean z17, boolean z18) {
        com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(this.f306333c, this.f306335e, null, z17, z18, 2, null);
        if (((java.lang.Boolean) ((jz5.n) this.f306337g).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.i(m(), "getRightRedDot " + this.f306335e + '=' + S0 + ", checkFreqCtrl=" + z17 + ", checkExposeLimit=" + z18);
        }
        return S0;
    }

    public java.lang.String m() {
        return this.f306338h;
    }

    public boolean n() {
        return ((c61.l7) i95.n0.c(c61.l7.class)).Ik();
    }
}
