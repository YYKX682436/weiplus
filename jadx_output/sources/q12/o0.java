package q12;

/* loaded from: classes5.dex */
public final class o0 extends com.tencent.mm.sdk.event.n {
    public o0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RevokeNativeMsgEvent event = (com.tencent.mm.autogen.events.RevokeNativeMsgEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.ds dsVar = event.f54714g;
        if (dsVar == null) {
            com.tencent.mars.xlog.Log.i("EmoticonMsgRevokeListener", "event data is null");
        } else {
            boolean z17 = false;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_emoticon_deletion_event_report_android, false)) {
                java.lang.String str = dsVar.f6498c;
                if (android.text.TextUtils.isEmpty(str)) {
                    com.tencent.mars.xlog.Log.i("EmoticonMsgRevokeListener", "talker is empty");
                } else {
                    kotlin.jvm.internal.o.d(str);
                    if (com.tencent.mm.storage.z3.j4(str) || c01.e2.U(str) || com.tencent.mm.storage.z3.D4(str) || r26.i0.y(str, "gh_", false)) {
                        com.tencent.mars.xlog.Log.i("EmoticonMsgRevokeListener", "talker is not real chat ".concat(str));
                    } else {
                        z17 = true;
                    }
                }
                if (z17) {
                    com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(dsVar.f6498c, dsVar.f6496a);
                    if (n17.z0() != null && n17.Q0() != null && n17.getType() == 47) {
                        pm0.v.V(1000L, new q12.n0(this, n17));
                    }
                }
            }
        }
        return true;
    }
}
