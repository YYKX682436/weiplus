package se5;

/* loaded from: classes.dex */
public class a extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f406932e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "xmlContent", l15.c.class), com.tencent.mm.protobuf.i.u(-1, "thumbPath")});
        this.f406932e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public java.lang.String getThumbPath() {
        return super.getString(this.f406932e + 1);
    }

    public l15.c j() {
        return (l15.c) super.getCustom(this.f406932e + 0);
    }

    public void k(java.lang.String str) {
        super.set(this.f406932e + 1, str);
    }

    public void l(l15.c cVar) {
        super.set(this.f406932e + 0, cVar);
    }
}
