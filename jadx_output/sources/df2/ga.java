package df2;

/* loaded from: classes5.dex */
public final class ga extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f230207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f230208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.zb zbVar) {
        super(2, continuation);
        this.f230207d = hVar;
        this.f230208e = zbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ga(this.f230207d, continuation, this.f230208e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.ga gaVar = (df2.ga) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gaVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Integer] */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.ze1 ze1Var;
        java.util.LinkedList<r45.pa7> list;
        java.util.LinkedList list2;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.ye1 ye1Var = (r45.ye1) ((xg2.i) this.f230207d).f454393b;
        if (ye1Var == null || (list2 = ye1Var.getList(1)) == null) {
            ze1Var = null;
        } else {
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((r45.ze1) obj2).getInteger(0) == 4) {
                    break;
                }
            }
            ze1Var = (r45.ze1) obj2;
        }
        df2.zb zbVar = this.f230208e;
        if (ze1Var == null || ze1Var.getInteger(1) != 0) {
            java.lang.String str = zbVar.f231939m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[aiAssistant] fetchWelcomeConfig: result invalid, ret_code=");
            sb6.append(ze1Var != null ? new java.lang.Integer(ze1Var.getInteger(1)) : null);
            com.tencent.mars.xlog.Log.e(str, sb6.toString());
        } else {
            try {
                com.tencent.mm.protobuf.g byteString = ze1Var.getByteString(3);
                byte[] g17 = byteString != null ? byteString.g() : null;
                if (g17 == null) {
                    g17 = new byte[0];
                }
                r45.df1 df1Var = new r45.df1();
                df1Var.parseFrom(g17);
                if (!df1Var.getBoolean(0)) {
                    com.tencent.mars.xlog.Log.w(zbVar.f231939m, "[aiAssistant] fetchWelcomeConfig: success=false");
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    r45.nf1 nf1Var = (r45.nf1) df1Var.getCustom(1);
                    if (nf1Var != null && (list = nf1Var.getList(0)) != null) {
                        for (r45.pa7 pa7Var : list) {
                            if (pa7Var.getBoolean(2)) {
                                java.lang.String string = pa7Var.getString(0);
                                if (!(string == null || string.length() == 0)) {
                                    arrayList.add(pa7Var);
                                }
                            }
                        }
                    }
                    r45.nf1 nf1Var2 = (r45.nf1) df1Var.getCustom(1);
                    com.tencent.mm.sdk.platformtools.u3.h(new df2.ea(zbVar, arrayList, nf1Var2 != null ? new java.lang.Float(nf1Var2.getFloat(1)) : null));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(zbVar.f231939m, "[aiAssistant] fetchWelcomeConfig: parse failed: " + e17.getMessage());
            }
        }
        return jz5.f0.f302826a;
    }
}
