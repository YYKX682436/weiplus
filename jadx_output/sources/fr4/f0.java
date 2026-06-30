package fr4;

/* loaded from: classes8.dex */
public final class f0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gr4.e f265819a;

    public f0(gr4.e eVar) {
        this.f265819a = eVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.modelbase.n nVar;
        com.tencent.mm.protobuf.f fVar;
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = (nVar = oVar.f70711b).f70700a) != null && (fVar instanceof r45.ij3)) {
            com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[requestSessionInfo] session info request success");
            com.tencent.mm.protobuf.f fVar2 = nVar.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetMsgSessionInfoResp");
            this.f265819a.a((r45.ij3) fVar2);
            return;
        }
        com.tencent.mars.xlog.Log.e("W1w.W1wPersonalMsgService", "[requestSessionInfo] session info request failed: errType=" + i17 + ", errCode=" + i18);
    }
}
