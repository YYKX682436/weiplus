package m14;

/* loaded from: classes15.dex */
public class o extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f322883d;

    public o() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY), com.tencent.mm.protobuf.i.r(-1, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, m14.m.class), com.tencent.mm.protobuf.i.r(-1, "enableTips", m14.b.class), com.tencent.mm.protobuf.i.r(-1, "check_type", m14.a.class), com.tencent.mm.protobuf.i.u(-1, "swiperId"), com.tencent.mm.protobuf.i.c(-1, "isInstalled")});
        this.f322883d = appendAttrs;
        super.set__serialName("TipsItemData");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, new m14.m(), new m14.b(), new m14.a(), "", java.lang.Boolean.FALSE});
    }

    public int getPriority() {
        return super.getInteger(this.f322883d + 0);
    }

    public m14.a j() {
        return (m14.a) super.getCustom(this.f322883d + 3);
    }

    public m14.b k() {
        return (m14.b) super.getCustom(this.f322883d + 2);
    }

    public java.lang.String l() {
        return super.getString(this.f322883d + 4);
    }

    public m14.m n() {
        return (m14.m) super.getCustom(this.f322883d + 1);
    }

    public boolean o() {
        return super.getBoolean(this.f322883d + 5);
    }

    public void p(boolean z17) {
        super.set(this.f322883d + 5, java.lang.Boolean.valueOf(z17));
    }
}
