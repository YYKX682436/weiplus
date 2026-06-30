package r72;

/* loaded from: classes15.dex */
public class j0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393146d;

    public j0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.u(-1, "listenItem"), com.tencent.mm.protobuf.i.u(-1, "listenId")});
        this.f393146d = appendAttrs;
        super.set__serialName("tingListenItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", ""});
    }

    public java.lang.String getListenId() {
        return super.getString(this.f393146d + 2);
    }

    public java.lang.String j() {
        return super.getString(this.f393146d + 1);
    }

    public int k() {
        return super.getInteger(this.f393146d + 0);
    }

    public void l(java.lang.String str) {
        super.set(this.f393146d + 2, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f393146d + 1, str);
    }

    public void o(int i17) {
        super.set(this.f393146d + 0, java.lang.Integer.valueOf(i17));
    }
}
