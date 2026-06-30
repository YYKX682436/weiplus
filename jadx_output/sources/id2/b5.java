package id2;

/* loaded from: classes.dex */
public final class b5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f290499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f290500e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(xg2.h hVar, kotlin.coroutines.Continuation continuation, yz5.q qVar) {
        super(2, continuation);
        this.f290499d = hVar;
        this.f290500e = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.b5(this.f290499d, continuation, this.f290500e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.b5 b5Var = (id2.b5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.fs1 fs1Var = (r45.fs1) ((xg2.i) this.f290499d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveExtraInfo succes : ");
        java.util.LinkedList list = fs1Var.getList(1);
        sb6.append(list != null ? new java.lang.Integer(list.size()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveRemindRestric", sb6.toString());
        java.util.LinkedList list2 = fs1Var.getList(1);
        kotlin.jvm.internal.o.f(list2, "getGet_resp_list(...)");
        java.util.Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((r45.mn3) obj2).getInteger(0) == 5) {
                break;
            }
        }
        r45.mn3 mn3Var = (r45.mn3) obj2;
        if (mn3Var != null) {
            r45.hs1 hs1Var = (r45.hs1) r45.hs1.class.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            com.tencent.mm.protobuf.g byteString = mn3Var.getByteString(2);
            byte[] g17 = byteString != null ? byteString.g() : null;
            if (g17 != null) {
                try {
                    hs1Var.parseFrom(g17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            if (hs1Var != null) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(hs1Var.getBoolean(2));
                java.lang.String string = hs1Var.getString(1);
                if (string == null) {
                    string = "";
                }
                java.lang.String string2 = hs1Var.getString(0);
                this.f290500e.invoke(valueOf, string, string2 != null ? string2 : "");
            }
        }
        return jz5.f0.f302826a;
    }
}
