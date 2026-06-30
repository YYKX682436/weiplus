package pf2;

/* loaded from: classes10.dex */
public final class c implements pf2.b {

    /* renamed from: a, reason: collision with root package name */
    public final oh2.h f353809a;

    public c(android.content.Context context, java.lang.String rotateCharsPattern) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rotateCharsPattern, "rotateCharsPattern");
        this.f353809a = new oh2.h(context, rotateCharsPattern);
    }

    @Override // pf2.b
    public void a(android.graphics.Canvas canvas, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        this.f353809a.g(canvas, i17, i18, null);
    }

    @Override // pf2.b
    public void b(my5.a lyric) {
        kotlin.jvm.internal.o.g(lyric, "lyric");
        com.tencent.mars.xlog.Log.i("VerticalLyricsRenderer", "bindLyrics: size=" + lyric.b());
        this.f353809a.a(lyric);
    }

    @Override // pf2.b
    public void c(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("VerticalLyricsRenderer", "setTextColors: normal=" + i17 + ", highlight=" + i18);
        this.f353809a.j(i17, i18);
    }

    @Override // pf2.b
    public void release() {
        com.tencent.mars.xlog.Log.i("VerticalLyricsRenderer", "release");
    }

    @Override // pf2.b
    public void reset() {
        com.tencent.mars.xlog.Log.i("VerticalLyricsRenderer", "reset");
        this.f353809a.h();
    }
}
