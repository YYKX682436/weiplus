package nq3;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f338988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.q f338989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nq3.c f338990f;

    public b(nq3.c cVar, com.tencent.mm.storage.f9 f9Var, ot0.q qVar) {
        this.f338990f = cVar;
        this.f338988d = f9Var;
        this.f338989e = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        nq3.c cVar = this.f338990f;
        nq3.d dVar = cVar.f338991d;
        com.tencent.mm.storage.f9 f9Var = this.f338988d;
        dVar.f338993e = new bt3.l0(f9Var.getMsgId(), f9Var.Q0(), this.f338989e.f348694p, null);
        cVar.f338991d.f338993e.f24330y = 3;
        gm0.j1.d().a(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, cVar.f338991d);
        gm0.j1.d().g(cVar.f338991d.f338993e);
    }
}
