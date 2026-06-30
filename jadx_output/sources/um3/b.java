package um3;

/* loaded from: classes.dex */
public final class b extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f429117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f429117d = jz5.h.b(new um3.a(this));
    }

    public final com.tencent.mm.sdk.coroutines.LifecycleScope O6() {
        return (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f429117d).getValue();
    }
}
