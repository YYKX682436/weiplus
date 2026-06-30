package rw2;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.t f400620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(rw2.t tVar) {
        super(0);
        this.f400620d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.xeffect.VLogDirector vLogDirector = new com.tencent.mm.xeffect.VLogDirector();
        rw2.t tVar = this.f400620d;
        tVar.f400634k = vLogDirector;
        vLogDirector.c();
        tVar.f400634k.g(0, 0, tVar.f400624a, tVar.f400625b);
        tVar.f400634k.g(0, 0, tVar.f400624a, tVar.f400625b);
        com.tencent.mm.xeffect.VLogDirector vLogDirector2 = tVar.f400634k;
        int i17 = tVar.f400624a;
        int i18 = tVar.f400625b;
        vLogDirector2.f214799c = i17;
        vLogDirector2.f214800d = i18;
        is0.c cVar = new is0.c(true, 15L);
        android.opengl.GLES20.glBindTexture(3553, cVar.f294395e);
        android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, tVar.f400624a, tVar.f400625b, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
        android.opengl.GLES20.glBindTexture(3553, 0);
        tVar.f400636m = cVar;
        com.tencent.mars.xlog.Log.i(tVar.f400626c, "initVLogDirector finished size:[" + tVar.f400624a + ',' + tVar.f400625b + ']');
        return jz5.f0.f302826a;
    }
}
