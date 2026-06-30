package vq;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f439173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f439175f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, kotlin.jvm.internal.f0 f0Var) {
        super(0);
        this.f439173d = u3Var;
        this.f439174e = emojiDebugUI;
        this.f439175f = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f439173d.setMessage(this.f439174e.getString(com.tencent.mm.R.string.c0d) + ' ' + this.f439175f.f310116d);
        return jz5.f0.f302826a;
    }
}
