package m21;

/* loaded from: classes4.dex */
public class o implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.h96 f322996a = new r45.h96();

    @Override // m21.u
    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            if (this.f322996a != null) {
                sb6.append("<EcsInfo>");
                sb6.append("<productId>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f322996a.f375965d));
                sb6.append("</productId>");
                sb6.append("<bizType>");
                sb6.append(this.f322996a.f375966e);
                sb6.append("</bizType>");
                sb6.append("<ecsJumpInfoBase64>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f322996a.f375967f));
                sb6.append("</ecsJumpInfoBase64>");
                sb6.append("<reportData>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f322996a.f375968g));
                sb6.append("</reportData>");
                sb6.append("<showDetailBtn>");
                sb6.append(this.f322996a.f375969h);
                sb6.append("</showDetailBtn>");
                sb6.append("</EcsInfo>");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsMediaEcsInfoObject", "make content error %s", e17.getMessage());
        }
        return sb6.toString();
    }
}
