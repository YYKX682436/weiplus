package vq;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f439191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f439193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f439194g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f439195h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f439196i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f439197m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.util.List list, com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2, java.lang.Object obj, kotlin.jvm.internal.f0 f0Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        super(0);
        this.f439191d = list;
        this.f439192e = emojiDebugUI;
        this.f439193f = c0Var;
        this.f439194g = c0Var2;
        this.f439195h = obj;
        this.f439196i = f0Var;
        this.f439197m = u3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int size = this.f439191d.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mars.xlog.Log.i(this.f439192e.d, "addEmoji: start " + i17 + ' ' + ((java.lang.String) this.f439191d.get(i17)));
            com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f439192e;
            java.lang.String str = (java.lang.String) this.f439191d.get(i17);
            vq.l lVar = new vq.l(this.f439193f, this.f439192e, i17, this.f439196i, this.f439195h, this.f439197m);
            emojiDebugUI.getClass();
            new pr.b(0, 4, kz5.b0.c(str)).l().H(new vq.p(emojiDebugUI, str, lVar));
            if (this.f439193f.f310112d || this.f439194g.f310112d) {
                break;
            }
            java.lang.Object obj = this.f439195h;
            synchronized (obj) {
                obj.wait();
            }
        }
        pm0.v.X(new vq.m(this.f439192e, this.f439196i, this.f439197m));
        return jz5.f0.f302826a;
    }
}
