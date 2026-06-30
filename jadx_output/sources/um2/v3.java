package um2;

/* loaded from: classes3.dex */
public final class v3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f428994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428995e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(android.view.View view, fm2.c cVar) {
        super(0);
        this.f428994d = view;
        this.f428995e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f428994d;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        return new com.tencent.mm.plugin.finder.live.plugin.na((android.view.ViewGroup) view, this.f428995e);
    }
}
