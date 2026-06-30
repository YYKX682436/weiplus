package x3;

/* loaded from: classes15.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public int f451582a;

    /* renamed from: b, reason: collision with root package name */
    public int f451583b;

    /* renamed from: c, reason: collision with root package name */
    public int f451584c;

    public n() {
        c();
    }

    public int a(androidx.gridlayout.widget.GridLayout gridLayout, android.view.View view, x3.j jVar, int i17, boolean z17) {
        return this.f451582a - jVar.a(view, i17, n3.p1.a(gridLayout));
    }

    public void b(int i17, int i18) {
        this.f451582a = java.lang.Math.max(this.f451582a, i17);
        this.f451583b = java.lang.Math.max(this.f451583b, i18);
    }

    public void c() {
        this.f451582a = Integer.MIN_VALUE;
        this.f451583b = Integer.MIN_VALUE;
        this.f451584c = 2;
    }

    public int d(boolean z17) {
        if (!z17) {
            int i17 = this.f451584c;
            android.util.Printer printer = androidx.gridlayout.widget.GridLayout.f11530o;
            if ((i17 & 2) != 0) {
                return 100000;
            }
        }
        return this.f451582a + this.f451583b;
    }

    public java.lang.String toString() {
        return "Bounds{before=" + this.f451582a + ", after=" + this.f451583b + '}';
    }
}
