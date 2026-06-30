package ur2;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur2.o f430398d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ur2.o oVar) {
        super(0);
        this.f430398d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ur2.o oVar = this.f430398d;
        oVar.f430412i = false;
        android.widget.EditText editText = oVar.f430415o;
        editText.requestFocus();
        editText.postDelayed(new ur2.h(oVar), 200L);
        return jz5.f0.f302826a;
    }
}
