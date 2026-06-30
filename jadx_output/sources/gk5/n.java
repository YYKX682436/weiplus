package gk5;

/* loaded from: classes9.dex */
public final class n extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new fc5.b();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String j17 = ((fc5.b) c7()).j();
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
        ot0.q v17;
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d7()) || (v17 = ot0.q.v(d7())) == null) {
            return;
        }
        fc5.b bVar = (fc5.b) c7();
        long j17 = bVar.getLong(bVar.f43702d + 0);
        fc5.b bVar2 = (fc5.b) c7();
        java.lang.Object obj = com.tencent.mm.pluginsdk.model.app.k0.K(v17, "", "", toUser, "", null, null, "", "", new com.tencent.mm.plugin.msg.MsgIdTalker(j17, bVar2.getString(bVar2.f43702d + 1))).second;
        if (obj != null) {
            com.tencent.mm.ui.transmit.MsgRetransmitUI.O6(toUser, (java.lang.Long) obj);
        }
    }
}
