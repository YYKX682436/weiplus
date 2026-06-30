package w15;

/* loaded from: classes5.dex */
public class e extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f442246d;

    public e() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "link", w15.d.class), com.tencent.mm.protobuf.i.u(-1, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)});
        this.f442246d = appendAttrs;
        super.set__serialName("revokemsgcontent");
        super.set__xmlPrefixTag("sysmsg");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, ""});
    }

    public final java.lang.String getText() {
        return super.getString(this.f442246d + 1);
    }

    public final w15.d j() {
        return (w15.d) super.getCustom(this.f442246d + 0);
    }

    public final void k(w15.d dVar) {
        super.set(this.f442246d + 0, dVar);
    }

    public final void l(java.lang.String str) {
        super.set(this.f442246d + 1, str);
    }
}
