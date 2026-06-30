package df2;

/* loaded from: classes3.dex */
public final class fm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f230150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.hm f230151e;

    public fm(android.view.ViewGroup viewGroup, df2.hm hmVar) {
        this.f230150d = viewGroup;
        this.f230151e = hmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f230150d.setVisibility(0);
        df2.hm.Z6(this.f230151e);
    }
}
