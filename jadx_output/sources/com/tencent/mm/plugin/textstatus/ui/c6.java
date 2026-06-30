package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class c6 implements com.tencent.mm.plugin.textstatus.convert.dowhat.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity f173766a;

    public c6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity) {
        this.f173766a = textStatusDoWhatActivity;
    }

    @Override // com.tencent.mm.plugin.textstatus.convert.dowhat.u
    public void a(android.view.View v17, java.lang.String iconId) {
        android.widget.Button button;
        android.widget.ImageView imageView;
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout;
        pj4.b0 b0Var;
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(iconId, "iconId");
        boolean b17 = kotlin.jvm.internal.o.b(iconId, "userdefine");
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity = this.f173766a;
        if (!b17) {
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity.U6(textStatusDoWhatActivity, iconId);
            return;
        }
        bi4.d1 d1Var = textStatusDoWhatActivity.f173518i;
        if (d1Var != null) {
            d1Var.f354946p++;
        }
        textStatusDoWhatActivity.f173529w = textStatusDoWhatActivity.findViewById(com.tencent.mm.R.id.cp_);
        textStatusDoWhatActivity.A = textStatusDoWhatActivity.findViewById(com.tencent.mm.R.id.ovp);
        android.view.View view = textStatusDoWhatActivity.f173529w;
        if (view != null) {
            bk4.e1 e1Var = bk4.e1.f21460a;
            bi4.d1 d1Var2 = textStatusDoWhatActivity.f173518i;
            view.setBackgroundResource(e1Var.b((d1Var2 == null || (b0Var = d1Var2.f354937d) == null) ? null : b0Var.f354989x));
        }
        android.view.View view2 = textStatusDoWhatActivity.f173529w;
        float f17 = i65.a.f(textStatusDoWhatActivity.getContext(), com.tencent.mm.R.dimen.f479688cn);
        if (view2 != null) {
            view2.setOutlineProvider(new bk4.e2(true, true, f17));
        }
        if (view2 != null) {
            view2.setClipToOutline(true);
        }
        android.view.View view3 = textStatusDoWhatActivity.f173529w;
        textStatusDoWhatActivity.f173530x = view3 != null ? (android.widget.EditText) view3.findViewById(com.tencent.mm.R.id.cp8) : null;
        android.view.View view4 = textStatusDoWhatActivity.f173529w;
        textStatusDoWhatActivity.f173531y = view4 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view4.findViewById(com.tencent.mm.R.id.cp9) : null;
        bk4.f.V(bk4.i.a(), textStatusDoWhatActivity.f173531y, "userdefine", null, null, null, false, false, 124, null);
        android.view.View view5 = textStatusDoWhatActivity.f173529w;
        if (view5 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view5, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showCustomDialog", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showCustomDialog", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view6 = textStatusDoWhatActivity.A;
        if (view6 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showCustomDialog", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showCustomDialog", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view7 = textStatusDoWhatActivity.A;
        if (view7 != null) {
            view7.setOnClickListener(com.tencent.mm.plugin.textstatus.ui.d6.f173805d);
        }
        java.lang.String str = textStatusDoWhatActivity.f173516g;
        if (str.length() > 0) {
            android.widget.EditText editText = textStatusDoWhatActivity.f173530x;
            if (editText != null) {
                editText.setText(str);
            }
            android.widget.EditText editText2 = textStatusDoWhatActivity.f173530x;
            if (editText2 != null) {
                editText2.setSelection(str.length());
            }
        }
        textStatusDoWhatActivity.V6();
        android.widget.EditText editText3 = textStatusDoWhatActivity.f173530x;
        com.tencent.mm.plugin.textstatus.ui.u5 u5Var = textStatusDoWhatActivity.f173532z;
        if (editText3 != null) {
            editText3.removeTextChangedListener(u5Var);
        }
        android.widget.EditText editText4 = textStatusDoWhatActivity.f173530x;
        if (editText4 != null) {
            editText4.addTextChangedListener(u5Var);
        }
        android.view.View view8 = textStatusDoWhatActivity.f173529w;
        if (view8 != null && (inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) view8.findViewById(com.tencent.mm.R.id.cow)) != null) {
            inputPanelLinearLayout.e(textStatusDoWhatActivity);
        }
        android.view.View view9 = textStatusDoWhatActivity.f173529w;
        if (view9 != null && (imageView = (android.widget.ImageView) view9.findViewById(com.tencent.mm.R.id.hkr)) != null) {
            imageView.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.e6(textStatusDoWhatActivity));
        }
        android.view.View view10 = textStatusDoWhatActivity.f173529w;
        if (view10 != null && (button = (android.widget.Button) view10.findViewById(com.tencent.mm.R.id.b0z)) != null) {
            button.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.f6(textStatusDoWhatActivity, iconId));
        }
        android.view.View view11 = textStatusDoWhatActivity.f173529w;
        textStatusDoWhatActivity.B = view11 != null ? (android.widget.TextView) view11.findViewById(com.tencent.mm.R.id.oqc) : null;
        android.widget.EditText editText5 = textStatusDoWhatActivity.f173530x;
        if (editText5 != null) {
            editText5.requestFocus();
        }
        textStatusDoWhatActivity.showVKB();
    }
}
