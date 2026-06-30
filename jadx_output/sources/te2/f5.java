package te2;

/* loaded from: classes3.dex */
public final class f5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f417999d;

    public f5(te2.p8 p8Var) {
        this.f417999d = p8Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f417999d.getActivity().finish();
    }
}
