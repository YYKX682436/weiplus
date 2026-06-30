package h15;

/* loaded from: classes9.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f278218d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.j(-1, "datastatus"), com.tencent.mm.protobuf.i.v(-1, "dataid"), com.tencent.mm.protobuf.i.v(-1, "htmlid"), com.tencent.mm.protobuf.i.j(-1, "datatype"), com.tencent.mm.protobuf.i.j(-1, "dataillegaltype"), com.tencent.mm.protobuf.i.u(-1, "datatitle"), com.tencent.mm.protobuf.i.u(-1, "datadesc"), com.tencent.mm.protobuf.i.u(-1, "datafmt"), com.tencent.mm.protobuf.i.i(-1, "filetype"), com.tencent.mm.protobuf.i.i(-1, "thumbfiletype"), com.tencent.mm.protobuf.i.u(-1, "cdn_thumbkey"), com.tencent.mm.protobuf.i.u(-1, "cdn_thumburl"), com.tencent.mm.protobuf.i.u(-1, "thumbfullmd5"), com.tencent.mm.protobuf.i.u(-1, "thumbhead256md5"), com.tencent.mm.protobuf.i.i(-1, "thumbfullsize"), com.tencent.mm.protobuf.i.i(-1, "thumb_width"), com.tencent.mm.protobuf.i.i(-1, "thumb_height"), com.tencent.mm.protobuf.i.u(-1, "cdn_datakey"), com.tencent.mm.protobuf.i.u(-1, "cdn_dataurl"), com.tencent.mm.protobuf.i.u(-1, "fullmd5"), com.tencent.mm.protobuf.i.i(-1, "fullsize")});
        this.f278218d = appendAttrs;
        super.set__serialName("dataitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", "", 0, 0, "", "", "", 0, 0, "", "", "", "", 0, 0, 0, "", "", "", 0});
    }

    public java.lang.String getMd5() {
        return super.getString(this.f278218d + 19);
    }

    public java.lang.String j() {
        return super.getString(this.f278218d + 7);
    }

    public java.lang.String k() {
        return super.getString(this.f278218d + 1);
    }

    public java.lang.String l() {
        return super.getString(this.f278218d + 5);
    }

    public int n() {
        return super.getInteger(this.f278218d + 3);
    }
}
