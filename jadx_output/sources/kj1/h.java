package kj1;

/* loaded from: classes3.dex */
public final class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f308334d;

    public h(yz5.a aVar) {
        this.f308334d = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f308334d.invoke();
    }
}
