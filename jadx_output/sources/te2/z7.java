package te2;

/* loaded from: classes3.dex */
public final class z7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f418566d;

    public z7(kotlinx.coroutines.r2 r2Var) {
        this.f418566d = r2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("FinderLiveNoticeQRCodeUIC", "REQUEST_CODE_CROP_IMAGE user cancel upload");
        kotlinx.coroutines.p2.a(this.f418566d, null, 1, null);
    }
}
