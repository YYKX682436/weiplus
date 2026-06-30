package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class tl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.tl f128092d = new com.tencent.mm.plugin.finder.storage.tl();

    public tl() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "横屏切换额外总加速度阈值", null, null, 12, null);
        aVar.a("FINDER_ORIENTATION_THRESHOLD_ACCELERATION", kz5.c0.i(1, 2, 3, 5, 10), kz5.c0.i("1", "2", "3", "5", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT));
        lb2.j.d(aVar, e42.c0.clicfg_finder_threshold_acceleration, false, 2, null);
        return aVar;
    }
}
