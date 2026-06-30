package m12;

/* loaded from: classes10.dex */
public final class i extends m12.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f322857f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f322858g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.Range f322859h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String inputPath, java.lang.String outputPath) {
        super(inputPath, outputPath);
        kotlin.jvm.internal.o.g(inputPath, "inputPath");
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        this.f322857f = inputPath;
        this.f322858g = outputPath;
        this.f322859h = new android.util.Range(0, 0);
    }

    @Override // m12.a
    public boolean a() {
        if (!super.a()) {
            return false;
        }
        int intValue = ((java.lang.Number) this.f322859h.getUpper()).intValue();
        java.lang.Object lower = this.f322859h.getLower();
        kotlin.jvm.internal.o.f(lower, "getLower(...)");
        return intValue - ((java.lang.Number) lower).intValue() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // m12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m12.i.c(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
