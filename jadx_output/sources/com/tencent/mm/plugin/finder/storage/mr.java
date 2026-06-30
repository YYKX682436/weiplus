package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class mr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.mr f127209d = new com.tencent.mm.plugin.finder.storage.mr();

    public mr() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(0.5f, "拖动进度条倍速阻尼");
        dVar.a("FINDER_SCALE_CLEAN_PARAM_N2", kz5.c0.i(java.lang.Float.valueOf(0.5f), java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(1.5f), java.lang.Float.valueOf(2.0f)), kz5.c0.i("0.5f", "1f", "1.5f", "2f"));
        return dVar;
    }
}
