package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req f189018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f189020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.a5 f189021g;

    public p(com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req req, java.lang.String str, android.content.Context context, com.tencent.mm.pluginsdk.model.app.a5 a5Var) {
        this.f189018d = req;
        this.f189019e = str;
        this.f189020f = context;
        this.f189021g = a5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        this.f189018d.toBundle(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = this.f189019e;
        args.bundle = bundle;
        args.flags = 268435456;
        boolean send = com.tencent.mm.opensdk.channel.MMessageActV2.send(this.f189020f, args);
        com.tencent.mm.pluginsdk.model.app.a5 a5Var = this.f189021g;
        if (a5Var != null) {
            a5Var.a(send, false);
        }
    }
}
