package com.tencent.mm.plugin.game.model;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f140266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f140267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f140268f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.a5 f140269g;

    public e(android.content.Context context, com.tencent.mm.pluginsdk.model.app.m mVar, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, com.tencent.mm.pluginsdk.model.app.a5 a5Var) {
        this.f140266d = context;
        this.f140267e = mVar;
        this.f140268f = wXMediaMessage;
        this.f140269g = a5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        android.content.Context context = this.f140266d;
        com.tencent.mm.pluginsdk.model.app.m mVar = this.f140267e;
        java.lang.String str = mVar.field_packageName;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = this.f140268f;
        java.lang.String str2 = mVar.field_appId;
        java.lang.String str3 = mVar.field_openId;
        com.tencent.mm.pluginsdk.model.app.a5 a5Var = this.f140269g;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.w.w(context, str, wXMediaMessage, str2, str3, 0, a5Var, null);
    }
}
