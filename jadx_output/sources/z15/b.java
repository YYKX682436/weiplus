package z15;

/* loaded from: classes9.dex */
public class b extends l15.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f469412d;

    public b() {
        com.tencent.mm.protobuf.k c17 = com.tencent.mm.protobuf.i.c(-1, "isPlayed");
        c17.f192167h = true;
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.j(-1, "endflag"), com.tencent.mm.protobuf.i.j(-1, "cancelflag"), com.tencent.mm.protobuf.i.j(-1, "forwardflag"), com.tencent.mm.protobuf.i.j(-1, "voiceformat"), com.tencent.mm.protobuf.i.j(-1, "voicelength"), com.tencent.mm.protobuf.i.j(-1, "length"), com.tencent.mm.protobuf.i.j(-1, "bufid"), com.tencent.mm.protobuf.i.v(-1, "aeskey"), com.tencent.mm.protobuf.i.v(-1, "voiceurl"), com.tencent.mm.protobuf.i.v(-1, "voicemd5"), com.tencent.mm.protobuf.i.v(-1, "clientmsgid"), com.tencent.mm.protobuf.i.v(-1, "fromusername"), c17});
        this.f469412d = appendAttrs;
        super.set__serialName("voicemsg");
        super.set__xmlPrefixTag("msg");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, java.lang.Boolean.FALSE});
    }

    public java.lang.String getAeskey() {
        return super.getString(this.f469412d + 7);
    }

    public java.lang.String getFromUsername() {
        return super.getString(this.f469412d + 11);
    }

    public int getLength() {
        return super.getInteger(this.f469412d + 5);
    }

    public int j() {
        return super.getInteger(this.f469412d + 6);
    }

    public int k() {
        return super.getInteger(this.f469412d + 4);
    }

    public java.lang.String l() {
        return super.getString(this.f469412d + 9);
    }

    public java.lang.String n() {
        return super.getString(this.f469412d + 8);
    }

    public boolean o() {
        return super.getBoolean(this.f469412d + 12);
    }

    public void p(java.lang.String str) {
        super.set(this.f469412d + 7, str);
    }

    public void q(int i17) {
        super.set(this.f469412d + 2, java.lang.Integer.valueOf(i17));
    }

    public void r(java.lang.String str) {
        super.set(this.f469412d + 11, str);
    }

    public void s(int i17) {
        super.set(this.f469412d + 5, java.lang.Integer.valueOf(i17));
    }

    public void t(boolean z17) {
        super.set(this.f469412d + 12, java.lang.Boolean.valueOf(z17));
    }

    public void u(int i17) {
        super.set(this.f469412d + 4, java.lang.Integer.valueOf(i17));
    }

    public void w(java.lang.String str) {
        super.set(this.f469412d + 8, str);
    }
}
