package s05;

/* loaded from: classes9.dex */
public class e extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f401978d;

    public e() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.u(-1, "md5")});
        this.f401978d = appendAttrs;
        super.set__serialName("WeAppPkgInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, null});
    }

    public int getType() {
        return super.getInteger(this.f401978d + 0);
    }

    public void j(java.lang.String str) {
        super.set(this.f401978d + 1, str);
    }

    public void k(int i17) {
        super.set(this.f401978d + 0, java.lang.Integer.valueOf(i17));
    }
}
