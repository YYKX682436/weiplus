package vg2;

/* loaded from: classes3.dex */
public final class s implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.t f436580d;

    public s(vg2.t tVar) {
        this.f436580d = tVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("GiftActivityJumpToastWidget", "dismiss half dialog");
        this.f436580d.f436585g = null;
    }
}
