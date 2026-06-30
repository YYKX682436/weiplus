package df2;

/* loaded from: classes3.dex */
public final class pk extends if2.b implements if2.e {
    public android.view.View A;
    public android.widget.EditText B;
    public android.view.View C;
    public android.view.View D;
    public com.tencent.mm.ui.tools.f5 E;
    public final jz5.g F;
    public final jz5.g G;
    public android.view.ViewGroup H;
    public ce2.i I;

    /* renamed from: J, reason: collision with root package name */
    public ce2.i f231072J;
    public java.util.List K;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231073m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f231074n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f231075o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f231076p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f231077q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f231078r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.reward.view.MagicRewardView f231079s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f231080t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f231081u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f231082v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f231083w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveCustomGiftTagView f231084x;

    /* renamed from: y, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f231085y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f231086z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231073m = "LiveGiftCustomGiftController";
        this.F = jz5.h.b(df2.mk.f230785d);
        this.G = jz5.h.b(df2.nk.f230863d);
    }

    public static final void i7(android.widget.EditText editText, df2.pk pkVar) {
        android.text.Editable text;
        if (((editText == null || (text = editText.getText()) == null) ? 0 : text.length()) <= 0) {
            android.view.View view = pkVar.C;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "showCustomTextEditorInput$checkDeleteBtnVisibility", "(Landroid/widget/EditText;Lcom/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "showCustomTextEditorInput$checkDeleteBtnVisibility", "(Landroid/widget/EditText;Lcom/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = pkVar.C;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "showCustomTextEditorInput$checkDeleteBtnVisibility", "(Landroid/widget/EditText;Lcom/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "showCustomTextEditorInput$checkDeleteBtnVisibility", "(Landroid/widget/EditText;Lcom/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean Z6(java.lang.String str, ce2.i iVar, ce2.i iVar2) {
        r45.na0 D0;
        java.util.LinkedList<r45.ma0> list;
        r45.na0 D02;
        java.util.LinkedList list2;
        java.lang.Object obj;
        if (iVar2 != null && (D0 = iVar2.D0()) != null && (list = D0.getList(0)) != null) {
            for (r45.ma0 ma0Var : list) {
                if (iVar != null && (D02 = iVar.D0()) != null && (list2 = D02.getList(0)) != null) {
                    java.util.Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(((r45.ma0) obj).getString(4), ma0Var.getString(4))) {
                            break;
                        }
                    }
                    r45.ma0 ma0Var2 = (r45.ma0) obj;
                    if (ma0Var2 != null && !kotlin.jvm.internal.o.b(ma0Var2.getString(2), ma0Var.getString(2))) {
                        com.tencent.mars.xlog.Log.i(this.f231073m, str + " component " + ma0Var.getString(0) + ' ' + ma0Var.getString(4) + " change from $" + ma0Var2.getString(2) + " to " + ma0Var.getString(2) + '!');
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean a7(ce2.i iVar, ce2.i iVar2) {
        java.lang.String str;
        r45.na0 D0;
        r45.pa0 pa0Var;
        r45.na0 D02;
        java.lang.String str2 = null;
        r45.pa0 pa0Var2 = (iVar2 == null || (D02 = iVar2.D0()) == null) ? null : (r45.pa0) D02.getCustom(1);
        if (pa0Var2 != null && pa0Var2.getBoolean(0)) {
            if (pa0Var2 == null || (str = pa0Var2.getString(3)) == null) {
                str = "";
            }
            if (iVar != null && (D0 = iVar.D0()) != null && (pa0Var = (r45.pa0) D0.getCustom(1)) != null) {
                java.lang.String string = pa0Var.getString(3);
                str2 = string == null ? "" : string;
            }
            if (!kotlin.jvm.internal.o.b(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String b7(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append(ya.b.INDEX + i17 + ',' + pm0.b0.g((r45.ma0) obj) + '\n');
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.d(sb7);
        return sb7;
    }

    public final java.util.ArrayList c7() {
        return (java.util.ArrayList) ((jz5.n) this.G).getValue();
    }

    public final void d7(android.widget.EditText editText) {
        android.content.Context context;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
        }
        android.view.View view = this.f231077q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "hideCustomTextEditorInput", "(Landroid/widget/EditText;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "hideCustomTextEditorInput", "(Landroid/widget/EditText;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f231086z;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "hideCustomTextEditorInput", "(Landroid/widget/EditText;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "hideCustomTextEditorInput", "(Landroid/widget/EditText;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void e7() {
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView = this.f231079s;
        if (magicRewardView != null) {
            magicRewardView.h();
        }
        this.f231074n = null;
        this.f231075o = null;
        this.f231078r = null;
        this.f231079s = null;
        this.f231080t = null;
        this.f231081u = null;
        this.f231082v = null;
        this.f231083w = null;
        this.f231084x = null;
        this.f231085y = null;
        this.f231086z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        ((kotlinx.coroutines.flow.h3) ((je2.t) business(je2.t.class)).f299267m).k(java.lang.Boolean.FALSE);
        c7().clear();
        bm2.a2 a2Var = (bm2.a2) ((jz5.n) this.F).getValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("release:");
        java.util.ArrayList arrayList = a2Var.f21759e;
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i(a2Var.f21758d, sb6.toString());
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    public final void f7(java.lang.String str) {
        ce2.i iVar = this.f231072J;
        r45.na0 D0 = iVar != null ? iVar.D0() : null;
        float a17 = ce2.i.U1.a(str, D0 != null ? D0.getList(0) : null, D0 != null ? (r45.pa0) D0.getCustom(1) : null);
        ce2.i iVar2 = this.f231072J;
        float f17 = (iVar2 != null ? iVar2.field_price : 0.0f) + a17;
        com.tencent.mars.xlog.Log.i(this.f231073m, str + " setCustomGiftPrice totalPrice:" + f17 + ",componentPrice:" + a17);
        android.widget.TextView textView = this.f231081u;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf((int) f17));
        }
        if (f17 <= 0.0f) {
            android.view.ViewGroup viewGroup = this.f231080t;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            android.view.ViewGroup viewGroup2 = this.f231082v;
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.setVisibility(4);
            return;
        }
        android.view.ViewGroup viewGroup3 = this.f231080t;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
        if (a17 <= 0.0f) {
            android.view.ViewGroup viewGroup4 = this.f231082v;
            if (viewGroup4 == null) {
                return;
            }
            viewGroup4.setVisibility(4);
            return;
        }
        android.widget.TextView textView2 = this.f231083w;
        if (textView2 != null) {
            textView2.setText(java.lang.String.valueOf((int) a17));
        }
        android.view.ViewGroup viewGroup5 = this.f231082v;
        if (viewGroup5 == null) {
            return;
        }
        viewGroup5.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g7(android.view.View r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.pk.g7(android.view.View, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h7(ce2.i r25, android.view.ViewGroup r26) {
        /*
            Method dump skipped, instructions count: 1667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.pk.h7(ce2.i, android.view.ViewGroup):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        com.tencent.mars.xlog.Log.i(this.f231073m, "onLiveActivate");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        ((kotlinx.coroutines.flow.h3) ((je2.t) business(je2.t.class)).f299267m).k(java.lang.Boolean.FALSE);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        release();
        this.H = null;
        je2.t tVar = (je2.t) business(je2.t.class);
        java.lang.String source = this.f231073m + "_onViewUnmount";
        tVar.getClass();
        kotlin.jvm.internal.o.g(source, "source");
        it2.z zVar = tVar.f299266i;
        if (zVar != null) {
            zVar.b(source, kt2.c.f311972e);
        }
    }

    public final void release() {
        e7();
        this.I = null;
        this.f231072J = null;
        com.tencent.mm.ui.tools.f5 f5Var = this.E;
        if (f5Var != null) {
            f5Var.d();
        }
        this.E = null;
        this.K = null;
    }
}
