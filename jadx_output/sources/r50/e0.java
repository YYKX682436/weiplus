package r50;

/* loaded from: classes5.dex */
public final class e0 implements com.tencent.mm.pluginsdk.ui.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f392575a;

    public e0(r50.j0 j0Var) {
        this.f392575a = j0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void a() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void b(int i17) {
        r50.j0 j0Var = this.f392575a;
        android.text.Editable text = j0Var.W6().e().getText();
        if (text == null || r26.n0.N(text)) {
            j0Var.W6().j().c(i17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void c(float f17, float f18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void d() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void e(float f17, float f18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void f() {
        this.f392575a.showVKB();
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void onHide() {
        r50.j0 j0Var = this.f392575a;
        j0Var.W6().k().setVisibility(8);
        if (com.tencent.mm.pluginsdk.ui.SpeechInputLayout.f189820y.a() == 2) {
            android.view.View m17 = j0Var.W6().m();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$6", "onHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m17, "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$6", "onHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.w2
    public void onShow() {
        r50.j0 j0Var = this.f392575a;
        j0Var.W6().k().setVisibility(0);
        ct.f3 f3Var = (ct.f3) i95.n0.c(ct.f3.class);
        android.widget.FrameLayout k17 = j0Var.W6().k();
        kotlin.jvm.internal.o.f(k17, "getSpeechInputContainer(...)");
        ((x90.m) f3Var).getClass();
        b31.l.f17613a.h(k17, 4, "");
        if (com.tencent.mm.pluginsdk.ui.SpeechInputLayout.f189820y.a() == 2) {
            android.view.View m17 = j0Var.W6().m();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$6", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m17, "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$6", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
