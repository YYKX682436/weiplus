package t15;

/* loaded from: classes12.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f414607d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "send_group_id"), com.tencent.mm.protobuf.i.u(-1, "send_to_username"), com.tencent.mm.protobuf.i.i(-1, "send_room_size"), com.tencent.mm.protobuf.i.i(-1, "send_select_img_count"), com.tencent.mm.protobuf.i.i(-1, "send_select_video_count")});
        this.f414607d = appendAttrs;
        super.set__serialName("multi_send_report_info");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, 0, 0, 0});
    }

    public java.lang.String j() {
        return super.getString(this.f414607d + 0);
    }

    public int k() {
        return super.getInteger(this.f414607d + 2);
    }

    public int l() {
        return super.getInteger(this.f414607d + 3);
    }

    public int n() {
        return super.getInteger(this.f414607d + 4);
    }

    public java.lang.String o() {
        return super.getString(this.f414607d + 1);
    }

    public void p(java.lang.String str) {
        super.set(this.f414607d + 0, str);
    }

    public void q(int i17) {
        super.set(this.f414607d + 2, java.lang.Integer.valueOf(i17));
    }

    public void r(int i17) {
        super.set(this.f414607d + 3, java.lang.Integer.valueOf(i17));
    }

    public void s(int i17) {
        super.set(this.f414607d + 4, java.lang.Integer.valueOf(i17));
    }

    public void t(java.lang.String str) {
        super.set(this.f414607d + 1, str);
    }
}
