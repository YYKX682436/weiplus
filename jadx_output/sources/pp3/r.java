package pp3;

/* loaded from: classes5.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp3.u f357495d;

    public r(pp3.u uVar) {
        this.f357495d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/patmsg/ui/PatSuffixSettingDialog$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pp3.u uVar = this.f357495d;
        android.widget.EditText editText = (android.widget.EditText) uVar.findViewById(com.tencent.mm.R.id.kpy);
        if (editText != null) {
            android.text.Editable text = editText.getText();
            kotlin.jvm.internal.o.f(text, "getText(...)");
            uVar.getClass();
            r45.mo4 mo4Var = new r45.mo4();
            java.lang.String o17 = com.tencent.mm.sdk.platformtools.t8.o(text.toString());
            kotlin.jvm.internal.o.f(o17, "escapeStringForUCC(...)");
            int length = o17.length() - 1;
            int i17 = 0;
            boolean z17 = false;
            while (i17 <= length) {
                boolean z18 = kotlin.jvm.internal.o.i(o17.charAt(!z17 ? i17 : length), 32) <= 0;
                if (z17) {
                    if (!z18) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z18) {
                    i17++;
                } else {
                    z17 = true;
                }
            }
            mo4Var.f380712d = o17.subSequence(i17, length + 1).toString();
            ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT, mo4Var));
            android.content.Context context = uVar.f357499f;
            uVar.f357507q = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.gy7), false, false, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/patmsg/ui/PatSuffixSettingDialog$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
