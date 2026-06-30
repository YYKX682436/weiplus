package i22;

/* loaded from: classes15.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i22.j0 f287979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f287980e;

    public h0(i22.j0 j0Var, java.util.List list) {
        this.f287979d = j0Var;
        this.f287980e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i22.j0 j0Var = this.f287979d;
        j0Var.f287992o.f287967e.clear();
        j0Var.f287992o.f287967e.addAll(this.f287980e);
        j0Var.f287992o.notifyDataSetChanged();
    }
}
