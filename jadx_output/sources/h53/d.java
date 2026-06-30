package h53;

/* loaded from: classes8.dex */
public class d implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h53.j f279042d;

    public d(h53.j jVar) {
        this.f279042d = jVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        h53.j jVar = this.f279042d;
        if (jVar.f279058h == h53.i.stopped) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameJsCore", "destroy");
            jVar.f279058h = h53.i.destroyed;
            jVar.f279056f.a(new h53.f(jVar, "onDestroy"));
            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new h53.e(jVar), false);
            jVar.f279059i = b4Var;
            b4Var.c(60000L, 60000L);
        }
        return false;
    }
}
