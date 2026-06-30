package hx4;

/* loaded from: classes8.dex */
public final class m implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hx4.p f285679d;

    public m(hx4.p pVar) {
        this.f285679d = pVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        hx4.p pVar = this.f285679d;
        pVar.b(0, null);
        hx4.s.b(pVar.f285683b, 4, pVar.f285685d);
    }
}
