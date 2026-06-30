package ty0;

/* loaded from: classes5.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final n0.e5 f422791a;

    /* renamed from: b, reason: collision with root package name */
    public final n0.e5 f422792b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f422793c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.e5 f422794d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.e5 f422795e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f422796f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f422797g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f422798h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f422799i;

    /* renamed from: j, reason: collision with root package name */
    public final ty0.c f422800j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f422801k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.l f422802l;

    public b1(n0.e5 musicInfoListState, n0.e5 musicInfoState, yz5.l selectMusic, n0.e5 musicMutedState, n0.e5 originMutedState, yz5.a currentLyricInfoGetter, yz5.p setMovieOption, yz5.p switchMovieOption, boolean z17, ty0.c cVar, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 256) != 0 ? true : z17;
        cVar = (i17 & 512) != 0 ? null : cVar;
        kotlin.jvm.internal.o.g(musicInfoListState, "musicInfoListState");
        kotlin.jvm.internal.o.g(musicInfoState, "musicInfoState");
        kotlin.jvm.internal.o.g(selectMusic, "selectMusic");
        kotlin.jvm.internal.o.g(musicMutedState, "musicMutedState");
        kotlin.jvm.internal.o.g(originMutedState, "originMutedState");
        kotlin.jvm.internal.o.g(currentLyricInfoGetter, "currentLyricInfoGetter");
        kotlin.jvm.internal.o.g(setMovieOption, "setMovieOption");
        kotlin.jvm.internal.o.g(switchMovieOption, "switchMovieOption");
        this.f422791a = musicInfoListState;
        this.f422792b = musicInfoState;
        this.f422793c = selectMusic;
        this.f422794d = musicMutedState;
        this.f422795e = originMutedState;
        this.f422796f = currentLyricInfoGetter;
        this.f422797g = setMovieOption;
        this.f422798h = switchMovieOption;
        this.f422799i = z17;
        this.f422800j = cVar;
        this.f422801k = new java.util.LinkedHashMap();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty0.b1)) {
            return false;
        }
        ty0.b1 b1Var = (ty0.b1) obj;
        return kotlin.jvm.internal.o.b(this.f422791a, b1Var.f422791a) && kotlin.jvm.internal.o.b(this.f422792b, b1Var.f422792b) && kotlin.jvm.internal.o.b(this.f422793c, b1Var.f422793c) && kotlin.jvm.internal.o.b(this.f422794d, b1Var.f422794d) && kotlin.jvm.internal.o.b(this.f422795e, b1Var.f422795e) && kotlin.jvm.internal.o.b(this.f422796f, b1Var.f422796f) && kotlin.jvm.internal.o.b(this.f422797g, b1Var.f422797g) && kotlin.jvm.internal.o.b(this.f422798h, b1Var.f422798h) && this.f422799i == b1Var.f422799i && kotlin.jvm.internal.o.b(this.f422800j, b1Var.f422800j);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f422791a.hashCode() * 31) + this.f422792b.hashCode()) * 31) + this.f422793c.hashCode()) * 31) + this.f422794d.hashCode()) * 31) + this.f422795e.hashCode()) * 31) + this.f422796f.hashCode()) * 31) + this.f422797g.hashCode()) * 31) + this.f422798h.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f422799i)) * 31;
        ty0.c cVar = this.f422800j;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public java.lang.String toString() {
        return "MusicState(musicInfoListState=" + this.f422791a + ", musicInfoState=" + this.f422792b + ", selectMusic=" + this.f422793c + ", musicMutedState=" + this.f422794d + ", originMutedState=" + this.f422795e + ", currentLyricInfoGetter=" + this.f422796f + ", setMovieOption=" + this.f422797g + ", switchMovieOption=" + this.f422798h + ", showOrigin=" + this.f422799i + ", reporter=" + this.f422800j + ')';
    }
}
