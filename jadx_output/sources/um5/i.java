package um5;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.p f429166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(um5.p pVar) {
        super(0);
        this.f429166d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um5.p pVar = this.f429166d;
        if (pVar.f429177u.f429150a > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy extern input textureId:");
            um5.f fVar = pVar.f429177u;
            sb6.append(fVar.f429150a);
            xm5.b.c(pVar.f429176t, sb6.toString(), new java.lang.Object[0]);
            android.opengl.GLES20.glDeleteTextures(1, new int[]{fVar.f429150a}, 0);
        }
        return jz5.f0.f302826a;
    }
}
