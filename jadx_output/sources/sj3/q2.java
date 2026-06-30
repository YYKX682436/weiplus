package sj3;

/* loaded from: classes14.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f408708d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(sj3.g3 g3Var) {
        super(0);
        this.f408708d = g3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sj3.g3 g3Var = this.f408708d;
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = g3Var.f408520a;
        android.view.View h17 = g3Var.h();
        kotlin.jvm.internal.o.f(h17, "access$getMultitalkScreenProjectorAction(...)");
        android.view.View g17 = g3Var.g();
        kotlin.jvm.internal.o.f(g17, "access$getMultiScreenProjectRedDot(...)");
        return new rj3.a(multiTalkMainUI, h17, "screenShare", g17);
    }
}
