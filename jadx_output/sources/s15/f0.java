package s15;

/* loaded from: classes9.dex */
public class f0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402162d;

    public f0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.u(-1, "categoryItem"), com.tencent.mm.protobuf.i.u(-1, "categoryId")});
        this.f402162d = appendAttrs;
        super.set__serialName("RecordTingCategoryItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", ""});
    }

    public java.lang.String j() {
        return super.getString(this.f402162d + 1);
    }

    public void k(java.lang.String str) {
        super.set(this.f402162d + 2, str);
    }

    public void l(java.lang.String str) {
        super.set(this.f402162d + 1, str);
    }

    public void n(int i17) {
        super.set(this.f402162d + 0, java.lang.Integer.valueOf(i17));
    }
}
