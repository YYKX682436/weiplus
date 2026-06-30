package oi4;

/* loaded from: classes9.dex */
public final class g extends oi4.n {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.czo;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        kj4.b item = (kj4.b) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        n73.e eVar = (n73.e) i95.n0.c(n73.e.class);
        pj4.b2 b2Var = item.f308453e;
        com.tencent.mm.storage.z3 wi6 = ((m73.q) eVar).wi(b2Var.f354997f, 1);
        android.content.Context context = holder.f293121e;
        this.f345646f = context;
        if (wi6 == null || !wi6.r2()) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.oog)).setText(b2Var.f354995d);
            n11.a.b().g(b2Var.f354996e, (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hke));
            holder.itemView.setOnClickListener(null);
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.oog)).setText(((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ai((android.widget.TextView) holder.p(com.tencent.mm.R.id.oog), wi6.d1(), ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, wi6.g2(), i65.a.h(context, com.tencent.mm.R.dimen.f479897ia)), bi4.c.CONVERSATION_LIST, i65.a.h(context, com.tencent.mm.R.dimen.f479897ia)));
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) holder.p(com.tencent.mm.R.id.hke), wi6.d1(), null);
            holder.itemView.setOnClickListener(new oi4.f(wi6, holder, item, this));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.haq);
        android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_like);
        com.tencent.mm.ui.uk.f(drawable, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478714f5));
        imageView.setImageDrawable(drawable);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.oqb)).setText(k35.m1.f(context, b2Var.f354999h * 1000, true, false));
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.jue)).setVisibility(4);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // oi4.n
    public void n(java.lang.String userName, mj4.h textStatusItem, java.lang.String str) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(textStatusItem, "textStatusItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.CommentHistoryItemConvert", "goToShowTextStatusActivity: id:" + ((mj4.k) textStatusItem).l() + " userName:" + userName + " refCommentId:" + str);
        android.content.Context context = this.f345646f;
        if (context != null) {
            com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173693f.b(context, userName, textStatusItem);
        }
    }
}
