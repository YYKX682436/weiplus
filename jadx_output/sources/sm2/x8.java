package sm2;

/* loaded from: classes3.dex */
public final class x8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewStub f409788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409789e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(android.view.ViewStub viewStub, fm2.a aVar) {
        super(0);
        this.f409788d = viewStub;
        this.f409789e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View inflate = this.f409788d.inflate();
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new com.tencent.mm.plugin.finder.live.plugin.w60((android.view.ViewGroup) inflate, this.f409789e);
    }
}
