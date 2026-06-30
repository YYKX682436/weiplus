package com.tencent.mm.plugin.game.commlib.util;

/* loaded from: classes8.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f139400a;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.game.commlib.util.b f139401b;

    public static boolean a() {
        android.os.PowerManager powerManager = (android.os.PowerManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isPowerSaveMode();
        }
        return false;
    }
}
