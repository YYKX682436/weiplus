package ju3;

/* loaded from: classes4.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout f301982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout webviewScreenShotPluginLayout) {
        super(1);
        this.f301982d = webviewScreenShotPluginLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel it = (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) obj;
        kotlin.jvm.internal.o.g(it, "it");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = it.f155662f;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        java.lang.String r17 = c01.z1.r();
        java.lang.String format = java.lang.String.format("%s#%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), r17}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        jq0Var.e(r17);
        jq0Var.j(r17);
        jq0Var.g(3);
        jq0Var.c(currentTimeMillis);
        jq0Var.d(format);
        jq0Var.i(format);
        gp0Var.g0(format);
        gp0Var.A0(str);
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (j17) {
            gp0Var.B0(str);
        } else {
            c4Var.f6326l = com.tencent.mm.R.string.cad;
        }
        gp0Var.h0(2);
        bq0Var.f370964f.add(gp0Var);
        bq0Var.o(jq0Var);
        c4Var.f6315a = bq0Var;
        android.content.Context context = this.f301982d.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        c4Var.f6323i = (android.app.Activity) context;
        c4Var.f6317c = 2;
        doFavoriteEvent.e();
        return jz5.f0.f302826a;
    }
}
