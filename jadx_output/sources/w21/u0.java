package w21;

/* loaded from: classes9.dex */
public class u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f442478d = java.util.regex.Pattern.compile(":");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f442479a;

    /* renamed from: b, reason: collision with root package name */
    public final long f442480b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f442481c;

    public u0(java.lang.String str) {
        try {
            int i17 = 1;
            java.lang.String[] split = f442478d.split(str.endsWith("\n") ? str.substring(0, str.length() - 1) : str);
            if (split.length != 4 || !com.tencent.mm.storage.z3.H3(split[0])) {
                i17 = 0;
            }
            if (split.length > i17) {
                this.f442479a = split[i17];
            }
            int i18 = i17 + 1;
            if (split.length > i18) {
                this.f442480b = com.tencent.mm.sdk.platformtools.t8.V(split[i18], 0L);
            }
            int i19 = i17 + 2;
            if (split.length > i19) {
                this.f442481c = split[i19].equals("1");
            }
        } catch (java.lang.Exception unused) {
            if (this.f442479a == null) {
                this.f442479a = "";
            }
            this.f442481c = false;
            this.f442480b = 0L;
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
        }
    }

    public static java.lang.String c(java.lang.String str, long j17, boolean z17) {
        return str + ":" + j17 + ":" + (z17 ? 1 : 0) + "\n";
    }

    public java.lang.String a() {
        return this.f442479a;
    }

    public java.lang.String b() {
        return this.f442479a + ":" + this.f442480b + ":" + (this.f442481c ? 1 : 0) + ":\n";
    }
}
