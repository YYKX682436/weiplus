package s15;

/* loaded from: classes9.dex */
public class d extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402157d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "createTime"), com.tencent.mm.protobuf.i.r(-1, "desc", s15.b.class)});
        this.f402157d = appendAttrs;
        super.set__serialName("NewLifeShareExtInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, null});
    }

    public s15.b j() {
        return (s15.b) super.getCustom(this.f402157d + 1);
    }

    public void k(int i17) {
        super.set(this.f402157d + 0, java.lang.Integer.valueOf(i17));
    }

    public void l(s15.b bVar) {
        super.set(this.f402157d + 1, bVar);
    }
}
