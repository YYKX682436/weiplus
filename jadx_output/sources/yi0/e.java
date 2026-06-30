package yi0;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f462489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f462489d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yi0.e(this.f462489d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yi0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.flutter.plugin.proto.f fVar = new com.tencent.mm.flutter.plugin.proto.f();
        java.lang.String str = this.f462489d;
        if (ui0.a.a(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusDataSource", "do not show text status cause in black list!");
            return fVar;
        }
        ((we0.l1) ((xe0.i0) i95.n0.c(xe0.i0.class))).getClass();
        mj4.h M = ai4.m0.f5173a.M(str);
        if (M == null) {
            return fVar;
        }
        com.tencent.mm.flutter.plugin.proto.s0 s0Var = new com.tencent.mm.flutter.plugin.proto.s0();
        mj4.k kVar = (mj4.k) M;
        s0Var.f68074d = kVar.l();
        s0Var.f68083p = kVar.k();
        yi0.a aVar2 = yi0.b.f462477d;
        int i17 = kVar.f327067b.field_MediaType;
        aVar2.getClass();
        boolean z17 = true;
        s0Var.f68076f = (i17 != 1 ? i17 != 2 ? yi0.b.f462478e : yi0.b.f462480g : yi0.b.f462479f).ordinal();
        s0Var.f68081n = kVar.j();
        s0Var.f68082o = kVar.i();
        s0Var.f68075e = r5.field_CreateTime * 1000;
        s0Var.f68080m = kVar.g();
        java.lang.String h17 = kVar.h();
        ((we0.y0) ((xe0.e0) i95.n0.c(xe0.e0.class))).getClass();
        bk4.f0 f0Var = bk4.f0.f21465a;
        pj4.o1 j17 = f0Var.j(h17);
        ((we0.y0) ((xe0.e0) i95.n0.c(xe0.e0.class))).getClass();
        pj4.g0 h18 = j17 != null ? bk4.g0.h(j17) : null;
        if (h18 == null) {
            xe0.e0 e0Var = (xe0.e0) i95.n0.c(xe0.e0.class);
            java.util.LinkedList linkedList = xe0.j0.a(M, false, 1, null).f355219m;
            ((we0.y0) e0Var).getClass();
            h18 = linkedList != null ? bk4.g0.f(linkedList) : null;
        }
        pj4.o0 a17 = xe0.j0.a(M, false, 1, null);
        s0Var.f68089v = "0";
        java.lang.String d17 = wi4.a.d(a17);
        if (d17 != null && !r26.n0.N(d17)) {
            z17 = false;
        }
        if (!z17) {
            xe0.i0 i0Var = (xe0.i0) i95.n0.c(xe0.i0.class);
            java.util.LinkedList linkedList2 = a17.f355216g;
            ((we0.l1) i0Var).getClass();
            pj4.j0 a18 = linkedList2 != null ? sj4.a1.a(linkedList2) : null;
            if (a18 != null && kotlin.jvm.internal.o.b(a18.f355139d, "5")) {
                byte[] decode = android.util.Base64.decode(a18.f355141f, 0);
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                finderObject.parseFrom(decode);
                s0Var.f68085r = vi0.j.a(finderObject);
            }
            java.util.LinkedList jumpInfos = a17.f355216g;
            kotlin.jvm.internal.o.f(jumpInfos, "jumpInfos");
            pj4.j0 j0Var = (pj4.j0) kz5.n0.Z(jumpInfos);
            if (j0Var != null) {
                s0Var.f68089v = j0Var.f355139d;
            }
        }
        s0Var.f68087t = wi4.a.c(a17);
        s0Var.f68088u = wi4.a.e(a17);
        ((we0.y0) ((xe0.e0) i95.n0.c(xe0.e0.class))).getClass();
        s0Var.f68078h = f0Var.m(a17);
        s0Var.f68077g = h18 != null ? h18.f355046d : null;
        s0Var.f68079i = a17.f355214e;
        s0Var.f68086s = kVar.v();
        s0Var.f68084q = kVar.p();
        if (!kotlin.jvm.internal.o.b(s0Var.f68089v, "0")) {
            s0Var.f68076f = 0;
            s0Var.f68084q = "text_state_default_image_2";
        }
        fVar.f67965d = s0Var;
        return fVar;
    }
}
