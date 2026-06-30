package js3;

/* loaded from: classes4.dex */
public class g implements com.tencent.mm.ipcinvoker.j, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f301523d;

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        this.f301523d = rVar;
        gm0.j1.d().a(12213, this);
        gm0.j1.d().g(new ms3.b());
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetUnreadMailCountTask", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        gm0.j1.d().q(12213, this);
        com.tencent.mm.ipcinvoker.r rVar = this.f301523d;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCInteger(((ks3.d1) ((ms3.b) m1Var).f330978d.f70711b.f70700a).f311655d));
        }
    }
}
