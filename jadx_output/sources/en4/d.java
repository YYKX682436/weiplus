package en4;

/* loaded from: classes8.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f255338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255339e;

    public d(android.os.Bundle bundle, java.lang.String str) {
        this.f255338d = bundle;
        this.f255339e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        jx3.f.INSTANCE.d(17080, 43, 1);
        android.os.Bundle bundle = this.f255338d;
        com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Resp(bundle);
        ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).getClass();
        resp.toBundle(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = this.f255339e;
        args.bundle = bundle;
        args.flags = 268435456;
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.send(com.tencent.mm.sdk.platformtools.x2.f193071a, args);
    }
}
