package yn1;

/* loaded from: classes4.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final yn1.r1 f463808d = new yn1.r1();

    public r1() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.modelbase.o commReqResp = (com.tencent.mm.modelbase.o) obj;
        com.tencent.mm.modelbase.i cgi = (com.tencent.mm.modelbase.i) obj2;
        kotlin.jvm.internal.o.g(commReqResp, "commReqResp");
        kotlin.jvm.internal.o.g(cgi, "cgi");
        commReqResp.f70714e = 1;
        commReqResp.setRsaInfo(o45.pi.d());
        return jz5.f0.f302826a;
    }
}
