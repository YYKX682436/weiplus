package dt2;

/* loaded from: classes3.dex */
public final class i implements fo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dt2.t f243184a;

    public i(dt2.t tVar) {
        this.f243184a = tVar;
    }

    @Override // fo0.b
    public java.lang.String a() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        java.lang.String url;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        r45.uo1 liveDesc;
        dt2.t tVar = this.f243184a;
        gk2.e eVar = tVar.f243196e;
        java.lang.String string = (eVar == null || (finderObject2 = ((mm2.c1) eVar.a(mm2.c1.class)).f328846n) == null || (objectDesc2 = finderObject2.getObjectDesc()) == null || (liveDesc = objectDesc2.getLiveDesc()) == null) ? null : liveDesc.getString(0);
        if (string == null || string.length() == 0) {
            gk2.e eVar2 = tVar.f243196e;
            string = (eVar2 == null || (finderObject = ((mm2.c1) eVar2.a(mm2.c1.class)).f328846n) == null || (objectDesc = finderObject.getObjectDesc()) == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null || (url = finderMedia.getUrl()) == null) ? "" : url;
        }
        return string == null ? "" : string;
    }

    @Override // fo0.b
    public void a1() {
        dt2.a0 a0Var = ws2.k1.f449066r.a().f449083o;
        if (a0Var != null) {
            a0Var.d();
        }
    }

    @Override // fo0.b
    public android.graphics.Bitmap b() {
        dt2.a0 a0Var = ws2.k1.f449066r.a().f449083o;
        if (a0Var != null) {
            return a0Var.f243158a.getBitmap();
        }
        return null;
    }

    @Override // fo0.b
    public boolean isPlaying() {
        dt2.a0 a0Var = ws2.k1.f449066r.a().f449083o;
        return a0Var != null && a0Var.f243158a.isPlaying();
    }

    @Override // fo0.b
    public void u() {
        dt2.a0 a0Var = ws2.k1.f449066r.a().f449083o;
        if (a0Var != null) {
            a0Var.e(null);
        }
    }
}
