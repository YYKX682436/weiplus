package pf4;

/* loaded from: classes4.dex */
public final class e0 extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf4.f0 f353861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f353862b;

    public e0(pf4.f0 f0Var, java.util.List list) {
        this.f353861a = f0Var;
        this.f353862b = list;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        pf4.f0 f0Var = this.f353861a;
        boolean z17 = ((gf4.a) f0Var.f353866d.get(i17)).f271335f;
        java.util.List list = this.f353862b;
        return z17 == ((gf4.a) list.get(i18)).f271335f && com.tencent.mm.sdk.platformtools.t8.D0(((gf4.a) f0Var.f353866d.get(i17)).f271331b, ((gf4.a) list.get(i18)).f271331b);
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        pf4.f0 f0Var = this.f353861a;
        long j17 = ((gf4.a) f0Var.f353866d.get(i17)).f271333d;
        java.util.List list = this.f353862b;
        return j17 == ((gf4.a) list.get(i18)).f271333d && ((gf4.a) f0Var.f353866d.get(i17)).f271334e == ((gf4.a) list.get(i18)).f271334e;
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f353862b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f353861a.f353866d.size();
    }
}
