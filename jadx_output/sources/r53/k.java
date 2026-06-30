package r53;

/* loaded from: classes8.dex */
public class k implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f392673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f392674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f392675c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo f392676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f392677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392678f;

    public k(android.os.Bundle bundle, android.content.Context context, q80.f0 f0Var, com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo, int i17, java.lang.String str) {
        this.f392673a = bundle;
        this.f392674b = context;
        this.f392675c = f0Var;
        this.f392676d = jumpInfo;
        this.f392677e = i17;
        this.f392678f = str;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterUtil", "gamelog.util, jumpToPage, openLiteApp failed ");
        q80.f0 f0Var = this.f392675c;
        if (f0Var != null) {
            f0Var.fail();
        }
        r53.f.x(this.f392674b, this.f392676d, this.f392677e, this.f392678f);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUtil", "gamelog.util, jumpToPage, openLiteApp success ");
        android.os.Bundle bundle = this.f392673a;
        java.lang.String string = bundle.getString("pageOrientation");
        if (bundle.getBoolean("isHalfScreen") && "portrait".equals(string)) {
            android.content.Context context = this.f392674b;
            if (context instanceof com.tencent.mm.ui.MMActivity) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUtil", "gamelog.util, halfScreen forcePortrait");
                ((com.tencent.mm.ui.MMActivity) context).setRequestedOrientation(1);
            }
        }
        q80.f0 f0Var = this.f392675c;
        if (f0Var != null) {
            f0Var.success();
        }
    }
}
