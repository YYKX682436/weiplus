package tm4;

/* loaded from: classes8.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f420643d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), com.tencent.mm.protobuf.i.c(-1, "show"), com.tencent.mm.protobuf.i.r(-1, "reddotInfo", tm4.c.class)});
        this.f420643d = appendAttrs;
        super.set__serialName("ReddotBean");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", java.lang.Boolean.FALSE, new tm4.c()});
    }

    public void j(java.lang.String str) {
        super.set(this.f420643d + 0, str);
    }

    public void k(tm4.c cVar) {
        super.set(this.f420643d + 2, cVar);
    }

    public void l(boolean z17) {
        super.set(this.f420643d + 1, java.lang.Boolean.valueOf(z17));
    }
}
