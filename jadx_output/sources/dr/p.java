package dr;

/* loaded from: classes12.dex */
public class p extends dr.t {

    /* renamed from: d, reason: collision with root package name */
    public dr.q f242397d;

    /* renamed from: e, reason: collision with root package name */
    public final long f242398e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f242399f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, com.tencent.mm.emoji.view.AbsEmojiView view, dr.q qVar) {
        super(emojiInfo, view);
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        kotlin.jvm.internal.o.g(view, "view");
        this.f242397d = qVar;
        this.f242398e = java.lang.System.currentTimeMillis();
    }

    @Override // dr.t, dr.s
    public void a() {
        super.a();
        this.f242397d = null;
    }

    @Override // dr.s
    public void c(boolean z17) {
        toString();
        java.lang.ref.WeakReference weakReference = this.f242402c;
        android.graphics.drawable.Drawable drawable = null;
        java.util.Objects.toString(weakReference != null ? (com.tencent.mm.emoji.view.AbsEmojiView) weakReference.get() : null);
        if (this.f242399f) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f242398e;
            if (currentTimeMillis - j17 <= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                int iOSNetType = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
                if (iOSNetType == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1257L, 124L);
                } else if (iOSNetType == 2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1257L, 115L);
                } else if (iOSNetType == 3) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1257L, 118L);
                } else if (iOSNetType == 4) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1257L, 121L);
                }
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j17;
                int iOSNetType2 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
                if (iOSNetType2 == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1257L, 125L, currentTimeMillis2);
                } else if (iOSNetType2 == 2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1257L, 116L, currentTimeMillis2);
                } else if (iOSNetType2 == 3) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1257L, 119L, currentTimeMillis2);
                } else if (iOSNetType2 == 4) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1257L, 122L, currentTimeMillis2);
                }
            }
        }
        java.lang.ref.WeakReference weakReference2 = this.f242402c;
        com.tencent.mm.emoji.view.AbsEmojiView absEmojiView = weakReference2 != null ? (com.tencent.mm.emoji.view.AbsEmojiView) weakReference2.get() : null;
        if (z17) {
            br.a aVar = new br.a();
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f242400a;
            kotlin.jvm.internal.o.e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
            drawable = aVar.b((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo, new dr.m(this));
        }
        pm0.v.X(new dr.l(z17, drawable, absEmojiView, this));
    }

    @Override // dr.s
    public void f(boolean z17) {
        if (this.f242400a.E0()) {
            pm0.v.K(null, new dr.n(this));
        } else {
            this.f242399f = true;
            pm0.v.X(new dr.o(this));
        }
    }
}
