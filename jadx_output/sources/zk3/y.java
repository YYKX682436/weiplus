package zk3;

/* loaded from: classes8.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f473524e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(zk3.g0 g0Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f473523d = g0Var;
        this.f473524e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitask.ui.minusscreen.e eVar = (com.tencent.mm.plugin.multitask.ui.minusscreen.e) this.f473523d.f473461s;
        eVar.getClass();
        androidx.appcompat.app.AppCompatActivity context = this.f473524e;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager minusScreenGridLayoutManager = new com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager(context, eVar.f150560b);
        minusScreenGridLayoutManager.B = new com.tencent.mm.plugin.multitask.ui.minusscreen.d();
        minusScreenGridLayoutManager.setItemPrefetchEnabled(true);
        return minusScreenGridLayoutManager;
    }
}
