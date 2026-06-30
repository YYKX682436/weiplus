package kn3;

/* loaded from: classes8.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f309663d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "tipsid"), com.tencent.mm.protobuf.i.i(-1, "ctrl_type"), com.tencent.mm.protobuf.i.n(-1, "message_num"), com.tencent.mm.protobuf.i.u(-1, "object_id"), com.tencent.mm.protobuf.i.u(-1, "ext_reportinfo"), com.tencent.mm.protobuf.i.u(-1, "show_parent_path"), com.tencent.mm.protobuf.i.u(-1, "show_path"), com.tencent.mm.protobuf.i.i(-1, "show_type"), com.tencent.mm.protobuf.i.i(-1, "ctrlinfo_business_type")});
        this.f309663d = appendAttrs;
        super.set__serialName("coverRedDotInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", 0, 0L, "", "", "", "", 0, 0});
    }

    @Override // e14.l
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        return false;
    }

    public void j(int i17) {
        super.set(this.f309663d + 8, java.lang.Integer.valueOf(i17));
    }

    public void k(int i17) {
        super.set(this.f309663d + 1, java.lang.Integer.valueOf(i17));
    }

    public void l(java.lang.String str) {
        super.set(this.f309663d + 4, str);
    }

    public void n(long j17) {
        super.set(this.f309663d + 2, java.lang.Long.valueOf(j17));
    }

    public void o(java.lang.String str) {
        super.set(this.f309663d + 3, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f309663d + 5, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f309663d + 6, str);
    }

    public void r(int i17) {
        super.set(this.f309663d + 7, java.lang.Integer.valueOf(i17));
    }

    public void s(java.lang.String str) {
        super.set(this.f309663d + 0, str);
    }
}
