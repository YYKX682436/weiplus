package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class v9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.v9 f128181d = new com.tencent.mm.plugin.finder.storage.v9();

    public v9() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(-1, "贴片广告剩余播放时间限制(S)", null, null, 12, null);
        aVar.a("FINDER_CROSS_PLATFORM_CARD_REMAINING_LIMIT", kz5.c0.i(-1, 0, 3, 5, 10), kz5.c0.i("default", "0", "3", "5", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT));
        return aVar;
    }
}
