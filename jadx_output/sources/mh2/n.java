package mh2;

/* loaded from: classes10.dex */
public final class n extends mh2.a {

    /* renamed from: c, reason: collision with root package name */
    public final ah2.f f326408c;

    /* renamed from: d, reason: collision with root package name */
    public final lj2.v0 f326409d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f326410e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f326411f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f326412g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f326413h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f326414i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f326415j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.TextView f326416k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f326417l;

    /* renamed from: m, reason: collision with root package name */
    public int f326418m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f326419n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, android.view.ViewGroup root, ah2.f contentService, lj2.v0 pluginAbility) {
        super(context, root);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(contentService, "contentService");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        this.f326408c = contentService;
        this.f326409d = pluginAbility;
        this.f326410e = "KTVFinishSingingWidget";
        android.view.View findViewById = this.f326292b.findViewById(com.tencent.mm.R.id.s_4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f326411f = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = this.f326292b.findViewById(com.tencent.mm.R.id.rp9);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f326412g = textView;
        android.view.View findViewById3 = this.f326292b.findViewById(com.tencent.mm.R.id.s97);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f326413h = textView2;
        android.view.View findViewById4 = this.f326292b.findViewById(com.tencent.mm.R.id.s98);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        this.f326414i = textView3;
        android.view.View findViewById5 = this.f326292b.findViewById(com.tencent.mm.R.id.rto);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
        this.f326415j = textView4;
        android.view.View findViewById6 = this.f326292b.findViewById(com.tencent.mm.R.id.rtp);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView5 = (android.widget.TextView) findViewById6;
        this.f326416k = textView5;
        android.view.View findViewById7 = this.f326292b.findViewById(com.tencent.mm.R.id.ulg);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f326417l = findViewById7;
        android.view.View findViewById8 = this.f326292b.findViewById(com.tencent.mm.R.id.uli);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.view.View findViewById9 = this.f326292b.findViewById(com.tencent.mm.R.id.ulh);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f326418m = -1;
        this.f326419n = "";
        com.tencent.mm.ui.fk.a(textView2);
        com.tencent.mm.ui.fk.a(textView3);
        com.tencent.mm.ui.fk.a(textView4);
        com.tencent.mm.ui.fk.a(textView5);
        com.tencent.mm.ui.fk.b((android.widget.TextView) findViewById9);
        com.tencent.mm.ui.fk.b((android.widget.TextView) findViewById8);
        com.tencent.mm.ui.fk.b(textView);
    }

    @Override // mh2.a
    public int a() {
        return com.tencent.mm.R.layout.drd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mh2.a
    public void c(om2.d0 singState) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.by1 by1Var;
        r45.ay1 ay1Var;
        r45.xn1 xn1Var;
        kotlin.jvm.internal.o.g(singState, "singState");
        this.f326418m = -1;
        this.f326419n = "";
        this.f326408c.b(new mh2.l(this));
        jz5.f0 f0Var = null;
        om2.c0 c0Var = singState instanceof om2.c0 ? (om2.c0) singState : null;
        lj2.v0 v0Var = this.f326409d;
        if (c0Var != null) {
            om2.o oVar = c0Var.f346280a;
            boolean z17 = oVar.f346366g;
            java.lang.String str = oVar.f346364e;
            android.content.Context context = this.f326291a;
            this.f326412g.setText(z17 ? context.getResources().getString(com.tencent.mm.R.string.ora, str) : context.getResources().getString(com.tencent.mm.R.string.mja, str));
            r45.xn1 xn1Var2 = oVar.f346361b;
            b(this.f326411f, xn1Var2 != null ? (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0) : null);
            f(c0Var.f346282c);
            java.lang.String str2 = this.f326410e;
            om2.o oVar2 = c0Var.f346281b;
            if (oVar2 != null) {
                java.lang.String str3 = oVar2.f346364e;
                boolean z18 = true;
                if (str3.length() > 0) {
                    r45.xn1 xn1Var3 = oVar2.f346361b;
                    finderContact = xn1Var3 != null ? (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0) : null;
                } else {
                    finderContact = null;
                    str3 = null;
                }
                if (finderContact == null) {
                    com.tencent.mm.plugin.finder.live.plugin.l lVar = v0Var instanceof com.tencent.mm.plugin.finder.live.plugin.l ? (com.tencent.mm.plugin.finder.live.plugin.l) v0Var : null;
                    if (lVar != null) {
                        java.util.List list = ((om2.g) lVar.P0(om2.g.class)).f346311r;
                        r45.yx1 yx1Var = list != null ? (r45.yx1) kz5.n0.a0(list, 1) : null;
                        com.tencent.mars.xlog.Log.i(str2, "state has no singer contact, fetch contact from LiveKTVSingSlice");
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (yx1Var == null || (xn1Var = yx1Var.f391463i) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
                        str3 = (yx1Var == null || (by1Var = yx1Var.f391466o) == null || (ay1Var = by1Var.f371143d) == null) ? null : ay1Var.f370351e;
                        finderContact = finderContact2;
                    }
                }
                if (str3 != null && str3.length() != 0) {
                    z18 = false;
                }
                jz5.f0 f0Var2 = jz5.f0.f302826a;
                if (z18) {
                    android.view.View view = this.f326417l;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View view2 = this.f326417l;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = this.f326417l;
                    android.widget.TextView textView = (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.ulh);
                    if (oVar.f346366g) {
                        textView.setText(context.getResources().getString(com.tencent.mm.R.string.ord, str3));
                    } else {
                        textView.setText(context.getResources().getString(com.tencent.mm.R.string.ore, str3));
                    }
                    android.widget.ImageView imageView = (android.widget.ImageView) view3.findViewById(com.tencent.mm.R.id.ulj);
                    if (finderContact != null) {
                        kotlin.jvm.internal.o.d(imageView);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(imageView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        imageView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        b(imageView, finderContact);
                        com.tencent.mars.xlog.Log.i(str2, "finish singing view show next song name:" + str3 + " singer:" + finderContact.getNickname());
                        f0Var = f0Var2;
                    }
                    if (f0Var == null) {
                        kotlin.jvm.internal.o.d(imageView);
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(imageView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        imageView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        com.tencent.mars.xlog.Log.w(str2, "finish singing view show next song name:" + str3 + " but singer contact is null");
                    }
                }
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                android.view.View view4 = this.f326417l;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/ktv/view/KTVFinishSingingWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/ktv/SingState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mars.xlog.Log.e(str2, "nextSongInfo is null");
            }
        }
        lj2.w0 f17 = v0Var.f();
        lj2.w0 w0Var = lj2.w0.f318959e;
        android.view.View view5 = this.f326292b;
        if (f17 == w0Var) {
            view5.setTranslationY(i65.a.b(view5.getContext(), 40));
        } else {
            view5.setTranslationY(0.0f);
        }
    }

    @Override // mh2.a
    public void d(r45.x84 ktvData) {
        kotlin.jvm.internal.o.g(ktvData, "ktvData");
        r45.ia4 ia4Var = ktvData.f389870i;
        if (ia4Var != null) {
            f(ia4Var);
        }
    }

    public final void f(r45.ia4 ia4Var) {
        com.tencent.mars.xlog.Log.i(this.f326410e, "total_score: " + ia4Var.f376875m + " level: " + ia4Var.f376876n);
        if (ia4Var.f376875m == this.f326418m && kotlin.jvm.internal.o.b(this.f326419n, ia4Var.f376876n)) {
            return;
        }
        pm0.v.X(new mh2.m(this, ia4Var));
    }
}
