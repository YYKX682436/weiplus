package y21;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static int f459054h;

    /* renamed from: a, reason: collision with root package name */
    public final int f459055a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f459056b;

    /* renamed from: c, reason: collision with root package name */
    public y21.f f459057c;

    /* renamed from: d, reason: collision with root package name */
    public y21.b f459058d;

    /* renamed from: e, reason: collision with root package name */
    public y21.a f459059e;

    /* renamed from: f, reason: collision with root package name */
    public final x21.c f459060f;

    /* renamed from: g, reason: collision with root package name */
    public y21.e f459061g;

    public h(boolean z17, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? true : z17;
        z18 = (i17 & 2) != 0 ? true : z18;
        int i18 = f459054h;
        f459054h = i18 + 1;
        this.f459055a = i18;
        this.f459056b = "MicroMsg.MSP.StreamSilkPlayer-" + i18;
        this.f459060f = new x21.c(z17, new y21.g(this), z18);
    }

    public static void e(y21.h hVar, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        hVar.getClass();
        com.tencent.mars.xlog.Log.i(hVar.f459056b, "stopPlay, playingFlag: " + z18);
        y21.f fVar = hVar.f459057c;
        if (fVar != null) {
            fVar.c(true);
        }
        hVar.f459057c = null;
        x21.c cVar = hVar.f459060f;
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "stop play force " + z17);
        cVar.c(z17);
        y21.b bVar = hVar.f459058d;
        if (bVar != null) {
            bVar.close();
        }
        hVar.f459058d = null;
        y21.e eVar = hVar.f459061g;
        if (eVar != null) {
            eVar.d();
        }
        hVar.f459061g = null;
    }

    public final boolean a() {
        return !(this.f459057c != null ? r0.d() : true);
    }

    public final void b(y21.b source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i(this.f459056b, "setSource: using SafeStreamSilkDecoder for thread safety");
        y21.e eVar = this.f459061g;
        if (eVar != null) {
            eVar.d();
        }
        this.f459061g = new y21.e(source);
        this.f459058d = source;
    }

    public final void c(y21.a aVar) {
        com.tencent.mars.xlog.Log.i(this.f459056b, "setStateListener " + aVar);
        this.f459059e = aVar;
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i(this.f459056b, "startPlay");
        if (a()) {
            com.tencent.mars.xlog.Log.i(this.f459056b, "now is playing");
            return;
        }
        if (this.f459061g == null) {
            com.tencent.mars.xlog.Log.w(this.f459056b, "no audio source, delay init");
            return;
        }
        x21.c cVar = this.f459060f;
        cVar.b(cVar.f451515d, cVar.f451516e);
        y21.f fVar = this.f459057c;
        if (fVar == null || fVar.d()) {
            y21.e eVar = this.f459061g;
            kotlin.jvm.internal.o.d(eVar);
            y21.f fVar2 = new y21.f(this, eVar, this.f459060f);
            this.f459057c = fVar2;
            ((ku5.t0) ku5.t0.f312615d).g(fVar2);
        }
    }

    public final void f(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f459056b, "switchSpeaker: " + z17);
        x21.c.d(this.f459060f, z17, 0, 2, null);
    }
}
