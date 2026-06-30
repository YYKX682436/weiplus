package q23;

/* loaded from: classes4.dex */
public final class j implements q23.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f359816a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f359817b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f359818c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f359819d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View.OnClickListener f359820e;

    public j(android.view.ViewGroup parent) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.egu, parent, true);
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f359816a = context;
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.ut_);
        this.f359817b = viewGroup2;
        if (viewGroup2 != null) {
            viewGroup2.setBackground(null);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.utg);
        this.f359818c = weImageView;
        if (weImageView != null) {
            weImageView.setEnableColorFilter(false);
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.uth);
        this.f359819d = textView;
        if (textView != null) {
            com.tencent.mm.ui.dl.i(textView.getPaint());
        }
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new q23.i(this));
        }
        qk.t7 t7Var = (qk.t7) i95.n0.c(qk.t7.class);
        kotlin.jvm.internal.o.e(viewGroup2, "null cannot be cast to non-null type android.view.View");
        ((hs.z) t7Var).wi(viewGroup2);
    }

    @Override // q23.f
    public void a(int i17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f359818c;
        kotlin.jvm.internal.o.d(weImageView);
        weImageView.setAlpha(1.0f);
        if (i17 == 2) {
            weImageView.setImageResource(com.tencent.mm.R.raw.radio_off_white);
        } else {
            if (i17 == 0 || i17 == 1) {
                weImageView.setImageResource(com.tencent.mm.R.raw.checkbox_selected_small);
            } else if (i17 == 3) {
                weImageView.setAlpha(0.3f);
                weImageView.setImageResource(com.tencent.mm.R.raw.radio_off_white);
            }
        }
        android.view.ViewGroup viewGroup = this.f359817b;
        if (viewGroup != null) {
            viewGroup.setClickable(true);
        }
        boolean z17 = (i17 == 2 || i17 == 0) || i17 == 1;
        android.content.Context context = this.f359816a;
        if (z17) {
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            if (viewGroup != null) {
                viewGroup.setBackground(i65.a.i(context, com.tencent.mm.R.drawable.d58));
            }
            if (viewGroup != null) {
                viewGroup.setEnabled(true);
            }
        } else if (i17 == 3) {
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            if (viewGroup != null) {
                viewGroup.setBackground(i65.a.i(context, com.tencent.mm.R.drawable.d58));
            }
            if (viewGroup != null) {
                viewGroup.setEnabled(false);
            }
            if (viewGroup != null) {
                viewGroup.setClickable(false);
            }
        }
        boolean z18 = (i17 == 2 || i17 == 0) || i17 == 1;
        android.widget.TextView textView = this.f359819d;
        if (z18) {
            if (textView != null) {
                textView.setTextColor(i65.a.d(context, com.tencent.mm.R.color.f478553an));
            }
        } else {
            if (i17 != 3 || textView == null) {
                return;
            }
            textView.setTextColor(i65.a.d(context, com.tencent.mm.R.color.abx));
        }
    }

    public void b(android.view.View.OnClickListener l17) {
        kotlin.jvm.internal.o.g(l17, "l");
        this.f359820e = l17;
    }

    @Override // q23.f
    public void reset() {
        android.view.ViewGroup viewGroup = this.f359817b;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
