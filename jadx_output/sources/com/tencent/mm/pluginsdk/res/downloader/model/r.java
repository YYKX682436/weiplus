package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f189703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.res.downloader.model.v f189704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189705f;

    public r(com.tencent.mm.pluginsdk.res.downloader.model.s sVar, java.util.List list, com.tencent.mm.pluginsdk.res.downloader.model.v vVar, java.lang.String str) {
        this.f189703d = list;
        this.f189704e = vVar;
        this.f189705f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f189703d.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.pluginsdk.res.downloader.model.h) it.next()).getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if ("CheckResUpdate".equals(this.f189704e.f189728f)) {
                com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
                boolean z18 = l0Var.f189686e;
                java.lang.String str = this.f189705f;
                if (!(z18 ? ((java.util.concurrent.ConcurrentHashMap) l0Var.f189683b.f189692b).containsKey(str) : false)) {
                    com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.a(str);
                }
            }
        }
    }
}
