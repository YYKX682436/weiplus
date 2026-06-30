package i33;

/* loaded from: classes10.dex */
public abstract class c extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f288166d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f288167e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288166d = jz5.h.b(new i33.a(this));
        this.f288167e = jz5.h.b(new i33.b(this));
    }

    public final androidx.recyclerview.widget.RecyclerView T6() {
        java.lang.Object value = ((jz5.n) this.f288166d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    public final androidx.recyclerview.widget.GridLayoutManager U6() {
        return (androidx.recyclerview.widget.GridLayoutManager) ((jz5.n) this.f288167e).getValue();
    }

    public void V6(com.tencent.mm.ui.q2 oldMode, com.tencent.mm.ui.q2 newMode) {
        kotlin.jvm.internal.o.g(oldMode, "oldMode");
        kotlin.jvm.internal.o.g(newMode, "newMode");
    }
}
