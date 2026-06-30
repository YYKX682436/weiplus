package xc2;

/* loaded from: classes5.dex */
public final class x2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f453339d;

    public x2(yz5.a aVar) {
        this.f453339d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        yz5.a aVar = this.f453339d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
