package gp3;

/* loaded from: classes9.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f274387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f274388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gp3.u f274389f;

    public t(gp3.u uVar, android.widget.TextView textView, android.widget.LinearLayout linearLayout) {
        this.f274389f = uVar;
        this.f274387d = textView;
        this.f274388e = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        gp3.u uVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/preference/MallOrderDeployablePreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView textView = this.f274387d;
        textView.setVisibility(8);
        int i17 = 0;
        while (true) {
            uVar = this.f274389f;
            java.lang.String[] strArr = uVar.P;
            if (i17 >= strArr.length) {
                break;
            }
            java.lang.String str = strArr[i17];
            uVar.getClass();
            android.widget.TextView textView2 = new android.widget.TextView(uVar.f197770d);
            textView2.setText(str);
            textView2.setTextSize(16.0f);
            textView2.setTextColor(gp3.u.S);
            if (uVar.R) {
                textView2.setSingleLine(true);
                textView2.setEllipsize(uVar.Q);
            } else {
                textView2.setSingleLine(false);
            }
            this.f274388e.addView(textView2, new android.widget.LinearLayout.LayoutParams(-2, -2));
            i17++;
        }
        textView.setOnClickListener(null);
        com.tencent.mm.ui.base.preference.r rVar = uVar.M;
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/MallOrderDeployablePreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
