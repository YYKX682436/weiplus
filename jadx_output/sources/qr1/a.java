package qr1;

/* loaded from: classes2.dex */
public final class a implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f366058a;

    public a(yz5.l lVar) {
        this.f366058a = lVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        yz5.l lVar = this.f366058a;
        if (i17 != 0 || i18 != 0 || oVar == null || (fVar = oVar.f70711b.f70700a) == null || !(fVar instanceof r45.t00)) {
            lVar.invoke(null);
            return;
        }
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CheckFansMsgResp");
        r45.t00 t00Var = (r45.t00) fVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(t00Var.f386047e)) {
            lVar.invoke(null);
        } else {
            lVar.invoke(t00Var.f386047e);
        }
    }
}
