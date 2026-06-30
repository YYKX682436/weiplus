package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class w30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.w30 f128226d = new com.tencent.mm.plugin.finder.storage.w30();

    public w30() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17 = 1024;
        return java.lang.Long.valueOf(((android.os.Environment.getExternalStorageDirectory().getFreeSpace() / j17) / j17) / j17);
    }
}
