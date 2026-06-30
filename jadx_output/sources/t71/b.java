package t71;

/* loaded from: classes12.dex */
public final class b implements java.util.function.IntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t71.c f416034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f416035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f416036c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f416037d;

    public b(t71.c cVar, kotlin.jvm.internal.f0 f0Var, int i17, java.lang.StringBuilder sb6) {
        this.f416034a = cVar;
        this.f416035b = f0Var;
        this.f416036c = i17;
        this.f416037d = sb6;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i17) {
        char[] chars = java.lang.Character.toChars(i17);
        kotlin.jvm.internal.o.f(chars, "toChars(...)");
        java.lang.String str = new java.lang.String(chars);
        byte[] bytes = str.getBytes(this.f416034a.f416039e);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        int length = bytes.length;
        kotlin.jvm.internal.f0 f0Var = this.f416035b;
        if (f0Var.f310116d + length <= this.f416036c) {
            this.f416037d.append(str);
            f0Var.f310116d += length;
        }
    }
}
