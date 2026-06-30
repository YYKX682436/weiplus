package du0;

/* loaded from: classes5.dex */
public final class v0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f243452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f243452d = jz5.h.b(du0.u0.f243449d);
    }

    public final pp0.l0 O6() {
        return (pp0.l0) ((jz5.n) this.f243452d).getValue();
    }

    public final void P6(com.tencent.maas.moviecomposing.Timeline timeline) {
        kotlin.jvm.internal.o.g(timeline, "timeline");
        yy0.m7 m7Var = (yy0.m7) O6();
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.l1(m7Var, timeline, null), 3, null);
    }

    public final void Q6(java.lang.String exportScene, java.util.Map exportParams) {
        kotlin.jvm.internal.o.g(exportScene, "exportScene");
        kotlin.jvm.internal.o.g(exportParams, "exportParams");
        yy0.m7 m7Var = (yy0.m7) O6();
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.m1(m7Var, exportScene, exportParams, null), 3, null);
    }

    public final void R6(boolean z17, int i17, boolean z18) {
        yy0.m7 m7Var = (yy0.m7) O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.v1(m7Var, z17, i17, z18, null), 3, null);
    }

    public final void S6(java.lang.String batchClippingID) {
        kotlin.jvm.internal.o.g(batchClippingID, "batchClippingID");
        yy0.m7 m7Var = (yy0.m7) O6();
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.s2(m7Var, batchClippingID, null), 3, null);
    }

    public final void T6(float f17, float f18, float f19, float f27, float f28, float f29) {
        yy0.m7 m7Var = (yy0.m7) O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.t2(m7Var, f17, f18, f19, f27, f28, f29, null), 3, null);
    }

    public final void U6(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        yy0.m7 m7Var = (yy0.m7) O6();
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.x4(m7Var, text, null), 3, null);
    }

    public final void V6() {
        yy0.m7 m7Var = (yy0.m7) O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.f5(m7Var, null), 3, null);
    }

    public final void W6(java.lang.String reportingEventName, java.lang.String reportingEventDetails) {
        kotlin.jvm.internal.o.g(reportingEventName, "reportingEventName");
        kotlin.jvm.internal.o.g(reportingEventDetails, "reportingEventDetails");
        ((yy0.m7) O6()).oj(reportingEventName, reportingEventDetails);
    }
}
