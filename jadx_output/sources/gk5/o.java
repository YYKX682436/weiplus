package gk5;

/* loaded from: classes9.dex */
public final class o extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new fc5.h();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String j17 = ((fc5.h) c7()).j();
        return j17 == null ? "" : j17;
    }

    @Override // m50.x
    public int b7() {
        return 49;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((gk5.m1) pf5.z.f353948a.a(activity).a(gk5.m1.class)).W6(action);
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d7())) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardFinderTopicUIC", "transfer finder topic to %s", toUser);
        ot0.q v17 = ot0.q.v(d7());
        if (v17 != null) {
            android.util.Pair wi6 = ((ez.w0) ot0.j1.a()).wi(v17, "", "", toUser, "", null, true);
            if (!((wi6.first == null || wi6.second == null) ? false : true)) {
                wi6 = null;
            }
            if (wi6 != null) {
                com.tencent.mm.ui.transmit.MsgRetransmitUI.O6(toUser, (java.lang.Long) wi6.second);
            }
        }
    }
}
