package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.r1 f127458d = new com.tencent.mm.plugin.finder.storage.r1();

    public r1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "是否基于视频文件规格筛选", null, null, 12, null);
        aVar.c(e42.d0.clicfg_channel_sharpen_android_fileformat_limit, false);
        aVar.a("ENABLE_FILEFORMAT_LIMIT", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
