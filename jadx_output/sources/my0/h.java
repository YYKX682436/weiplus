package my0;

/* loaded from: classes5.dex */
public final class h extends ly0.v {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f332664c;

    /* renamed from: d, reason: collision with root package name */
    public final my0.f f332665d;

    /* renamed from: e, reason: collision with root package name */
    public final ly0.p f332666e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String imagePath, byte[] bArr, my0.f aiScene) {
        super(kz5.b0.c(imagePath));
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        kotlin.jvm.internal.o.g(aiScene, "aiScene");
        this.f332664c = bArr;
        this.f332665d = aiScene;
        this.f332666e = ly0.p.f322228d;
    }

    @Override // ly0.v
    public ly0.n a(java.util.List imageUrls, yz5.l rawCompletionCallback) {
        kotlin.jvm.internal.o.g(imageUrls, "imageUrls");
        kotlin.jvm.internal.o.g(rawCompletionCallback, "rawCompletionCallback");
        return new my0.e(imageUrls, this.f332664c, this.f332665d.f332661d, null, rawCompletionCallback, null);
    }

    @Override // ly0.v
    public ly0.p d() {
        return this.f332666e;
    }

    @Override // ly0.v
    public java.lang.Object e(java.lang.String taskId, java.util.List generatedImagePath) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(generatedImagePath, "generatedImagePath");
        return new my0.g(taskId, (java.lang.String) kz5.n0.X(generatedImagePath));
    }
}
