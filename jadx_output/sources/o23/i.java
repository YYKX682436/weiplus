package o23;

@j95.b
/* loaded from: classes10.dex */
public final class i extends i95.w implements e60.b1 {
    public void Ai(android.widget.ImageView imageView, int i17, java.lang.String thumbFilePath, java.lang.String orgFilePath, long j17, long j18) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(thumbFilePath, "thumbFilePath");
        kotlin.jvm.internal.o.g(orgFilePath, "orgFilePath");
        e33.m6.c(imageView, i17, thumbFilePath, orgFilePath, j17, -1, null, null, j18);
    }

    public int Bi(java.lang.String str) {
        return (c01.e2.G(str) || com.tencent.mm.storage.z3.V3(str) || com.tencent.mm.storage.z3.u3().contains(str) || kotlin.jvm.internal.o.b("weixin", str) || com.tencent.mm.storage.z3.m4(str)) ? 26214400 : 1073741824;
    }

    public java.lang.Object Di(androidx.activity.ComponentActivity componentActivity, int i17, java.util.ArrayList arrayList, int i18, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        if (arrayList.isEmpty()) {
            rVar.resumeWith(kotlin.Result.m521constructorimpl(new qc0.m1(-1, -1, 0, null, null, null, 0, 124, null)));
        } else {
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            o23.h hVar = new o23.h(componentActivity, valueOf, h0Var, rVar);
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.GalleryFeatureService", "optLaunch ui:" + componentActivity, new java.lang.Object[0]);
            androidx.activity.result.c e17 = componentActivity.getActivityResultRegistry().e(valueOf, new o23.g(i17, i18), hVar);
            h0Var.f310123d = e17;
            e17.a(arrayList, new z2.i(z2.l.a()));
            componentActivity.overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1);
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public void wi(android.widget.ImageView imageView, int i17, java.lang.String thumbFilePath, java.lang.String orgFilePath, long j17, int i18, f60.a aVar, long j18) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(thumbFilePath, "thumbFilePath");
        kotlin.jvm.internal.o.g(orgFilePath, "orgFilePath");
        e33.m6.b(imageView, i17, thumbFilePath, orgFilePath, j17, i18, aVar, j18);
    }
}
