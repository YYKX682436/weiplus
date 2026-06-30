package qc5;

/* loaded from: classes.dex */
public class a extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f361521e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "xmlContent", l15.c.class)});
        this.f361521e = appendAttrs;
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
        return (l15.c) super.getCustom(this.f361521e + 0);
    }

    public void k(l15.c cVar) {
        super.set(this.f361521e + 0, cVar);
    }
}
