package x05;

/* loaded from: classes9.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f451189d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(-1, "avatar"), com.tencent.mm.protobuf.i.u(-1, "nickname"), com.tencent.mm.protobuf.i.u(-1, "auth_job"), com.tencent.mm.protobuf.i.i(-1, "auth_icon"), com.tencent.mm.protobuf.i.u(-1, "auth_icon_url"), com.tencent.mm.protobuf.i.u(-1, "ecSource"), com.tencent.mm.protobuf.i.u(-1, "lastGMsgID")});
        this.f451189d = appendAttrs;
        super.set__serialName("findernamecard");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null, null, 0, null, null, null});
    }

    @Override // e14.l
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        boolean checkValueSkip = super.checkValueSkip(fieldSerializeName, obj, z17);
        if (!checkValueSkip && kotlin.jvm.internal.o.b(fieldSerializeName, "auth_icon") && kotlin.jvm.internal.o.b(obj, -1) && z17) {
            return true;
        }
        return checkValueSkip;
    }

    public java.lang.String getAuthIconUrl() {
        return super.getString(this.f451189d + 5);
    }

    public java.lang.String getNickname() {
        return super.getString(this.f451189d + 2);
    }

    public java.lang.String getUsername() {
        return super.getString(this.f451189d + 0);
    }

    public int j() {
        return super.getInteger(this.f451189d + 4);
    }

    public java.lang.String k() {
        return super.getString(this.f451189d + 3);
    }

    public java.lang.String l() {
        return super.getString(this.f451189d + 1);
    }

    public java.lang.String n() {
        return super.getString(this.f451189d + 6);
    }

    public java.lang.String o() {
        return super.getString(this.f451189d + 7);
    }

    public void p(int i17) {
        super.set(this.f451189d + 4, java.lang.Integer.valueOf(i17));
    }

    public void q(java.lang.String str) {
        super.set(this.f451189d + 3, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f451189d + 1, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f451189d + 7, str);
    }

    public void t(java.lang.String str) {
        super.set(this.f451189d + 2, str);
    }

    public void u(java.lang.String str) {
        super.set(this.f451189d + 0, str);
    }
}
