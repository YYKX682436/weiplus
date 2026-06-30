package i53;

/* loaded from: classes12.dex */
public class m3 implements i53.i4 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f288657f = com.tencent.mm.plugin.game.commlib.util.m.b(com.tencent.mm.plugin.game.commlib.util.l.ONE_WEEK) + "video/";

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f288658a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f288659b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f288660c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.commlib.view.CycleProgressView f288661d;

    /* renamed from: e, reason: collision with root package name */
    public i53.l3 f288662e;

    public m3(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f288658a = mMActivity;
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameVideoDownloadPerform", "cancel video download!");
        com.tencent.mm.ui.MMActivity mMActivity = this.f288658a;
        mMActivity.setResult(0);
        mMActivity.finish();
    }

    public final void b(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_GameVideoDownloadUI";
        oVar.field_mediaId = this.f288659b;
        oVar.M1 = str;
        oVar.H1 = 0;
        oVar.Z = 3;
        oVar.f241809y0 = 4;
        com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(this.f288660c));
        oVar.field_fullpath = this.f288660c;
        oVar.f241815c2 = new i53.k3(this, currentTimeMillis, str);
        i53.l3 l3Var = new i53.l3(this, oVar);
        this.f288662e = l3Var;
        com.tencent.mm.sdk.platformtools.u3.i(l3Var, 500L);
    }
}
