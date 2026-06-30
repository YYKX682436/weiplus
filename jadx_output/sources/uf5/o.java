package uf5;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.x f427277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(uf5.x xVar) {
        super(2);
        this.f427277d = xVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        uf5.l lVar;
        android.view.View anchorView = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(anchorView, "anchorView");
        uf5.x xVar = this.f427277d;
        if (intValue == -1) {
            xVar.getClass();
        } else {
            j75.f Q6 = xVar.Q6();
            if (Q6 != null && (lVar = (uf5.l) Q6.getState()) != null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) lVar.f427267f;
                int max = java.lang.Math.max(0, arrayList.size() - 4) + intValue;
                if (max >= 0 && max < arrayList.size()) {
                    java.lang.String str = (java.lang.String) arrayList.get(max);
                    androidx.appcompat.app.AppCompatActivity activity = xVar.getActivity();
                    uf5.v vVar = new uf5.v(xVar, str);
                    kotlin.jvm.internal.o.g(activity, "activity");
                    android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.tencent.mm.R.layout.dz6, (android.view.ViewGroup) null);
                    android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -2, -2, true);
                    popupWindow.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
                    popupWindow.setOutsideTouchable(true);
                    inflate.setOnClickListener(new uf5.b(vVar, popupWindow));
                    inflate.measure(0, 0);
                    popupWindow.showAsDropDown(anchorView, (anchorView.getWidth() - inflate.getMeasuredWidth()) / 2, -(inflate.getMeasuredHeight() + anchorView.getHeight() + activity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl)));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
