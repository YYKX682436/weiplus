package qf2;

/* loaded from: classes3.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f362582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f362583f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(xg2.h hVar, kotlin.coroutines.Continuation continuation, km2.q qVar, qf2.v0 v0Var) {
        super(2, continuation);
        this.f362581d = hVar;
        this.f362582e = qVar;
        this.f362583f = v0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.t(this.f362581d, continuation, this.f362582e, this.f362583f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.t tVar = (qf2.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f362581d).f454381b).f454379a;
        if (jVar == null || (str = jVar.f397426g) == null) {
            str = "";
        }
        int i17 = jVar != null ? jVar.f397425f : 0;
        int i18 = jVar != null ? jVar.f397424e : 0;
        km2.q qVar = this.f362582e;
        qVar.f309181l = 0;
        mk2.h hVar = mk2.h.f327133a;
        r45.xn1 xn1Var = qVar.f309187r;
        java.lang.String str2 = null;
        hVar.b((xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact2.getUsername());
        java.util.List list = ((mm2.o4) this.f362583f.business(mm2.o4.class)).f329325t;
        kotlin.jvm.internal.o.f(list, "<get-anchorPkMicUserTempList>(...)");
        pm0.v.I(list, new qf2.q(this.f362582e));
        java.util.List list2 = ((mm2.o4) this.f362583f.business(mm2.o4.class)).f329318o;
        kotlin.jvm.internal.o.f(list2, "<get-linkMicUserList>(...)");
        pm0.v.I(list2, new qf2.r(this.f362582e));
        java.util.List list3 = ((mm2.o4) this.f362583f.business(mm2.o4.class)).f329319p;
        kotlin.jvm.internal.o.f(list3, "<get-recomApplylinkMicUserList>(...)");
        pm0.v.I(list3, new qf2.s(this.f362582e));
        java.util.Map map = ((mm2.o4) this.f362583f.business(mm2.o4.class)).f329326u;
        kotlin.jvm.internal.o.f(map, "<get-anchorPkCarryMicUserMap>(...)");
        java.lang.String str3 = this.f362582e.f309170a;
        synchronized (map) {
            map.remove(str3);
        }
        if (str.length() > 0) {
            db5.t7.g(this.f362583f.O6(), str);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("accept pk response fail, errCode: ");
        sb6.append(i17);
        sb6.append(" errMsg: ");
        sb6.append(str);
        sb6.append(" errType: ");
        sb6.append(i18);
        sb6.append(" applyId: ");
        sb6.append(this.f362582e.f309194y);
        sb6.append(" , nickName: ");
        r45.xn1 xn1Var2 = this.f362582e.f309187r;
        if (xn1Var2 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) != null) {
            str2 = finderContact.getNickname();
        }
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", sb6.toString());
        return jz5.f0.f302826a;
    }
}
