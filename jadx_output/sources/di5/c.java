package di5;

/* loaded from: classes12.dex */
public final class c extends lf3.n implements qf3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("FinderLiveGalleryData");
        java.io.Serializable serializableExtra = intent.getSerializableExtra("FinderLiveGalleryConfig");
        t40.b bVar = serializableExtra instanceof t40.b ? (t40.b) serializableExtra : null;
        if (parcelableArrayListExtra == null || bVar == null) {
            com.tencent.mars.xlog.Log.e("MediaGallery.FinderPostGalleryDataProvider", "fetch: data or config is null");
            return false;
        }
        mf3.f fVar = new mf3.f();
        java.lang.String str = "";
        int i17 = 0;
        int i18 = 0;
        for (java.lang.Object obj : parcelableArrayListExtra) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams finderLiveGalleryParams = (com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams) obj;
            ci5.j jVar = finderLiveGalleryParams.f66603d == 1 ? new ci5.j(finderLiveGalleryParams, bVar, false) : null;
            if (jVar != null) {
                fVar.add(jVar);
                int i27 = bVar.f415472f;
                if (i18 == i27) {
                    str = jVar.getId();
                    i17 = fVar.size() - 1;
                    com.tencent.mars.xlog.Log.i("MediaGallery.FinderPostGalleryDataProvider", "enterIndex = " + i27 + "  enterId = " + str + ", selection = " + i17);
                }
            }
            i18 = i19;
        }
        lf3.c0 c0Var = (lf3.c0) listener;
        c0Var.Y6(str);
        c0Var.X6(fVar, false);
        listener.T3(i17);
        return true;
    }
}
