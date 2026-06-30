package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.l2 f182936f;

    public i2(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.model.l2 l2Var) {
        this.f182934d = context;
        this.f182935e = str;
        this.f182936f = l2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.e1.t(this.f182934d, this.f182935e, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l8b), new com.tencent.mm.plugin.webview.model.h2(this));
    }
}
