package xh4;

/* loaded from: classes.dex */
public final class q implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f454627d;

    public q(yz5.a aVar) {
        this.f454627d = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yz5.a aVar = this.f454627d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
