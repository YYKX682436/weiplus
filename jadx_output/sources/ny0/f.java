package ny0;

/* loaded from: classes5.dex */
public final class f extends ly0.v {

    /* renamed from: c, reason: collision with root package name */
    public final ly0.p f341394c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List paths) {
        super(paths);
        kotlin.jvm.internal.o.g(paths, "paths");
        this.f341394c = ly0.p.f322229e;
    }

    @Override // ly0.v
    public ly0.n a(java.util.List imageUrls, yz5.l rawCompletionCallback) {
        kotlin.jvm.internal.o.g(imageUrls, "imageUrls");
        kotlin.jvm.internal.o.g(rawCompletionCallback, "rawCompletionCallback");
        return new ny0.d(imageUrls, null, rawCompletionCallback, null);
    }

    @Override // ly0.v
    public ly0.p d() {
        return this.f341394c;
    }

    @Override // ly0.v
    public java.lang.Object e(java.lang.String taskId, java.util.List generatedImagePath) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(generatedImagePath, "generatedImagePath");
        return new ny0.e(taskId, generatedImagePath);
    }
}
