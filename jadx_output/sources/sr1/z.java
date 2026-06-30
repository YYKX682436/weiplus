package sr1;

/* loaded from: classes11.dex */
public class z extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sr1.a0 f411504b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(sr1.a0 a0Var) {
        super(a0Var);
        this.f411504b = a0Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        sr1.a0 a0Var = (sr1.a0) gVar;
        sr1.y yVar = (sr1.y) eVar;
        u50.y yVar2 = (u50.y) i95.n0.c(u50.y.class);
        android.view.View view = yVar.f411499a;
        boolean z17 = this.f411504b.f423761d;
        ((s50.r0) yVar2).getClass();
        com.tencent.mm.plugin.fts.ui.n3.j(view, z17);
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479767eo);
        gk0.k kVar = new gk0.k(h17, h17);
        kVar.f272434e = com.tencent.mm.R.drawable.bgo;
        kVar.f272433d = 0.5f;
        gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
        android.widget.ImageView imageView = yVar.f411500b;
        java.lang.String str = a0Var.f411451u;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        ((h83.g) n0Var).wi(imageView, str, kVar);
        if (c01.e2.R(a0Var.f411449s)) {
            java.lang.CharSequence aj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).aj(context, a0Var.f411452v);
            u50.y yVar3 = (u50.y) i95.n0.c(u50.y.class);
            android.widget.TextView textView = yVar.f411501c;
            ((s50.r0) yVar3).getClass();
            com.tencent.mm.plugin.fts.ui.n3.a(aj6, textView);
        } else {
            u50.y yVar4 = (u50.y) i95.n0.c(u50.y.class);
            java.lang.CharSequence charSequence = a0Var.f411452v;
            android.widget.TextView textView2 = yVar.f411501c;
            ((s50.r0) yVar4).getClass();
            com.tencent.mm.plugin.fts.ui.n3.a(charSequence, textView2);
        }
        u50.y yVar5 = (u50.y) i95.n0.c(u50.y.class);
        java.lang.CharSequence charSequence2 = a0Var.f411453w;
        android.widget.TextView textView3 = yVar.f411502d;
        ((s50.r0) yVar5).getClass();
        com.tencent.mm.plugin.fts.ui.n3.a(charSequence2, textView3);
        if (a0Var.f411448r.l2()) {
            yVar.f411503e.setVisibility(8);
            return;
        }
        if ((a0Var.f411448r.f1() & 512) > 0) {
            yVar.f411503e.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_star_identify, i65.a.d(context, com.tencent.mm.R.color.aes)));
            yVar.f411503e.setVisibility(0);
            return;
        }
        if (!((a0Var.f411448r.f1() & 16) > 0)) {
            yVar.f411503e.setVisibility(8);
            return;
        }
        yVar.f411503e.setIconColor(i65.a.d(context, com.tencent.mm.R.color.f478522a3));
        yVar.f411503e.setImageResource(com.tencent.mm.R.raw.icons_filled_star_identify);
        yVar.f411503e.setVisibility(0);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bbt, viewGroup, false);
        sr1.y yVar = this.f411504b.f411456z;
        yVar.f411500b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        yVar.f411501c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        yVar.f411502d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        yVar.f411499a = inflate.findViewById(com.tencent.mm.R.id.d0v);
        yVar.f411503e = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.h6y);
        inflate.setTag(yVar);
        return inflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0379  */
    @Override // u13.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(android.content.Context r20, android.view.View r21, u13.g r22, java.lang.Object... r23) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sr1.z.d(android.content.Context, android.view.View, u13.g, java.lang.Object[]):boolean");
    }
}
