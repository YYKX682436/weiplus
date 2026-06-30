package o15;

/* loaded from: classes9.dex */
public class b extends l15.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f342328d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, ya.b.LOCATION, o15.a.class)});
        this.f342328d = appendAttrs;
        super.set__serialName("msg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null});
    }

    public o15.a j() {
        return (o15.a) super.getCustom(this.f342328d + 0);
    }

    public void k(o15.a aVar) {
        super.set(this.f342328d + 0, aVar);
    }
}
