package xc5;

/* loaded from: classes10.dex */
public final class m extends lf3.n implements yf3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // yf3.a
    public void n3(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        com.tencent.mm.storage.f9 b17 = iVar != null ? iVar.b() : null;
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MsgHistoryGalleryFavoriteComponent", "addFavorite fail, mediaInfo is not IChatMsgMediaInfo");
            return;
        }
        ad5.e eVar = ad5.e.f3244a;
        android.app.Activity context = getContext();
        ad5.t0 t0Var = new ad5.t0(null, 1, null);
        t0Var.f3314a.put(ad5.q0.f3300a, kz5.b0.c(b17));
        eVar.d(context, t0Var);
    }
}
