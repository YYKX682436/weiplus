package i12;

/* loaded from: classes15.dex */
public class m extends j12.b {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f287223i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f287224m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f287225n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f287226o;

    public m(android.content.Context context, java.lang.String str) {
        super(context);
        this.f287223i = true;
        this.f287224m = true;
        this.f287225n = new java.util.LinkedList();
        this.f287226o = "";
        this.f287226o = str;
    }

    @Override // j12.b
    public void a() {
        super.a();
    }

    @Override // j12.b
    public int c() {
        return 0;
    }

    @Override // j12.b
    public int f() {
        return 0;
    }

    @Override // j12.b
    public boolean g(int i17) {
        return true;
    }

    @Override // j12.b
    public android.view.View j(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        boolean z17;
        r45.zj0 zj0Var;
        i12.l lVar = (i12.l) view.getTag();
        j12.i item = getItem(i17);
        if (lVar != null && item != null) {
            item.f297174i = this.f287224m;
            r45.kj0 kj0Var = item.f297169d;
            if (kj0Var == null) {
                lVar.k(0);
                z17 = false;
            } else {
                lVar.f287176h.setText(kj0Var.f378727e);
                lVar.j(kj0Var.f378733n);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(kj0Var.f378732m)) {
                    n11.a b17 = n11.a.b();
                    java.lang.String str = kj0Var.f378732m;
                    b17.h(str, lVar.f287174f, y12.f.b("", str));
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(kj0Var.f378735p)) {
                    lVar.f287175g.setVisibility(8);
                } else {
                    n11.a b18 = n11.a.b();
                    java.lang.String str2 = kj0Var.f378735p;
                    b18.h(str2, lVar.f287175g, y12.f.b("", str2));
                    lVar.f287175g.setVisibility(0);
                }
                lVar.k(8);
                z17 = true;
            }
            if (!z17 && (zj0Var = item.f297167b) != null) {
                lVar.f287176h.setText(zj0Var.f392130f);
                if (n22.l.c(zj0Var)) {
                    n11.a.b().g("", lVar.f287174f);
                    lVar.f287174f.setImageResource(com.tencent.mm.R.drawable.icon_002_cover);
                } else {
                    n11.a b19 = n11.a.b();
                    java.lang.String str3 = zj0Var.f392129e;
                    b19.h(str3, lVar.f287174f, y12.f.b(zj0Var.f392128d, str3));
                }
                boolean b27 = j12.g.b(zj0Var.f392134m, 2);
                if (!android.text.TextUtils.isEmpty(zj0Var.f392146y)) {
                    lVar.f287175g.setImageDrawable(null);
                    lVar.f287175g.setVisibility(0);
                    n11.a b28 = n11.a.b();
                    java.lang.String str4 = zj0Var.f392146y;
                    b28.h(str4, lVar.f287175g, y12.f.b("", str4));
                } else if (b27) {
                    lVar.f287175g.setVisibility(0);
                    lVar.f287175g.setImageResource(com.tencent.mm.R.drawable.bhy);
                } else {
                    lVar.f287175g.setVisibility(8);
                }
                android.view.View view2 = lVar.f287177i;
                int i18 = ((java.util.LinkedList) this.f287225n).contains(zj0Var.f392128d) ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreMainAdapter", "getItemView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreMainAdapter", "getItemView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                lVar.j(!com.tencent.mm.sdk.platformtools.t8.K0(zj0Var.f392147z) ? zj0Var.f392147z : zj0Var.f392145x);
                java.lang.String str5 = this.f287226o;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                    android.view.View view3 = lVar.A;
                    aVar.pk(view3, "emoticon_album_cell");
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(view3, 40, 10, false);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(lVar.f287183o, "emoticon_album_cell_add");
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(lVar.f287183o, 8, 10, false);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("pid", zj0Var.f392128d);
                    hashMap.put("emoticon_type", 2);
                    hashMap.put("emoticon_enter_scene", 0);
                    hashMap.put("pos_id", java.lang.Integer.valueOf(i17));
                    hashMap.put("requestid", str5);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(view3, hashMap);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(lVar.f287183o, hashMap);
                }
            }
        }
        return view;
    }

    @Override // j12.b
    public int k() {
        return 0;
    }

    @Override // j12.b
    public i12.c l(android.content.Context context, android.view.View view) {
        i12.l lVar = new i12.l(this, context, view);
        com.tencent.mm.plugin.emoji.model.h0 h0Var = this.f297153f;
        com.tencent.mm.ui.widget.button.WeButton weButton = lVar.f287183o;
        if (weButton != null) {
            weButton.setOnClickListener(new i12.a(lVar, h0Var));
        }
        com.tencent.mm.ui.widget.button.WeButton weButton2 = lVar.f287185q;
        if (weButton2 != null) {
            weButton2.setOnClickListener(new i12.b(lVar, h0Var));
        }
        return lVar;
    }

    @Override // j12.b
    public void o(int i17) {
    }

    @Override // j12.b
    public void p(int i17) {
    }

    @Override // j12.b
    public void q(int i17) {
    }

    public m(android.content.Context context) {
        super(context);
        this.f287223i = true;
        this.f287224m = true;
        this.f287225n = new java.util.LinkedList();
        this.f287226o = "";
    }
}
