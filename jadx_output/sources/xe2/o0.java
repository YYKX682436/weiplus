package xe2;

/* loaded from: classes3.dex */
public final class o0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453892c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453892c = "LiveHighLightCheerAppMsgInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        gk2.e eVar = this.f445267a;
        ((mm2.x4) eVar.a(mm2.x4.class)).f329532m.clear();
        ((mm2.x4) eVar.a(mm2.x4.class)).f329532m.addAll(msgList);
        com.tencent.mars.xlog.Log.i(this.f453892c, "handleHighLightCheerMsg roomData.business(LiveCommonSlice::class.java).highLightCheerList:" + ((mm2.x4) eVar.a(mm2.x4.class)).f329532m.size());
    }

    @Override // we2.z
    public boolean e() {
        return true;
    }

    @Override // we2.z
    public boolean f(r45.ch1 appMsg) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(appMsg, "appMsg");
        zl2.r4 r4Var = zl2.r4.f473950a;
        r45.xn1 xn1Var = (r45.xn1) appMsg.getCustom(13);
        return !r4Var.c2((xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername());
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20006};
    }
}
