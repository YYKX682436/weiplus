package sr2;

/* loaded from: classes10.dex */
public final class w0 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.plugin.finder.view.tg, ya2.r1, com.tencent.mm.plugin.finder.view.pp {
    public final jz5.g A;
    public final int B;
    public boolean C;
    public int D;
    public int E;
    public java.lang.String F;
    public int G;
    public int H;
    public com.tencent.mm.plugin.finder.view.FinderPostTextModifyView I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f411752J;
    public int K;
    public wl5.x L;
    public wl5.x M;
    public sr2.r N;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f411753d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderPostEditText f411754e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f411755f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderPostFooter f411756g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f411757h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f411758i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f411759m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderPostEditText f411760n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f411761o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f411762p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f411763q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f411764r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f411765s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f411766t;

    /* renamed from: u, reason: collision with root package name */
    public int f411767u;

    /* renamed from: v, reason: collision with root package name */
    public rx2.u f411768v;

    /* renamed from: w, reason: collision with root package name */
    public int f411769w;

    /* renamed from: x, reason: collision with root package name */
    public db5.d5 f411770x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f411771y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f411772z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f411765s = true;
        this.f411766t = true;
        this.f411769w = -1;
        jz5.i iVar = jz5.i.f302831f;
        this.f411771y = jz5.h.a(iVar, new sr2.q0(activity));
        this.f411772z = jz5.h.a(iVar, new sr2.r0(activity));
        this.A = jz5.h.a(iVar, new sr2.t0(activity));
        this.B = (int) activity.getResources().getDimension(com.tencent.mm.R.dimen.f479714d7);
        this.F = "";
        so2.p6 p6Var = so2.p6.f410541d;
    }

    public final void O6(java.lang.String str, java.lang.String str2) {
        java.lang.String sb6;
        int selectionStart = V6().getSelectionStart();
        java.lang.String obj = V6().getText().toString();
        com.tencent.mars.xlog.Log.i("Finder.PostEditUIC", "addTopicStr before start:" + selectionStart + " content:" + obj);
        int length = str2.length() > 0 ? selectionStart - str2.length() : 0;
        if (selectionStart == 0) {
            sb6 = str + obj;
        } else if (selectionStart == obj.length()) {
            if (length > 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.String substring = obj.substring(0, length);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                sb7.append(substring);
                sb7.append(str);
                java.lang.String substring2 = obj.substring(length + 1, obj.length());
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                sb7.append(substring2);
                sb6 = sb7.toString();
            } else {
                sb6 = obj + str;
            }
        } else if (length > 0) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.lang.String substring3 = obj.substring(0, length);
            kotlin.jvm.internal.o.f(substring3, "substring(...)");
            sb8.append(substring3);
            sb8.append(str);
            java.lang.String substring4 = obj.substring(length + 1, obj.length());
            kotlin.jvm.internal.o.f(substring4, "substring(...)");
            sb8.append(substring4);
            sb6 = sb8.toString();
        } else {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            java.lang.String substring5 = obj.substring(0, selectionStart);
            kotlin.jvm.internal.o.f(substring5, "substring(...)");
            sb9.append(substring5);
            sb9.append(str);
            java.lang.String substring6 = obj.substring(selectionStart, obj.length());
            kotlin.jvm.internal.o.f(substring6, "substring(...)");
            sb9.append(substring6);
            sb6 = sb9.toString();
        }
        this.f411769w = length > 0 ? length + str.length() : selectionStart + str.length();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity context = getContext();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, sb6);
        com.tencent.mars.xlog.Log.i("Finder.PostEditUIC", "addTopicStr after content:" + sb6 + " text:" + ((java.lang.Object) i17));
        V6().setText(i17);
        V6().requestFocus();
        V6().setSelection(this.f411769w);
    }

    public final void P6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.post.PostMainUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.post.PostMainUIC.class)).Z6();
    }

    public final void Q6(int i17) {
        if (!h7() || g7()) {
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126404c).getValue()).r()).intValue();
            boolean i76 = i7();
            com.tencent.mars.xlog.Log.i("Finder.PostEditUIC", "[checkShowShortTitle] textLimit=" + intValue + " textCount=" + i17 + " enableShortTitle=" + i76);
            jz5.g gVar = this.A;
            if (!i76) {
                if (l7()) {
                    ((ur2.v) gVar.getValue()).O6(false);
                    return;
                }
                android.widget.RelativeLayout relativeLayout = this.f411759m;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("shortTitleLayout");
                    throw null;
                }
            }
            if (l7()) {
                ((ur2.v) gVar.getValue()).O6(i17 > intValue);
                return;
            }
            if (i17 > intValue) {
                android.widget.RelativeLayout relativeLayout2 = this.f411759m;
                if (relativeLayout2 == null) {
                    kotlin.jvm.internal.o.o("shortTitleLayout");
                    throw null;
                }
                if (relativeLayout2.getVisibility() == 8) {
                    android.widget.RelativeLayout relativeLayout3 = this.f411759m;
                    if (relativeLayout3 == null) {
                        kotlin.jvm.internal.o.o("shortTitleLayout");
                        throw null;
                    }
                    relativeLayout3.setVisibility(0);
                    android.widget.RelativeLayout relativeLayout4 = this.f411759m;
                    if (relativeLayout4 != null) {
                        relativeLayout4.post(new sr2.x(this));
                    } else {
                        kotlin.jvm.internal.o.o("shortTitleLayout");
                        throw null;
                    }
                }
            }
        }
    }

    public final void R6(wl5.x xVar) {
        if (xVar != null) {
            xVar.k();
        }
        if (xVar != null) {
            xVar.M = true;
        }
        if (xVar != null) {
            xVar.N = true;
        }
        if (xVar != null) {
            xVar.i();
        }
    }

    public final com.tencent.mm.plugin.finder.assist.m0 S6(int i17, int i18) {
        java.lang.Object obj;
        java.util.Iterator it = d7().b().f400967c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.tencent.mm.plugin.finder.assist.m0 m0Var = (com.tencent.mm.plugin.finder.assist.m0) obj;
            if (i17 >= m0Var.f102375a && i18 <= m0Var.f102376b) {
                break;
            }
        }
        return (com.tencent.mm.plugin.finder.assist.m0) obj;
    }

    public final java.lang.String T6() {
        java.util.List<so2.n6> deleteList;
        if (!h7() || g7()) {
            return r26.n0.w0(V6().getText().toString()).toString();
        }
        java.lang.String obj = r26.n0.w0(U6().getText().toString()).toString();
        com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView = this.I;
        if (finderPostTextModifyView == null || (deleteList = finderPostTextModifyView.getDeleteList()) == null) {
            return obj;
        }
        for (so2.n6 n6Var : kz5.n0.F0(deleteList, new sr2.y())) {
            obj = r26.n0.X(obj, n6Var.f410503c, n6Var.f410504d).toString();
        }
        return obj;
    }

    public final android.widget.TextView U6() {
        android.widget.TextView textView = this.f411758i;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("descModTv");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderPostEditText V6() {
        com.tencent.mm.plugin.finder.view.FinderPostEditText finderPostEditText = this.f411754e;
        if (finderPostEditText != null) {
            return finderPostEditText;
        }
        kotlin.jvm.internal.o.o("descTv");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderPostFooter W6() {
        com.tencent.mm.plugin.finder.view.FinderPostFooter finderPostFooter = this.f411756g;
        if (finderPostFooter != null) {
            return finderPostFooter;
        }
        kotlin.jvm.internal.o.o("footer");
        throw null;
    }

    public final android.view.View X6() {
        android.view.View view = this.f411757h;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("footerContainer");
        throw null;
    }

    public final int Y6(int i17) {
        return (getActivity().findViewById(com.tencent.mm.R.id.jlt).getHeight() - i17) - W6().findViewById(com.tencent.mm.R.id.tca).getLayoutParams().height;
    }

    public final android.widget.ScrollView Z6() {
        return (android.widget.ScrollView) this.f411772z.getValue();
    }

    public final java.lang.String a7() {
        java.lang.String obj;
        java.lang.String obj2;
        if (h7() && !g7()) {
            java.lang.CharSequence text = b7().getText();
            if (text != null && (obj2 = text.toString()) != null) {
                return obj2;
            }
        } else if (i7() && l7()) {
            ur2.v vVar = (ur2.v) this.A.getValue();
            if (vVar.f430424d) {
                android.widget.TextView textView = vVar.f430427g;
                if (textView != null) {
                    return textView.getText().toString();
                }
                kotlin.jvm.internal.o.o("tvTitle");
                throw null;
            }
        } else {
            android.text.Editable text2 = c7().getText();
            if (text2 != null && (obj = text2.toString()) != null) {
                return obj;
            }
        }
        return "";
    }

    public final android.widget.TextView b7() {
        android.widget.TextView textView = this.f411764r;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("shortTitleModTv");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderPostEditText c7() {
        com.tencent.mm.plugin.finder.view.FinderPostEditText finderPostEditText = this.f411760n;
        if (finderPostEditText != null) {
            return finderPostEditText;
        }
        kotlin.jvm.internal.o.o("shortTitleTv");
        throw null;
    }

    public final rx2.u d7() {
        rx2.u uVar = this.f411768v;
        if (uVar != null) {
            return uVar;
        }
        kotlin.jvm.internal.o.o("styleManager");
        throw null;
    }

    public final wl5.x e7(android.widget.TextView textView, so2.p6 p6Var) {
        int dimensionPixelSize = (getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.u_) - ((int) ((textView.getPaint().getFontMetrics().bottom - textView.getPaint().getFontMetrics().top) / 4))) + getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        rl5.r rVar = new rl5.r(getContext(), textView);
        rVar.C = true;
        rVar.Q = false;
        rVar.f397355y = new sr2.z(this);
        rVar.f397354x = new sr2.a0(this, p6Var);
        rVar.L = sr2.b0.f411516d;
        wl5.o oVar = new wl5.o(textView, rVar, null, null, null);
        oVar.f447123g = com.tencent.mm.R.color.a3y;
        oVar.f447122f = com.tencent.mm.R.color.f478860j6;
        int i17 = -dimensionPixelSize;
        com.tencent.mm.ui.yk.a("SelectableTextHelper", "setMenuAdjustY:%s", java.lang.Integer.valueOf(i17));
        oVar.f447126j = i17;
        oVar.f447127k = false;
        wl5.x xVar = new wl5.x(oVar);
        xVar.C = textView.length();
        xVar.f447159d = new sr2.j0(this, xVar, textView, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), p6Var);
        return xVar;
    }

    public final void f7(android.view.View view, java.lang.String str, int i17) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, i17, 25496);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(view, new sr2.m0(this));
    }

    public final boolean g7() {
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.W).getValue()).r()).booleanValue();
    }

    public final boolean h7() {
        return 1 == this.E;
    }

    public final boolean i7() {
        return ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue() ? ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.V).getValue()).r()).booleanValue() && k7() : k7();
    }

    public final boolean k7() {
        ya2.b2 b17 = ya2.h.f460484a.b(xy2.c.e(getActivity()));
        long j17 = b17 != null ? b17.field_additionalFlag : 0L;
        com.tencent.mars.xlog.Log.i("Finder.PostEditUIC", "[isShortTitleEnable] additionalFlag=" + j17);
        return (j17 & 8) == 8;
    }

    public final boolean l7() {
        return ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue() && ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.V).getValue()).r()).booleanValue();
    }

    public final void m7(boolean z17) {
        android.view.View contentView;
        int[] iArr = new int[2];
        com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView = this.I;
        if (finderPostTextModifyView != null && (contentView = finderPostTextModifyView.getContentView()) != null) {
            contentView.getLocationInWindow(iArr);
        }
        int i17 = iArr[1];
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = (com.tencent.mm.plugin.finder.post.PostMainUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.post.PostMainUIC.class);
        int i18 = this.K;
        postMainUIC.getClass();
        android.graphics.Point point = new android.graphics.Point();
        postMainUIC.getActivity().getWindowManager().getDefaultDisplay().getSize(point);
        int dimensionPixelSize = postMainUIC.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        postMainUIC.P7((point.y - i17) + dimensionPixelSize);
        int i19 = (i18 - i17) + (dimensionPixelSize * 2);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "[checkBottomAndScroll] selectY:" + i18 + " bottomY:" + i17 + " offset:" + i19);
        if (z17) {
            android.view.View view = postMainUIC.f122516h;
            if (view != null) {
                view.post(new sr2.h3(postMainUIC, i19));
            } else {
                kotlin.jvm.internal.o.o("bottomSpace");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n7(java.lang.String oldStr, java.lang.String newStr, int i17, int i18, so2.p6 textType, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(oldStr, "oldStr");
        kotlin.jvm.internal.o.g(newStr, "newStr");
        kotlin.jvm.internal.o.g(textType, "textType");
        so2.p6 p6Var = so2.p6.f410542e;
        R6(textType == p6Var ? this.L : this.M);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.hideVKB();
        }
        android.widget.TextView U6 = textType == p6Var ? U6() : b7();
        float dimension = textType == p6Var ? getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479575r) : getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479850gz);
        java.lang.CharSequence text = U6.getText();
        if (z17) {
            android.text.SpannableString spannableString = text instanceof android.text.SpannableString ? (android.text.SpannableString) text : null;
            if (spannableString != null) {
                for (java.lang.Object obj : spannableString.getSpans(0, spannableString.length(), db5.g.class)) {
                    spannableString.removeSpan((db5.g) obj);
                }
            }
        }
        int length = i18 > text.length() ? text.length() : i18;
        com.tencent.mars.xlog.Log.i("Finder.PostEditUIC", "[onModify] text.length:" + text.length() + " oldStr:" + oldStr + " newStr:" + newStr + " start:" + i17 + " end:" + i18 + " realEnd:" + length + " isRevert:" + z17 + " isDelete:" + z18);
        java.lang.String obj2 = text.subSequence(0, i17).toString();
        java.lang.String obj3 = text.subSequence(length, text.length()).toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onModify] preStr:");
        sb6.append(obj2);
        sb6.append(" newStr:");
        sb6.append(newStr);
        sb6.append(" after:");
        sb6.append(obj3);
        com.tencent.mars.xlog.Log.i("Finder.PostEditUIC", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(obj2);
        sb7.append(newStr);
        sb7.append(obj3);
        java.lang.String element = sb7.toString();
        com.tencent.mars.xlog.Log.i("Finder.PostEditUIC", "[onModify] text:" + ((java.lang.Object) element));
        com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView = this.I;
        if (finderPostTextModifyView != null) {
            java.util.Iterator it = ((java.util.ArrayList) finderPostTextModifyView.c(textType)).iterator();
            while (it.hasNext()) {
                so2.n6 n6Var = (so2.n6) it.next();
                int color = n6Var.f410506f == so2.a.f410242f ? getContext().getResources().getColor(com.tencent.mm.R.color.Red_Alpha_0_3) : getContext().getResources().getColor(com.tencent.mm.R.color.a3y);
                kotlin.jvm.internal.o.f(element, "element");
                int i19 = n6Var.f410503c;
                int i27 = n6Var.f410504d;
                android.text.SpannableString spannableString2 = new android.text.SpannableString(element);
                spannableString2.setSpan(new db5.g(U6, color, i19, i27), i19, i27, 33);
                element = spannableString2;
            }
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        U6.setText(com.tencent.mm.pluginsdk.ui.span.c0.n(getContext(), element, dimension));
        if (z18) {
            com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView2 = this.I;
            if (finderPostTextModifyView2 != null) {
                finderPostTextModifyView2.post(new sr2.o0(this));
            }
            com.tencent.mars.xlog.Log.i("Finder.PostEditUIC", "[onModify] textAfterDelete:" + T6());
        }
    }

    public final void o7(int i17, android.content.Intent intent, boolean z17) {
        java.lang.String str;
        int length;
        int selectionEnd;
        com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView;
        if (intent != null) {
            boolean z18 = true;
            int intExtra = intent.getIntExtra("key_scene", 1);
            if (i17 != -1) {
                d7().b().d(0, "");
                if (intExtra == 2) {
                    java.lang.String obj = V6().getText().toString();
                    int selectionEnd2 = V6().getSelectionEnd();
                    if (selectionEnd2 > 0) {
                        int i18 = selectionEnd2 - 1;
                        boolean z19 = true;
                        while (i18 >= 0 && z19) {
                            if (V6().getText().toString().charAt(i18) == '@') {
                                i18--;
                            } else {
                                z19 = false;
                            }
                        }
                        int i19 = i18 + 1;
                        if (i19 > obj.length()) {
                            i19 = obj.length();
                        }
                        java.lang.String substring = obj.substring(0, i19);
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        java.lang.String substring2 = obj.substring(selectionEnd2, obj.length());
                        kotlin.jvm.internal.o.f(substring2, "substring(...)");
                        V6().setText(substring.concat(substring2));
                        V6().setSelection(i19);
                        return;
                    }
                    return;
                }
                return;
            }
            int intExtra2 = intent.getIntExtra("key_source", 2);
            byte[] byteArrayExtra = intent.getByteArrayExtra("key_select_contact");
            r45.gb4 gb4Var = null;
            if (byteArrayExtra != null) {
                try {
                    r45.gb4 gb4Var2 = new r45.gb4();
                    gb4Var2.parseFrom(byteArrayExtra);
                    gb4Var = gb4Var2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("Finder.PostEditUIC", "onActivityResult LocalFinderAtContact parseFrom:%s", e17.getMessage());
                }
            }
            rx2.d b17 = d7().b();
            if (gb4Var == null || (str = gb4Var.getString(2)) == null) {
                str = "";
            }
            b17.d(intExtra2, str);
            d7().b().a(gb4Var);
            if (gb4Var != null) {
                if (h7() && !g7()) {
                    java.lang.String string = gb4Var.getString(2);
                    if (string != null && string.length() != 0) {
                        z18 = false;
                    }
                    if (z18) {
                        return;
                    }
                    java.lang.String string2 = gb4Var.getString(2);
                    java.lang.String concat = "@".concat(string2 != null ? string2 : "");
                    if (kotlin.jvm.internal.o.b(concat, this.F) || (finderPostTextModifyView = this.I) == null) {
                        return;
                    }
                    finderPostTextModifyView.h(concat, this.F, this.G, this.H, so2.p6.f410542e, gb4Var);
                    return;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(gb4Var.getString(2))) {
                    return;
                }
                int selectionEnd3 = V6().getSelectionEnd();
                java.lang.String obj2 = V6().getText().toString();
                if (intExtra == 2 && (selectionEnd = V6().getSelectionEnd()) > 0) {
                    int i27 = selectionEnd - 1;
                    boolean z27 = true;
                    while (i27 >= 0 && z27) {
                        if (V6().getText().toString().charAt(i27) == '@') {
                            i27--;
                        } else {
                            z27 = false;
                        }
                    }
                    selectionEnd3 = i27 + 1;
                    if (selectionEnd3 > obj2.length()) {
                        selectionEnd3 = obj2.length();
                    }
                    java.lang.String substring3 = obj2.substring(0, selectionEnd3);
                    kotlin.jvm.internal.o.f(substring3, "substring(...)");
                    java.lang.String substring4 = obj2.substring(selectionEnd, obj2.length());
                    kotlin.jvm.internal.o.f(substring4, "substring(...)");
                    obj2 = substring3.concat(substring4);
                }
                if (selectionEnd3 > obj2.length()) {
                    selectionEnd3 = obj2.length();
                }
                java.lang.String substring5 = obj2.substring(0, selectionEnd3);
                kotlin.jvm.internal.o.f(substring5, "substring(...)");
                if (z17) {
                    substring5 = substring5.concat("@");
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(substring5);
                sb6.append(gb4Var.getString(2));
                sb6.append(' ');
                java.lang.String substring6 = obj2.substring(selectionEnd3, obj2.length());
                kotlin.jvm.internal.o.f(substring6, "substring(...)");
                sb6.append(substring6);
                java.lang.String sb7 = sb6.toString();
                if (z17) {
                    java.lang.String string3 = gb4Var.getString(2);
                    length = selectionEnd3 + (string3 != null ? string3.length() : 0) + 2;
                } else {
                    java.lang.String string4 = gb4Var.getString(2);
                    length = selectionEnd3 + (string4 != null ? string4.length() : 0) + 1;
                }
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity context = getContext();
                ((ke0.e) xVar).getClass();
                android.text.SpannableString i28 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, sb7);
                i28.toString();
                V6().setText(i28);
                V6().setSelection(length);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        d7();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        this.f411752J = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (!this.C) {
            java.lang.String stringExtra = getActivity().getIntent().getStringExtra("KEY_FINDER_POST_TOPIC_WORD");
            if (stringExtra == null) {
                stringExtra = "";
            }
            boolean booleanExtra = getActivity().getIntent().getBooleanExtra("KEY_FINDER_POST_IS_HIGHLIGHT_TOPIC", false);
            if ((stringExtra.length() > 0) && !booleanExtra) {
                O6("#".concat(stringExtra), "");
            }
        }
        this.C = true;
        this.f411752J = false;
    }

    public final sr2.v5 p7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(sr2.v5.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (sr2.v5) a17;
    }

    public final void q7(int i17) {
        if (i17 == 0) {
            int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.by);
            if (V6().getMaxHeight() < dimension || !((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue()) {
                V6().setMaxHeight(dimension);
                return;
            }
            return;
        }
        int i18 = com.tencent.mm.ui.bl.b(getContext()).y;
        int i19 = com.tencent.mm.ui.bl.i(getContext(), -1);
        android.view.View view = this.f411763q;
        if (view == null) {
            kotlin.jvm.internal.o.o("header");
            throw null;
        }
        int height = view.getHeight();
        android.view.View view2 = this.f411763q;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("header");
            throw null;
        }
        int b17 = height + com.tencent.mm.ui.kk.b(view2);
        android.view.View view3 = this.f411763q;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("header");
            throw null;
        }
        int a17 = b17 + com.tencent.mm.ui.kk.a(view3);
        int dimension2 = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479662c0);
        if (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue()) {
            V6().setMaxHeight(((i18 - i19) - a17) - dimension2);
            return;
        }
        float Y6 = ((Y6(i17) - Z6().getY()) - ((r0 * 2) + r0)) - ((int) getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.ur9);
        kotlin.jvm.internal.o.d(findViewById);
        if (findViewById.getVisibility() == 0) {
            Y6 -= this.B;
        }
        V6().setMaxHeight((int) Y6);
    }

    public final void r7(java.lang.String str) {
        android.view.View contentView;
        db5.d5 d5Var = this.f411770x;
        if (d5Var == null) {
            if (this.C) {
                this.f411770x = com.tencent.mm.ui.widget.dialog.y3.b(getActivity(), com.tencent.mm.R.layout.d1a, com.tencent.mm.R.raw.icons_outlined_info, getActivity().getResources().getColor(com.tencent.mm.R.color.f478491c), str, 0L);
                return;
            } else {
                c7().post(new sr2.v0(this, str));
                return;
            }
        }
        android.widget.TextView textView = (d5Var == null || (contentView = d5Var.getContentView()) == null) ? null : (android.widget.TextView) contentView.findViewById(com.tencent.mm.R.id.obb);
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        kotlin.jvm.internal.o.g(account, "account");
        Q6(this.D);
    }
}
