package xc0;

/* loaded from: classes14.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f453027d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.u(-1, "icon_url"), com.tencent.mm.protobuf.i.v(-1, "type"), com.tencent.mm.protobuf.i.u(-1, "time_stamp"), com.tencent.mm.protobuf.i.u(-1, "remind_id"), com.tencent.mm.protobuf.i.u(-1, "busi_type"), com.tencent.mm.protobuf.i.u(-1, ya.b.START_DATE), com.tencent.mm.protobuf.i.u(-1, "expire_date"), com.tencent.mm.protobuf.i.u(-1, "expireDate"), com.tencent.mm.protobuf.i.u(-1, "version"), com.tencent.mm.protobuf.i.u(-1, "desc_type"), com.tencent.mm.protobuf.i.u(-1, "extra_info"), com.tencent.mm.protobuf.i.u(-1, "url"), com.tencent.mm.protobuf.i.u(-1, "domain")});
        this.f453027d = appendAttrs;
        super.set__serialName("sysmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "pc_remind_message", "", "", "", "", "", "", "", "", "", "", ""});
    }

    public java.lang.String getIcon_url() {
        return super.getString(this.f453027d + 1);
    }

    public java.lang.String getTitle() {
        return super.getString(this.f453027d + 0);
    }

    public java.lang.String getUrl() {
        return super.getString(this.f453027d + 12);
    }

    public java.lang.String j() {
        return super.getString(this.f453027d + 5);
    }

    public java.lang.String k() {
        return super.getString(this.f453027d + 10);
    }

    public java.lang.String l() {
        return super.getString(this.f453027d + 13);
    }

    public java.lang.String n() {
        return super.getString(this.f453027d + 4);
    }

    public java.lang.String o() {
        return super.getString(this.f453027d + 3);
    }

    public void p(java.lang.String str) {
        super.set(this.f453027d + 13, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f453027d + 3, str);
    }
}
