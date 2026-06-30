package e15;

/* loaded from: classes9.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f246447d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.u(-1, "listenItem"), com.tencent.mm.protobuf.i.n(-1, "listenId")});
        this.f246447d = appendAttrs;
        super.set__serialName("tingListenItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, null, 0L});
    }

    public int getType() {
        return super.getInteger(this.f246447d + 0);
    }

    public long j() {
        return super.getLong(this.f246447d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f246447d + 1);
    }
}
