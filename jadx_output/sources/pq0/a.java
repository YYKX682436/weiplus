package pq0;

/* loaded from: classes7.dex */
public final class a extends lc3.p {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f357566i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f357567m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String bizName, java.lang.String instanceName) {
        super(instanceName);
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        this.f357566i = bizName;
        this.f357567m = "mbpkgs/" + bizName + ".wspkg";
    }

    @Override // jc3.x
    public java.lang.String g() {
        return this.f357566i;
    }

    @Override // lc3.o
    public lc3.a k() {
        java.util.Map map = ge3.s.f270974a;
        java.lang.Object obj = ge3.s.f270974a.get(this.f357566i);
        kotlin.jvm.internal.o.d(obj);
        ge3.a aVar = (ge3.a) obj;
        return new lc3.a(this.f357567m, aVar.c(), aVar.getMd5(), 0L, 8, null);
    }

    @Override // lc3.o
    public lc3.c n() {
        return new lc3.c(this.f357567m, lc3.b.f317882d);
    }

    @Override // lc3.o
    public java.lang.String s() {
        return "/index.js";
    }

    @Override // lc3.o
    public java.lang.String u() {
        return jc3.w0.f299010a.b(this.f357566i);
    }

    @Override // lc3.o
    public java.lang.String v() {
        return this.f357566i;
    }
}
