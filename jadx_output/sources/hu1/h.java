package hu1;

/* loaded from: classes15.dex */
public class h extends hu1.a {
    @Override // hu1.a, hu1.g
    public boolean a() {
        return false;
    }

    @Override // hu1.a, hu1.g
    public boolean c() {
        return false;
    }

    @Override // hu1.a, hu1.g
    public boolean e() {
        return false;
    }

    @Override // hu1.a, hu1.g
    public boolean f() {
        return !this.f285071d && this.f285070c.s0().S == 1;
    }

    @Override // hu1.a, hu1.g
    public boolean g() {
        if (super.g() || f()) {
            return true;
        }
        return this.f285070c.i() && this.f285071d;
    }

    @Override // hu1.a, hu1.g
    public boolean i() {
        return false;
    }

    @Override // hu1.a, hu1.g
    public boolean k() {
        return false;
    }

    @Override // hu1.a, hu1.g
    public boolean n() {
        return this.f285069b.f95103a == 3;
    }

    @Override // hu1.a, hu1.g
    public boolean p() {
        return this.f285071d;
    }

    @Override // hu1.a, hu1.g
    public boolean q() {
        return this.f285071d && super.q();
    }

    @Override // hu1.a, hu1.g
    public boolean r() {
        java.util.ArrayList h17 = eu1.f.h(this.f285070c.f());
        com.tencent.mm.plugin.card.ui.p0 p0Var = this.f285069b;
        if ((!p0Var.f95109g || p0Var.f95103a == 4) && !android.text.TextUtils.isEmpty(this.f285070c.a())) {
            return true;
        }
        return (this.f285069b.f95109g && h17.size() > 0) || (!android.text.TextUtils.isEmpty(this.f285070c.a()) && n());
    }

    @Override // hu1.a
    public void x() {
        super.x();
    }
}
