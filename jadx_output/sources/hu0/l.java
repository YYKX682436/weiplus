package hu0;

/* loaded from: classes5.dex */
public final class l extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f285037d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f285038e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f285039f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f285040g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f285041h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f285037d = jz5.h.b(hu0.b.f285017d);
    }

    public static final void O6(hu0.l lVar, java.lang.String str) {
        lVar.getClass();
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((cy1.a) ((dy1.r) c17)).Bj(str, "view_clk", lVar.Q6(), 1, false);
    }

    public final void P6(android.view.View view, java.lang.String str) {
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cy1.a aVar = (cy1.a) ((dy1.r) c17);
        aVar.pk(view, str);
        aVar.Tj(view, 32, 1, false);
        aVar.Ai(view, new hu0.a(this));
    }

    public final java.util.Map Q6() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        gu0.k2 k2Var = (gu0.k2) ((jz5.n) this.f285037d).getValue();
        eu0.b bVar = k2Var != null ? k2Var.f275725a : null;
        eu0.o oVar = bVar != null ? bVar.f256708n : null;
        jz5.l[] lVarArr = new jz5.l[4];
        java.lang.String str4 = "";
        if (oVar == null || (str = oVar.f256727a) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str);
        if (oVar == null || (str2 = oVar.f256728b) == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str2);
        lVarArr[2] = new jz5.l("comment_scene", 101);
        if (bVar != null && (str3 = bVar.f256707m) != null) {
            str4 = str3;
        }
        lVarArr[3] = new jz5.l("templateid", str4);
        return kz5.c1.k(lVarArr);
    }

    public final void R6(boolean z17) {
        float f17 = z17 ? 1.0f : 0.5f;
        android.widget.Button button = this.f285039f;
        if (button != null) {
            button.setEnabled(z17);
            button.setAlpha(f17);
        }
        android.widget.TextView textView = this.f285040g;
        if (textView != null) {
            textView.setEnabled(z17);
            textView.setAlpha(f17);
        }
        android.widget.LinearLayout linearLayout = this.f285038e;
        if (linearLayout != null) {
            linearLayout.setAlpha(f17);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f285038e = null;
        this.f285039f = null;
        this.f285040g = null;
        this.f285041h = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        eu0.b bVar;
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        gu0.k2 k2Var = (gu0.k2) ((jz5.n) this.f285037d).getValue();
        android.widget.TextView textView = null;
        boolean b17 = kotlin.jvm.internal.o.b((k2Var == null || (bVar = k2Var.f275725a) == null) ? null : bVar.f256695a, "reedit");
        this.f285038e = (android.widget.LinearLayout) contentView.findViewById(com.tencent.mm.R.id.sxb);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.sxf);
        if (textView2 != null) {
            textView2.setText(b17 ? "" : textView2.getContext().getString(com.tencent.mm.R.string.o_r));
        }
        android.widget.Button button = (android.widget.Button) contentView.findViewById(com.tencent.mm.R.id.sxe);
        if (button != null) {
            button.setText(button.getContext().getString(b17 ? com.tencent.mm.R.string.o_p : com.tencent.mm.R.string.o_l));
            if (b17) {
                P6(button, "effect_modify_complete_continue_post");
            }
            button.setOnClickListener(new hu0.i(b17, this));
        } else {
            button = null;
        }
        this.f285039f = button;
        android.widget.TextView textView3 = (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.sxc);
        if (textView3 != null) {
            if (b17) {
                P6(textView3, "effect_modify_complete_reedit");
            }
            textView3.setOnClickListener(new hu0.j(b17, this));
            textView = textView3;
        }
        this.f285040g = textView;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) contentView.findViewById(com.tencent.mm.R.id.sxg);
        if (frameLayout != null) {
            frameLayout.setClipToOutline(true);
            frameLayout.setOutlineProvider(new hu0.k());
        }
        com.tencent.mars.xlog.Log.i("MJCC.ControlUIC", "onViewCreated: isReedit=" + b17);
    }
}
