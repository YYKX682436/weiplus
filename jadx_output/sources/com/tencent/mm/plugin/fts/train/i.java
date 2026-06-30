package com.tencent.mm.plugin.fts.train;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f137822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.train.j f137823e;

    public i(com.tencent.mm.plugin.fts.train.j jVar, java.lang.String str) {
        this.f137823e = jVar;
        this.f137822d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f137823e.f137824d.prewarmOne(this.f137822d);
    }
}
