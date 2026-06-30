package tm2;

/* loaded from: classes3.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewStub f420566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(android.view.ViewStub viewStub, fm2.b bVar) {
        super(0);
        this.f420566d = viewStub;
        this.f420567e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View inflate = this.f420566d.inflate();
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new com.tencent.mm.plugin.finder.live.plugin.w60((android.view.ViewGroup) inflate, this.f420567e);
    }
}
