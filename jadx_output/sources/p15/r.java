package p15;

/* loaded from: classes9.dex */
public class r extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f351263d;

    public r() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "code_content"), com.tencent.mm.protobuf.i.i(-1, "src_type")});
        this.f351263d = appendAttrs;
        super.set__serialName("code_info");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, 0});
    }

    public java.lang.String j() {
        return super.getString(this.f351263d + 0);
    }

    public int k() {
        return super.getInteger(this.f351263d + 1);
    }

    public void l(java.lang.String str) {
        super.set(this.f351263d + 0, str);
    }

    public void n(int i17) {
        super.set(this.f351263d + 1, java.lang.Integer.valueOf(i17));
    }

    @Override // e14.l
    public boolean processXmlValueUseCData(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        if (kotlin.jvm.internal.o.b(tagName, "code_content")) {
            return true;
        }
        return super.processXmlValueUseCData(value, tagName, itemTagName, z17);
    }
}
