package cp5;

/* loaded from: classes14.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f221142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp5.j f221143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z17, cp5.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f221142d = z17;
        this.f221143e = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cp5.g(this.f221142d, this.f221143e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cp5.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dp5.c cVar = dp5.c.f242278a;
        dp5.b bVar = (dp5.b) dp5.c.f242279b;
        bVar.getClass();
        if (this.f221142d) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            android.opengl.GLES20.glBindTexture(3553, iArr[0]);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9728);
            android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
            android.opengl.GLES20.glBindTexture(3553, 0);
            bVar.b("genTexture");
            i17 = iArr[0];
        } else {
            int[] iArr2 = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr2, 0);
            android.opengl.GLES20.glBindTexture(36197, iArr2[0]);
            android.opengl.GLES20.glTexParameteri(36197, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(36197, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729);
            android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
            android.opengl.GLES20.glBindTexture(36197, 0);
            bVar.b("glGenTextures");
            i17 = iArr2[0];
        }
        dp5.a aVar2 = new dp5.a(i17);
        this.f221143e.f221161f.add(aVar2);
        return aVar2;
    }
}
