package dk5;

/* loaded from: classes9.dex */
public class v4 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234963e;

    public v4(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, java.util.List list) {
        this.f234963e = sendAppMessageWrapperUI;
        this.f234962d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        int i17 = com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.B;
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234963e;
        sendAppMessageWrapperUI.getClass();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        java.util.List list = this.f234962d;
        if (K0 || com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "dealRecord() called with: msgContent = [" + str + "], userName = [" + list + "]");
        } else {
            for (int i18 = 0; i18 < list.size(); i18++) {
                java.lang.String str2 = (java.lang.String) list.get(i18);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "dealRecord() called with: msgContent = [" + str + "], userName = [" + str2 + "]");
                } else {
                    ot0.q v17 = ot0.q.v(str);
                    if (v17 != null) {
                        r45.ul5 A = bt3.g2.A(v17.f348663h0);
                        java.lang.String str3 = (A == null || com.tencent.mm.sdk.platformtools.t8.K0(A.f387463d)) ? v17.f348654f : A.f387463d;
                        v17.f348646d = sendAppMessageWrapperUI.f211019e.field_appId;
                        v17.f348654f = sendAppMessageWrapperUI.getContext().getString(com.tencent.mm.R.string.hfl, str3);
                        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = new com.tencent.mm.autogen.events.RecordOperationEvent();
                        am.eq eqVar = recordOperationEvent.f54663g;
                        eqVar.f6583a = 4;
                        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                        f9Var.d1(ot0.q.u(v17, null, null));
                        eqVar.f6594l = f9Var;
                        eqVar.f6588f = str2;
                        eqVar.f6601s = true;
                        recordOperationEvent.e();
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SendAppMessageWrapperUI", "dealRecord fail msg content is null");
                    }
                }
            }
        }
        this.f234963e.Z6(2, null, null, "", 0, new java.util.LinkedList(list));
        return null;
    }
}
