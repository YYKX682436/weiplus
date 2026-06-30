package dc5;

/* loaded from: classes9.dex */
public class a extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f228867e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.n(-1, "favLocalId"), com.tencent.mm.protobuf.i.i(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.r(-1, "xmlContent", l15.c.class)});
        this.f228867e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0L, 0, null});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public int getScene() {
        return super.getInteger(this.f228867e + 1);
    }

    public long j() {
        return super.getLong(this.f228867e + 0);
    }

    public l15.c k() {
        return (l15.c) super.getCustom(this.f228867e + 2);
    }

    public void l(long j17) {
        super.set(this.f228867e + 0, java.lang.Long.valueOf(j17));
    }

    public void n(l15.c cVar) {
        super.set(this.f228867e + 2, cVar);
    }

    public void o(int i17) {
        super.set(this.f228867e + 1, java.lang.Integer.valueOf(i17));
    }
}
