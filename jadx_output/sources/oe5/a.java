package oe5;

/* loaded from: classes9.dex */
public class a extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f344814e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "xmlContent", e15.k.class), com.tencent.mm.protobuf.i.u(-1, "thumbPath")});
        this.f344814e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public e15.k j() {
        return (e15.k) super.getCustom(this.f344814e + 0);
    }

    public void k(e15.k kVar) {
        super.set(this.f344814e + 0, kVar);
    }
}
