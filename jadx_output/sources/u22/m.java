package u22;

/* loaded from: classes10.dex */
public final class m implements x85.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u22.r f424000a;

    public m(u22.r rVar) {
        this.f424000a = rVar;
    }

    @Override // x85.c
    public void a(int i17, r45.p64 p64Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.StickerPanelData", "getLensInfo onResult: " + p64Var);
        if (p64Var != null) {
            u22.r rVar = this.f424000a;
            rVar.f424025m.add(p64Var);
            rVar.d();
        }
    }
}
