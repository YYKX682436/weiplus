package r15;

/* loaded from: classes12.dex */
public class g extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f368646d;

    public g() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "start"), com.tencent.mm.protobuf.i.u(-1, "end"), com.tencent.mm.protobuf.i.i(-1, "startindex"), com.tencent.mm.protobuf.i.i(-1, "endindex"), com.tencent.mm.protobuf.i.u(-1, "quotemd5")});
        this.f368646d = appendAttrs;
        super.set__serialName("partialtext");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, 0, 0, null});
    }

    @Override // e14.l
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        return false;
    }

    public int getEndIndex() {
        return super.getInteger(this.f368646d + 3);
    }

    public java.lang.String getMd5() {
        return super.getString(this.f368646d + 4);
    }

    public java.lang.String j() {
        return super.getString(this.f368646d + 1);
    }

    public java.lang.String k() {
        return super.getString(this.f368646d + 0);
    }

    public int l() {
        return super.getInteger(this.f368646d + 2);
    }

    public void n(java.lang.String str) {
        super.set(this.f368646d + 1, str);
    }

    public void o(int i17) {
        super.set(this.f368646d + 3, java.lang.Integer.valueOf(i17));
    }

    public void p(java.lang.String str) {
        super.set(this.f368646d + 4, str);
    }

    @Override // e14.l
    public boolean processXmlValueUseCData(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        if (kotlin.jvm.internal.o.b(tagName, "start") || kotlin.jvm.internal.o.b(tagName, "end")) {
            return true;
        }
        return super.processXmlValueUseCData(value, tagName, itemTagName, z17);
    }

    public void q(java.lang.String str) {
        super.set(this.f368646d + 0, str);
    }

    public void r(int i17) {
        super.set(this.f368646d + 2, java.lang.Integer.valueOf(i17));
    }
}
