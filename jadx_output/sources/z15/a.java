package z15;

/* loaded from: classes12.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f469411d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.v(-1, "voiceformat"), com.tencent.mm.protobuf.i.j(-1, "length"), com.tencent.mm.protobuf.i.j(-1, "endflag"), com.tencent.mm.protobuf.i.j(-1, "cancelflag"), com.tencent.mm.protobuf.i.o(-1, "voicelength"), com.tencent.mm.protobuf.i.v(-1, "fromusername"), com.tencent.mm.protobuf.i.j(-1, "isPlayed"), com.tencent.mm.protobuf.i.r(-1, "extcommoninfo", r15.b.class)});
        this.f469411d = appendAttrs;
        super.set__serialName("voicemsg");
        super.set__xmlPrefixTag("msg");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, 0, 0, 0, 0L, "", 0, null});
    }

    public java.lang.String getFromUsername() {
        return super.getString(this.f469411d + 5);
    }

    public r15.b j() {
        return (r15.b) super.getCustom(this.f469411d + 7);
    }

    public long k() {
        return super.getLong(this.f469411d + 4);
    }

    public int l() {
        return super.getInteger(this.f469411d + 6);
    }

    public void n(int i17) {
        super.set(this.f469411d + 3, java.lang.Integer.valueOf(i17));
    }

    public void o(int i17) {
        super.set(this.f469411d + 2, java.lang.Integer.valueOf(i17));
    }

    public void p(r15.b bVar) {
        super.set(this.f469411d + 7, bVar);
    }

    public void q(java.lang.String str) {
        super.set(this.f469411d + 5, str);
    }

    public void r(int i17) {
        super.set(this.f469411d + 1, java.lang.Integer.valueOf(i17));
    }

    public void s(int i17) {
        super.set(this.f469411d + 6, java.lang.Integer.valueOf(i17));
    }

    public void t(java.lang.String str) {
        super.set(this.f469411d + 0, str);
    }

    public void u(long j17) {
        super.set(this.f469411d + 4, java.lang.Long.valueOf(j17));
    }
}
