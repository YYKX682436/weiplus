package gx0;

/* loaded from: classes5.dex */
public final class p9 extends du0.p1 {

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f276833u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f276834v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f276835w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f276836x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f276837y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f276833u = kz5.c0.i(ug.m.MovieClip, ug.m.VideoClip, ug.m.ImageClip);
        com.tencent.maas.model.time.MJTime InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
        this.f276835w = InvalidTime;
        this.f276836x = jz5.h.b(new gx0.m9(this));
        this.f276837y = jz5.h.b(new gx0.o9(this));
        jz5.h.b(new gx0.n9(this));
    }

    @Override // du0.p1
    public void V6(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        java.lang.String str;
        q7(audioCacheInfo);
        ex0.a0 a0Var = u7().f276642r;
        if (a0Var == null || audioCacheInfo == null || (str = audioCacheInfo.f155715i) == null) {
            return;
        }
        java.lang.String str2 = Q6().f243442f.f48224b;
        if (a0Var.L(audioCacheInfo, str, 1.0f, false)) {
            ex0.o o17 = a0Var.o();
            if (o17 != null) {
                kotlin.jvm.internal.o.d(str2);
                o17.I(str2);
            }
            com.tencent.maas.moviecomposing.segments.MusicSegment m17 = a0Var.f257092b.f48414a.m();
            if (m17 != null) {
                com.tencent.maas.base.MJID mjid = m17.f48532a;
                kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
                k7(mjid);
            }
        }
    }

    @Override // du0.p1
    public void W6(float f17) {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.d9(this, f17, null), 3, null);
    }

    @Override // du0.p1
    public void X6(float f17) {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.f9(this, f17, null), 3, null);
    }

    @Override // du0.p1
    public boolean Y6(boolean z17) {
        ex0.a0 a0Var = u7().f276642r;
        boolean z18 = false;
        if (a0Var != null && a0Var.F()) {
            z18 = true;
        }
        if (z18 && z17) {
            kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.g9(this, null), 3, null);
        }
        return z18;
    }

    @Override // du0.p1
    public float a7() {
        ex0.o o17;
        java.lang.Float f17;
        ev0.c cVar = this.f243414q;
        if (cVar != null && (f17 = cVar.f222353c.f256883f) != null) {
            return f17.floatValue();
        }
        ex0.a0 a0Var = u7().f276642r;
        if (a0Var == null || (o17 = a0Var.o()) == null) {
            return 0.5f;
        }
        return o17.C();
    }

    @Override // du0.p1
    public com.tencent.maas.model.time.MJTime b7() {
        com.tencent.maas.moviecomposing.Timeline o76 = u7().o7();
        if (o76 != null) {
            return o76.l();
        }
        return null;
    }

    @Override // du0.p1
    public ex0.o d7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return u7().m7(segmentID);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    @Override // du0.p1
    public float e7() {
        ex0.c cVar;
        ex0.a0 a0Var = u7().f276642r;
        if (a0Var == null) {
            return 0.5f;
        }
        java.util.Iterator it = a0Var.f257097g.f257177e.iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = 0;
                break;
            }
            cVar = it.next();
            if (((ex0.r) cVar) instanceof ex0.c) {
                break;
            }
        }
        ex0.c cVar2 = cVar instanceof ex0.c ? cVar : null;
        if (cVar2 == null) {
            return 1.0f;
        }
        return cVar2.C();
    }

    @Override // du0.p1
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f7() {
        ex0.a0 a0Var = u7().f276642r;
        if (a0Var != null) {
            return a0Var.E;
        }
        return null;
    }

    @Override // du0.p1
    public int g7() {
        ex0.a0 a0Var = u7().f276642r;
        if (a0Var != null) {
            return a0Var.F;
        }
        return 0;
    }

    @Override // du0.p1
    public boolean h7() {
        com.tencent.maas.moviecomposing.Timeline timeline;
        com.tencent.maas.moviecomposing.Storyline storyline;
        com.tencent.maas.moviecomposing.segments.MusicSegment m17;
        ex0.a0 a0Var = u7().f276642r;
        if (a0Var == null || (timeline = a0Var.f257092b) == null || (storyline = timeline.f48414a) == null || (m17 = storyline.m()) == null) {
            return false;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = m17.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.MusicSegment.E1(m17, D);
        }
        return bool.booleanValue();
    }

    @Override // du0.p1
    public boolean i7() {
        ex0.a0 a0Var = u7().f276642r;
        if (a0Var != null) {
            return a0Var.y();
        }
        return false;
    }

    @Override // du0.p1
    public rv0.n1 l7() {
        return (rv0.n1) T6(rv0.n1.class);
    }

    @Override // du0.p1
    public yt0.c m7() {
        return (yt0.c) T6(gx0.w8.class);
    }

    @Override // du0.p1, du0.g, com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        com.tencent.mars.xlog.Log.i("MovieMusicTipUIC", "onViewCreated: 开始监听Timeline变更");
        u7().f276643s.observe(getActivity(), new gx0.i9(this));
    }

    @Override // du0.p1
    public void p7(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, boolean z18) {
        boolean z19;
        rv0.j jVar;
        jz5.o oVar;
        ex0.a0 a0Var = u7().f276642r;
        if (a0Var == null) {
            return;
        }
        if (audioCacheInfo != null) {
            du0.v0 R6 = R6();
            java.lang.String musicID = audioCacheInfo.C;
            boolean z27 = a7() > 0.0f;
            boolean z28 = !i7();
            int h76 = u7().h7();
            int k76 = u7().k7();
            R6.getClass();
            kotlin.jvm.internal.o.g(musicID, "musicID");
            com.tencent.maas.moviecomposing.Timeline timeline = a0Var.f257092b;
            kotlin.jvm.internal.o.g(timeline, "timeline");
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            z19 = false;
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.h1(m7Var, musicID, z27, z17, z28, timeline, h76, k76, null), 3, null);
        } else {
            z19 = false;
        }
        java.lang.String i17 = audioCacheInfo != null ? com.tencent.mm.vfs.w6.i(audioCacheInfo.f155715i, z19) : null;
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        if (i17 == null) {
            if (a0Var.E != null) {
                c0Var.f310112d = true;
            }
            a0Var.F();
        }
        boolean z29 = z17 != h7() ? true : z19;
        if ((!kotlin.jvm.internal.o.b(a0Var.E != null ? java.lang.Integer.valueOf(r5.f155711e) : null, audioCacheInfo != null ? java.lang.Integer.valueOf(audioCacheInfo.f155711e) : null)) && i17 != null && audioCacheInfo != null) {
            boolean z37 = a0Var.E != null ? true : z19;
            ex0.o o17 = a0Var.o();
            if (o17 != null) {
                com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment = o17.f257130f;
                android.graphics.PointF m07 = elementSegment.m0();
                kotlin.jvm.internal.o.f(m07, "getLayerPosition(...)");
                java.lang.Float valueOf = java.lang.Float.valueOf(elementSegment.n0());
                android.graphics.PointF o07 = elementSegment.o0();
                kotlin.jvm.internal.o.f(o07, "getLayerScale(...)");
                oVar = new jz5.o(m07, valueOf, o07);
            } else {
                oVar = null;
            }
            if (a0Var.L(audioCacheInfo, i17, a7(), z17)) {
                c0Var.f310112d = true;
                java.lang.String str = Q6().f243442f.f48224b;
                ex0.o o18 = a0Var.o();
                if (o18 == null) {
                    return;
                }
                du0.t0 Q6 = Q6();
                com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment = o18.f257154q;
                musicSegment.getClass();
                com.tencent.maas.moviecomposing.Timeline D = musicSegment.D();
                if (!Q6.Q6(D != null ? com.tencent.maas.moviecomposing.segments.MusicSegment.D1(musicSegment, D) : "")) {
                    kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.j9(this, o18, str, null), 3, null);
                }
                k7(o18.f257168b);
                ou0.e0.a(o18, t7(), u7(), c7().J1());
                if (z37) {
                    jz5.o oVar2 = new jz5.o(new android.graphics.PointF(0.0f, 0.0f), java.lang.Float.valueOf(0.0f), new android.graphics.PointF(1.0f, 1.0f));
                    com.tencent.mars.xlog.Log.i("MovieMusicTipUIC", "onMusicSelected: isChangeMusic == true");
                    if (oVar != null && !kotlin.jvm.internal.o.b(oVar, oVar2)) {
                        java.lang.Object obj = oVar.f302841d;
                        java.util.Objects.toString(obj);
                        java.lang.Number number = (java.lang.Number) oVar.f302842e;
                        number.floatValue();
                        java.lang.Object obj2 = oVar.f302843f;
                        java.util.Objects.toString(obj2);
                        o18.r((android.graphics.PointF) obj);
                        o18.s(number.floatValue());
                        o18.t((android.graphics.PointF) obj2);
                    }
                    gx0.kh u76 = u7();
                    java.lang.String string = getContext().getString(com.tencent.mm.R.string.lme);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    u76.r7(string, null);
                } else {
                    com.tencent.mars.xlog.Log.i("MovieMusicTipUIC", "onMusicSelected: isChangeMusic == false");
                    gx0.kh u77 = u7();
                    java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.llw);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    u77.r7(string2, null);
                }
            }
        } else if (audioCacheInfo == null || i17 == null || !audioCacheInfo.g()) {
            if (z29) {
                kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.e9(this, z17, true, null), 3, null);
                c0Var.f310112d = true;
            }
        } else if (a0Var.L(audioCacheInfo, i17, a7(), z17)) {
            c0Var.f310112d = true;
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.k9(c0Var, this, null), 3, null);
        ex0.a0 a0Var2 = u7().f276642r;
        if (a0Var2 == null) {
            return;
        }
        a0Var2.f(z18);
        t7().c7();
        rv0.n1 n1Var = (rv0.n1) ((jz5.n) this.f243416s).getValue();
        if (n1Var == null || (jVar = (rv0.j) n1Var.f69240i) == null) {
            return;
        }
        jVar.J(z18);
    }

    @Override // du0.p1
    public void q7(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        super.q7(audioCacheInfo);
        ex0.a0 a0Var = u7().f276642r;
        ev0.c cVar = this.f243414q;
        int f17 = cVar != null ? cVar.f() : 0;
        if (a0Var == null) {
            return;
        }
        a0Var.F = f17;
    }

    @Override // du0.p1
    public void r7(zw0.b entrance) {
        kotlin.jvm.internal.o.g(entrance, "entrance");
        if (u7().f276642r == null) {
            return;
        }
        du0.v0 R6 = R6();
        R6.getClass();
        java.lang.String entryType = entrance.f476559d;
        kotlin.jvm.internal.o.g(entryType, "entryType");
        yy0.m7 m7Var = (yy0.m7) R6.O6();
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.p1(m7Var, entryType, null), 3, null);
        this.f276834v = t7().isPlaying();
        this.f276835w = t7().h7();
        com.tencent.mars.xlog.Log.i("MovieMusicTipUIC", "openMusicPanel: wasPlaying=" + this.f276834v + ", time=" + this.f276835w.toMilliseconds() + "ms");
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.l9(this, null), 3, null);
        super.r7(entrance);
    }

    public final gx0.bf t7() {
        return (gx0.bf) ((jz5.n) this.f276836x).getValue();
    }

    public final gx0.kh u7() {
        return (gx0.kh) ((jz5.n) this.f276837y).getValue();
    }
}
