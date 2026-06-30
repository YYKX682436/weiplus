package vq;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f439187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f439188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, kotlin.jvm.internal.f0 f0Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        super(0);
        this.f439186d = emojiDebugUI;
        this.f439187e = f0Var;
        this.f439188f = u3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dp.a.makeText((android.content.Context) this.f439186d, (java.lang.CharSequence) ("added " + this.f439187e.f310116d), 0).show();
        this.f439188f.dismiss();
        return jz5.f0.f302826a;
    }
}
