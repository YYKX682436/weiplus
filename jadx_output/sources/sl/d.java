package sl;

/* loaded from: classes12.dex */
public class d implements tl.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl.j f409021a;

    public d(sl.j jVar) {
        this.f409021a = jVar;
    }

    @Override // tl.f
    public void a() {
        sl.j jVar = this.f409021a;
        fl.a aVar = jVar.f409040m;
        aVar.v();
        if (aVar.f263689o) {
            f25.m0 m0Var = aVar.f263686l;
            if (m0Var != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            }
            aVar.f263686l = null;
            aVar.f263689o = false;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(jVar.f409036i);
        jVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "setError abandon focus, needFocusOnPlay: %s, hasAudioFocus: %s", valueOf, java.lang.Boolean.FALSE);
        if (jVar.f409042o != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new sl.c(this));
        }
    }
}
