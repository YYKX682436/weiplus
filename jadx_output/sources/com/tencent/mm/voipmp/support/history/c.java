package com.tencent.mm.voipmp.support.history;

/* loaded from: classes8.dex */
public final class c extends in5.r {
    public c(yz5.p onClickTalker) {
        kotlin.jvm.internal.o.g(onClickTalker, "onClickTalker");
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ddn;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.voipmp.support.history.b item = (com.tencent.mm.voipmp.support.history.b) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.q1p);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
        java.lang.String str = item.f213762d;
        com.tencent.mm.pluginsdk.ui.u.b(weImageView, str, 0.1f, true);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.q1q)).setText(c01.a2.e(str));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.pxg);
        java.lang.String str2 = item.f213763e;
        textView.setVisibility((str2 == null || kotlin.jvm.internal.o.b(str2, "")) ? 8 : 0);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.pxg)).setText(holder.f293121e.getString(com.tencent.mm.R.string.f492322lf3, c01.a2.e(str2)));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
