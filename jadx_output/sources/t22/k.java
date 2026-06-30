package t22;

/* loaded from: classes10.dex */
public final class k implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t22.l f415092d;

    public k(t22.l lVar) {
        this.f415092d = lVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        t22.l lVar = this.f415092d;
        com.tencent.mars.xlog.Log.i(lVar.f415096d, "startStickerPreview: cancel loading");
        lVar.f415097e = true;
        lVar.a(false);
    }
}
