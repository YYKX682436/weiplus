package hu1;

/* loaded from: classes15.dex */
public class a implements hu1.g {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f285068a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.card.ui.p0 f285069b;

    /* renamed from: c, reason: collision with root package name */
    public tt1.j f285070c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f285071d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f285072e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f285073f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f285074g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f285075h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f285076i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f285077j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f285078k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f285079l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f285080m = false;

    public a(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f285068a = mMActivity;
    }

    @Override // hu1.g
    public boolean a() {
        return ((android.text.TextUtils.isEmpty(this.f285070c.i0().f385189o) ^ true) && w() && v()) || this.f285071d;
    }

    @Override // hu1.g
    public boolean b() {
        return false;
    }

    @Override // hu1.g
    public boolean c() {
        return this.f285070c.s0().I != null;
    }

    @Override // hu1.g
    public boolean d() {
        return false;
    }

    @Override // hu1.g
    public boolean e() {
        return (this.f285070c.i0().f385198x == null || android.text.TextUtils.isEmpty(this.f285070c.i0().f385198x.f388878d)) ? false : true;
    }

    @Override // hu1.g
    public boolean f() {
        return false;
    }

    @Override // hu1.g
    public boolean g() {
        return !android.text.TextUtils.isEmpty(this.f285070c.s0().F);
    }

    @Override // hu1.g
    public boolean h() {
        if (this.f285070c.i0().f385191q == null || this.f285070c.i0().f385191q.size() < 1) {
            return false;
        }
        return (w() && v()) || this.f285071d;
    }

    @Override // hu1.g
    public boolean i() {
        int i17;
        return (this.f285069b.f95103a == 6 && (!this.f285070c.F() || this.f285070c.y())) || (i17 = this.f285069b.f95103a) == 5 || (i17 == 23 && this.f285070c.z());
    }

    @Override // hu1.g
    public boolean j() {
        return false;
    }

    @Override // hu1.g
    public boolean k() {
        return !this.f285070c.F();
    }

    @Override // hu1.g
    public boolean l() {
        return this instanceof hu1.b;
    }

    @Override // hu1.g
    public boolean m() {
        return this.f285072e;
    }

    @Override // hu1.g
    public boolean n() {
        return false;
    }

    @Override // hu1.g
    public boolean o() {
        return !this.f285070c.d();
    }

    @Override // hu1.g
    public boolean p() {
        return true;
    }

    @Override // hu1.g
    public boolean q() {
        return (this.f285070c.s0().M == null || this.f285070c.s0().M.f372343g == null || this.f285070c.s0().M.f372343g.size() <= 0 || android.text.TextUtils.isEmpty((java.lang.CharSequence) this.f285070c.s0().M.f372343g.get(0))) ? false : true;
    }

    @Override // hu1.g
    public boolean r() {
        return false;
    }

    public java.lang.String s() {
        return !android.text.TextUtils.isEmpty(this.f285070c.s0().T) ? this.f285070c.s0().T : this.f285070c.i0().f385192r == 0 ? this.f285068a.getString(com.tencent.mm.R.string.aug) : this.f285070c.i0().f385193s == 0 ? !android.text.TextUtils.isEmpty(this.f285070c.s0().f388571z) ? this.f285070c.s0().f388571z : this.f285068a.getString(com.tencent.mm.R.string.ara) : "";
    }

    public boolean t() {
        return !this.f285070c.d0() && (lu1.a0.u(this.f285069b.f95103a) || lu1.a0.w(this.f285069b.f95103a) || this.f285069b.f95103a == 23);
    }

    public boolean u() {
        return !this.f285070c.y() && this.f285069b.f95103a == 6;
    }

    public boolean v() {
        int i17;
        int i18 = this.f285069b.f95103a;
        return i18 == 3 || (i18 == 6 && this.f285070c.i0().f385188n == 0) || (i17 = this.f285069b.f95103a) == 4 || i17 == 5 || i17 == 15;
    }

    public boolean w() {
        return this.f285070c.i0().f385181d == 0 || this.f285070c.i0().f385181d == 1 || this.f285070c.i0().f385181d == 2;
    }

    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardBaseShowLogic", "updateAcceptState()");
        if (!lu1.a0.u(this.f285069b.f95103a) && !lu1.a0.w(this.f285069b.f95103a)) {
            int i17 = this.f285069b.f95103a;
            if (i17 == 6) {
                if (this.f285070c.y()) {
                    this.f285072e = true;
                    this.f285073f = true;
                    this.f285076i = false;
                } else if (this.f285070c.F()) {
                    this.f285079l = true;
                    this.f285076i = true;
                    this.f285074g = true;
                    this.f285075h = true;
                } else {
                    this.f285072e = false;
                    this.f285073f = false;
                    this.f285076i = false;
                    this.f285074g = true;
                }
            } else if (lu1.a0.v(i17)) {
                this.f285072e = false;
                this.f285073f = false;
                this.f285074g = true;
                if (this.f285070c.F()) {
                    this.f285079l = true;
                    this.f285076i = true;
                    this.f285075h = true;
                } else {
                    this.f285080m = true;
                }
            } else if (this.f285069b.f95103a == 23) {
                if (this.f285070c.d0()) {
                    this.f285072e = true;
                    this.f285073f = true;
                    this.f285076i = false;
                    this.f285077j = true;
                } else {
                    this.f285072e = true;
                    this.f285073f = false;
                    this.f285076i = false;
                    this.f285077j = true;
                }
                if (!android.text.TextUtils.isEmpty(this.f285069b.f95106d) && !this.f285069b.f95106d.equals(c01.z1.r()) && !this.f285070c.z()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardBaseShowLogic", " detail page");
                    this.f285072e = false;
                    this.f285073f = false;
                    this.f285074g = true;
                    if (this.f285070c.F()) {
                        this.f285079l = true;
                        this.f285076i = true;
                        this.f285075h = true;
                    }
                }
            }
        } else if (this.f285070c.d0()) {
            this.f285072e = true;
            this.f285073f = true;
            this.f285078k = true;
            this.f285076i = true;
            this.f285077j = true;
        } else if (this.f285070c.d0()) {
            this.f285072e = false;
            this.f285073f = false;
            this.f285076i = false;
        } else {
            this.f285072e = true;
            this.f285073f = false;
            if (this.f285070c.e()) {
                this.f285079l = true;
                this.f285076i = true;
                this.f285075h = true;
            } else {
                this.f285076i = false;
            }
            this.f285077j = true;
        }
        if (this.f285070c.e()) {
            this.f285072e = false;
            this.f285073f = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardBaseShowLogic", "need direct jump!");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardBaseShowLogic", "not need direct jump!");
        }
        if (this.f285071d) {
            this.f285072e = false;
            this.f285073f = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardBaseShowLogic", "updateAcceptView to gone!");
        } else if (this.f285072e) {
            this.f285071d = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardBaseShowLogic", "set mIsAcceptedCard is false!");
        } else {
            this.f285071d = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardBaseShowLogic", "set mIsAcceptedCard is true");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardBaseShowLogic", "mIsAcceptedCard:" + this.f285071d);
    }
}
