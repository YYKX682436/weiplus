package jj5;

/* loaded from: classes.dex */
public final class f extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f300044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f300044d = jz5.h.b(new jj5.e(activity, this));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return (jj5.d) ((jz5.n) this.f300044d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }
}
