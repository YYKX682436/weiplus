package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class AppGrid extends android.widget.GridView {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.f f189912d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f189913e;

    /* renamed from: f, reason: collision with root package name */
    public int f189914f;

    /* renamed from: g, reason: collision with root package name */
    public int f189915g;

    /* renamed from: h, reason: collision with root package name */
    public int f189916h;

    /* renamed from: i, reason: collision with root package name */
    public int f189917i;

    /* renamed from: m, reason: collision with root package name */
    public int f189918m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.c f189919n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.SharedPreferences f189920o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.ref.WeakReference f189921p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f189922q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f189923r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemLongClickListener f189924s;

    public AppGrid(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f189915g = 0;
        this.f189916h = 0;
        this.f189921p = null;
        this.f189923r = new com.tencent.mm.pluginsdk.ui.chat.a(this);
        this.f189924s = new com.tencent.mm.pluginsdk.ui.chat.b(this);
        this.f189913e = context;
    }

    public static com.tencent.mm.pluginsdk.ui.chat.y b(com.tencent.mm.pluginsdk.ui.chat.x xVar) {
        if (xVar == null) {
            return null;
        }
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        return "zh_CN".equals(d17) ? xVar.f190722p2 : "zh_TW".equals(d17) ? xVar.f190724r2 : "zh_HK".equals(d17) ? xVar.f190723q2 : xVar.f190725s2;
    }

    public void c() {
        if (this.f189919n != null) {
            for (final int i17 = 0; i17 < getChildCount(); i17++) {
                final android.view.View childAt = getChildAt(i17);
                if (childAt != null) {
                    final com.tencent.mm.pluginsdk.ui.chat.c cVar = this.f189919n;
                    int i18 = com.tencent.mm.pluginsdk.ui.chat.c.f190202m;
                    cVar.getClass();
                    if (!(j62.e.g().i("clicfg_disable_attachment_rpt", 0, true, true) != 0)) {
                        childAt.post(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.chat.c$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.pluginsdk.ui.chat.c cVar2 = com.tencent.mm.pluginsdk.ui.chat.c.this;
                                cVar2.getClass();
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rpt exp:");
                                int i19 = i17;
                                sb6.append(i19);
                                sb6.append(":");
                                android.view.View view = childAt;
                                sb6.append(view.hashCode());
                                sb6.append(" ");
                                sb6.append(cVar2.f190208i.f189919n.hashCode());
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppGrid", sb6.toString());
                                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("chat_attachment_item_" + ((com.tencent.mm.pluginsdk.ui.chat.e) view.getTag()).f190289p, "view_exp", cVar2.d(i19, (com.tencent.mm.pluginsdk.ui.chat.e) view.getTag()), 36465);
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // android.widget.AdapterView
    public int getCount() {
        return this.f189919n.getCount();
    }

    public int getCurPage() {
        return this.f189917i;
    }

    public void setChattingContextRef(yb5.d dVar) {
        this.f189921p = new java.lang.ref.WeakReference(dVar);
    }

    public void setOnAppSelectedListener(com.tencent.mm.pluginsdk.ui.chat.f fVar) {
        this.f189912d = fVar;
    }

    public void setSessionid(java.lang.String str) {
        this.f189922q = str;
    }

    public AppGrid(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f189915g = 0;
        this.f189916h = 0;
        this.f189921p = null;
        this.f189923r = new com.tencent.mm.pluginsdk.ui.chat.a(this);
        this.f189924s = new com.tencent.mm.pluginsdk.ui.chat.b(this);
        this.f189913e = context;
    }
}
