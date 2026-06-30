package um2;

/* loaded from: classes3.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewStub f429015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f429016e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(android.view.ViewStub viewStub, fm2.c cVar) {
        super(0);
        this.f429015d = viewStub;
        this.f429016e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View inflate = this.f429015d.inflate();
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new com.tencent.mm.plugin.finder.live.plugin.t20((android.view.ViewGroup) inflate, this.f429016e);
    }
}
