package k53;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k53.g f304330g;

    public a(k53.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f304330g = gVar;
        this.f304327d = str;
        this.f304328e = str2;
        this.f304329f = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        com.tencent.mm.modelcdntran.l3 Di = t21.o2.Di();
        k53.f fVar = this.f304330g.f304361g;
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_GameOnlineVideoProxy";
        oVar.field_mediaId = this.f304327d;
        oVar.M1 = this.f304328e;
        oVar.H1 = 1;
        oVar.Z = 3;
        oVar.f241809y0 = 4;
        oVar.field_fullpath = this.f304329f;
        oVar.f241815c2 = fVar;
        Di.e(oVar, false);
    }
}
