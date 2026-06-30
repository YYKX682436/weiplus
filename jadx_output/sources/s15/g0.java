package s15;

/* loaded from: classes9.dex */
public class g0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402164d;

    public g0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.u(-1, "listenItem"), com.tencent.mm.protobuf.i.u(-1, "listenId")});
        this.f402164d = appendAttrs;
        super.set__serialName("RecordTingListenItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", ""});
    }

    public java.lang.String j() {
        return super.getString(this.f402164d + 1);
    }

    public int k() {
        return super.getInteger(this.f402164d + 0);
    }

    public void l(java.lang.String str) {
        super.set(this.f402164d + 2, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f402164d + 1, str);
    }

    public void o(int i17) {
        super.set(this.f402164d + 0, java.lang.Integer.valueOf(i17));
    }
}
