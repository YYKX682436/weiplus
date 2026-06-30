package n91;

/* loaded from: classes7.dex */
public class i implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        final com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingAddHistoryRecordIPCData customLoadingAddHistoryRecordIPCData = (com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingAddHistoryRecordIPCData) obj;
        ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: n91.i$$a
            @Override // java.lang.Runnable
            public final void run() {
                n91.i.this.getClass();
                com.tencent.mm.plugin.appbrand.appusage.f3 hj6 = com.tencent.mm.plugin.appbrand.app.r9.hj();
                com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingAddHistoryRecordIPCData customLoadingAddHistoryRecordIPCData2 = customLoadingAddHistoryRecordIPCData;
                hj6.m0(k91.k4.f(customLoadingAddHistoryRecordIPCData2.f77547d), customLoadingAddHistoryRecordIPCData2.f77548e, false, customLoadingAddHistoryRecordIPCData2.f77549f, 1, customLoadingAddHistoryRecordIPCData2.f77550g, false);
            }
        });
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
