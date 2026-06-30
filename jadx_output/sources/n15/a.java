package n15;

/* loaded from: classes5.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f334153d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "expidstr")});
        this.f334153d = appendAttrs;
        super.set__serialName("expinfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null});
    }

    public java.lang.String j() {
        return super.getString(this.f334153d + 0);
    }
}
