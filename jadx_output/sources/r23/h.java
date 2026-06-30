package r23;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final r23.h f368825d = new r23.h();

    public h() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        dx1.g.f244489a.j("SnsPublishProcess", booleanValue ? "blankCnt" : "refuseCnt", 1, bx1.u.f36310e);
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandle", "onSendItemClick deny permission, cancel: " + booleanValue);
        r23.j.f368837k = false;
        return jz5.f0.f302826a;
    }
}
