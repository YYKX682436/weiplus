package com.tencent.mm.plugin.sns.model;

/* loaded from: classes.dex */
public class a0 implements com.tencent.mm.plugin.sns.model.h0 {
    public a0(com.tencent.mm.plugin.sns.model.m0 m0Var) {
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(final java.lang.String str, int i17, final boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
        fs.g.b(com.tencent.mm.plugin.sns.model.j0.class, new fs.o() { // from class: com.tencent.mm.plugin.sns.model.a0$$c
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onImageFinish$1", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
                ((fa4.e) ((com.tencent.mm.plugin.sns.model.j0) nVar)).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogic");
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                java.lang.String str2 = str;
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSSnsImageDownloadLogic", "[%s][media:%s]onImageFinish isOk=%s", "[image-flow]", str2, valueOf);
                com.tencent.mm.autogen.events.SnsImageDownloadedEvent snsImageDownloadedEvent = new com.tencent.mm.autogen.events.SnsImageDownloadedEvent();
                am.yv yvVar = snsImageDownloadedEvent.f54816g;
                yvVar.f8481a = 5;
                yvVar.f8483c = str2;
                yvVar.f8484d = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), str2) + ca4.z0.K(str2);
                snsImageDownloadedEvent.e();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogic");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onImageFinish$1", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
                return false;
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
        fs.g.b(com.tencent.mm.plugin.sns.model.j0.class, new com.tencent.mm.plugin.sns.model.a0$$b());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(final java.lang.String str, final boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
        fs.g.b(com.tencent.mm.plugin.sns.model.j0.class, new fs.o(str, z17) { // from class: com.tencent.mm.plugin.sns.model.a0$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onSightFinish$3", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
                ((fa4.e) ((com.tencent.mm.plugin.sns.model.j0) nVar)).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogic");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogic");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onSightFinish$3", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
                return false;
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(final java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
        fs.g.b(com.tencent.mm.plugin.sns.model.j0.class, new fs.o() { // from class: com.tencent.mm.plugin.sns.model.a0$$d
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onThumbFinish$0", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
                ((fa4.e) ((com.tencent.mm.plugin.sns.model.j0) nVar)).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogic");
                java.lang.String str2 = str;
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSSnsImageDownloadLogic", "[%s][media:%s]onThumbFinish ", "[image-flow]", str2);
                com.tencent.mm.autogen.events.SnsImageDownloadedEvent snsImageDownloadedEvent = new com.tencent.mm.autogen.events.SnsImageDownloadedEvent();
                am.yv yvVar = snsImageDownloadedEvent.f54816g;
                yvVar.f8481a = 2;
                yvVar.f8483c = str2;
                yvVar.f8484d = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), str2) + ca4.z0.V(str2);
                snsImageDownloadedEvent.e();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogic");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onThumbFinish$0", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
                return false;
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
    }
}
