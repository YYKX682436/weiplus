package s05;

/* loaded from: classes5.dex */
public class f extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f401979d;

    public f() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "videobuttontext"), com.tencent.mm.protobuf.i.u(-1, "videotemplocalpath"), com.tencent.mm.protobuf.i.u(-1, "videomd5"), com.tencent.mm.protobuf.i.u(-1, "videoremoteurl"), com.tencent.mm.protobuf.i.u(-1, "videothumburl"), com.tencent.mm.protobuf.i.u(-1, "videoplaydesc")});
        this.f401979d = appendAttrs;
        super.set__serialName("WeAppScreenVideoInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null, null, null, null});
    }

    public java.lang.String j() {
        return super.getString(this.f401979d + 3);
    }

    public java.lang.String k() {
        return super.getString(this.f401979d + 4);
    }
}
