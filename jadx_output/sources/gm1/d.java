package gm1;

/* loaded from: classes7.dex */
public final class d implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm1.e f273309d;

    public d(gm1.e eVar) {
        this.f273309d = eVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f273309d.getActivity().finish();
    }
}
