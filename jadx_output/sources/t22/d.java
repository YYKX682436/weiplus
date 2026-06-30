package t22;

/* loaded from: classes10.dex */
public final class d implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t22.e f415082d;

    public d(t22.e eVar) {
        this.f415082d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        t22.e eVar = this.f415082d;
        com.tencent.mars.xlog.Log.i(eVar.f415085c, "CheckLensInfo: cancel loading");
        eVar.f415086d.dismiss();
        eVar.f415084b.a(false);
    }
}
