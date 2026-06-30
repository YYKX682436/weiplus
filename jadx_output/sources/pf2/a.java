package pf2;

/* loaded from: classes10.dex */
public final class a implements pf2.b {

    /* renamed from: a, reason: collision with root package name */
    public final oh2.f f353808a;

    public a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f353808a = new oh2.f(context);
    }

    @Override // pf2.b
    public void a(android.graphics.Canvas canvas, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        this.f353808a.g(canvas, i17, i18, null);
    }

    @Override // pf2.b
    public void b(my5.a lyric) {
        kotlin.jvm.internal.o.g(lyric, "lyric");
        com.tencent.mars.xlog.Log.i("HorizontalLyricsRenderer", "bindLyrics: size=" + lyric.b());
        this.f353808a.a(lyric);
    }

    @Override // pf2.b
    public void c(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("HorizontalLyricsRenderer", "setTextColors: normal=" + i17 + ", highlight=" + i18);
        this.f353808a.j(i17, i18);
    }

    @Override // pf2.b
    public void d(nf2.j1 alignment) {
        oh2.e eVar;
        kotlin.jvm.internal.o.g(alignment, "alignment");
        com.tencent.mars.xlog.Log.i("HorizontalLyricsRenderer", "setHorizontalAlignment: " + alignment);
        int ordinal = alignment.ordinal();
        if (ordinal == 0) {
            eVar = oh2.e.f345366d;
        } else if (ordinal == 1) {
            eVar = oh2.e.f345367e;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            eVar = oh2.e.f345368f;
        }
        oh2.f fVar = this.f353808a;
        fVar.getClass();
        if (fVar.f345371y != eVar) {
            fVar.f345371y = eVar;
            com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomHorizontalLyricsDrawer", "setHorizontalAlignment: " + eVar);
        }
    }

    @Override // pf2.b
    public void release() {
        com.tencent.mars.xlog.Log.i("HorizontalLyricsRenderer", "release");
    }

    @Override // pf2.b
    public void reset() {
        com.tencent.mars.xlog.Log.i("HorizontalLyricsRenderer", "reset");
        this.f353808a.h();
    }
}
