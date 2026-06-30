package mm1;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final mm1.f f328659d = new mm1.f();

    public f() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (android.os.Build.VERSION.SDK_INT >= 31 && fp.e0.i()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!o45.wf.f343033k && !j62.e.g().l("clicfg_xiaomi_audio_manager_cache", false, true, true)) {
                return java.lang.Boolean.FALSE;
            }
            pm1.e.f356814e.a();
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}
