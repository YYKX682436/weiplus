package ur2;

/* loaded from: classes10.dex */
public final class v extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f430424d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f430425e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f430426f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f430427g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f430428h;

    /* renamed from: i, reason: collision with root package name */
    public ur2.o f430429i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f430430m;

    /* renamed from: n, reason: collision with root package name */
    public ry2.e f430431n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if ((r1.length() > 0) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O6(boolean r17) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ur2.v.O6(boolean):void");
    }

    public final void P6(long j17) {
        java.lang.CharSequence charSequence;
        com.tencent.mm.ui.tools.f5 f5Var = this.f430430m;
        if (f5Var != null) {
            f5Var.d();
        }
        if (this.f430424d) {
            android.widget.TextView textView = this.f430427g;
            if (textView == null) {
                kotlin.jvm.internal.o.o("tvTitle");
                throw null;
            }
            charSequence = textView.getText();
        } else {
            charSequence = "";
        }
        ur2.o oVar = this.f430429i;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("previewHalfScreen");
            throw null;
        }
        kotlin.jvm.internal.o.d(charSequence);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z17) {
            if (i18 >= i17) {
                i17 = i18;
            }
            i18 = i17;
        }
        oVar.f430413m = i18 - oVar.f430407d.findViewById(com.tencent.mm.R.id.jlt).getHeight();
        oVar.f430412i = false;
        oVar.f430419s.f();
        android.view.View view = oVar.f430416p;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), oVar.f430413m);
        android.view.View view2 = oVar.f430414n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen", "tryShow", "(JLjava/lang/CharSequence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen", "tryShow", "(JLjava/lang/CharSequence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z18 = charSequence.length() > 0;
        android.widget.EditText editText = oVar.f430415o;
        if (z18) {
            editText.setText(charSequence);
        }
        editText.requestFocus();
        editText.postDelayed(new ur2.n(oVar), j17);
    }

    public final void Q6(boolean z17, java.lang.CharSequence charSequence) {
        if (z17) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f430428h;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("ivIcon");
                throw null;
            }
            weImageView.setImageResource(com.tencent.mm.R.raw.text_filled);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f430428h;
            if (weImageView2 == null) {
                kotlin.jvm.internal.o.o("ivIcon");
                throw null;
            }
            weImageView2.setIconColor(getContext().getColor(com.tencent.mm.R.color.Brand_100));
            android.widget.TextView textView = this.f430427g;
            if (textView == null) {
                kotlin.jvm.internal.o.o("tvTitle");
                throw null;
            }
            textView.setTextColor(getContext().getColor(com.tencent.mm.R.color.Brand_100));
            android.widget.TextView textView2 = this.f430427g;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("tvTitle");
                throw null;
            }
            textView2.setText(charSequence);
        } else {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f430428h;
            if (weImageView3 == null) {
                kotlin.jvm.internal.o.o("ivIcon");
                throw null;
            }
            weImageView3.setImageResource(com.tencent.mm.R.raw.text_medium);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f430428h;
            if (weImageView4 == null) {
                kotlin.jvm.internal.o.o("ivIcon");
                throw null;
            }
            weImageView4.setIconColor(getContext().getColor(com.tencent.mm.R.color.abw));
            android.widget.TextView textView3 = this.f430427g;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("tvTitle");
                throw null;
            }
            textView3.setTextColor(getContext().getColor(com.tencent.mm.R.color.abw));
            android.widget.TextView textView4 = this.f430427g;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("tvTitle");
                throw null;
            }
            textView4.setText(getContext().getString(com.tencent.mm.R.string.nmf));
        }
        this.f430424d = z17;
    }
}
