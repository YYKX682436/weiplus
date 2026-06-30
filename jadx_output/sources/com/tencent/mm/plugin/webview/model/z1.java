package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.l2 f183222f;

    public z1(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.model.l2 l2Var) {
        this.f183220d = context;
        this.f183221e = str;
        this.f183222f = l2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f183220d;
        if (context == null || !(context instanceof android.app.Activity) || ((android.app.Activity) context).isFinishing()) {
            return;
        }
        db5.e1.t(context, this.f183221e, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l8b), new com.tencent.mm.plugin.webview.model.y1(this));
    }
}
