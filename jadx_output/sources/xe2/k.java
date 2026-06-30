package xe2;

/* loaded from: classes3.dex */
public final class k extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453873c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453873c = "LiveSingSongMsgInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.fj1 fj1Var = new r45.fj1();
        if (ch1Var != null) {
            r45.ch1 ch1Var2 = ch1Var.getByteString(4) != null ? ch1Var : null;
            if (ch1Var2 != null) {
                com.tencent.mm.protobuf.g byteString = ch1Var2.getByteString(4);
                fj1Var.parseFrom(byteString != null ? byteString.g() : null);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("from msg syncRoomManagaerInfo modType: ");
        sb6.append(fj1Var.getInteger(0));
        sb6.append(", msgId: ");
        sb6.append(ch1Var != null ? ch1Var.getString(2) : null);
        com.tencent.mars.xlog.Log.i(this.f453873c, sb6.toString());
        java.lang.String str = this.f453874d;
        if (str != null) {
            if (kotlin.jvm.internal.o.b(str, ch1Var != null ? ch1Var.getString(2) : null)) {
                return;
            }
        }
        int integer = fj1Var.getInteger(0);
        gk2.e eVar = this.f445267a;
        if (integer == 2) {
            dk2.xa.f234344a.e(eVar, 2, false);
            ((kotlinx.coroutines.flow.h3) ((mm2.c1) eVar.a(mm2.c1.class)).U).k(java.lang.Boolean.FALSE);
        } else {
            dk2.xa.f234344a.e(eVar, 1, true);
            ((kotlinx.coroutines.flow.h3) ((mm2.c1) eVar.a(mm2.c1.class)).U).k(java.lang.Boolean.TRUE);
        }
        this.f453874d = ch1Var != null ? ch1Var.getString(2) : null;
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20069};
    }
}
