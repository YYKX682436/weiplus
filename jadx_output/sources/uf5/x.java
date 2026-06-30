package uf5;

/* loaded from: classes8.dex */
public final class x extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f427321d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f427322e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f427323f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f427324g;

    /* renamed from: h, reason: collision with root package name */
    public uf5.u1 f427325h;

    /* renamed from: i, reason: collision with root package name */
    public uf5.k f427326i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static final void T6(uf5.x xVar) {
        uf5.l lVar;
        j75.f Q6 = xVar.Q6();
        if (Q6 == null || (lVar = (uf5.l) Q6.getState()) == null) {
            return;
        }
        java.util.List list = lVar.f427268g;
        if (list.isEmpty()) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(xVar.getActivity(), "com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI");
        intent.putStringArrayListExtra("label_username_list", new java.util.ArrayList<>(list));
        lk5.s.e(intent, true);
        xVar.getActivity().startActivityForResult(intent, 100);
    }

    public static final void U6(uf5.x xVar, uf5.l lVar) {
        xVar.getClass();
        int size = lVar.f427268g.size();
        if (size > 0) {
            android.widget.Button button = xVar.f427324g;
            if (button == null) {
                kotlin.jvm.internal.o.o("batchSetBtn");
                throw null;
            }
            button.setText(xVar.getActivity().getString(com.tencent.mm.R.string.pa6, java.lang.Integer.valueOf(size)));
            android.widget.Button button2 = xVar.f427324g;
            if (button2 != null) {
                button2.setEnabled(true);
                return;
            } else {
                kotlin.jvm.internal.o.o("batchSetBtn");
                throw null;
            }
        }
        android.widget.Button button3 = xVar.f427324g;
        if (button3 == null) {
            kotlin.jvm.internal.o.o("batchSetBtn");
            throw null;
        }
        button3.setText(xVar.getActivity().getString(com.tencent.mm.R.string.f493838pa4));
        android.widget.Button button4 = xVar.f427324g;
        if (button4 != null) {
            button4.setEnabled(false);
        } else {
            kotlin.jvm.internal.o.o("batchSetBtn");
            throw null;
        }
    }

    public static final void V6(uf5.x xVar, al5.q qVar) {
        if (com.tencent.mm.ui.b4.c(xVar.getActivity())) {
            androidx.appcompat.app.AppCompatActivity activity = xVar.getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity != null) {
                xVar.getRootView().post(new uf5.w(mMActivity, qVar));
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        j75.f Q6;
        uf5.l lVar;
        super.onActivityResult(i17, i18, intent);
        if (i17 != 100 || i18 != -1 || (Q6 = Q6()) == null || (lVar = (uf5.l) Q6.getState()) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(lVar.f427268g);
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.B3(new uf5.d(arrayList));
        }
    }
}
