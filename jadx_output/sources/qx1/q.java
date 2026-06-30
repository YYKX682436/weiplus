package qx1;

/* loaded from: classes12.dex */
public class q implements jx1.a, mx1.b {

    /* renamed from: a, reason: collision with root package name */
    public final nx1.z f367307a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f367308b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageButton f367309c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f367310d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f367311e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f367312f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f367313g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.LinearLayout f367314h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f367315i = false;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f367316j = "";

    /* renamed from: k, reason: collision with root package name */
    public boolean f367317k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f367318l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f367319m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f367320n = false;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f367321o;

    public q(nx1.z zVar, android.view.View view, mx1.a aVar, long j17) {
        this.f367307a = zVar;
        this.f367308b = view;
        zVar.f341333c = this;
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = (com.tencent.mm.ui.widget.imageview.WeImageButton) view.findViewById(com.tencent.mm.R.id.d8a);
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton2 = (com.tencent.mm.ui.widget.imageview.WeImageButton) view.findViewById(com.tencent.mm.R.id.d88);
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton3 = (com.tencent.mm.ui.widget.imageview.WeImageButton) view.findViewById(com.tencent.mm.R.id.d89);
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton4 = (com.tencent.mm.ui.widget.imageview.WeImageButton) view.findViewById(com.tencent.mm.R.id.d87);
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton5 = (com.tencent.mm.ui.widget.imageview.WeImageButton) view.findViewById(com.tencent.mm.R.id.d86);
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton6 = (com.tencent.mm.ui.widget.imageview.WeImageButton) view.findViewById(com.tencent.mm.R.id.d8_);
        this.f367309c = weImageButton6;
        weImageButton.setVisibility((j17 & 1) == 0 ? 8 : 0);
        weImageButton2.setVisibility((j17 & 16) == 0 ? 8 : 0);
        weImageButton3.setVisibility((j17 & 4096) == 0 ? 8 : 0);
        weImageButton4.setVisibility((j17 & 65536) == 0 ? 8 : 0);
        weImageButton5.setVisibility((j17 & 256) == 0 ? 8 : 0);
        weImageButton6.setVisibility((j17 & 1048576) == 0 ? 8 : 0);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.d8z);
        this.f367310d = linearLayout;
        linearLayout.setVisibility(8);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) linearLayout.findViewById(com.tencent.mm.R.id.pog);
        this.f367311e = linearLayout2;
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) linearLayout.findViewById(com.tencent.mm.R.id.poe);
        this.f367312f = linearLayout3;
        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) linearLayout.findViewById(com.tencent.mm.R.id.pof);
        android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) linearLayout.findViewById(com.tencent.mm.R.id.jqt);
        this.f367313g = linearLayout5;
        android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) linearLayout.findViewById(com.tencent.mm.R.id.po_);
        this.f367314h = linearLayout6;
        linearLayout2.setVisibility((j17 & 16777216) == 0 ? 8 : 0);
        linearLayout3.setVisibility((j17 & 268435456) == 0 ? 8 : 0);
        linearLayout4.setVisibility((j17 & 4294967296L) == 0 ? 8 : 0);
        linearLayout5.setVisibility((j17 & 68719476736L) == 0 ? 8 : 0);
        linearLayout6.setVisibility((j17 & 1099511627776L) == 0 ? 8 : 0);
        weImageButton.setOnClickListener(new qx1.h(this, aVar));
        weImageButton2.setOnClickListener(new qx1.i(this, aVar));
        this.f367321o = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_jump_to_record_media, true);
        weImageButton5.setOnClickListener(new qx1.j(this, aVar));
        weImageButton6.setOnClickListener(new qx1.k(this, aVar, zVar));
        linearLayout2.setOnClickListener(new qx1.l(this, aVar));
        linearLayout3.setOnClickListener(new qx1.m(this, aVar));
        linearLayout4.setOnClickListener(new qx1.n(this, zVar, aVar));
        linearLayout5.setOnClickListener(new qx1.o(this, aVar));
        linearLayout6.setOnClickListener(new qx1.p(this, aVar));
        weImageButton3.setOnClickListener(new qx1.a(this, aVar));
        weImageButton4.setOnClickListener(new qx1.c(this, aVar));
    }

    public static void a(qx1.q qVar, android.view.View view, boolean z17) {
        qVar.getClass();
        view.postDelayed(new qx1.g(qVar, view, z17), 100L);
    }

    public static void b(qx1.q qVar, mx1.a aVar) {
        qVar.getClass();
        ((com.tencent.mm.plugin.component.editor.EditorUI) aVar).k7(true, 50L);
        qVar.c(1, 0L);
    }

    public void c(int i17, long j17) {
        this.f367308b.postDelayed(new qx1.d(this, i17), j17);
    }

    public void d(mx1.a aVar) {
        int i17;
        this.f367309c.setImageResource(com.tencent.mm.R.drawable.f481399sa);
        if (this.f367315i) {
            this.f367315i = false;
            hx1.g a17 = hx1.g.a();
            if (a17.f285623a && !a17.f285626d) {
                a17.b();
            }
            hx1.g a18 = hx1.g.a();
            java.lang.String str = com.tencent.mm.vfs.w6.j(a18.f285633k) ? a18.f285633k : "";
            int i18 = (int) hx1.g.a().f285625c;
            int j17 = (int) com.tencent.mm.plugin.component.editor.u1.j(i18);
            nx1.d q17 = nx1.d.q();
            synchronized (q17) {
                if (q17.f341282a != null) {
                    i17 = 0;
                    while (i17 < q17.f341282a.size()) {
                        if (((ix1.a) q17.f341282a.get(i17)).b() == 4 && ((ix1.n) q17.f341282a.get(i17)).f295349w.booleanValue()) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                i17 = -1;
            }
            ix1.a l17 = nx1.d.q().l(i17);
            if (!com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EditorFooterPanel", "voicePath not exist, remove data from data list and ui.");
                nx1.d.q().w(i17, false);
                if (aVar != null) {
                    aVar.x1(i17);
                }
                ix1.l lVar = new ix1.l();
                lVar.f295338s = "";
                lVar.f295312b = true;
                lVar.f295317g = false;
                nx1.d.q().a(i17, lVar, true);
                nx1.d.q().d(i17 - 1, i17 + 1, true);
                return;
            }
            if (i17 == -1 || l17 == null || l17.b() != 4) {
                return;
            }
            ix1.n nVar = (ix1.n) l17;
            nVar.f295349w = java.lang.Boolean.FALSE;
            nVar.f295327p = 4;
            nVar.f295328q = true;
            ((java.lang.String) com.tencent.mm.plugin.component.editor.u1.m(com.tencent.mm.sdk.platformtools.x2.f193071a, j17)).getClass();
            nVar.f295329r = str;
            nVar.f295345v = i18;
            mx1.a aVar2 = nx1.d.q().f341283b;
            if (aVar2 != null) {
                aVar2.j3(i17, 0L);
            }
        }
    }
}
