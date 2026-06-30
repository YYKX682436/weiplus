package wq4;

/* loaded from: classes14.dex */
public class h0 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wq4.k0 f448640a;

    public h0(wq4.k0 k0Var) {
        this.f448640a = k0Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        mediaPlayer.release();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        wq4.k0 k0Var = this.f448640a;
        if (currentTimeMillis - k0Var.f448653g > 5000) {
            k0Var.getClass();
            i95.m c17 = i95.n0.c(ym1.f.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            xm1.h hVar = ((ym1.f) c17).f463136e;
            if (hVar == null) {
                hVar = new xm1.j();
                i95.m c18 = i95.n0.c(ym1.f.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ((ym1.f) c18).f463136e = hVar;
                i95.m c19 = i95.n0.c(ym1.f.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                ((ym1.f) c19).f463138g[0] = "music";
            }
            hVar.v();
        }
    }
}
