package qj3;

/* loaded from: classes10.dex */
public final class c implements qk.y7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qj3.g f363872a;

    public c(qj3.g gVar) {
        this.f363872a = gVar;
    }

    @Override // qk.y7
    public void a(qk.g6 features) {
        kotlin.jvm.internal.o.g(features, "features");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkEditPhotoContainerPlugin", "[onSelectedFeature] features:%s", features.name());
        if (features == qk.g6.DEFAULT) {
            ju3.d0.k(this.f363872a.f363877e, ju3.c0.V1, null, 2, null);
        }
    }

    @Override // qk.y7
    public void b(qk.g6 features, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(features, "features");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkEditPhotoContainerPlugin", "[onSelectedDetailFeature] features:%s index:%s", features.name(), java.lang.Integer.valueOf(i17));
    }

    @Override // qk.y7
    public void c(boolean z17) {
    }
}
