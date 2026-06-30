package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f188908d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f188909e;

    /* renamed from: f, reason: collision with root package name */
    public final int f188910f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f188911g;

    public g3(com.tencent.mm.sdk.platformtools.n3 n3Var, java.lang.String str, int i17, java.lang.String str2) {
        this.f188908d = null;
        this.f188909e = null;
        this.f188910f = 0;
        this.f188911g = null;
        this.f188908d = n3Var;
        this.f188909e = str;
        this.f188910f = i17;
        this.f188911g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2 = this.f188909e;
        if (str2 == null || str2.length() == 0 || (str = this.f188911g) == null || str.length() == 0) {
            return;
        }
        com.tencent.mm.pluginsdk.model.app.n3 n3Var = new com.tencent.mm.pluginsdk.model.app.n3(str2, this.f188910f, com.tencent.mm.sdk.platformtools.t8.u0(str));
        android.os.Message obtain = android.os.Message.obtain();
        obtain.obj = n3Var;
        this.f188908d.sendMessage(obtain);
    }
}
