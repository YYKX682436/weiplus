package gk5;

/* loaded from: classes.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.e f272641d;

    public d(gk5.e eVar) {
        this.f272641d = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f272641d.getContext().finish();
    }
}
