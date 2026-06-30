package wd2;

/* loaded from: classes3.dex */
public final class d implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd2.g f444828d;

    public d(wd2.g gVar) {
        this.f444828d = gVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        yz5.a aVar = this.f444828d.f444851r;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
