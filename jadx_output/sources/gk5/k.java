package gk5;

/* loaded from: classes9.dex */
public final class k extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new fc5.f();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String j17 = ((fc5.f) c7()).j();
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
        ((gk5.m1) pf5.z.f353948a.a(activity).a(gk5.m1.class)).U6(d7(), com.tencent.mm.ui.chatting.hd.d(action.f454741b));
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d7())) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardFinderLiveUIC", "transfer finder name card to %s", toUser);
        ot0.q v17 = ot0.q.v(d7());
        if (v17 != null) {
            fc5.f fVar = (fc5.f) c7();
            long j17 = fVar.getLong(fVar.f43702d + 0);
            fc5.f fVar2 = (fc5.f) c7();
            java.lang.Object obj = com.tencent.mm.pluginsdk.model.app.k0.K(v17, "", "", toUser, "", null, null, "", "", new com.tencent.mm.plugin.msg.MsgIdTalker(j17, fVar2.getString(fVar2.f43702d + 1))).second;
            if (obj != null) {
                com.tencent.mm.ui.transmit.MsgRetransmitUI.O6(toUser, (java.lang.Long) obj);
            }
        }
    }
}
