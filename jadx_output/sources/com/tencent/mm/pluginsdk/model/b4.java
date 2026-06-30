package com.tencent.mm.pluginsdk.model;

/* loaded from: classes4.dex */
public class b4 extends android.os.FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f189242a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.a4 f189243b;

    public b4(java.lang.String str, com.tencent.mm.pluginsdk.model.a4 a4Var) {
        super(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenshotObserver", "observer  " + str);
        this.f189243b = a4Var;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i17, java.lang.String str) {
        if (str == null || i17 != 8) {
            return;
        }
        java.lang.String str2 = this.f189242a;
        if (str2 == null || !str.equalsIgnoreCase(str2)) {
            this.f189242a = str;
            this.f189243b.a(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenshotObserver", "Send event to listener. ".concat(str));
        }
    }
}
