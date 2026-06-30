package u;

/* loaded from: classes16.dex */
public class n extends wm3.a {
    public final jz5.g A6;

    /* renamed from: z6, reason: collision with root package name */
    public final jz5.g f423394z6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f423394z6 = jz5.h.b(new u.m(this));
        this.A6 = jz5.h.b(new u.l(this));
    }

    public final androidx.viewpager.widget.ViewPager P6() {
        return (androidx.viewpager.widget.ViewPager) ((jz5.n) this.f423394z6).getValue();
    }

    public final int T6() {
        return ((java.lang.Number) ((jz5.n) this.A6).getValue()).intValue();
    }
}
