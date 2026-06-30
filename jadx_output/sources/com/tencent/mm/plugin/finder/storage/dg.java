package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class dg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.dg f126650d = new com.tencent.mm.plugin.finder.storage.dg();

    public dg() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "去掉FinderObject中的展示逻辑(POI/活动)，全部由后台通过跳转器控制", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_ignore_finderobject_extend_link, false, 2, null);
        aVar.a("FINDER_IGNORE_FINDEROBJECT_EXTEND_LINK", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
