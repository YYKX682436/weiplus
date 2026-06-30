package hf2;

/* loaded from: classes10.dex */
public final class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.l2 f281096d;

    public k2(hf2.l2 l2Var) {
        this.f281096d = l2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String string;
        java.util.LinkedList linkedList;
        r45.ji0 ji0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextPanelWidget$init$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hf2.l2 l2Var = this.f281096d;
        r45.ei0 ei0Var = l2Var.f281104a.f281185q;
        java.lang.String str2 = (ei0Var == null || (linkedList = ei0Var.f373529d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) == null) ? null : ji0Var.f377829n;
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        hf2.x xVar = l2Var.f281104a;
        hf2.f1 f1Var = (hf2.f1) ((jz5.n) xVar.B).getValue();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 18);
        jSONObject.put("sub_type", 1);
        jSONObject.put("word_txt", str2);
        r45.h84 h84Var = xVar.f281186r;
        if (h84Var == null || (str = h84Var.getString(0)) == null) {
            str = "";
        }
        jSONObject.put("word_template_id", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        f1Var.b(jSONObject2);
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ANCHOR_STICKER_LAST_TEXT_ID_STRING_SYNC;
        r45.h84 h84Var2 = xVar.f281186r;
        if (h84Var2 != null && (string = h84Var2.getString(0)) != null) {
            str3 = string;
        }
        c17.x(u3Var, str3);
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = l2Var.f281107d;
        if (liveBottomSheetPanel != null) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
        }
        qc0.g1 g1Var = xVar.f7().f281072c;
        if (g1Var != null) {
            qc0.g1.a(g1Var, null, 1, null);
        }
        xVar.m7("PanelConfirm");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextPanelWidget$init$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
