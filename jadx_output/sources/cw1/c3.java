package cw1;

/* loaded from: classes8.dex */
public final class c3 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseConvUI f222849d;

    public c3(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseConvUI cleanChattingChooseConvUI) {
        this.f222849d = cleanChattingChooseConvUI;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f222849d.f95720d;
        if (list != null) {
            return list.size();
        }
        kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        throw null;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String e17;
        cw1.e3 holder = (cw1.e3) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseConvUI cleanChattingChooseConvUI = this.f222849d;
        java.util.List list = cleanChattingChooseConvUI.f95720d;
        if (list == null) {
            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            throw null;
        }
        jz5.l lVar = (jz5.l) ((java.util.ArrayList) list).get(i17);
        holder.itemView.setTag(lVar);
        java.lang.String str = (java.lang.String) lVar.f302833d;
        long longValue = ((java.lang.Number) lVar.f302834e).longValue();
        android.view.View view = holder.f222904h;
        int i18 = i17 == 0 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$Adapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$Adapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(holder.f222900d, str, null);
        if (com.tencent.mm.storage.z3.R4(str)) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            e17 = c01.a2.f(str, str);
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            e17 = c01.a2.e(str);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView = holder.f222901e;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(cleanChattingChooseConvUI, e17, textSize));
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(str, longValue);
        ((bt.p0) ((com.tencent.mm.storage.h8) i95.n0.c(com.tencent.mm.storage.h8.class))).getClass();
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        if (w7Var.f53904d == null) {
            w7Var.f53904d = new com.tencent.mm.app.u7(w7Var);
        }
        com.tencent.mm.storage.g8 g8Var = w7Var.f53904d;
        int A0 = n17.A0();
        java.lang.String j17 = n17.j();
        int type = n17.getType();
        ((com.tencent.mm.app.u7) g8Var).getClass();
        holder.f222902f.setText(qm.a0.l(A0, str, j17, type, cleanChattingChooseConvUI));
        holder.f222903g.setText(k35.m1.f(cleanChattingChooseConvUI, n17.getCreateTime(), true, false));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.b0n, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new cw1.e3(this.f222849d, inflate);
    }
}
