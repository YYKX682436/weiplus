package lr4;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgConvFragment f320760d;

    public q(com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgConvFragment w1wPersonalMsgConvFragment) {
        this.f320760d = w1wPersonalMsgConvFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgConvFragment fragment = this.f320760d;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(fragment).a(pf5.e.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        pf5.e.launch$default((pf5.e) a17, null, null, new lr4.p(null), 3, null);
    }
}
