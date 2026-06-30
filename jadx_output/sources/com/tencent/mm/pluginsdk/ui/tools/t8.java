package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class t8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f191928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191930f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191931g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f191932h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.f9 f191933i;

    public t8(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.tencent.mm.pluginsdk.ui.tools.f9 f9Var) {
        this.f191928d = context;
        this.f191929e = str;
        this.f191930f = str2;
        this.f191931g = str3;
        this.f191932h = z17;
        this.f191933i = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.STORAGE, d85.f0.M, new com.tencent.mm.pluginsdk.ui.tools.s8(this))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUtil", "business switch close ,return");
            return;
        }
        if (com.tencent.mm.pluginsdk.ui.tools.e9.f191608a == null) {
            com.tencent.mm.pluginsdk.ui.tools.e9.f191608a = new com.tencent.mm.sdk.platformtools.i6(1, "webview-save-image", 1);
        }
        com.tencent.mm.pluginsdk.ui.tools.e9.f191608a.a(new com.tencent.mm.pluginsdk.ui.tools.d9(this.f191928d, this.f191929e, this.f191930f, this.f191931g, this.f191932h, 0, null, this.f191933i));
    }
}
