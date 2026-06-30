package x21;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: h, reason: collision with root package name */
    public static int f451543h;

    /* renamed from: a, reason: collision with root package name */
    public final int f451544a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f451545b;

    /* renamed from: c, reason: collision with root package name */
    public x21.j f451546c;

    /* renamed from: d, reason: collision with root package name */
    public final x21.i f451547d;

    /* renamed from: e, reason: collision with root package name */
    public final x21.c f451548e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f451549f;

    /* renamed from: g, reason: collision with root package name */
    public x21.e f451550g;

    public l(boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? true : z17;
        int i18 = f451543h;
        f451543h = i18 + 1;
        this.f451544a = i18;
        this.f451545b = "MicroMsg.MSP.MultiFileSilkPlayer-" + i18;
        this.f451547d = new x21.i();
        this.f451548e = new x21.c(z17, new x21.k(this), true);
    }

    public static void d(x21.l lVar, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        com.tencent.mars.xlog.Log.i(lVar.f451545b, "stopPlay, playingFlag: " + z18);
        lVar.f451549f = z18;
        x21.j jVar = lVar.f451546c;
        if (jVar != null) {
            jVar.c(true);
        }
        lVar.f451546c = null;
        x21.c cVar = lVar.f451548e;
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "stop play force " + z17);
        cVar.c(z17);
        x21.i iVar = lVar.f451547d;
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MSP.MultiFileSilkDecoder", "release");
        com.tencent.mars.xlog.Log.i("MicroMsg.MSP.MultiFileSilkDecoder", "reset");
        iVar.f451536b = null;
        x21.g gVar = iVar.f451537c;
        if (gVar != null) {
            com.tencent.mars.xlog.Log.i(gVar.f451525b, "decoder uninit");
            gVar.f451530g = false;
            w21.v vVar = gVar.f451526c;
            if (vVar != null) {
                com.tencent.mm.modelvoice.MediaRecorder.SilkDecUnInit(vVar.f442482a);
            }
        }
        iVar.f451537c = null;
    }

    public final void a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i(this.f451545b, "appendFile: ".concat(path));
        x21.i iVar = this.f451547d;
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MSP.MultiFileSilkDecoder", "appendFile ".concat(path));
        java.util.ArrayList arrayList = (java.util.ArrayList) iVar.f451535a;
        arrayList.add(new x21.h(path, arrayList.size(), 0L, 4, null));
        if (this.f451549f) {
            c();
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i(this.f451545b, "clearFileList");
        x21.i iVar = this.f451547d;
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MSP.MultiFileSilkDecoder", "clearFileList");
        ((java.util.ArrayList) iVar.f451535a).clear();
        iVar.f451536b = null;
        d(this, true, false, 2, null);
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i(this.f451545b, "startPlay");
        this.f451549f = true;
        if (!(this.f451546c != null ? r1.d() : true)) {
            com.tencent.mars.xlog.Log.i(this.f451545b, "now is playing");
            return;
        }
        if (!(true ^ ((java.util.ArrayList) this.f451547d.f451535a).isEmpty())) {
            com.tencent.mars.xlog.Log.w(this.f451545b, "no audio file, delay init");
            return;
        }
        x21.i iVar = this.f451547d;
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MSP.MultiFileSilkDecoder", "reset");
        iVar.f451536b = null;
        x21.g gVar = iVar.f451537c;
        if (gVar != null) {
            com.tencent.mars.xlog.Log.i(gVar.f451525b, "decoder uninit");
            gVar.f451530g = false;
            w21.v vVar = gVar.f451526c;
            if (vVar != null) {
                com.tencent.mm.modelvoice.MediaRecorder.SilkDecUnInit(vVar.f442482a);
            }
        }
        iVar.f451537c = null;
        x21.c cVar = this.f451548e;
        cVar.b(cVar.f451515d, cVar.f451516e);
        x21.j jVar = this.f451546c;
        if (jVar == null || jVar.d()) {
            x21.j jVar2 = new x21.j(this, this.f451547d, this.f451548e);
            this.f451546c = jVar2;
            ((ku5.t0) ku5.t0.f312615d).g(jVar2);
        }
    }
}
