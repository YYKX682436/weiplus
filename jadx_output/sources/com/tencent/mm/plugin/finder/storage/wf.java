package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class wf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.wf f128250d = new com.tencent.mm.plugin.finder.storage.wf();

    public wf() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "强化流是否开启", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_hot_enhance_enable, false, 2, null);
        aVar.a("FINDER_HOT_ENHANCE_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
