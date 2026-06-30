package gm1;

/* loaded from: classes7.dex */
public final class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm1.e f273308d;

    public c(gm1.e eVar) {
        this.f273308d = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f273308d.getActivity().finish();
    }
}
