package xe2;

/* loaded from: classes3.dex */
public final class m1 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453882c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453882c = "LiveTopDescInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        com.tencent.mm.protobuf.g byteString;
        java.util.LinkedList list;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.jk1 jk1Var = new r45.jk1();
        if (ch1Var != null && (byteString = ch1Var.getByteString(4)) != null) {
            r45.xn1 xn1Var = (r45.xn1) ch1Var.getCustom(13);
            java.lang.String str = null;
            if (!kotlin.jvm.internal.o.b((xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact2.getUsername(), c01.z1.r())) {
                r45.xn1 xn1Var2 = (r45.xn1) ch1Var.getCustom(13);
                if (xn1Var2 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) != null) {
                    str = finderContact.getUsername();
                }
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                if (!kotlin.jvm.internal.o.b(str, xy2.c.e(context))) {
                    jk1Var.parseFrom(byteString.g());
                    r45.t12 t12Var = new r45.t12();
                    t12Var.set(8, new r45.xn1());
                    r45.xn1 xn1Var3 = (r45.xn1) t12Var.getCustom(8);
                    if (xn1Var3 != null && (list = xn1Var3.getList(11)) != null) {
                        r45.yl1 yl1Var = new r45.yl1();
                        yl1Var.set(0, -10001);
                        yl1Var.set(4, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.npz));
                        list.add(yl1Var);
                    }
                    t12Var.set(0, jk1Var.getString(0));
                    t12Var.set(2, jk1Var.getString(1));
                    gk2.e eVar = this.f445267a;
                    ((mm2.x4) eVar.a(mm2.x4.class)).f329531i.clear();
                    ((mm2.x4) eVar.a(mm2.x4.class)).f329531i.add(t12Var);
                }
            }
        }
        com.tencent.mars.xlog.Log.i(this.f453882c, "receiver promote msg: " + pm0.b0.g(jk1Var));
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20121};
    }
}
