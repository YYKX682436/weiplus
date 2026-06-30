package w15;

/* loaded from: classes5.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f442243d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "fromusername"), com.tencent.mm.protobuf.i.u(-1, "tousername"), com.tencent.mm.protobuf.i.n(-1, "newmsgid"), com.tencent.mm.protobuf.i.u(-1, "climsgid"), com.tencent.mm.protobuf.i.u(-1, ya.b.ORIGIN)});
        this.f442243d = appendAttrs;
        super.set__serialName("uploadfinishmsg");
        super.set__xmlPrefixTag("sysmsg");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", 0L, "", ""});
    }

    public java.lang.String getFromUsername() {
        return super.getString(this.f442243d + 0);
    }

    public java.lang.String getToUsername() {
        return super.getString(this.f442243d + 1);
    }

    public long j() {
        return super.getLong(this.f442243d + 2);
    }
}
