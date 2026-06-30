package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class in extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.in f126959d = new com.tencent.mm.plugin.finder.storage.in();

    public in() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(2, "发表使用素材位置弹窗关掉X次后不再出", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_post_material_poi_switch_dialog_close_max_time, false, 2, null);
        aVar.a("FINDER_POST_MATERIAL_POI_SWITCH_DIALOG_CLOSE_MAX_TIME", kz5.c0.i(2, Integer.MAX_VALUE), kz5.c0.i("2次", "无限"));
        return aVar;
    }
}
