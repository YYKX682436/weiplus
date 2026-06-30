package u03;

/* loaded from: classes4.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u03.h f423464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f423465e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u03.h hVar, byte[] bArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f423464d = hVar;
        this.f423465e = bArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new u03.g(this.f423464d, this.f423465e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((u03.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String g17;
        java.lang.String d17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.tencent.mm.flutter.plugin.proto.q0 q0Var = new com.tencent.mm.flutter.plugin.proto.q0();
            q0Var.parseFrom(this.f423465e);
            java.lang.String str = q0Var.f68069i;
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
            kotlin.jvm.internal.o.d(k17);
            r45.jj4 jj4Var = (r45.jj4) k17.getTimeLine().ContentObj.f369840h.getFirst();
            boolean u17 = com.tencent.mm.vfs.w6.u(com.tencent.mm.plugin.sns.model.y6.n(jj4Var.f377855d));
            java.lang.String p17 = com.tencent.mm.plugin.sns.model.y6.p(jj4Var);
            t21.v2 k18 = com.tencent.mm.plugin.sns.model.y6.k(str, jj4Var.f377855d, jj4Var.Y);
            if (k18 == null) {
                com.tencent.mm.plugin.sns.model.y6.u(str, jj4Var.f377855d, 30, jj4Var.Y);
            } else {
                com.tencent.mm.plugin.sns.model.y6.y(k18, jj4Var.f377855d, 30);
            }
            this.f423464d.getClass();
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = p17;
            objArr[1] = java.lang.Boolean.valueOf(u17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCdnTaskFactory", "prepare stream download sns video %s mkDir %b", objArr);
            if (k18 != null && (d17 = k18.d()) != null) {
                g17 = d17;
                com.tencent.mm.storage.s7 c17 = com.tencent.mm.storage.s7.c();
                c17.f195313b = k17.getCreateTime();
                ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
                return t21.o2.Di().k(c17, jj4Var.f377858g, p17, g17, 1, false, jj4Var.f377855d, jj4Var.D, jj4Var.E, jj4Var.U, jj4Var);
            }
            g17 = com.tencent.mm.plugin.sns.model.y6.g(str, jj4Var);
            com.tencent.mm.storage.s7 c172 = com.tencent.mm.storage.s7.c();
            c172.f195313b = k17.getCreateTime();
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            return t21.o2.Di().k(c172, jj4Var.f377858g, p17, g17, 1, false, jj4Var.f377855d, jj4Var.D, jj4Var.E, jj4Var.U, jj4Var);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
