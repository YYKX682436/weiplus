package df2;

/* loaded from: classes3.dex */
public final class mm extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f230787a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f230788b;

    public mm(gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f230787a = liveContext;
        this.f230788b = "Finder.LiveInsertGiftNotifyInterceptor";
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        r45.ta4 e17;
        com.tencent.mm.protobuf.g byteString;
        r45.ta4 e18;
        com.tencent.mm.protobuf.g byteString2;
        kotlin.jvm.internal.o.g(respWrapper, "respWrapper");
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        if (nVar != null && (e18 = nVar.e()) != null && (byteString2 = e18.getByteString(11)) != null) {
            d(respWrapper, byteString2, null);
            km2.n nVar2 = dk2.ef.H;
            r45.ta4 e19 = nVar2 != null ? nVar2.e() : null;
            if (e19 != null) {
                e19.set(11, null);
            }
        }
        km2.n nVar3 = dk2.ef.H;
        if (nVar3 == null || (e17 = nVar3.e()) == null || (byteString = e17.getByteString(16)) == null) {
            return true;
        }
        r45.ch1 ch1Var = new r45.ch1();
        try {
            ch1Var.parseFrom(byteString.g());
        } catch (java.lang.Exception e27) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e27);
            ch1Var = null;
        }
        if (ch1Var != null) {
            com.tencent.mm.protobuf.g byteString3 = ch1Var.getByteString(4);
            r45.xn1 xn1Var = (r45.xn1) ch1Var.getCustom(13);
            if (byteString3 != null) {
                d(respWrapper, byteString3, xn1Var);
            }
        }
        dk2.ef efVar2 = dk2.ef.f233372a;
        km2.n nVar4 = dk2.ef.H;
        r45.ta4 e28 = nVar4 != null ? nVar4.e() : null;
        if (e28 == null) {
            return true;
        }
        e28.set(16, null);
        return true;
    }

    public final void d(we2.b bVar, com.tencent.mm.protobuf.g gVar, r45.xn1 xn1Var) {
        java.util.LinkedList list;
        r45.r71 r71Var = bVar.f445214a;
        if (r71Var == null || (list = r71Var.getList(14)) == null) {
            return;
        }
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(1, 20009);
        ch1Var.set(4, gVar);
        ch1Var.set(2, zl2.q4.f473933a.m());
        r45.xn1 xn1Var2 = new r45.xn1();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
        finderContact.setUsername(((mm2.c1) this.f230787a.a(mm2.c1.class)).f328852o);
        xn1Var2.set(0, finderContact);
        ch1Var.set(0, xn1Var2);
        ch1Var.set(13, xn1Var);
        com.tencent.mars.xlog.Log.i(this.f230788b, "insert liveappmsg:" + ch1Var.hashCode() + ", client_msg_id:" + ch1Var.getString(2));
        list.add(ch1Var);
    }
}
