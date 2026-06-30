package w15;

/* loaded from: classes5.dex */
public class f extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f442247d;

    public f() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "uuid"), com.tencent.mm.protobuf.i.u(-1, "deviceid"), com.tencent.mm.protobuf.i.u(-1, "deadlinewording"), com.tencent.mm.protobuf.i.u(-1, "forceDisplay")});
        this.f442247d = appendAttrs;
        super.set__serialName("showTeenageModeOpenNotify");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null, null});
    }

    public java.lang.String getUuid() {
        return super.getString(this.f442247d + 0);
    }

    public java.lang.String j() {
        return super.getString(this.f442247d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f442247d + 3);
    }
}
