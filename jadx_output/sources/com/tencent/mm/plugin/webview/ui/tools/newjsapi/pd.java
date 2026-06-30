package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class pd implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f186441f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f186442g;

    public pd(nw4.k kVar, nw4.y2 y2Var, kotlin.jvm.internal.h0 h0Var, boolean z17) {
        this.f186439d = kVar;
        this.f186440e = y2Var;
        this.f186441f = h0Var;
        this.f186442g = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        java.lang.String errMsg = (java.lang.String) this.f186441f.f310123d;
        nw4.k env = this.f186439d;
        kotlin.jvm.internal.o.g(env, "env");
        nw4.y2 msg = this.f186440e;
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        env.f340863d.e(msg.f341013c, msg.f341019i + errMsg, null);
        android.content.Context context = env.f340860a;
        if (this.f186442g && (context instanceof android.app.Activity)) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
    }
}
