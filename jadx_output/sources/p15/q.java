package p15;

/* loaded from: classes11.dex */
public class q extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f351262d;

    public q() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "sec-hash")});
        this.f351262d = appendAttrs;
        super.set__serialName("passthrough");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{""});
    }

    public java.lang.String j() {
        return super.getString(this.f351262d + 0);
    }

    public void k(java.lang.String str) {
        super.set(this.f351262d + 0, str);
    }
}
