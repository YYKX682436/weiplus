package s15;

/* loaded from: classes9.dex */
public class s extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402178d;

    public s() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(-1, "nickname"), com.tencent.mm.protobuf.i.u(-1, "avatar"), com.tencent.mm.protobuf.i.u(-1, "authJob"), com.tencent.mm.protobuf.i.i(-1, "authIcon"), com.tencent.mm.protobuf.i.u(-1, "lastGMsgID")});
        this.f402178d = appendAttrs;
        super.set__serialName("RecordFinderShareNameCardItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", -1, ""});
    }

    @Override // e14.l
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        boolean checkValueSkip = super.checkValueSkip(fieldSerializeName, obj, z17);
        if (!checkValueSkip && kotlin.jvm.internal.o.b(fieldSerializeName, "authIcon") && kotlin.jvm.internal.o.b(obj, -1) && z17) {
            return true;
        }
        return checkValueSkip;
    }

    public java.lang.String getNickname() {
        return super.getString(this.f402178d + 1);
    }

    public java.lang.String getUsername() {
        return super.getString(this.f402178d + 0);
    }

    public int j() {
        return super.getInteger(this.f402178d + 4);
    }

    public java.lang.String k() {
        return super.getString(this.f402178d + 3);
    }

    public java.lang.String l() {
        return super.getString(this.f402178d + 2);
    }

    public java.lang.String n() {
        return super.getString(this.f402178d + 5);
    }

    public void o(int i17) {
        super.set(this.f402178d + 4, java.lang.Integer.valueOf(i17));
    }

    public void p(java.lang.String str) {
        super.set(this.f402178d + 3, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f402178d + 2, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f402178d + 5, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f402178d + 1, str);
    }

    public void t(java.lang.String str) {
        super.set(this.f402178d + 0, str);
    }
}
