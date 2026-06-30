package kn3;

/* loaded from: classes11.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f309664d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "redPointMsgId"), com.tencent.mm.protobuf.i.u(-1, "byPassInfo"), com.tencent.mm.protobuf.i.i(-1, "category")});
        this.f309664d = appendAttrs;
        super.set__serialName("reddotParams");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", 0});
    }

    @Override // e14.l
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        return false;
    }

    public void j(java.lang.String str) {
        super.set(this.f309664d + 1, str);
    }

    public void k(int i17) {
        super.set(this.f309664d + 2, java.lang.Integer.valueOf(i17));
    }

    public void l(java.lang.String str) {
        super.set(this.f309664d + 0, str);
    }
}
