package fp0;

/* loaded from: classes2.dex */
public class r extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f265277f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f265278g;

    /* renamed from: h, reason: collision with root package name */
    public int f265279h;

    public r(yz5.l task, java.lang.String id6) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(id6, "id");
        this.f265277f = task;
        this.f265278g = id6;
        this.f265279h = -1;
    }

    @Override // fp0.d
    public void a() {
        this.f265277f.invoke(this);
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f265278g;
    }

    public void e() {
    }

    public java.lang.String toString() {
        return "{token=" + this.f265279h + " id=" + this.f265278g + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ r(yz5.l r1, java.lang.String r2, int r3, kotlin.jvm.internal.i r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L19
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = java.lang.System.nanoTime()
            r2.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L19:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fp0.r.<init>(yz5.l, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
