package x3;

/* loaded from: classes15.dex */
public class g extends x3.n {

    /* renamed from: d, reason: collision with root package name */
    public int f451571d;

    public g(x3.h hVar) {
    }

    @Override // x3.n
    public int a(androidx.gridlayout.widget.GridLayout gridLayout, android.view.View view, x3.j jVar, int i17, boolean z17) {
        return java.lang.Math.max(0, super.a(gridLayout, view, jVar, i17, z17));
    }

    @Override // x3.n
    public void b(int i17, int i18) {
        super.b(i17, i18);
        this.f451571d = java.lang.Math.max(this.f451571d, i17 + i18);
    }

    @Override // x3.n
    public void c() {
        super.c();
        this.f451571d = Integer.MIN_VALUE;
    }

    @Override // x3.n
    public int d(boolean z17) {
        return java.lang.Math.max(super.d(z17), this.f451571d);
    }
}
