package r05;

/* loaded from: classes9.dex */
public class e extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f368360d;

    public e() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "packageflag"), com.tencent.mm.protobuf.i.u(-1, "packageid")});
        this.f368360d = appendAttrs;
        super.set__serialName("AppMsgEmoticonShared");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, ""});
    }

    public java.lang.String j() {
        return super.getString(this.f368360d + 1);
    }

    public void k(int i17) {
        super.set(this.f368360d + 0, java.lang.Integer.valueOf(i17));
    }

    public void l(java.lang.String str) {
        super.set(this.f368360d + 1, str);
    }
}
