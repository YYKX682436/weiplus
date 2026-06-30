package ld5;

/* loaded from: classes9.dex */
public class a extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f318108e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.q(-1, "msgIdList", ""), com.tencent.mm.protobuf.i.r(-1, "xmlContent", l15.c.class)});
        this.f318108e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f318108e + 0);
    }

    public l15.c k() {
        return (l15.c) super.getCustom(this.f318108e + 1);
    }

    public void l(java.util.LinkedList linkedList) {
        super.set(this.f318108e + 0, linkedList);
    }

    public void n(l15.c cVar) {
        super.set(this.f318108e + 1, cVar);
    }
}
