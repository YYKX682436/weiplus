package un;

/* loaded from: classes.dex */
public final class p0 extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        wi5.n0 n0Var;
        super.onActivityResult(i17, i18, intent);
        if (intent == null || i17 != 5) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        if (stringExtra != null) {
            java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
            if (!(!f07.isEmpty())) {
                f07 = null;
            }
            if (f07 != null) {
                linkedList.addAll(f07);
            }
        }
        java.lang.String stringExtra2 = intent.getStringExtra("Cancel_Select_Contact");
        if (stringExtra2 != null) {
            java.util.List f08 = r26.n0.f0(stringExtra2, new java.lang.String[]{","}, false, 0, 6, null);
            java.util.List list = f08.isEmpty() ^ true ? f08 : null;
            if (list != null) {
                linkedList2.addAll(list);
            }
        }
        j75.f Q6 = Q6();
        if (Q6 == null || (n0Var = (wi5.n0) Q6.getState()) == null) {
            return;
        }
        if (n0Var.e()) {
            j75.f Q62 = Q6();
            if (Q62 != null) {
                Q62.B3(new wi5.k0(linkedList, linkedList2));
                return;
            }
            return;
        }
        j75.f Q63 = Q6();
        if (Q63 != null) {
            Q63.B3(new wi5.c0(linkedList, i17));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new un.o0(this));
        }
    }
}
