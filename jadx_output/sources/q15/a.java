package q15;

/* loaded from: classes11.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f359692d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "hit_white_uin"), com.tencent.mm.protobuf.i.n(-1, "touchex_delay_confirm"), com.tencent.mm.protobuf.i.i(-1, "accinfo_random_strike"), com.tencent.mm.protobuf.i.i(-1, "accinfo_clear_strike"), com.tencent.mm.protobuf.i.n(-1, "expired_duration"), com.tencent.mm.protobuf.i.u(-1, "device_uuid"), com.tencent.mm.protobuf.i.i(-1, "forced_strike"), com.tencent.mm.protobuf.i.u(-1, "intercept_stack"), com.tencent.mm.protobuf.i.u(-1, "evil_pkg"), com.tencent.mm.protobuf.i.u(-1, "screenshot_disable_ui_name"), com.tencent.mm.protobuf.i.i(-1, "screenshot_disable")});
        this.f359692d = appendAttrs;
        super.set__serialName("acc_strike_newxml");
        super.set__xmlPrefixTag("sysmsg");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0L, 0, 0, 0L, null, 0, null, null, "", 0});
    }

    public int j() {
        return super.getInteger(this.f359692d + 3);
    }

    public int k() {
        return super.getInteger(this.f359692d + 2);
    }

    public java.lang.String l() {
        return super.getString(this.f359692d + 5);
    }

    public java.lang.String n() {
        return super.getString(this.f359692d + 8);
    }

    public long o() {
        return super.getLong(this.f359692d + 4);
    }

    public int p() {
        return super.getInteger(this.f359692d + 6);
    }

    public int q() {
        return super.getInteger(this.f359692d + 0);
    }

    public java.lang.String r() {
        return super.getString(this.f359692d + 7);
    }

    public int s() {
        return super.getInteger(this.f359692d + 10);
    }

    public java.lang.String t() {
        return super.getString(this.f359692d + 9);
    }

    public long u() {
        return super.getLong(this.f359692d + 1);
    }
}
