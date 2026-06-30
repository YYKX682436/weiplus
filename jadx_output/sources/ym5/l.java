package ym5;

/* loaded from: classes10.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.h f463422d;

    public l(ym5.h hVar) {
        this.f463422d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/BaseDrawingView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ym5.h hVar = this.f463422d;
        if (hVar.getTextEditView().getVisibility() == 0) {
            l45.q presenter = hVar.getPresenter();
            android.text.Editable text = hVar.f463357t.getText();
            int currentTextColor = hVar.f463357t.getCurrentTextColor();
            int intValue = hVar.f463358u.getCurMode() == 3 ? ((java.lang.Integer) hVar.f463358u.getTag()).intValue() : 0;
            l45.n nVar = (l45.n) presenter;
            nVar.getClass();
            if (text != null) {
                nVar.s(text.toString(), currentTextColor, intValue, "");
            }
        } else {
            qk.i6 i6Var = ((l45.n) hVar.getPresenter()).f316464e;
            if (i6Var != null) {
                i6Var.onFinish();
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/BaseDrawingView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
