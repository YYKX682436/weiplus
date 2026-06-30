package g15;

/* loaded from: classes9.dex */
public class d extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f267589d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.o(-1, "quoteId"), com.tencent.mm.protobuf.i.v(-1, "quoteTalker"), com.tencent.mm.protobuf.i.r(-1, "quotePartial", r15.g.class)});
        this.f267589d = appendAttrs;
        super.set__serialName("DraftQuoteInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0L, "", null});
    }

    public long j() {
        return super.getLong(this.f267589d + 0);
    }

    public java.lang.String k() {
        return super.getString(this.f267589d + 1);
    }

    public r15.g l() {
        return (r15.g) super.getCustom(this.f267589d + 2);
    }

    public void n(long j17) {
        super.set(this.f267589d + 0, java.lang.Long.valueOf(j17));
    }

    public void o(java.lang.String str) {
        super.set(this.f267589d + 1, str);
    }

    public void p(r15.g gVar) {
        super.set(this.f267589d + 2, gVar);
    }
}
