package xn2;

/* loaded from: classes2.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderLongVideoShowLastExitFeedHintEvent f455526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(xn2.p0 p0Var, com.tencent.mm.autogen.events.FinderLongVideoShowLastExitFeedHintEvent finderLongVideoShowLastExitFeedHintEvent) {
        super(0);
        this.f455525d = p0Var;
        this.f455526e = finderLongVideoShowLastExitFeedHintEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xn2.p0 p0Var = this.f455525d;
        if (!p0Var.f455543a.isFinishing()) {
            android.app.Activity activity = p0Var.f455543a;
            if (!activity.isDestroyed()) {
                int a17 = com.tencent.mm.ui.bl.a(activity) + com.tencent.mm.ui.bl.i(activity, -1) + i65.a.b(activity, 24);
                int B = i65.a.B(activity);
                com.tencent.mm.autogen.events.FinderLongVideoShowLastExitFeedHintEvent finderLongVideoShowLastExitFeedHintEvent = this.f455526e;
                do2.b bVar = new do2.b(activity, new xn2.j0(p0Var, finderLongVideoShowLastExitFeedHintEvent, finderLongVideoShowLastExitFeedHintEvent.f54303g.f6937b));
                bVar.e(B / 2, a17);
                p0Var.f455567y = bVar;
                bVar.show();
                pm0.v.V(3000L, new xn2.k0(p0Var));
            }
        }
        return jz5.f0.f302826a;
    }
}
