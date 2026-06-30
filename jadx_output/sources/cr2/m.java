package cr2;

/* loaded from: classes2.dex */
public final class m implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cr2.x f221868a;

    public m(cr2.x xVar) {
        this.f221868a = xVar;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        cr2.x xVar = this.f221868a;
        if (z17) {
            xVar.e(true, "rv-auto-refresh", true);
        } else {
            xVar.e(true, "rv-refresh", false);
        }
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        this.f221868a.e(false, "rv-load-more", false);
        return true;
    }
}
