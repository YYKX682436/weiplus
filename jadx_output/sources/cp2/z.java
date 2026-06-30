package cp2;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f220955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dd2 f220956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(cp2.v0 v0Var, r45.dd2 dd2Var) {
        super(0);
        this.f220955d = v0Var;
        this.f220956e = dd2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.fragment.app.Fragment fragment = this.f220955d.f220933m;
        kotlin.jvm.internal.o.d(fragment);
        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
        kotlin.jvm.internal.o.d(parentFragment);
        ((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) pf5.z.f353948a.b(parentFragment).a(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class)).S6(this.f220956e.getInteger(0));
        return jz5.f0.f302826a;
    }
}
