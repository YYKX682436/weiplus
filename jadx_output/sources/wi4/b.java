package wi4;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f446272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi4.c f446273e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.widget.EditText editText, wi4.c cVar) {
        super(0);
        this.f446272d = editText;
        this.f446273e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f446272d.removeTextChangedListener(this.f446273e);
        return jz5.f0.f302826a;
    }
}
