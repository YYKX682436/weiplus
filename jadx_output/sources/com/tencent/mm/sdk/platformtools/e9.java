package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public class e9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f192658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m3.a f192659e;

    public e9(android.content.Context context, m3.a aVar) {
        this.f192658d = context;
        this.f192659e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean b17 = fp.q.b(null);
        android.content.Context context = this.f192658d;
        if (!b17) {
            dp.a.makeText(context, com.tencent.mm.R.string.f490391to, 1).show();
            return;
        }
        if ((context instanceof android.app.Activity) || ((context instanceof android.content.ContextWrapper) && (((android.content.ContextWrapper) context).getBaseContext() instanceof android.app.Activity))) {
            com.tencent.mm.sdk.platformtools.d9 d9Var = com.tencent.mm.sdk.platformtools.g9.f192720c;
            d9Var.f192544h = this.f192659e;
            d9Var.a(context);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Business.Entry#showAlert error: the given context is not activty, context = ");
            sb6.append(context == null ? "null" : context.getClass());
            com.tencent.mars.xlog.Log.i("MicroMsg.WeChatBrands", sb6.toString());
        }
    }
}
