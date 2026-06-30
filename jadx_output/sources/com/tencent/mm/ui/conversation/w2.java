package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class w2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final yf5.j0 f208211d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ListView f208212e;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.Activity f208213f;

    public w2(yf5.j0 j0Var, android.widget.ListView listView, android.app.Activity activity) {
        this.f208211d = j0Var;
        this.f208212e = listView;
        this.f208213f = activity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.storage.l4 l4Var;
        yf5.j0 j0Var = this.f208211d;
        android.widget.ListView listView = this.f208212e;
        if (i17 < listView.getHeaderViewsCount()) {
            return;
        }
        int headerViewsCount = i17 - listView.getHeaderViewsCount();
        try {
            l4Var = ((yf5.w0) j0Var).getItem(headerViewsCount);
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConversationClickListener", e17, "", new java.lang.Object[0]);
            l4Var = null;
        }
        if (l4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConversationClickListener", "null user at position = " + headerViewsCount);
            return;
        }
        if (view.getTag() instanceof yf5.n) {
            yf5.n nVar = (yf5.n) view.getTag();
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationClickListener", "[onItemClick] position:%s [%s,%s]", java.lang.Integer.valueOf(headerViewsCount), l4Var.h1(), nVar.f461926m);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(nVar.f461926m) && !java.util.Objects.equals(l4Var.h1(), nVar.f461926m)) {
                com.tencent.mm.storage.l4 h17 = ((yf5.w0) j0Var).h(nVar.f461926m);
                if (h17 != null) {
                    l4Var = h17;
                }
            }
        }
        com.tencent.mm.ui.conversation.u2.b(this.f208213f, view, l4Var, headerViewsCount, new com.tencent.mm.ui.conversation.v2(this));
    }
}
