package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class cz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.cz f126609d = new com.tencent.mm.plugin.finder.storage.cz();

    public cz() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "批量mention更新方式", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_mention_batch_update_method, false, 2, null);
        aVar.a("FinderBatchMentionUpdateMethod", kz5.c0.i(0, 1), kz5.c0.i("分字段更新", "整体更新"));
        return aVar;
    }
}
