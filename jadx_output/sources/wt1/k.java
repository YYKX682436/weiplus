package wt1;

/* loaded from: classes15.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f449302a;

    /* renamed from: b, reason: collision with root package name */
    public tt1.j f449303b;

    /* renamed from: c, reason: collision with root package name */
    public int f449304c = 3;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f449305d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public xt1.b f449306e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f449307f;

    public k(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f449302a = mMActivity;
    }

    public final void a() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int i17 = this.f449303b.s0().f388565x;
        java.util.List list = this.f449305d;
        if (i17 >= 1 && this.f449307f == null) {
            xt1.b bVar = new xt1.b();
            bVar.f456443t = 1;
            if (android.text.TextUtils.isEmpty(this.f449303b.s0().Y)) {
                bVar.f379843d = c(com.tencent.mm.R.string.ari);
            } else {
                bVar.f379843d = this.f449303b.s0().Y;
            }
            bVar.f379844e = "";
            bVar.f379845f = "";
            bVar.f379846g = "card://jump_shop_list";
            ((java.util.ArrayList) list).add(bVar);
            return;
        }
        if (this.f449303b.s0().f388565x < 1 || (arrayList = this.f449307f) == null || arrayList.size() < 1) {
            return;
        }
        xt1.b bVar2 = new xt1.b();
        bVar2.f456443t = 1;
        r45.nu nuVar = (r45.nu) this.f449307f.get(0);
        if (!android.text.TextUtils.isEmpty(this.f449303b.s0().Y)) {
            bVar2.f379843d = this.f449303b.s0().Y;
        } else if (this.f449303b.o()) {
            bVar2.f379843d = c(com.tencent.mm.R.string.ari);
        } else if (nuVar.f381679n >= 5000.0f) {
            bVar2.f379843d = c(com.tencent.mm.R.string.ari);
        } else {
            if (this.f449303b.s0().f388565x == 1 || this.f449307f.size() == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailDataMgr", "shop_count is 1 or mShopList size is 1");
                return;
            }
            bVar2.f379843d = c(com.tencent.mm.R.string.aro);
        }
        if (!this.f449303b.o() || nuVar.f381679n >= 2000.0f) {
            bVar2.f379844e = "";
        } else {
            int i18 = this.f449303b.s0().f388565x;
            com.tencent.mm.ui.MMActivity mMActivity = this.f449302a;
            if (i18 > 1 || ((arrayList2 = this.f449307f) != null && arrayList2.size() > 1)) {
                bVar2.f379844e = mMActivity.getString(com.tencent.mm.R.string.f490801au5, lu1.a0.D(mMActivity, nuVar.f381679n));
            } else {
                bVar2.f379844e = lu1.a0.D(mMActivity, nuVar.f381679n);
            }
        }
        bVar2.f379845f = "";
        bVar2.f379846g = "card://jump_shop_list";
        ((java.util.ArrayList) list).add(bVar2);
    }

    public xt1.b b() {
        int i17;
        xt1.b bVar = new xt1.b();
        bVar.f456443t = 1;
        boolean z17 = lu1.a0.u(this.f449304c) || lu1.a0.w(this.f449304c) || (i17 = this.f449304c) == 23 ? !(!this.f449303b.d0() || this.f449303b.s0().P == null || android.text.TextUtils.isEmpty(this.f449303b.s0().P.f374867d) || android.text.TextUtils.isEmpty(this.f449303b.s0().f388548g)) : !(i17 != 6 || !this.f449303b.y() || this.f449303b.s0().P == null || android.text.TextUtils.isEmpty(this.f449303b.s0().P.f374867d) || android.text.TextUtils.isEmpty(this.f449303b.s0().f388548g));
        bVar.f456445v = z17;
        if (!z17 && !android.text.TextUtils.isEmpty(this.f449303b.s0().H)) {
            bVar.f379843d = this.f449303b.s0().H;
        } else if (c01.e2.J(this.f449303b.s0().f388548g)) {
            bVar.f379843d = c(com.tencent.mm.R.string.au8);
            bVar.f456445v = false;
        } else {
            bVar.f379843d = c(com.tencent.mm.R.string.au7);
            if (this.f449303b.s0().P == null || this.f449303b.s0().P.f374868e != 1) {
                bVar.f456446w = false;
            } else {
                bVar.f456446w = true;
            }
        }
        if (!android.text.TextUtils.isEmpty(this.f449303b.s0().f388544J)) {
            bVar.f379844e = this.f449303b.s0().f388544J;
        }
        bVar.f379845f = "";
        bVar.f379846g = "card://jump_service";
        this.f449306e = bVar;
        return bVar;
    }

    public final java.lang.String c(int i17) {
        return this.f449302a.getString(i17);
    }

    public java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(this.f449303b.s0().f388568y)) {
            sb6.append(this.f449303b.s0().f388568y);
        } else if (this.f449303b.o()) {
            sb6.append(c(com.tencent.mm.R.string.f490799au3));
        } else if (this.f449303b.d()) {
            sb6.append(c(com.tencent.mm.R.string.f490787as3));
        } else if (this.f449303b.X()) {
            sb6.append(c(com.tencent.mm.R.string.arm));
        } else if (this.f449303b.Q()) {
            sb6.append(c(com.tencent.mm.R.string.asa));
        } else if (this.f449303b.m0()) {
            sb6.append(c(com.tencent.mm.R.string.atc));
        }
        return sb6.toString();
    }
}
