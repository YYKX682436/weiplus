package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f208616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f208617e;

    public g4(android.content.Context context, android.content.Intent intent) {
        this.f208616d = context;
        this.f208617e = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            android.content.Context context = this.f208616d;
            android.content.Intent intent = this.f208617e;
            java.lang.String string = context.getString(com.tencent.mm.R.string.c1n);
            ((kt.c) i0Var).getClass();
            com.tencent.mm.pluginsdk.model.app.w.v(context, intent, string, null, null);
        } catch (java.lang.Throwable unused) {
        }
    }
}
