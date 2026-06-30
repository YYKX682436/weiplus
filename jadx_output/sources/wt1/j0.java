package wt1;

/* loaded from: classes4.dex */
public class j0 implements com.tencent.mm.modelbase.u0, i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f449297d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f449298e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f449299f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f449300g;

    /* renamed from: h, reason: collision with root package name */
    public xt1.d0 f449301h;

    public j0() {
        gm0.j1.n().f273288b.a(1058, this);
        this.f449300g = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }

    public void a(java.lang.String str, wt1.i0 i0Var) {
        synchronized (this.f449297d) {
            try {
                if (((java.util.HashMap) this.f449297d).get(str) != null) {
                    ((java.util.Set) ((java.util.HashMap) this.f449297d).get(str)).remove(i0Var);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        synchronized (this.f449298e) {
            this.f449298e.remove(str);
        }
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        java.util.Set set;
        java.lang.String str;
        if (!z17) {
            return true;
        }
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        if (e17 != null) {
            e17.m(this);
        }
        synchronized (this.f449297d) {
            set = (java.util.Set) ((java.util.HashMap) this.f449297d).get(this.f449299f);
        }
        if (set == null || set.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardShopLBSManager", "onGetLocation, already cancelled, no need to doScene");
            return false;
        }
        synchronized (this.f449298e) {
            str = (java.lang.String) this.f449298e.get(this.f449299f);
        }
        xt1.d0 d0Var = new xt1.d0(this.f449299f, f17, f18, str);
        if (gm0.j1.n().f273288b.h(d0Var, 0)) {
            this.f449301h = d0Var;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardShopLBSManager", "doScene fail, callback immediate");
            this.f449300g.post(new wt1.h0(this, this.f449299f, false, null));
        }
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        this.f449301h = null;
        xt1.d0 d0Var = (xt1.d0) m1Var;
        java.lang.String str2 = d0Var.f456458f;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardShopLBSManager", "onSceneEnd, reqCardTpId = %s, errType = %d, errCode = %d", str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f449300g;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardShopLBSManager", "onSceneEnd, cardshoplbs fail");
            n3Var.post(new wt1.h0(this, str2, false, null));
        } else {
            java.util.ArrayList arrayList = d0Var.f456459g;
            if (arrayList != null) {
                arrayList.size();
            }
            n3Var.post(new wt1.h0(this, str2, true, arrayList));
        }
    }
}
