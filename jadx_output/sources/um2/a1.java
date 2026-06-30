package um2;

/* loaded from: classes3.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f428709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f428710e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(0);
        this.f428709d = viewGroup;
        this.f428710e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.plugin.finder.live.plugin.w0(this.f428709d, this.f428710e);
    }
}
