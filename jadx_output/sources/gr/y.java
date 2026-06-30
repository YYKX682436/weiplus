package gr;

/* loaded from: classes12.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.storage.emotion.EmojiInfo f274700a;

    /* renamed from: b, reason: collision with root package name */
    public final gr.w f274701b;

    /* renamed from: c, reason: collision with root package name */
    public final s25.a f274702c;

    public y(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, gr.w wVar) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f274700a = emojiInfo;
        this.f274701b = wVar;
        this.f274702c = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
        boolean z17 = false;
        if (com.tencent.mm.vfs.w6.j(this.f274700a.N0())) {
            if (com.tencent.mm.vfs.w6.k(this.f274700a.N0()) <= ((y12.h) r12).L(this.f274700a, true)) {
                gr.v vVar = gr.v.f274696a;
                vVar.a(false);
                if (vVar.b().getBoolean("capture_full", false)) {
                    com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = this.f274700a;
                    int i17 = emojiInfo2.field_captureUploadCounter;
                    if (i17 < 5) {
                        emojiInfo2.field_captureUploadCounter = i17 + 1;
                        if (wVar != null) {
                            ((qr.f) wVar).a(1, null, null);
                        }
                    } else if (wVar != null) {
                        ((qr.f) wVar).a(9, null, null);
                    }
                } else {
                    z17 = true;
                }
            } else if (wVar != null) {
                ((qr.f) wVar).a(2, null, null);
            }
        } else if (wVar != null) {
            ((qr.f) wVar).a(10, null, null);
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUploadLogic", "start upload emoji");
            qr.y yVar = qr.y.f366052d;
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo3 = this.f274700a;
            gr.x xVar = new gr.x(this);
            kotlin.jvm.internal.o.g(emojiInfo3, "emojiInfo");
            new qr.o(emojiInfo3, true, null, 0, null, null, null, false, xVar);
        }
    }
}
