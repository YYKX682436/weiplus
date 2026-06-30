package te5;

/* loaded from: classes5.dex */
public final class y1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f418774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f418774d = jz5.h.b(te5.x1.f418773d);
    }

    public final void O6() {
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "clearSer: " + P6().size());
        P6().clear();
    }

    public final java.util.Set P6() {
        return (java.util.Set) ((jz5.n) this.f418774d).getValue();
    }
}
