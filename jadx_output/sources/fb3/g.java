package fb3;

/* loaded from: classes.dex */
public final class g implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fb3.j f260862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260863b;

    public g(fb3.j jVar, java.lang.String str) {
        this.f260862a = jVar;
        this.f260863b = str;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        fb3.j jVar = this.f260862a;
        if (i17 != 0 || i18 != 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINISH_ACTIVITY_REASON", "KEY_FINISH_ACTIVITY_FOR_SEND_APPMSG_FAIL");
            jVar.getActivity().setResult(-1, intent);
            jVar.getActivity().finish();
            return;
        }
        if ((oVar != null ? oVar.f70711b.f70700a : null) instanceof r45.pz5) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SendShareCoverMsgResp");
            r45.pz5 pz5Var = (r45.pz5) fVar;
            if (pz5Var.f383502d != 0) {
                ik1.h0.b(new fb3.f(jVar, pz5Var));
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29977, 5, jVar.f260869f, this.f260863b, jVar.f260868e);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KEY_FINISH_ACTIVITY_REASON", "KEY_FINISH_ACTIVITY_FOR_SEND_APPMSG_SUCCESS");
            jVar.getActivity().setResult(-1, intent2);
            jVar.getActivity().finish();
        }
    }
}
