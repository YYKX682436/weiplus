package tm2;

/* loaded from: classes3.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewStub f420561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420562e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(android.view.ViewStub viewStub, fm2.b bVar) {
        super(0);
        this.f420561d = viewStub;
        this.f420562e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View inflate = this.f420561d.inflate();
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new com.tencent.mm.plugin.finder.live.plugin.t20((android.view.ViewGroup) inflate, this.f420562e);
    }
}
