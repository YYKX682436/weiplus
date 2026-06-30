package s23;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final s23.i f402305d = new s23.i();

    public i() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        dx1.g.f244489a.j("SnsPublishProcess", booleanValue ? "blankCnt" : "refuseCnt", 1, bx1.u.f36310e);
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandleNew", "onSendItemClick deny permission, cancel: " + booleanValue);
        s23.n.f402318p = false;
        return jz5.f0.f302826a;
    }
}
