package sv4;

/* loaded from: classes12.dex */
public final class h extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f413398d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f413399e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f413398d = jz5.h.b(new sv4.g(this));
        this.f413399e = jz5.h.b(new sv4.f(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        ((sv4.c) ((jz5.n) this.f413399e).getValue()).c();
    }
}
