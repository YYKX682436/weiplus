package x05;

/* loaded from: classes5.dex */
public class m extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f451197d;

    public m() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "nickname"), com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_USERNAME)});
        this.f451197d = appendAttrs;
        super.set__serialName("author");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null});
    }

    public java.lang.String getNickname() {
        return super.getString(this.f451197d + 0);
    }
}
