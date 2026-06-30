package um3;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um3.b f429116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(um3.b bVar) {
        super(0);
        this.f429116d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um3.b bVar = this.f429116d;
        return new com.tencent.mm.sdk.coroutines.LifecycleScope(bVar.getActivity().getClass().getSimpleName().concat("_LifecycleScopeUIC"), bVar.getActivity(), 0, 4, null);
    }
}
