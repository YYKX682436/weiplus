package s05;

/* loaded from: classes5.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f401976d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "shoulduseupdatablemsg"), com.tencent.mm.protobuf.i.i(-1, "shouldusechattoolmsg"), com.tencent.mm.protobuf.i.u(-1, "updatablemsgcontent"), com.tencent.mm.protobuf.i.u(-1, "updatablemsgcontentcolor"), com.tencent.mm.protobuf.i.u(-1, "subscribeentrycontent"), com.tencent.mm.protobuf.i.u(-1, "subscribeentrybuttonwording"), com.tencent.mm.protobuf.i.u(-1, "subscribeconfirmedcontent"), com.tencent.mm.protobuf.i.u(-1, "expiredsubscribewording"), com.tencent.mm.protobuf.i.i(-1, "updatablemsgstate"), com.tencent.mm.protobuf.i.i(-1, "updatablemsgperiod"), com.tencent.mm.protobuf.i.i(-1, "updatablemsgtype")});
        this.f401976d = appendAttrs;
        super.set__serialName("WaUpdatableMsgInfoV3");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0, null, null, null, null, null, null, 1, 10, 0});
    }

    public int j() {
        return super.getInteger(this.f401976d + 1);
    }

    public int k() {
        return super.getInteger(this.f401976d + 0);
    }
}
