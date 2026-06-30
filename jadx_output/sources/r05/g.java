package r05;

/* loaded from: classes9.dex */
public class g extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f368361d;

    public g() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "itemshowtype"), com.tencent.mm.protobuf.i.u(-1, "coverpicimageurl"), com.tencent.mm.protobuf.i.g(-1, "coverpicwidth"), com.tencent.mm.protobuf.i.g(-1, "coverpicheight"), com.tencent.mm.protobuf.i.i(-1, "piccount"), com.tencent.mm.protobuf.i.i(-1, "showsourceinfo"), com.tencent.mm.protobuf.i.u(-1, "isfindercontact"), com.tencent.mm.protobuf.i.i(-1, "duration"), com.tencent.mm.protobuf.i.i(-1, "ispaysubscribe"), com.tencent.mm.protobuf.i.i(-1, "nativepage")});
        this.f368361d = appendAttrs;
        super.set__serialName("AppMsgReaderShared");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{-1, "", valueOf, valueOf, 0, 0, "0", -1, 0, 0});
    }

    public void A(int i17) {
        super.set(this.f368361d + 4, java.lang.Integer.valueOf(i17));
    }

    @Override // e14.l
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        if (kotlin.jvm.internal.o.b(fieldSerializeName, "itemshowtype") || kotlin.jvm.internal.o.b(fieldSerializeName, "showsourceinfo")) {
            return false;
        }
        return super.checkValueSkip(fieldSerializeName, obj, z17);
    }

    public float j() {
        return super.getFloat(this.f368361d + 3);
    }

    public java.lang.String k() {
        return super.getString(this.f368361d + 1);
    }

    public float l() {
        return super.getFloat(this.f368361d + 2);
    }

    public int n() {
        return super.getInteger(this.f368361d + 7);
    }

    public int o() {
        return super.getInteger(this.f368361d + 0);
    }

    public int p() {
        return super.getInteger(this.f368361d + 9);
    }

    public int q() {
        return super.getInteger(this.f368361d + 4);
    }

    public java.lang.String r() {
        return super.getString(this.f368361d + 6);
    }

    public int s() {
        return super.getInteger(this.f368361d + 8);
    }

    public void t(float f17) {
        super.set(this.f368361d + 3, java.lang.Float.valueOf(f17));
    }

    public void u(java.lang.String str) {
        super.set(this.f368361d + 1, str);
    }

    public void w(float f17) {
        super.set(this.f368361d + 2, java.lang.Float.valueOf(f17));
    }

    public void x(int i17) {
        super.set(this.f368361d + 7, java.lang.Integer.valueOf(i17));
    }

    public void y(java.lang.String str) {
        super.set(this.f368361d + 6, str);
    }

    public void z(int i17) {
        super.set(this.f368361d + 0, java.lang.Integer.valueOf(i17));
    }
}
