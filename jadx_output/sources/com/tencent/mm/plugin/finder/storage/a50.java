package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class a50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.a50 f126385d = new com.tencent.mm.plugin.finder.storage.a50();

    public a50() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "声明原创标记外显", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_show_original, false, 2, null);
        aVar.a("SHOW_ORIGINAL", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
