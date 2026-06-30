package ea1;

/* loaded from: classes12.dex */
public class c extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f250509n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ea1.g f250510o;

    public c(ea1.g gVar, java.lang.String str) {
        this.f250510o = gVar;
        this.f250509n = str;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "DeleteWeAppTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.String str = this.f250509n;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "delete we app info id=%s", str);
        ea1.h hVar = this.f250510o.f250518f;
        int[] iArr = o13.d.f342218d;
        hVar.m0(iArr, str);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(1).m0(iArr, str);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{id: %s}", this.f250509n);
    }
}
