package hy4;

/* loaded from: classes8.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f286185a = {com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt), com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyx), com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyr)};

    /* renamed from: b, reason: collision with root package name */
    public static java.util.regex.Pattern f286186b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f286187c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Boolean f286188d = null;

    public static void a(java.lang.String str) {
        com.tencent.mm.app.MMCrashReportContents.Q.e(str);
        com.tencent.mm.app.MMBugReportContents.f53230k.f53724n.e(str);
        com.tencent.mm.sdk.platformtools.o4.L().putString("webview_url_prefs_url", str);
    }
}
