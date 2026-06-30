package il2;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f292038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f292039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f292040f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xg2.h hVar, kotlin.coroutines.Continuation continuation, int i17, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f292038d = hVar;
        this.f292039e = i17;
        this.f292040f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new il2.c(this.f292038d, continuation, this.f292039e, this.f292040f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        il2.c cVar = (il2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.fs1 fs1Var = (r45.fs1) ((xg2.i) this.f292038d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveExtraInfo succes : ");
        java.util.LinkedList list = fs1Var.getList(1);
        sb6.append(list != null ? new java.lang.Integer(list.size()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveRestrictConsumePlugin", sb6.toString());
        java.util.LinkedList list2 = fs1Var.getList(1);
        kotlin.jvm.internal.o.f(list2, "getGet_resp_list(...)");
        java.util.Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((r45.mn3) obj2).getInteger(0) == this.f292039e) {
                break;
            }
        }
        r45.mn3 mn3Var = (r45.mn3) obj2;
        if (mn3Var != null) {
            java.lang.Object newInstance = r45.hs1.class.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            com.tencent.mm.protobuf.f fVar = (com.tencent.mm.protobuf.f) newInstance;
            com.tencent.mm.protobuf.g byteString = mn3Var.getByteString(2);
            byte[] g17 = byteString != null ? byteString.g() : null;
            if (g17 != null) {
                try {
                    fVar.parseFrom(g17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            this.f292040f.f310123d = newInstance;
        }
        return jz5.f0.f302826a;
    }
}
