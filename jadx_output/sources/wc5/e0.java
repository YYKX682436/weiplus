package wc5;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.g0 f444554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(wc5.g0 g0Var) {
        super(0);
        this.f444554d = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wc5.g0 g0Var = this.f444554d;
        android.view.LayoutInflater.Factory factory = g0Var.f444569d;
        kotlin.jvm.internal.o.e(factory, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryController");
        cd5.a aVar = new cd5.a((uc5.r) factory, null, 2, null);
        aVar.f40660b = new wc5.d0(g0Var);
        return aVar;
    }
}
