package hr4;

/* loaded from: classes4.dex */
public final class r implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f284268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hr4.s f284269b;

    public r(java.util.LinkedList linkedList, hr4.s sVar) {
        this.f284268a = linkedList;
        this.f284269b = sVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mars.xlog.Log.i("W1wPersonalMsg.W1wPersonalMsgContactLooper", "cgi batch get profile contact. errCode: " + i18);
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f70711b.f70700a) != null && (fVar instanceof r45.ej3)) {
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetMsgContactListResp");
            r45.ej3 ej3Var = (r45.ej3) fVar;
            com.tencent.mars.xlog.Log.i("W1wPersonalMsg.W1wPersonalMsgContactLooper", "has get profile contact list: " + ej3Var.f373570d);
            java.util.LinkedList<r45.rq4> contact_list = ej3Var.f373570d;
            kotlin.jvm.internal.o.f(contact_list, "contact_list");
            hr4.s sVar = this.f284269b;
            for (r45.rq4 rq4Var : contact_list) {
                if (rq4Var.f385123i == 0) {
                    kr4.e eVar = new kr4.e();
                    eVar.field_username = rq4Var.f385120f;
                    eVar.field_avatar = rq4Var.f385119e;
                    eVar.field_nickname = rq4Var.f385118d;
                    eVar.field_avatarStyle = rq4Var.f385121g;
                    eVar.field_userJumpInfoStr = rq4Var.f385122h;
                    ((fr4.g0) i95.n0.c(fr4.g0.class)).Ai().z0(eVar);
                    sVar.f284270a.a(true, eVar);
                }
            }
            fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
            g0Var.getClass();
            ((ku5.t0) ku5.t0.f312615d).B(new fr4.d0(g0Var));
        } else {
            java.util.LinkedList<java.lang.String> linkedList = this.f284268a;
            hr4.s sVar2 = this.f284269b;
            for (java.lang.String str2 : linkedList) {
                hr4.q qVar = sVar2.f284270a;
                kr4.e eVar2 = new kr4.e();
                eVar2.field_username = str2;
                qVar.a(false, eVar2);
            }
        }
        this.f284269b.f284272c.set(false);
        this.f284269b.b();
    }
}
