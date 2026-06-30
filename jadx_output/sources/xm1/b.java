package xm1;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xm1.b f455157d = new xm1.b();

    public b() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (android.os.Build.VERSION.SDK_INT >= 31 && fp.e0.i()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            r2 = o45.wf.f343033k || j62.e.g().l("clicfg_xiaomi_audio_manager_cache", false, true, true);
            if (r2) {
                pm1.e.f356814e.a();
            }
        }
        return java.lang.Boolean.valueOf(r2);
    }
}
