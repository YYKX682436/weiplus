package xe2;

/* loaded from: classes3.dex */
public final class e extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453850c = "LiveAppMsgReplayTransitionInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(msgList);
        r45.wj1 wj1Var = new r45.wj1();
        if (ch1Var != null) {
            if (!(ch1Var.getByteString(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                wj1Var.parseFrom(byteString != null ? byteString.g() : null);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive replay transition info = ");
        cm2.a aVar = cm2.a.f43328a;
        sb6.append(aVar.n((r45.j72) wj1Var.getCustom(0)));
        sb6.append(',');
        sb6.append(aVar.o((r45.k72) wj1Var.getCustom(1)));
        com.tencent.mars.xlog.Log.i(this.f453850c, sb6.toString());
        gk2.e eVar = this.f445267a;
        r45.nw1 nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r;
        r45.i72 i72Var = (r45.i72) ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getCustom(44);
        if (i72Var == null) {
            i72Var = new r45.i72();
        }
        nw1Var.set(44, i72Var);
        r45.i72 i72Var2 = (r45.i72) ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getCustom(44);
        if (i72Var2 != null) {
            i72Var2.set(5, (r45.j72) wj1Var.getCustom(0));
            i72Var2.set(6, (r45.k72) wj1Var.getCustom(1));
        }
        ((mm2.e1) eVar.a(mm2.e1.class)).N6();
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20079};
    }
}
