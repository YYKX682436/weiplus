package hl2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final hl2.a f282099a = new hl2.a();

    /* renamed from: b, reason: collision with root package name */
    public static long f282100b;

    public final boolean a() {
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3727d8).getValue()).r()).intValue();
        if (intValue != 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveCreateLivePrepareSwitch", "isEnableNetworkIdentityAuth configValue=" + intValue);
            return intValue == 1;
        }
        long j17 = f282100b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FINDER_LIVE_CREATE_LIVE_PREPARE_SWITCH_FLAG enableNetworkIdentityAuth: ");
        long j18 = j17 & 32;
        sb6.append(j18 != 0);
        com.tencent.mars.xlog.Log.i("FinderLiveCreateLivePrepareSwitch", sb6.toString());
        return j18 != 0;
    }
}
