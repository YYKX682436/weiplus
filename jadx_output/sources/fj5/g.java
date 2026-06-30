package fj5;

/* loaded from: classes.dex */
public final class g extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f263246d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f263246d = jz5.h.b(new fj5.f(activity));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return (qi5.i) ((jz5.n) this.f263246d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }
}
