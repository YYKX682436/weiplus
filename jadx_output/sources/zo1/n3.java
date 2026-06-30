package zo1;

/* loaded from: classes5.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI f474704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo1.v f474705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI, wo1.v vVar) {
        super(3);
        this.f474704d = selectContactUI;
        this.f474705e = vVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.List selectList = (java.util.List) obj;
        ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g(selectList, "selectList");
        kotlin.jvm.internal.o.g((java.lang.String) obj2, "<anonymous parameter 1>");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI = this.f474704d;
        java.lang.String string = selectContactUI.getString(com.tencent.mm.R.string.ig8);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (!selectList.isEmpty()) {
            android.widget.LinearLayout linearLayout = selectContactUI.f92853m;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("avatarLl");
                throw null;
            }
            linearLayout.setVisibility(0);
            android.widget.Button button = selectContactUI.f92854n;
            if (button == null) {
                kotlin.jvm.internal.o.o("finishBtn");
                throw null;
            }
            button.setText(string + '(' + selectList.size() + ')');
            android.widget.Button button2 = selectContactUI.f92854n;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("finishBtn");
                throw null;
            }
            button2.setEnabled(true);
        } else {
            android.widget.LinearLayout linearLayout2 = selectContactUI.f92853m;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.o.o("avatarLl");
                throw null;
            }
            linearLayout2.setVisibility(8);
            android.widget.Button button3 = selectContactUI.f92854n;
            if (button3 == null) {
                kotlin.jvm.internal.o.o("finishBtn");
                throw null;
            }
            button3.setText(string);
            android.widget.Button button4 = selectContactUI.f92854n;
            if (button4 == null) {
                kotlin.jvm.internal.o.o("finishBtn");
                throw null;
            }
            button4.setEnabled(false);
        }
        wo1.v vVar = this.f474705e;
        if (vVar.isSelectAll()) {
            android.widget.TextView textView = selectContactUI.f92856p;
            if (textView == null) {
                kotlin.jvm.internal.o.o("selectAllTv");
                throw null;
            }
            textView.setText(com.tencent.mm.R.string.a76);
        } else {
            android.widget.TextView textView2 = selectContactUI.f92856p;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("selectAllTv");
                throw null;
            }
            textView2.setText(com.tencent.mm.R.string.f490681a75);
        }
        long estimatedSize = vVar.getEstimatedSize();
        android.widget.TextView textView3 = selectContactUI.f92855o;
        if (textView3 != null) {
            textView3.setText(estimatedSize > 0 ? selectContactUI.getString(com.tencent.mm.R.string.mwm, com.tencent.mm.sdk.platformtools.t8.S1(estimatedSize)) : "");
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("estimatedSizeTv");
        throw null;
    }
}
