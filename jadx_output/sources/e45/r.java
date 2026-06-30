package e45;

/* loaded from: classes8.dex */
public final class r extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f249417d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f249418e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f249419f;

    /* renamed from: g, reason: collision with root package name */
    public int f249420g;

    /* renamed from: h, reason: collision with root package name */
    public int f249421h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f249422i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f249423m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f249424n;

    /* renamed from: o, reason: collision with root package name */
    public e45.i f249425o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f249420g = 1;
        this.f249422i = new java.util.ArrayList();
        this.f249423m = new java.util.LinkedHashMap();
    }

    public static final void O6(e45.r rVar, int i17) {
        rVar.P6(rVar.getActivity().findViewById(com.tencent.mm.R.id.jdr), i17);
        rVar.P6(rVar.getActivity().findViewById(com.tencent.mm.R.id.f484375e24), i17);
    }

    public final void P6(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null || marginLayoutParams.bottomMargin == i17) {
            return;
        }
        marginLayoutParams.bottomMargin = i17;
        view.setLayoutParams(marginLayoutParams);
    }

    public final int Q6(android.view.View view, android.view.View view2) {
        if (view.getHeight() > 0) {
            return view.getHeight();
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view2.getWidth() > 0 ? view2.getWidth() : getActivity().getResources().getDisplayMetrics().widthPixels, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public final void R6(boolean z17, boolean z18) {
        c01.l2 c17 = c01.n2.d().c("KEY_DARA_CENTER_FILE_SELECTOR_SELECTED_FILE_LIST", true);
        java.util.ArrayList arrayList = this.f249422i;
        c17.i("INTENT_KEY_DATA_LIST", arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorBottomBarUIC", "startSelectedFileListHalfScreen() called previewDataList:" + arrayList.size());
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI.class);
        pf5.j0.a(intent, e45.t.class);
        intent.putExtra("INTENT_KEY_LAST_SELECTED_TAB", this.f249420g);
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f249418e;
        java.lang.CharSequence text = weButton != null ? weButton.getText() : null;
        if (text == null) {
            text = "";
        }
        intent.putExtra("INTENT_KEY_ACTION_BUTTON_TEXT", text);
        intent.putExtra("INTENT_KEY_SCROLL_TO_LAST", z17);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.vfh);
        intent.putExtra("INTENT_KEY_IS_NEED_CLEAN", checkBox != null ? checkBox.isChecked() : true);
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        android.app.Activity context = getContext();
        bh5.d dVar = cVar.f20922a;
        dVar.f20924a = context;
        cVar.b(com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment.class);
        cVar.e(true);
        cVar.a("com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI");
        if (z18) {
            dVar.f20927d.w(4);
        }
        cVar.h(8);
    }

    public final void S6() {
        int i17;
        android.widget.TextView textView = this.f249417d;
        if (textView == null) {
            return;
        }
        if (this.f249421h > 0) {
            if (textView != null) {
                textView.setText(getContext().getString(com.tencent.mm.R.string.dcy, java.lang.Integer.valueOf(this.f249421h)));
            }
            i17 = 0;
        } else {
            i17 = 4;
        }
        textView.setVisibility(i17);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.widget.TextView textView = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.qxn);
        if (textView != null) {
            com.tencent.mm.ui.bk.s0(textView.getPaint());
            textView.setOnClickListener(new e45.n(this));
        } else {
            textView = null;
        }
        this.f249417d = textView;
        S6();
        com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) getActivity().findViewById(com.tencent.mm.R.id.hrg);
        this.f249418e = weButton;
        if (weButton != null) {
            weButton.setEnabled(this.f249421h > 0);
        }
        com.tencent.mm.ui.widget.button.WeButton weButton2 = this.f249418e;
        if (weButton2 != null) {
            weButton2.setOnClickListener(new e45.o(this));
        }
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.lrc);
        this.f249419f = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new e45.p(this));
        }
        android.view.View findViewById2 = getActivity().findViewById(com.tencent.mm.R.id.taj);
        this.f249424n = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new e45.q(this));
        }
    }
}
