package x3;

/* loaded from: classes15.dex */
public final class e extends x3.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3.j f451569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3.j f451570b;

    public e(x3.j jVar, x3.j jVar2) {
        this.f451569a = jVar;
        this.f451570b = jVar2;
    }

    @Override // x3.j
    public int a(android.view.View view, int i17, int i18) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return (!(n3.v0.d(view) == 1) ? this.f451569a : this.f451570b).a(view, i17, i18);
    }

    @Override // x3.j
    public java.lang.String c() {
        return "SWITCHING[L:" + this.f451569a.c() + ", R:" + this.f451570b.c() + "]";
    }

    @Override // x3.j
    public int d(android.view.View view, int i17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return (!(n3.v0.d(view) == 1) ? this.f451569a : this.f451570b).d(view, i17);
    }
}
