package xs2;

/* loaded from: classes10.dex */
public final class f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final xs2.e0 f456322d = new xs2.e0(null);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f456323e = jz5.h.b(xs2.b0.f456308d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f456324f = jz5.h.b(xs2.c0.f456311d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f456325g = jz5.h.b(xs2.d0.f456313d);

    /* renamed from: a, reason: collision with root package name */
    public final xp.e f456326a;

    /* renamed from: b, reason: collision with root package name */
    public final xs2.n f456327b;

    /* renamed from: c, reason: collision with root package name */
    public final xp.a f456328c;

    public f0(xp.e danmakuCreator, xs2.n renderCreator, xp.a aVar) {
        kotlin.jvm.internal.o.g(danmakuCreator, "danmakuCreator");
        kotlin.jvm.internal.o.g(renderCreator, "renderCreator");
        this.f456326a = danmakuCreator;
        this.f456327b = renderCreator;
        this.f456328c = aVar;
    }

    public final int a(boolean z17, float f17) {
        int i17 = 0;
        xp.a aVar = this.f456328c;
        int i18 = (aVar != null ? aVar.f455805c : 0) != 0 ? aVar != null ? aVar.f455805c : 0 : 6500;
        if ((aVar != null ? aVar.f455806d : 0) == 0) {
            i17 = 12000;
        } else if (aVar != null) {
            i17 = aVar.f455806d;
        }
        float f18 = z17 ? i18 : i17;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return (int) ((f18 * ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127732h8).getValue()).r()).floatValue()) / f17);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof xs2.f0)) {
            return false;
        }
        xs2.f0 f0Var = (xs2.f0) obj;
        return this.f456327b.hashCode() == f0Var.f456327b.hashCode() && this.f456326a.hashCode() == f0Var.f456326a.hashCode() && kotlin.jvm.internal.o.b(this.f456328c, f0Var.f456328c);
    }

    public int hashCode() {
        int hashCode = ((this.f456326a.hashCode() * 31) + this.f456327b.hashCode()) * 31;
        xp.a aVar = this.f456328c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public java.lang.String toString() {
        return "LiveDanmakuConfig(danmakuCreator=" + this.f456326a + ", renderCreator=" + this.f456327b + ", customConfig=" + this.f456328c + ')';
    }
}
