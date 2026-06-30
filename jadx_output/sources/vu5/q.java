package vu5;

/* loaded from: classes12.dex */
public class q extends vu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final vu5.p f440365e = new vu5.p(null);

    @Override // vu5.k
    public void a(wu5.l lVar) {
        this.f440365e.f440364d.removeCallbacks(lVar);
    }

    @Override // vu5.b
    public vu5.a b() {
        return this.f440365e;
    }

    public void d() {
        this.f440365e.f440364d.removeCallbacksAndMessages(null);
    }

    @Override // vu5.k
    public java.lang.String getName() {
        return "UIPool";
    }
}
