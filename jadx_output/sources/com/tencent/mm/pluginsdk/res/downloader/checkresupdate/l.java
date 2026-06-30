package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes5.dex */
public class l implements com.tencent.mm.app.t2 {
    public l(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.n nVar) {
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.k(this), "checkResUpdate");
    }
}
