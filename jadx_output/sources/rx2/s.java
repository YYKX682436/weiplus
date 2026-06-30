package rx2;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f400993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager) {
        super(0);
        this.f400993d = finderLinearLayoutManager;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f400993d.f132637v;
        if (context != null) {
            return java.lang.Integer.valueOf(android.view.ViewConfiguration.get(context).getScaledTouchSlop());
        }
        kotlin.jvm.internal.o.o("context");
        throw null;
    }
}
