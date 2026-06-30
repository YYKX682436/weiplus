package f26;

/* loaded from: classes16.dex */
public final class i0 extends f26.q2 {

    /* renamed from: b, reason: collision with root package name */
    public final o06.e2[] f259173b;

    /* renamed from: c, reason: collision with root package name */
    public final f26.l2[] f259174c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f259175d;

    public i0(o06.e2[] parameters, f26.l2[] arguments, boolean z17) {
        kotlin.jvm.internal.o.g(parameters, "parameters");
        kotlin.jvm.internal.o.g(arguments, "arguments");
        this.f259173b = parameters;
        this.f259174c = arguments;
        this.f259175d = z17;
    }

    @Override // f26.q2
    public boolean b() {
        return this.f259175d;
    }

    @Override // f26.q2
    public f26.l2 d(f26.o0 key) {
        kotlin.jvm.internal.o.g(key, "key");
        o06.j i17 = key.w0().i();
        o06.e2 e2Var = i17 instanceof o06.e2 ? (o06.e2) i17 : null;
        if (e2Var == null) {
            return null;
        }
        int index = e2Var.getIndex();
        o06.e2[] e2VarArr = this.f259173b;
        if (index >= e2VarArr.length || !kotlin.jvm.internal.o.b(e2VarArr[index].g(), e2Var.g())) {
            return null;
        }
        return this.f259174c[index];
    }

    @Override // f26.q2
    public boolean e() {
        return this.f259174c.length == 0;
    }
}
