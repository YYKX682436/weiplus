package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class gl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.gl f126846d = new com.tencent.mm.plugin.finder.storage.gl();

    public gl() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号feed不感兴趣新样式", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_no_interested_new_style_android, false);
        aVar.a("FINDER_NO_INTERESTED_NEW_STYLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
