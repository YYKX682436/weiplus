package lx3;

/* loaded from: classes.dex */
public final class q implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f322111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f322112e;

    public q(yz5.q qVar, yz5.l lVar) {
        this.f322111d = qVar;
        this.f322112e = lVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SvrReporter", "report, errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
        if (i17 != 0 || i18 != 0) {
            this.f322111d.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return 0;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        r45.ak akVar = fVar instanceof r45.ak ? (r45.ak) fVar : null;
        if (akVar == null) {
            return 0;
        }
        this.f322112e.invoke(akVar);
        return 0;
    }
}
