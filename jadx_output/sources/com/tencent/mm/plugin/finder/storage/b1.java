package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.b1 f126494d = new com.tencent.mm.plugin.finder.storage.b1();

    public b1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "发表上传block", null, null, 12, null);
        aVar.a("DEBUG_POST_UPLOAD_BLOCK", new java.util.ArrayList(kz5.c0.i(0, 20)), kz5.c0.i("不block", "block 20秒"));
        return aVar;
    }
}
