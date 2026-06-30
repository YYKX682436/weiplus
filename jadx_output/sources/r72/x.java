package r72;

/* loaded from: classes11.dex */
public class x extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393160d;

    public x() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "templateTopicId"), com.tencent.mm.protobuf.i.i(-1, "templateType")});
        this.f393160d = appendAttrs;
        super.set__serialName("finderTopicTemplateItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", 0});
    }

    public java.lang.String j() {
        return super.getString(this.f393160d + 0);
    }

    public int k() {
        return super.getInteger(this.f393160d + 1);
    }

    public void l(java.lang.String str) {
        super.set(this.f393160d + 0, str);
    }

    public void n(int i17) {
        super.set(this.f393160d + 1, java.lang.Integer.valueOf(i17));
    }
}
