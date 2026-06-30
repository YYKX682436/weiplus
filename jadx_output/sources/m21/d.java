package m21;

/* loaded from: classes4.dex */
public class d implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.lh0 f322984a = new r45.lh0();

    @Override // m21.u
    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            if (this.f322984a != null) {
                sb6.append("<EcsShareInfo>");
                sb6.append("<title>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f322984a.f379474e));
                sb6.append("</title>");
                sb6.append("<productId>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f322984a.f379475f));
                sb6.append("</productId>");
                sb6.append("<ecsJumpInfoBase64>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f322984a.f379476g));
                sb6.append("</ecsJumpInfoBase64>");
                sb6.append("<type>");
                sb6.append(this.f322984a.f379473d);
                sb6.append("</type>");
                sb6.append("<reportData>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f322984a.f379478i));
                sb6.append("</reportData>");
                sb6.append("</EcsShareInfo>");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsEcsShareInfoObject", "make content error %s", e17.getMessage());
        }
        return sb6.toString();
    }
}
