package q15;

/* loaded from: classes5.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f359694d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "newmsgid")});
        this.f359694d = appendAttrs;
        super.set__serialName("masssend_msg_info");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null});
    }

    public java.lang.String j() {
        return super.getString(this.f359694d + 0);
    }
}
