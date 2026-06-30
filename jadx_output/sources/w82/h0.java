package w82;

/* loaded from: classes3.dex */
public class h0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f443871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.b7 f443872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w82.m0 f443873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rl5.r f443874g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavTagPanel f443875h;

    public h0(com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel, java.util.List list, db5.b7 b7Var, w82.m0 m0Var, rl5.r rVar) {
        this.f443875h = favTagPanel;
        this.f443871d = list;
        this.f443872e = b7Var;
        this.f443873f = m0Var;
        this.f443874g = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        o72.z4 uj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).uj();
        final db5.b7 b7Var = this.f443872e;
        final w82.m0 m0Var = this.f443873f;
        final rl5.r rVar = this.f443874g;
        yz5.l lVar = new yz5.l() { // from class: w82.h0$$a
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                final w82.h0 h0Var = w82.h0.this;
                h0Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.FavTagPanel", "delete tag result = " + bool);
                if (bool.booleanValue()) {
                    final db5.b7 b7Var2 = b7Var;
                    final w82.m0 m0Var2 = m0Var;
                    final rl5.r rVar2 = rVar;
                    ik1.h0.b(new java.lang.Runnable() { // from class: w82.h0$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            w82.h0 h0Var2 = w82.h0.this;
                            h0Var2.getClass();
                            db5.b7 b7Var3 = b7Var2;
                            h0Var2.f443875h.removeView(b7Var3.f228296b);
                            m0Var2.b(b7Var3.f228295a);
                            rVar2.a();
                        }
                    });
                }
                jx3.f.INSTANCE.d(29434, 6);
                return null;
            }
        };
        t72.l lVar2 = (t72.l) uj6;
        java.util.List list = this.f443871d;
        kotlin.jvm.internal.o.g(list, "list");
        v65.i.b(lVar2.Y6(), null, new t72.f(lVar2, list, lVar, null), 1, null);
    }
}
