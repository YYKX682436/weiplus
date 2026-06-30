package gg4;

/* loaded from: classes.dex */
public final class i extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f271750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f271750d = jz5.h.b(gg4.h.f271749d);
    }

    public final java.lang.String O6() {
        return (java.lang.String) ((jz5.n) this.f271750d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        pm0.v.K(null, new gg4.d(this));
    }
}
