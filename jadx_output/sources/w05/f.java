package w05;

/* loaded from: classes9.dex */
public class f extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f441937d;

    public f() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "msgcover"), com.tencent.mm.protobuf.i.u(-1, "boxoutercover"), com.tencent.mm.protobuf.i.u(-1, "boxinnercover"), com.tencent.mm.protobuf.i.u(-1, "normalcover"), com.tencent.mm.protobuf.i.u(-1, "videorecvcover"), com.tencent.mm.protobuf.i.u(-1, "videonomalcover")});
        this.f441937d = appendAttrs;
        super.set__serialName("giftcover");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", "", ""});
    }

    public java.lang.String j() {
        return super.getString(this.f441937d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f441937d + 1);
    }

    public java.lang.String l() {
        return super.getString(this.f441937d + 0);
    }

    public java.lang.String n() {
        return super.getString(this.f441937d + 3);
    }

    public java.lang.String o() {
        return super.getString(this.f441937d + 5);
    }

    public java.lang.String p() {
        return super.getString(this.f441937d + 4);
    }
}
