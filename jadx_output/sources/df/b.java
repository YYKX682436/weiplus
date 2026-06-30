package df;

/* loaded from: classes15.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.d f229427d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(df.d dVar) {
        super(1);
        this.f229427d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.inputmethod.InputConnection inputConnection = (android.view.inputmethod.InputConnection) obj;
        df.d dVar = this.f229427d;
        if (dVar != null) {
            dVar.a(inputConnection);
        }
        return jz5.f0.f302826a;
    }
}
