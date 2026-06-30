package od2;

/* loaded from: classes11.dex */
public class m extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od2.o f344625b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(od2.o oVar) {
        super(oVar);
        this.f344625b = oVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        od2.n nVar = (od2.n) eVar;
        od2.o oVar = (od2.o) gVar;
        u50.y yVar = (u50.y) i95.n0.c(u50.y.class);
        android.view.View view = nVar.f344626a;
        od2.o oVar2 = this.f344625b;
        boolean z17 = oVar2.f423761d;
        ((s50.r0) yVar).getClass();
        com.tencent.mm.plugin.fts.ui.n3.j(view, z17);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(nVar.f344627b, oVar.f344636u, null);
        u50.y yVar2 = (u50.y) i95.n0.c(u50.y.class);
        java.lang.CharSequence charSequence = oVar.f344637v;
        android.widget.TextView textView = nVar.f344628c;
        ((s50.r0) yVar2).getClass();
        com.tencent.mm.plugin.fts.ui.n3.a(charSequence, textView);
        u50.y yVar3 = (u50.y) i95.n0.c(u50.y.class);
        java.lang.CharSequence charSequence2 = oVar.f344638w;
        android.widget.TextView textView2 = nVar.f344629d;
        ((s50.r0) yVar3).getClass();
        com.tencent.mm.plugin.fts.ui.n3.a(charSequence2, textView2);
        u50.y yVar4 = (u50.y) i95.n0.c(u50.y.class);
        java.lang.String str = oVar.f344639x;
        android.widget.TextView textView3 = nVar.f344630e;
        ((s50.r0) yVar4).getClass();
        com.tencent.mm.plugin.fts.ui.n3.a(str, textView3);
        android.widget.ImageView imageView = nVar.f344631f;
        if (imageView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSFinderFollowerDataItem", "viewHolder.verifyIV = null.");
            return;
        }
        ya2.b2 b2Var = oVar2.f344632q;
        if (b2Var == null || b2Var.field_authInfo == null) {
            imageView.setVisibility(8);
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1.f460511a.c(nVar.f344631f, oVar2.f344632q.field_authInfo, 1);
        nVar.f344631f.setVisibility(0);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bc8, viewGroup, false);
        od2.n nVar = this.f344625b.f344640y;
        nVar.f344627b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        nVar.f344628c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        nVar.f344629d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        nVar.f344630e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hhi);
        nVar.f344626a = inflate.findViewById(com.tencent.mm.R.id.d0v);
        nVar.f344631f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f487539ox3);
        inflate.setTag(nVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        od2.o oVar = (od2.o) gVar;
        java.lang.String str = oVar.f344636u;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            a(this.f344625b.i(), oVar.f344634s);
            android.content.Intent intent = new android.content.Intent();
            boolean equals = str.equals(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(context));
            intent.putExtra("finder_username", str);
            ya2.e1 e1Var = ya2.e1.f460472a;
            if (equals) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.x(context, intent, 30, 20);
            } else {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(30, 20, 32, intent);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.w(context, intent);
            }
        }
        ya2.b2 b2Var = oVar.f344632q;
        java.lang.String str2 = b2Var != null ? b2Var.field_avatarUrl : "";
        o13.a0 a0Var = (o13.a0) i95.n0.c(o13.a0.class);
        java.lang.String str3 = oVar.f344636u;
        java.lang.String charSequence = oVar.f344637v.toString();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((com.tencent.mm.plugin.fts.ui.s3) a0Var).wi(str3, charSequence, str2, 31, ((z13.f) a17).d7());
        ((com.tencent.mm.plugin.fts.ui.s3) ((o13.a0) i95.n0.c(o13.a0.class))).Ai(oVar);
        return true;
    }
}
