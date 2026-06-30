package mi5;

/* loaded from: classes9.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.s0 f326908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l15.c f326910f;

    public r0(mi5.s0 s0Var, android.content.Context context, l15.c cVar) {
        this.f326908d = s0Var;
        this.f326909e = context;
        this.f326910f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String j17;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String l17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingUrlView$onUpdateViewModel$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f326909e;
        kotlin.jvm.internal.o.f(context, "$context");
        this.f326908d.getClass();
        v05.b k17 = this.f326910f.k();
        if (k17 != null) {
            int i17 = k17.f368365d;
            int integer = k17.getInteger(i17 + 6);
            str = "";
            int i18 = k17.f432315e;
            if (integer == 15) {
                r05.e eVar = (r05.e) k17.getCustom(i18 + 19);
                if (eVar != null && (j17 = eVar.j()) != null) {
                    str = j17;
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    str = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).P(k17.getString(i17 + 9));
                    kotlin.jvm.internal.o.f(str, "getProductIdByUrl(...)");
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", k17.getString(i17 + 9));
                    intent.putExtra("showShare", false);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                } else {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    qk.c0 c0Var = new qk.c0(str);
                    c0Var.f364155a = 22;
                    c0Var.f364198g = 122;
                    com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
                    if (p6Var == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ForwardChattingItemClickHelper", "emoticon liteapp service not found");
                    } else {
                        ((com.tencent.mm.feature.emoji.f4) p6Var).wi(context, c0Var);
                    }
                }
            } else if (integer == 25) {
                int i19 = i18 + 20;
                r05.b bVar = (r05.b) k17.getCustom(i19);
                int l18 = bVar != null ? bVar.l() : 0;
                r05.b bVar2 = (r05.b) k17.getCustom(i19);
                if (bVar2 == null || (str2 = bVar2.j()) == null) {
                    str2 = "";
                }
                r05.b bVar3 = (r05.b) k17.getCustom(i19);
                if (bVar3 == null || (str3 = bVar3.k()) == null) {
                    str3 = "";
                }
                if (l18 != 0) {
                    qk.v vVar = new qk.v();
                    java.lang.String string = k17.getString(i17 + 9);
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    vVar.f364040t = string != null ? string : "";
                    vVar.f364027g = com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(l18));
                    vVar.f364030j = str2;
                    vVar.f364036p = str3;
                    vVar.f364155a = 22;
                    vVar.f364035o = true;
                    vVar.f364156b = true;
                    vVar.f364043w = true;
                    com.tencent.mm.feature.emoji.api.q6 q6Var = (com.tencent.mm.feature.emoji.api.q6) i95.n0.c(com.tencent.mm.feature.emoji.api.q6.class);
                    if (q6Var == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ForwardChattingItemClickHelper", "emoticon page service not found");
                    } else {
                        ((com.tencent.mm.feature.emoji.h4) q6Var).wi(context, vVar);
                    }
                }
            } else if (integer != 97) {
                java.lang.String string2 = k17.getString(i17 + 9);
                if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ForwardChattingItemClickHelper", "open Url but url is Empty: " + k17.toXml());
                } else {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", string2);
                    intent2.putExtra("showShare", false);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent2, null);
                }
            } else {
                java.lang.String string3 = k17.getString(i17 + 2);
                if (string3 == null) {
                    string3 = "";
                }
                java.lang.String string4 = k17.getString(i17 + 3);
                if (string4 == null) {
                    string4 = "";
                }
                int i27 = i18 + 21;
                r05.d dVar = (r05.d) k17.getCustom(i27);
                if (dVar == null || (str4 = dVar.getIconUrl()) == null) {
                    str4 = "";
                }
                r05.d dVar2 = (r05.d) k17.getCustom(i27);
                if (dVar2 != null && (l17 = dVar2.l()) != null) {
                    str = l17;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ForwardChattingItemClickHelper", "setKey is null.");
                } else {
                    r45.vd0 vd0Var = new r45.vd0();
                    vd0Var.f388134d = str;
                    vd0Var.f388136f = string3;
                    vd0Var.f388137g = string4;
                    vd0Var.f388135e = str4;
                    qk.a0 a0Var = new qk.a0(vd0Var);
                    com.tencent.mm.feature.emoji.api.p6 p6Var2 = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
                    if (p6Var2 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ForwardChattingItemClickHelper", "unable to get emoticon liteapp feature service");
                    } else {
                        ((com.tencent.mm.feature.emoji.f4) p6Var2).wi(context, a0Var);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingUrlView$onUpdateViewModel$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
