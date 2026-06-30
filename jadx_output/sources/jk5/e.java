package jk5;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk5.j f300162d;

    public e(jk5.j jVar) {
        this.f300162d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jk5.j jVar = this.f300162d;
        java.lang.String str = null;
        try {
            jVar.f300170c = ((m56.a) jVar.f300168a).d();
            m56.b bVar = jVar.f300168a;
            l56.i iVar = jVar.f300170c;
            ((i56.d) ((m56.a) bVar).f324337b).getClass();
            str = java.lang.String.format("https://api.twitter.com/oauth/authorize?oauth_token=%s", iVar.f316692d);
        } catch (j56.a | j56.b unused) {
        }
        jVar.f300176i.sendMessage(jVar.f300176i.obtainMessage(1000, str));
    }
}
