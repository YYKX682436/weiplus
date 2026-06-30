package vh5;

/* loaded from: classes12.dex */
public final class r implements kg3.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh5.s f437238d;

    public r(vh5.s sVar) {
        this.f437238d = sVar;
    }

    @Override // kg3.f
    public void D1(int i17) {
        vh5.q a17 = this.f437238d.a(i17);
        if (a17 != null) {
            a17.q(kg3.s.f307723o.a(a17.f437230d));
        }
    }

    @Override // kg3.f
    public void M1(int i17) {
        vh5.q a17 = this.f437238d.a(i17);
        if (a17 != null) {
            a17.i();
        }
    }

    @Override // kg3.f
    public void onPageSelected(int i17) {
        vh5.q a17 = this.f437238d.a(i17);
        if (a17 != null) {
            a17.F();
        }
    }
}
