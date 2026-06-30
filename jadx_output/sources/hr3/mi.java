package hr3;

/* loaded from: classes11.dex */
public class mi extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f283813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 f283814e;

    public mi(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, java.lang.String str) {
        this.f283814e = sayHiWithSnsPermissionUI3;
        this.f283813d = str;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f283814e;
        sayHiWithSnsPermissionUI3.E[1] = 1;
        boolean z17 = sayHiWithSnsPermissionUI3.B;
        java.lang.String str = this.f283813d;
        if (z17) {
            java.lang.CharSequence text = sayHiWithSnsPermissionUI3.f153846h.getText();
            int e17 = com.tencent.mm.ui.tools.v4.e(text.toString(), com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2);
            if (e17 > 0) {
                sayHiWithSnsPermissionUI3.E[2] = 1;
            }
            uc0.q qVar = (uc0.q) i95.n0.c(uc0.q.class);
            androidx.appcompat.app.AppCompatActivity context = sayHiWithSnsPermissionUI3.getContext();
            hr3.li liVar = new hr3.li(this, text);
            ((tc0.m) qVar).getClass();
            hw3.a.a(context, str, e17, 64, liVar);
        } else {
            java.lang.String e18 = ck5.f.e(str, 64);
            if (e18 == null) {
                e18 = "";
            }
            if (str != null && e18.length() < str.length()) {
                android.widget.Toast.makeText(sayHiWithSnsPermissionUI3, sayHiWithSnsPermissionUI3.getString(com.tencent.mm.R.string.f492811hy2), 0).show();
            }
            com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = sayHiWithSnsPermissionUI3.f153846h;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = sayHiWithSnsPermissionUI3.f153846h.getTextSize();
            ((ke0.e) xVar).getClass();
            mMLimitedClearEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(sayHiWithSnsPermissionUI3, e18, textSize));
            sayHiWithSnsPermissionUI3.f153846h.setSelection(e18.length());
            android.view.View view2 = sayHiWithSnsPermissionUI3.f153847i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        sayHiWithSnsPermissionUI3.D[4] = 1;
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f283814e.getResources().getColor(com.tencent.mm.R.color.f478724ff));
        textPaint.setUnderlineText(false);
    }
}
