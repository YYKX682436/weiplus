package il2;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f292068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il2.r f292069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.view.ViewGroup viewGroup, il2.r rVar) {
        super(0);
        this.f292068d = viewGroup;
        this.f292069e = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f292068d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new kl2.q(context, this.f292069e);
    }
}
