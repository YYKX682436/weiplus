package n3;

/* loaded from: classes14.dex */
public class a3 extends n3.z2 {
    public a3(n3.g3 g3Var, android.view.WindowInsets windowInsets) {
        super(g3Var, windowInsets);
    }

    @Override // n3.d3
    public n3.g3 a() {
        return n3.g3.i(this.f334446c.consumeDisplayCutout(), null);
    }

    @Override // n3.y2, n3.d3
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3.a3)) {
            return false;
        }
        n3.a3 a3Var = (n3.a3) obj;
        return java.util.Objects.equals(this.f334446c, a3Var.f334446c) && java.util.Objects.equals(this.f334450g, a3Var.f334450g);
    }

    @Override // n3.d3
    public n3.l f() {
        android.view.DisplayCutout displayCutout = this.f334446c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new n3.l(displayCutout);
    }

    @Override // n3.d3
    public int hashCode() {
        return this.f334446c.hashCode();
    }

    public a3(n3.g3 g3Var, n3.a3 a3Var) {
        super(g3Var, a3Var);
    }
}
