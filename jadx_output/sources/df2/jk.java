package df2;

/* loaded from: classes3.dex */
public final class jk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f230486d;

    public jk(df2.pk pkVar) {
        this.f230486d = pkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.na0 D0;
        r45.pa0 pa0Var;
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView;
        android.text.Editable text;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.pk pkVar = this.f230486d;
        pkVar.d7(pkVar.B);
        ce2.i iVar = pkVar.f231072J;
        if (iVar != null && (D0 = iVar.D0()) != null && (pa0Var = (r45.pa0) D0.getCustom(1)) != null) {
            android.widget.EditText editText = pkVar.B;
            java.lang.String obj2 = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("edit custom gift text from:");
            java.lang.String string = pa0Var.getString(3);
            if (string == null) {
                string = "";
            }
            sb6.append(string);
            sb6.append(" to:");
            sb6.append(obj2);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = pkVar.f231073m;
            com.tencent.mars.xlog.Log.i(str, sb7);
            if (pa0Var.getBoolean(0)) {
                pa0Var.set(3, obj2);
                pa0Var.set(5, "");
                pa0Var.set(4, java.lang.Boolean.TRUE);
                pkVar.f7("updateEditCustomText");
                java.util.Iterator it = pkVar.c7().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((android.view.View) obj).getId() == com.tencent.mm.R.id.cpj) {
                            break;
                        }
                    }
                }
                android.view.View view2 = (android.view.View) obj;
                if (view2 != null) {
                    java.lang.String string2 = pa0Var.getString(3);
                    if (string2 == null) {
                        string2 = "";
                    }
                    pkVar.g7(view2, null, string2);
                }
                java.lang.String string3 = pa0Var.getString(7);
                if (string3 != null && (magicRewardView = pkVar.f231079s) != null) {
                    java.lang.String string4 = pa0Var.getString(3);
                    if (string4 == null) {
                        string4 = "";
                    }
                    magicRewardView.j(string3, string4);
                }
                ce2.i iVar2 = pkVar.f231072J;
                r45.na0 D02 = iVar2 != null ? iVar2.D0() : null;
                boolean Z6 = pkVar.Z6("", pkVar.I, pkVar.f231072J);
                boolean a76 = pkVar.a7(pkVar.I, pkVar.f231072J);
                android.widget.TextView textView = pkVar.f231078r;
                if (textView != null) {
                    textView.setEnabled(a76);
                }
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onCustomerEditText, componentChange:");
                sb8.append(Z6);
                sb8.append(",customGiftTextChange:");
                sb8.append(a76);
                sb8.append(", new customComponentList:");
                sb8.append(pkVar.b7(D02 != null ? D02.getList(0) : null));
                sb8.append(" customText:");
                sb8.append(D02 != null ? (r45.pa0) D02.getCustom(1) : null);
                com.tencent.mars.xlog.Log.i(str, sb8.toString());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
