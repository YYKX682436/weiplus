package xc5;

/* loaded from: classes12.dex */
public final class f2 extends lf3.n implements bg3.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // bg3.f
    public void S2(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        xc5.c cVar = mediaInfo instanceof xc5.c ? (xc5.c) mediaInfo : null;
        com.tencent.mm.storage.f9 f9Var = cVar != null ? cVar.f453399a : null;
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MsgHistoryGallerySaveComponent", "save fail, mediaInfo is not BaseMsgHistoryGalleryMediaInfo");
            return;
        }
        boolean z17 = mediaInfo.getLevel() == mf3.w.f326129e;
        android.app.Activity context = getContext();
        java.util.List c17 = kz5.b0.c(f9Var);
        xc5.e2 e2Var = new xc5.e2(this);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope == null || v65.i.b(lifecycleScope, null, new zc5.l(c17, z17, true, context, e2Var, null), 1, null) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryMediaHelper", "executeDownloadAndSave: accountScope is null, skip");
            e2Var.invoke(java.lang.Boolean.FALSE);
        }
    }
}
