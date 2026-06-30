package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes5.dex */
public final class n implements com.tencent.mm.pluginsdk.res.downloader.model.o {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.app.t2 f189625a = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.l(this);

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f189626b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a0 f189627c;

    public n() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f189626b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PriorityTickPostSyncTaskEvent>(this, a0Var) { // from class: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper$CheckResUpdateResDownloaderPlugin$2
            {
                this.__eventId = 1590499177;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.PriorityTickPostSyncTaskEvent priorityTickPostSyncTaskEvent) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.hK, 0) == 1) {
                    com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p0.b();
                }
                return false;
            }
        };
        this.f189627c = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a0();
    }
}
