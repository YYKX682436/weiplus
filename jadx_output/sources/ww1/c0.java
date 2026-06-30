package ww1;

/* loaded from: classes15.dex */
public class c0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f450160d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f450161e;

    /* renamed from: f, reason: collision with root package name */
    public final int f450162f;

    public c0(android.content.Context context, int i17) {
        this.f450160d = context;
        this.f450162f = i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f450161e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ww1.a0 a0Var = (ww1.a0) k3Var;
        java.util.List list = this.f450161e;
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return;
        }
        ww1.b0 b0Var = (ww1.b0) this.f450161e.get(i17);
        android.content.Context context = this.f450160d;
        int b17 = i65.a.b(context, 16);
        int b18 = i65.a.b(context, 18);
        if (i17 == this.f450161e.size() - 1) {
            a0Var.f450080d.setPadding(b17, b18, b17, b18);
            a0Var.f450080d.setBackgroundResource(com.tencent.mm.R.drawable.f481281pd);
        } else {
            a0Var.f450080d.setPadding(b17, b18, b17, 0);
            a0Var.f450080d.setBackgroundResource(com.tencent.mm.R.color.f478553an);
        }
        android.view.View view = a0Var.f450080d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/collect/model/CollectQrcodePayerMsgAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/CollectQrcodePayerMsgAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/collect/model/CollectQrcodePayerMsgAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/CollectQrcodePayerMsgAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i18 = this.f450162f;
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = a0Var.f450082f;
        if (i18 == 2) {
            cdnImageView.setRoundCorner(true);
            cdnImageView.setRoundCornerRate(0.1f);
            cdnImageView.b(b0Var.f450206r, 0, 0, com.tencent.mm.R.drawable.bhm);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(b0Var.f450195d)) {
            cdnImageView.setVisibility(8);
        } else {
            cdnImageView.setVisibility(0);
            gm0.j1.i();
            com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(b0Var.f450195d);
            if (f07 == null || ((int) f07.E2) <= 0) {
                ((c01.k7) c01.n8.a()).b(b0Var.f450195d, 4, new ww1.z(this, java.lang.System.currentTimeMillis(), a0Var, b0Var));
            } else {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(cdnImageView, b0Var.f450195d, null);
            }
        }
        java.lang.String str = b0Var.f450202n;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(b0Var.f450195d)) {
            str = com.tencent.mm.wallet_core.ui.r1.x(b0Var.f450195d);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView = a0Var.f450081e;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        int i19 = b0Var.f450201m;
        a0Var.f450083g.setText(i19 != 0 ? i19 != 1 ? i19 != 2 ? "" : context.getString(com.tencent.mm.R.string.b_f) : b0Var.f450117s ? com.tencent.mm.wallet_core.ui.r1.n(b0Var.f450197f, b0Var.f450198g) : context.getString(com.tencent.mm.R.string.b_g) : context.getString(com.tencent.mm.R.string.b_i));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new ww1.a0(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f488650zk, viewGroup, false));
    }
}
