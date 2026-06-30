package re5;

/* loaded from: classes12.dex */
public final class i implements vj5.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re5.s f394577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f394578e;

    public i(re5.s sVar, android.widget.RelativeLayout relativeLayout) {
        this.f394577d = sVar;
        this.f394578e = relativeLayout;
    }

    @Override // vj5.k
    public final void n6(int i17) {
        if (this.f394577d.f394594g) {
            return;
        }
        this.f394578e.setPadding(0, i17, 0, 0);
    }
}
