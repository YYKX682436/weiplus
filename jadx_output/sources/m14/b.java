package m14;

/* loaded from: classes15.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f322867d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "simplified_chinese"), com.tencent.mm.protobuf.i.u(-1, "traditional_chinese"), com.tencent.mm.protobuf.i.u(-1, "english"), com.tencent.mm.protobuf.i.i(-1, "days")});
        this.f322867d = appendAttrs;
        super.set__serialName("enableTips");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", 60});
    }

    public int j() {
        return super.getInteger(this.f322867d + 3);
    }

    public java.lang.String k() {
        return super.getString(this.f322867d + 2);
    }

    public java.lang.String l() {
        return super.getString(this.f322867d + 0);
    }

    public java.lang.String n() {
        return super.getString(this.f322867d + 1);
    }
}
