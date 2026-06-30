package wo;

/* loaded from: classes12.dex */
public class i0 extends wo.r0 {
    @Override // wo.r0
    public java.lang.String b() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (wo.w0.f447839a) {
            return android.os.Build.VERSION.SDK_INT < 26 ? android.os.Build.SERIAL : com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        return null;
    }
}
