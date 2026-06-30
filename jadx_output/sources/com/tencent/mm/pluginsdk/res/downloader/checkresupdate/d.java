package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent f189561d;

    public d(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e eVar, com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        this.f189561d = checkResUpdateCacheFileEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f189561d.e();
    }
}
