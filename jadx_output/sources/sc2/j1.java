package sc2;

/* loaded from: classes2.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f405980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f405981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f405982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405983g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, android.view.ViewGroup viewGroup3, android.view.View view) {
        super(0);
        this.f405980d = viewGroup;
        this.f405981e = viewGroup2;
        this.f405982f = viewGroup3;
        this.f405983g = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f405980d;
        viewGroup.setVisibility(0);
        viewGroup.setAlpha(1.0f);
        this.f405981e.setVisibility(8);
        this.f405982f.animate().setDuration(250L).alpha(1.0f);
        android.view.View view = this.f405983g;
        if (view.getVisibility() == 0) {
            view.animate().setDuration(250L).alpha(1.0f);
        }
        return jz5.f0.f302826a;
    }
}
