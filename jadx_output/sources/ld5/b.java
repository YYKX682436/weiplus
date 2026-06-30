package ld5;

/* loaded from: classes9.dex */
public class b extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f318109e;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.q(-1, "msgIdList", ""), com.tencent.mm.protobuf.i.u(-1, "desc"), com.tencent.mm.protobuf.i.x(-1, "picturePaths", "")});
        this.f318109e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, "", null});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public java.lang.String j() {
        return super.getString(this.f318109e + 1);
    }

    public java.util.LinkedList k() {
        return super.getLinkedList(this.f318109e + 0);
    }

    public java.util.LinkedList l() {
        return super.getLinkedList(this.f318109e + 2);
    }

    public void n(java.lang.String str) {
        super.set(this.f318109e + 1, str);
    }

    public void o(java.util.LinkedList linkedList) {
        super.set(this.f318109e + 0, linkedList);
    }

    public void p(java.util.LinkedList linkedList) {
        super.set(this.f318109e + 2, linkedList);
    }
}
