package yf;

/* loaded from: classes11.dex */
public final class m1 implements yf.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f461415a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f461416b;

    /* renamed from: c, reason: collision with root package name */
    public final int f461417c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction f461418d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f461419e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f461420f;

    /* renamed from: g, reason: collision with root package name */
    public final yf.j1 f461421g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType f461422h;

    public m1(int i17, java.lang.String name, int i18, com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction triggerAction, java.lang.String resPath, java.lang.String resPathMd5, yf.j1 j1Var, com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType type) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(triggerAction, "triggerAction");
        kotlin.jvm.internal.o.g(resPath, "resPath");
        kotlin.jvm.internal.o.g(resPathMd5, "resPathMd5");
        kotlin.jvm.internal.o.g(type, "type");
        this.f461415a = i17;
        this.f461416b = name;
        this.f461417c = i18;
        this.f461418d = triggerAction;
        this.f461419e = resPath;
        this.f461420f = resPathMd5;
        this.f461421g = j1Var;
        this.f461422h = type;
    }

    @Override // yf.k
    public java.lang.String a() {
        return "StickerItemInfo(resPath='" + this.f461419e + "', resPathMd5='" + this.f461420f + "')";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.m1)) {
            return false;
        }
        yf.m1 m1Var = (yf.m1) obj;
        return this.f461415a == m1Var.f461415a && kotlin.jvm.internal.o.b(this.f461416b, m1Var.f461416b) && this.f461417c == m1Var.f461417c && this.f461418d == m1Var.f461418d && kotlin.jvm.internal.o.b(this.f461419e, m1Var.f461419e) && kotlin.jvm.internal.o.b(this.f461420f, m1Var.f461420f) && kotlin.jvm.internal.o.b(this.f461421g, m1Var.f461421g) && this.f461422h == m1Var.f461422h;
    }

    public int hashCode() {
        int hashCode = ((((((((((java.lang.Integer.hashCode(this.f461415a) * 31) + this.f461416b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f461417c)) * 31) + this.f461418d.hashCode()) * 31) + this.f461419e.hashCode()) * 31) + this.f461420f.hashCode()) * 31;
        yf.j1 j1Var = this.f461421g;
        return ((hashCode + (j1Var == null ? 0 : j1Var.hashCode())) * 31) + this.f461422h.hashCode();
    }

    public java.lang.String toString() {
        return "StickerItemInfo(id=" + this.f461415a + ", name=" + this.f461416b + ", frameCount=" + this.f461417c + ", triggerAction=" + this.f461418d + ", resPath=" + this.f461419e + ", resPathMd5=" + this.f461420f + ", pos=" + this.f461421g + ", type=" + this.f461422h + ')';
    }
}
