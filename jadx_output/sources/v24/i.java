package v24;

/* loaded from: classes15.dex */
public class i extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f432926d;

    public i() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY), com.tencent.mm.protobuf.i.u(-1, "wording"), com.tencent.mm.protobuf.i.u(-1, "swiperId"), com.tencent.mm.protobuf.i.r(-1, "check_type", m14.a.class), com.tencent.mm.protobuf.i.i(-1, "installed")});
        this.f432926d = appendAttrs;
        super.set__serialName("items");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", "", new m14.a(), 0});
    }

    public void j(m14.a aVar) {
        super.set(this.f432926d + 3, aVar);
    }

    public void k(int i17) {
        super.set(this.f432926d + 4, java.lang.Integer.valueOf(i17));
    }

    public void l(int i17) {
        super.set(this.f432926d + 0, java.lang.Integer.valueOf(i17));
    }

    public void n(java.lang.String str) {
        super.set(this.f432926d + 2, str);
    }

    public void o(java.lang.String str) {
        super.set(this.f432926d + 1, str);
    }
}
