package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public abstract class a5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f192453a = new com.tencent.mm.sdk.platformtools.n3(xu5.b.a("MicroMsg.ScreenShotUtil"));

    /* renamed from: b, reason: collision with root package name */
    public static final android.os.Handler f192454b = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f192455c = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f192456d = {"_display_name", "_data", "date_added"};

    /* renamed from: e, reason: collision with root package name */
    public static android.database.ContentObserver f192457e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.ref.WeakReference f192458f;

    public static void a(android.content.Context context, com.tencent.mm.sdk.platformtools.f7 f7Var) {
        f192453a.post(new com.tencent.mm.sdk.platformtools.w4(context, f7Var));
    }
}
