package vq;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f439178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f439180f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f439181g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f439182h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f439183i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, int i17, kotlin.jvm.internal.f0 f0Var, java.lang.Object obj, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        super(1);
        this.f439178d = c0Var;
        this.f439179e = emojiDebugUI;
        this.f439180f = i17;
        this.f439181g = f0Var;
        this.f439182h = obj;
        this.f439183i = u3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f439178d.f310112d = !((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i(this.f439179e.d, "addEmoji: " + this.f439180f + ", " + this.f439178d.f310112d);
        kotlin.jvm.internal.f0 f0Var = this.f439181g;
        f0Var.f310116d = f0Var.f310116d + 1;
        pm0.v.X(new vq.k(this.f439183i, this.f439179e, f0Var));
        java.lang.Object obj2 = this.f439182h;
        synchronized (obj2) {
            obj2.notifyAll();
        }
        return jz5.f0.f302826a;
    }
}
