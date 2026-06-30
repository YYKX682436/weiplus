package r72;

/* loaded from: classes15.dex */
public class o extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393151d;

    public o() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "nickname"), com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_USERNAME)});
        this.f393151d = appendAttrs;
        super.set__serialName("author");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null});
    }

    public java.lang.String getNickname() {
        return super.getString(this.f393151d + 0);
    }

    public java.lang.String getUsername() {
        return super.getString(this.f393151d + 1);
    }

    public void j(java.lang.String str) {
        super.set(this.f393151d + 0, str);
    }

    public void k(java.lang.String str) {
        super.set(this.f393151d + 1, str);
    }
}
