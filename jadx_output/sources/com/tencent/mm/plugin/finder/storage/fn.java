package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class fn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.fn f126785d = new com.tencent.mm.plugin.finder.storage.fn();

    public fn() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "发表/草稿模拟失败", null, null, 12, null);
        aVar.a("FINDER_POST_FAILED_IN_STAGE", new java.util.ArrayList(kz5.c0.i(0, 1, 2, 3, 4, 5, 6)), kz5.c0.i("关闭(0)", "裁剪失败", "上传失败", "postCgi失败", "上传时文件不存在", "重编码时文件不存在", "postConfirmCgi失败"));
        return aVar;
    }
}
