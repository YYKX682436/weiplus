package x44;

/* loaded from: classes4.dex */
public final class p2 extends k64.s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f451876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(yz5.p pVar) {
        super(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED);
        this.f451876e = pVar;
    }

    @Override // k64.s
    public void b(int i17, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$request$1");
        yz5.p pVar = this.f451876e;
        if (i17 == 0 && (m1Var instanceof ib4.m)) {
            java.lang.Object obj = null;
            try {
                java.lang.Object a17 = k64.t.a(m1Var);
                if (a17 instanceof r45.fm3) {
                    obj = a17;
                }
            } catch (java.lang.Throwable unused) {
            }
            r45.fm3 fm3Var = (r45.fm3) obj;
            if (fm3Var != null) {
                java.lang.String str = fm3Var.f374441d;
                if (!(str == null || str.length() == 0)) {
                    java.lang.String url = fm3Var.f374441d;
                    kotlin.jvm.internal.o.f(url, "url");
                    pVar.invoke(0, url);
                }
            }
            pVar.invoke(-1, "");
        } else {
            pVar.invoke(-2, "");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$request$1");
    }
}
