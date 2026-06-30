package ux0;

/* loaded from: classes14.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ux0.o f431815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f431816e;

    public j(ux0.o oVar, kotlin.coroutines.Continuation continuation) {
        this.f431815d = oVar;
        this.f431816e = continuation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        ux0.c cVar;
        is0.c cVar2;
        ux0.o oVar = this.f431815d;
        rs0.h hVar = oVar.f431828g;
        kotlin.coroutines.Continuation continuation = this.f431816e;
        if (hVar == null) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
            return;
        }
        ux0.i iVar = oVar.f431831m;
        ux0.c cVar3 = iVar != null ? iVar.f431813b[iVar.f431814c] : null;
        if (cVar3 == null) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
            return;
        }
        ux0.h hVar2 = oVar.f431833o;
        if (hVar2 == null) {
            hVar2 = new ux0.h(ux0.g.TEXTURE_2D, false);
            oVar.f431833o = hVar2;
        }
        is0.c cVar4 = new is0.c(true, 24L);
        is0.c cVar5 = cVar3.f431785a;
        cVar4.a(cVar5.f294400m, cVar5.f294401n, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, null, 9729, 33071);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cVar = new ux0.c(cVar4, cVar3.f431786b);
            cVar2 = cVar.f431785a;
            cVar.f431786b = cVar3.f431786b;
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (!hVar2.c(cVar5.f294395e, cVar2.f294395e, cVar5.f294400m, cVar5.f294401n)) {
            cVar2.close();
            com.tencent.mars.xlog.Log.e("TextureVideoFrameSender", "Failed to render texture");
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
            return;
        }
        cVar.f431787c = android.opengl.GLES30.glFenceSync(37143, 0);
        android.opengl.GLES20.glFlush();
        continuation.resumeWith(kotlin.Result.m521constructorimpl(cVar));
        m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            cVar4.close();
            com.tencent.mars.xlog.Log.e("TextureVideoFrameSender", "Failed to render: " + m524exceptionOrNullimpl);
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
    }
}
