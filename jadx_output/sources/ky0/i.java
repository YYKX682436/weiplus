package ky0;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final ky0.i f313481a = new ky0.i();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f313482b = new java.util.LinkedHashMap();

    public final void a(java.util.List aiPathList, java.util.List sourcePathList) {
        kotlin.jvm.internal.o.g(aiPathList, "aiPathList");
        kotlin.jvm.internal.o.g(sourcePathList, "sourcePathList");
        com.tencent.mars.xlog.Log.i("MicroMsg.AITemplateSession", "recordAIAsset2SourcePath: " + aiPathList.size() + ", " + sourcePathList.size());
        for (jz5.l lVar : kz5.n0.a1(aiPathList, sourcePathList)) {
            f313482b.put((java.lang.String) lVar.f302833d, (java.lang.String) lVar.f302834e);
        }
    }
}
