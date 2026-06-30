package hr3;

/* loaded from: classes11.dex */
public class gh extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f283598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI f283599e;

    public gh(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI, java.lang.String str) {
        this.f283599e = sayHiWithSnsPermissionUI;
        this.f283598d = str;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = this.f283599e;
        sayHiWithSnsPermissionUI.f153839z[1] = 1;
        boolean z17 = sayHiWithSnsPermissionUI.f153832w;
        java.lang.String str = this.f283598d;
        if (z17) {
            java.lang.CharSequence text = sayHiWithSnsPermissionUI.f153817h.getText();
            int e17 = com.tencent.mm.ui.tools.v4.e(text.toString(), com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2);
            if (e17 > 0) {
                sayHiWithSnsPermissionUI.f153839z[2] = 1;
            }
            uc0.q qVar = (uc0.q) i95.n0.c(uc0.q.class);
            androidx.appcompat.app.AppCompatActivity context = sayHiWithSnsPermissionUI.getContext();
            hr3.fh fhVar = new hr3.fh(this, text);
            ((tc0.m) qVar).getClass();
            hw3.a.a(context, str, e17, 64, fhVar);
        } else {
            sayHiWithSnsPermissionUI.E = true;
            java.lang.String e18 = ck5.f.e(str, 64);
            if (e18 == null) {
                e18 = "";
            }
            if (str != null && e18.length() < str.length()) {
                android.widget.Toast.makeText(sayHiWithSnsPermissionUI, sayHiWithSnsPermissionUI.getString(com.tencent.mm.R.string.f492811hy2), 0).show();
            }
            com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = sayHiWithSnsPermissionUI.f153817h;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = sayHiWithSnsPermissionUI.f153817h.getTextSize();
            ((ke0.e) xVar).getClass();
            mMLimitedClearEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(sayHiWithSnsPermissionUI, e18, textSize));
            sayHiWithSnsPermissionUI.f153817h.setSelection(e18.length());
            android.view.View view2 = sayHiWithSnsPermissionUI.f153818i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        sayHiWithSnsPermissionUI.f153836y[4] = 1;
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f283599e.getResources().getColor(com.tencent.mm.R.color.f478724ff));
        textPaint.setUnderlineText(false);
    }
}
