package p15;

/* loaded from: classes8.dex */
public class m extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f351259d;

    public m() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "ImgSourceUrl"), com.tencent.mm.protobuf.i.i(-1, "BizType")});
        this.f351259d = appendAttrs;
        super.set__serialName("ImgSourceInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, 0});
    }

    public int j() {
        return super.getInteger(this.f351259d + 1);
    }

    public java.lang.String k() {
        return super.getString(this.f351259d + 0);
    }

    public void l(int i17) {
        super.set(this.f351259d + 1, java.lang.Integer.valueOf(i17));
    }

    public void n(java.lang.String str) {
        super.set(this.f351259d + 0, str);
    }
}
