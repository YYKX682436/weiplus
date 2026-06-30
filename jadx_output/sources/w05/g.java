package w05;

/* loaded from: classes9.dex */
public class g extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f441938d;

    public g() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "jumpBizType"), com.tencent.mm.protobuf.i.r(-1, "mini_app_info", w05.k.class), com.tencent.mm.protobuf.i.r(-1, "lite_app_info", w05.j.class), com.tencent.mm.protobuf.i.r(-1, "html5_info", w05.i.class), com.tencent.mm.protobuf.i.r(-1, "native_info", w05.l.class)});
        this.f441938d = appendAttrs;
        super.set__serialName("jumpinfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, null, null, null, null});
    }

    public w05.i j() {
        return (w05.i) super.getCustom(this.f441938d + 3);
    }

    public int k() {
        return super.getInteger(this.f441938d + 0);
    }

    public w05.j l() {
        return (w05.j) super.getCustom(this.f441938d + 2);
    }

    public w05.k n() {
        return (w05.k) super.getCustom(this.f441938d + 1);
    }
}
