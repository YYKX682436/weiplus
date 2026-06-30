package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class u extends db5.h implements ll3.p1 {

    /* renamed from: g, reason: collision with root package name */
    public final int f150799g;

    /* renamed from: h, reason: collision with root package name */
    public final int f150800h;

    /* renamed from: i, reason: collision with root package name */
    public int f150801i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f150802m;

    /* renamed from: n, reason: collision with root package name */
    public final ll3.r1 f150803n;

    /* renamed from: o, reason: collision with root package name */
    public int f150804o;

    /* renamed from: p, reason: collision with root package name */
    public final int f150805p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f150806q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f150807r;

    public u(android.content.Context context, int i17, boolean z17) {
        super(context);
        this.f150799g = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 26);
        this.f150800h = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 260);
        this.f150807r = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f150802m = new java.util.HashMap();
        ll3.r1 r1Var = new ll3.r1();
        this.f150803n = r1Var;
        r1Var.f319224b = this;
        this.f150805p = i17;
        this.f150806q = z17;
    }

    @Override // db5.h
    public int a() {
        return ((java.util.ArrayList) ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f308856e).size();
    }

    @Override // db5.h
    public android.view.View b(android.view.View view, android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.music.ui.t tVar;
        if (view == null) {
            view = android.view.LayoutInflater.from(this.f228355d).inflate(com.tencent.mm.R.layout.c4e, viewGroup, false);
            tVar = new com.tencent.mm.plugin.music.ui.t(this);
            tVar.f150780b = (com.tencent.mm.plugin.music.ui.MusicItemLayout) view.findViewById(com.tencent.mm.R.id.jz7);
            tVar.f150785g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jzj);
            tVar.f150787i = (com.tencent.mm.plugin.music.ui.LyricView) view.findViewById(com.tencent.mm.R.id.j7q);
            tVar.f150781c = view.findViewById(com.tencent.mm.R.id.f482808of);
            tVar.f150782d = view.findViewById(com.tencent.mm.R.id.f482809og);
            tVar.f150783e = view.findViewById(com.tencent.mm.R.id.f482810oh);
            tVar.f150784f = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.f482807oe);
            tVar.f150786h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jzz);
            view.setTag(tVar);
        } else {
            tVar = (com.tencent.mm.plugin.music.ui.t) view.getTag();
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f308856e;
        int size = (i17 - 100000) % arrayList.size();
        if (size < 0) {
            size += arrayList.size();
        }
        ql3.a y07 = ll3.o2.Ai().y0((java.lang.String) arrayList.get(size));
        this.f150802m.put(java.lang.Integer.valueOf(i17), view);
        tVar.c(y07, false);
        return view;
    }

    @Override // db5.h
    public void c(android.view.View view, int i17) {
        this.f150802m.remove(java.lang.Integer.valueOf(i17));
    }

    public void d(ql3.a aVar, int[] iArr) {
        java.util.Iterator it = this.f150802m.entrySet().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.music.ui.t tVar = (com.tencent.mm.plugin.music.ui.t) ((android.view.View) ((java.util.Map.Entry) it.next()).getValue()).getTag();
            if (tVar.f150779a.field_musicId.equals(aVar.field_musicId)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainAdapter", "onColorReady: %s", tVar.f150779a.field_songName);
                int i17 = iArr[0];
                int i18 = iArr[1];
                tVar.f150780b.setBackgroundColor(i17);
                tVar.f150787i.setLyricColor(i18);
                tVar.f150784f.setBackgroundColor(i17);
                com.tencent.mm.plugin.music.ui.p pVar = new com.tencent.mm.plugin.music.ui.p(tVar, i17);
                android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
                paintDrawable.setShape(new android.graphics.drawable.shapes.RectShape());
                paintDrawable.setShaderFactory(pVar);
                tVar.f150782d.setBackgroundDrawable(paintDrawable);
                com.tencent.mm.plugin.music.ui.q qVar = new com.tencent.mm.plugin.music.ui.q(tVar, (i17 & 16777215) | 1426063360);
                android.graphics.drawable.PaintDrawable paintDrawable2 = new android.graphics.drawable.PaintDrawable();
                paintDrawable2.setShape(new android.graphics.drawable.shapes.RectShape());
                paintDrawable2.setShaderFactory(qVar);
                tVar.f150783e.setBackgroundDrawable(paintDrawable2);
                tVar.f150785g.setTextColor(i18);
                tVar.f150786h.setTextColor(i18);
                ((com.tencent.mm.plugin.music.ui.MusicMainUI) this.f228355d).V6(aVar);
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f150801i;
    }
}
