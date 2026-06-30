package pr4;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f358001a;

    /* renamed from: b, reason: collision with root package name */
    public final int f358002b;

    /* renamed from: c, reason: collision with root package name */
    public final pr4.i f358003c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f358004d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f358005e;

    /* renamed from: f, reason: collision with root package name */
    public int f358006f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f358007g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f358008h;

    public h(java.lang.String title, int i17, pr4.i type, yz5.l getOrderBuff, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(getOrderBuff, "getOrderBuff");
        this.f358001a = title;
        this.f358002b = i17;
        this.f358003c = type;
        this.f358004d = getOrderBuff;
        this.f358007g = "";
        if (type == pr4.i.f358010e) {
            this.f358007g = "";
            return;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lhm);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f358007g = string;
    }
}
