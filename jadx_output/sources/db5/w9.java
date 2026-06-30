package db5;

/* loaded from: classes11.dex */
public final class w9 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.WeAgreementCheckBox f228565d;

    public w9(com.tencent.mm.ui.base.WeAgreementCheckBox weAgreementCheckBox) {
        this.f228565d = weAgreementCheckBox;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        em.t1 binding;
        em.t1 binding2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/WeAgreementCheckBox$initListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 1) {
            com.tencent.mm.ui.base.WeAgreementCheckBox weAgreementCheckBox = this.f228565d;
            binding = weAgreementCheckBox.getBinding();
            android.widget.TextView b17 = binding.b();
            kotlin.jvm.internal.o.f(b17, "getTvText(...)");
            if (!weAgreementCheckBox.c(b17, motionEvent)) {
                binding2 = weAgreementCheckBox.getBinding();
                binding2.a().toggle();
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/base/WeAgreementCheckBox$initListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
