package o50;

/* loaded from: classes5.dex */
public abstract class j extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f343067d;

    /* renamed from: e, reason: collision with root package name */
    public int f343068e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f343069f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f343070g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f343071h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f343067d = jz5.h.b(new o50.i(this));
        this.f343069f = jz5.h.b(new o50.c(this));
        this.f343070g = jz5.h.b(new o50.e(this));
        this.f343071h = jz5.h.b(new o50.d(this));
    }

    public abstract co.a T6();

    public abstract android.view.View U6(co.a aVar);

    public final co.a V6() {
        return (co.a) ((jz5.n) this.f343069f).getValue();
    }

    public final em.b W6() {
        return (em.b) ((jz5.n) this.f343067d).getValue();
    }

    public void X6(android.view.View previewChattingView) {
        kotlin.jvm.internal.o.g(previewChattingView, "previewChattingView");
        previewChattingView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        vg5.a aVar;
        j75.f Q6 = Q6();
        if (Q6 != null && (aVar = (vg5.a) Q6.getState()) != null) {
            aVar.f436776g = V6();
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.L2(getActivity(), new o50.h(this));
        }
    }
}
