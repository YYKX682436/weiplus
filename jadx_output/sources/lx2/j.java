package lx2;

/* loaded from: classes2.dex */
public final class j extends lx2.d {

    /* renamed from: k, reason: collision with root package name */
    public final r45.f03 f322069k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f322070l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f322071m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f322072n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f322073o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f322074p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView tipsLayout, r45.f03 f03Var) {
        super(tipsLayout);
        kotlin.jvm.internal.o.g(tipsLayout, "tipsLayout");
        this.f322069k = f03Var;
        this.f322070l = "personal_center_bubble";
        this.f322071m = "TLPersonalCenter";
        this.f322072n = "PersonalTipsBubbleViewHelper";
        this.f322073o = jz5.h.b(new lx2.h(this));
        this.f322074p = jz5.h.b(lx2.i.f322068d);
    }

    @Override // lx2.d
    public r45.qt2 c() {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((jz5.n) this.f322054e).getValue()).V6();
    }

    @Override // lx2.d
    public java.lang.String d() {
        return this.f322071m;
    }

    @Override // lx2.d
    public java.lang.String e() {
        return this.f322070l;
    }

    @Override // lx2.d
    public java.lang.String f() {
        return this.f322072n;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036  */
    @Override // lx2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx2.j.h():void");
    }

    @Override // lx2.d
    public void i(android.view.View arrow, android.widget.LinearLayout.LayoutParams arrowParams, android.widget.FrameLayout.LayoutParams tipsParams) {
        kotlin.jvm.internal.o.g(arrow, "arrow");
        kotlin.jvm.internal.o.g(arrowParams, "arrowParams");
        kotlin.jvm.internal.o.g(tipsParams, "tipsParams");
        arrowParams.rightMargin = (int) this.f322052c.getDimension(com.tencent.mm.R.dimen.afe);
        arrowParams.gravity = 8388613;
        tipsParams.gravity = 8388661;
        tipsParams.rightMargin = (int) this.f322051b.getResources().getDimension(com.tencent.mm.R.dimen.f479629b4);
        super.i(arrow, arrowParams, tipsParams);
    }

    @Override // lx2.d
    public com.tencent.mm.plugin.finder.view.jb j(r45.px2 px2Var, java.lang.ref.WeakReference weakReference) {
        java.lang.String str;
        r45.f03 f03Var;
        r45.f03 f03Var2;
        r45.ya0 ya0Var;
        r45.fz2 fz2Var;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127885pg).getValue()).r()).booleanValue();
        if (booleanValue && px2Var != null && (f03Var2 = (r45.f03) px2Var.getCustom(1)) != null && (ya0Var = f03Var2.B) != null && (fz2Var = ya0Var.f390918d) != null && (linkedList = fz2Var.f374741d) != null) {
            java.util.ArrayList<r45.cp5> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList) {
                int i17 = ((r45.cp5) obj).f371768d;
                if (i17 == 1 || i17 == 2) {
                    arrayList.add(obj);
                }
            }
            for (r45.cp5 cp5Var : arrayList) {
                r45.yo5 yo5Var = cp5Var.f371770f;
                if (yo5Var == null) {
                    yo5Var = new r45.yo5();
                    cp5Var.f371770f = yo5Var;
                }
                r45.t60 t60Var = yo5Var.f391261d;
                if (t60Var == null) {
                    t60Var = new r45.t60();
                    yo5Var.f391261d = t60Var;
                }
                r45.zo5 zo5Var = new r45.zo5();
                zo5Var.f392253d = "#FFFFFFFF";
                t60Var.f386167e = zo5Var;
            }
        }
        com.tencent.mm.plugin.finder.view.jb j17 = super.j(px2Var, weakReference);
        if (!booleanValue) {
            return j17;
        }
        com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = this.f322050a;
        android.view.View findViewById = finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.oa8);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.f484136d52);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.ovk);
        java.util.Iterator it = kz5.c0.i(findViewById, frameLayout).iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).setBackgroundResource(com.tencent.mm.R.drawable.d4r);
        }
        weImageView.setIconColor(this.f322051b.getResources().getColor(com.tencent.mm.R.color.f478493e));
        if (j17 == com.tencent.mm.plugin.finder.view.jb.f132433e) {
            frameLayout.setVisibility(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/helper/PersonalTipsBubbleViewHelper", "renderBubble", "(Lcom/tencent/mm/protocal/protobuf/FinderStreamTipsShowInfo;Ljava/lang/ref/WeakReference;)Lcom/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$RenderType;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/helper/PersonalTipsBubbleViewHelper", "renderBubble", "(Lcom/tencent/mm/protocal/protobuf/FinderStreamTipsShowInfo;Ljava/lang/ref/WeakReference;)Lcom/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$RenderType;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return j17;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/helper/PersonalTipsBubbleViewHelper", "renderBubble", "(Lcom/tencent/mm/protocal/protobuf/FinderStreamTipsShowInfo;Ljava/lang/ref/WeakReference;)Lcom/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$RenderType;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/helper/PersonalTipsBubbleViewHelper", "renderBubble", "(Lcom/tencent/mm/protocal/protobuf/FinderStreamTipsShowInfo;Ljava/lang/ref/WeakReference;)Lcom/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$RenderType;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        frameLayout.setVisibility(8);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.geh);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.oag);
        android.widget.ImageView imageView = (android.widget.ImageView) finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.gex);
        android.widget.ImageView imageView2 = (android.widget.ImageView) finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.gey);
        android.widget.ImageView imageView3 = (android.widget.ImageView) finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.gez);
        imageView.setVisibility(8);
        imageView2.setVisibility(8);
        imageView3.setVisibility(8);
        weImageView2.setVisibility(8);
        linearLayout.setBackground(null);
        android.widget.TextView textView = (android.widget.TextView) finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.f487334ob5);
        if (px2Var == null || (f03Var = (r45.f03) px2Var.getCustom(1)) == null || (str = f03Var.f373889f) == null) {
            str = "";
        }
        textView.setText(str);
        textView.setTextColor(-1);
        return j17;
    }
}
