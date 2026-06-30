package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes8.dex */
public class f1 implements com.tencent.xweb.e1 {
    public f1(com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI) {
    }

    @Override // com.tencent.xweb.e1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onCoreInitFinished");
    }

    @Override // com.tencent.xweb.e1
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onCoreInitFailed");
    }
}
