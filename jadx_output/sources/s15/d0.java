package s15;

/* loaded from: classes9.dex */
public class d0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402158d;

    public d0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.n(-1, "svrid"), com.tencent.mm.protobuf.i.u(-1, "displayname"), com.tencent.mm.protobuf.i.u(-1, "content"), com.tencent.mm.protobuf.i.u(-1, "referdesc")});
        this.f402158d = appendAttrs;
        super.set__serialName("RecordReferMsgItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0L, "", "", ""});
    }

    public java.lang.String getContent() {
        return super.getString(this.f402158d + 3);
    }

    public java.lang.String getDisplayName() {
        return super.getString(this.f402158d + 2);
    }

    public int getType() {
        return super.getInteger(this.f402158d + 0);
    }

    public java.lang.String j() {
        return super.getString(this.f402158d + 4);
    }

    public long k() {
        return super.getLong(this.f402158d + 1);
    }

    public void l(java.lang.String str) {
        super.set(this.f402158d + 3, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f402158d + 4, str);
    }

    public void o(long j17) {
        super.set(this.f402158d + 1, java.lang.Long.valueOf(j17));
    }

    public void p(int i17) {
        super.set(this.f402158d + 0, java.lang.Integer.valueOf(i17));
    }

    public void setDisplayName(java.lang.String str) {
        super.set(this.f402158d + 2, str);
    }
}
