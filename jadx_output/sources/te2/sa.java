package te2;

/* loaded from: classes.dex */
public final class sa implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418410d;

    public sa(te2.hc hcVar) {
        this.f418410d = hcVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f418410d.getActivity().finish();
    }
}
