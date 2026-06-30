package q15;

/* loaded from: classes5.dex */
public class e extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f359696d;

    public e() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(-1, "action"), com.tencent.mm.protobuf.i.i(-1, "stream_type"), com.tencent.mm.protobuf.i.n(-1, "svr_id"), com.tencent.mm.protobuf.i.u(-1, "ilink_stream_ticket"), com.tencent.mm.protobuf.i.u(-1, "msg_digest")});
        this.f359696d = appendAttrs;
        super.set__serialName("weclaw_stream_msg");
        super.set__xmlPrefixTag("sysmsg");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, 0, 0L, null, null});
    }

    public java.lang.String getUsername() {
        return super.getString(this.f359696d + 0);
    }

    public java.lang.String j() {
        return super.getString(this.f359696d + 1);
    }

    public java.lang.String k() {
        return super.getString(this.f359696d + 4);
    }

    public java.lang.String l() {
        return super.getString(this.f359696d + 5);
    }

    public long n() {
        return super.getLong(this.f359696d + 3);
    }

    public int o() {
        return super.getInteger(this.f359696d + 2);
    }
}
