package go5;

/* loaded from: classes11.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public f25.m0 f274157a;

    /* renamed from: b, reason: collision with root package name */
    public final f25.f f274158b = new go5.y();

    public final boolean a() {
        f25.m0 m0Var = this.f274157a;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.t.f259112c, this.f274158b);
        this.f274157a = m96;
        if (m96 != null && ((g25.e) m96).f267980c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPAudioFocus", "requestAudioFocus: gain focus");
            ((jp5.o) i95.n0.c(jp5.o.class)).W6(false);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPAudioFocus", "requestAudioFocus: not gain focus");
        ((jp5.o) i95.n0.c(jp5.o.class)).W6(true);
        return false;
    }
}
