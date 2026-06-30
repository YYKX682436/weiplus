package rx2;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f400992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager) {
        super(0);
        this.f400992d = finderLinearLayoutManager;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = this.f400992d;
        android.content.Context context = finderLinearLayoutManager.f132637v;
        if (context != null) {
            return new rx2.q(finderLinearLayoutManager, context);
        }
        kotlin.jvm.internal.o.o("context");
        throw null;
    }
}
