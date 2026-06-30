package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent f137479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.FTS5SearchFeatureLogic$2 f137480e;

    public c1(com.tencent.mm.plugin.fts.logic.FTS5SearchFeatureLogic$2 fTS5SearchFeatureLogic$2, com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        this.f137480e = fTS5SearchFeatureLogic$2;
        this.f137479d = checkResUpdateCacheFileEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.logic.f1 f1Var = this.f137480e.f137438d;
        if (f1Var.m(this.f137479d.f54053g.f7761c)) {
            ((com.tencent.mm.plugin.fts.t) f1Var.f137528e).b(65596, new com.tencent.mm.plugin.fts.logic.d1(f1Var, true));
        }
    }
}
