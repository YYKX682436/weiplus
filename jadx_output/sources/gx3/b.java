package gx3;

/* loaded from: classes11.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f277394d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "field1"), com.tencent.mm.protobuf.i.i(-1, "field2")});
        this.f277394d = appendAttrs;
        super.set__serialName("TestSerializeItemCustom");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", 0});
    }

    public void j(java.lang.String str) {
        super.set(this.f277394d + 0, str);
    }

    public void k(int i17) {
        super.set(this.f277394d + 1, java.lang.Integer.valueOf(i17));
    }
}
