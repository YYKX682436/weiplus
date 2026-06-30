package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class dc0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.dc0 f126643d = new com.tencent.mm.plugin.finder.storage.dc0();

    public dc0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "发表达人授权开关", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_post_poi_talent_authorize, false, 2, null);
        aVar.a("FINDER_POST_POI_TALENT_AUTHORIZE", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
