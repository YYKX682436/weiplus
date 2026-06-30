package vq;

/* loaded from: classes10.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439184d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = u85.i.f425710d + "preview/";
        com.tencent.mm.vfs.w6.f(str);
        com.tencent.mm.vfs.w6.u(str);
        com.tencent.mm.vfs.w6.Q("/sdcard/temp/sticker/output.zip", str);
        t85.j jVar = new t85.j();
        kotlin.jvm.internal.o.g(str, "<set-?>");
        jVar.f416476c = str;
        jVar.f416474a = "preview";
        jVar.c(str);
        t85.j jVar2 = new t85.j();
        jVar2.f416476c = str;
        jVar2.b(str);
        com.tencent.mars.xlog.Log.i(this.f439184d.d, "pack: " + jVar.f416484k.size() + ", " + jVar2.f416484k.size());
        return jz5.f0.f302826a;
    }
}
