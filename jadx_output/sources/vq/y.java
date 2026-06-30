package vq;

/* loaded from: classes12.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439234d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gr.a aVar = gr.b.f274661a;
        xq.e eVar = xq.s.f456019e;
        aVar.a("/sdcard/temp/emoji-anim.xml", eVar);
        com.tencent.mars.xlog.Log.i(this.f439234d.d, "anim version " + eVar.f455976b);
        return jz5.f0.f302826a;
    }
}
