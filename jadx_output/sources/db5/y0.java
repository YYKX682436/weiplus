package db5;

/* loaded from: classes8.dex */
public class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f228576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.z0 f228577e;

    public y0(android.widget.LinearLayout linearLayout, db5.z0 z0Var) {
        this.f228576d = linearLayout;
        this.f228577e = z0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMAlert$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = 0;
        while (true) {
            android.widget.LinearLayout linearLayout = this.f228576d;
            if (i17 >= linearLayout.getChildCount()) {
                ((android.widget.TextView) view).setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.radio_on, 0, 0, 0);
                view.post(new db5.x0(this, ((java.lang.Integer) view.getTag()).intValue()));
                yj0.a.h(this, "com/tencent/mm/ui/base/MMAlert$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                android.widget.TextView textView = (android.widget.TextView) linearLayout.getChildAt(i17);
                if (textView.getId() != com.tencent.mm.R.id.f487334ob5) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.radio_off, 0, 0, 0);
                }
                i17++;
            }
        }
    }
}
