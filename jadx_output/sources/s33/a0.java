package s33;

/* loaded from: classes8.dex */
public class a0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f402470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f402471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo f402472c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f402473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402474e;

    public a0(q80.f0 f0Var, android.content.Context context, com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo, int i17, java.lang.String str) {
        this.f402470a = f0Var;
        this.f402471b = context;
        this.f402472c = jumpInfo;
        this.f402473d = i17;
        this.f402474e = str;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("GameChatRoom.GameChatUtils", "gamelog.util, jumpToPage, openLiteApp failed ");
        q80.f0 f0Var = this.f402470a;
        if (f0Var != null) {
            f0Var.fail();
        }
        s33.y.j(this.f402471b, this.f402472c, this.f402473d, this.f402474e);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatUtils", "gamelog.util, jumpToPage, openLiteApp success ");
        q80.f0 f0Var = this.f402470a;
        if (f0Var != null) {
            f0Var.success();
        }
    }
}
