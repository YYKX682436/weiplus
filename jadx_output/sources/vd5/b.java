package vd5;

/* loaded from: classes9.dex */
public class b extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f436064e;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "xmlContent", l15.c.class)});
        this.f436064e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public l15.c j() {
        return (l15.c) super.getCustom(this.f436064e + 0);
    }

    public void k(l15.c cVar) {
        super.set(this.f436064e + 0, cVar);
    }
}
