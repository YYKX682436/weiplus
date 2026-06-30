package rx2;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx2.p f400976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(rx2.p pVar) {
        super(0);
        this.f400976d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rx2.p pVar = this.f400976d;
        com.tencent.mm.ui.MMActivity activity = pVar.f400983d;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(dv2.a1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        dv2.a1 a1Var = (dv2.a1) a17;
        if (a1Var.f243806d && (a1Var.f243807e.isEmpty() ^ true)) {
            rx2.l lVar = new rx2.l(pVar);
            rx2.m mVar = new rx2.m(pVar);
            java.util.ArrayList arrayList = a1Var.f243807e;
            if (!arrayList.isEmpty()) {
                com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(a1Var.getActivity());
                android.view.View inflate = android.view.LayoutInflater.from(a1Var.getActivity()).inflate(com.tencent.mm.R.layout.f489067b61, (android.view.ViewGroup) null);
                android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.f482692lf);
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) inflate.findViewById(com.tencent.mm.R.id.r2h);
                com.tencent.mm.plugin.finder.redpacket.FinderRedPacketScaleLayoutManager finderRedPacketScaleLayoutManager = new com.tencent.mm.plugin.finder.redpacket.FinderRedPacketScaleLayoutManager(a1Var.getContext(), 0, false);
                wxRecyclerView.setLayoutManager(finderRedPacketScaleLayoutManager);
                wxRecyclerView.N(new dv2.u0(a1Var.getActivity()));
                new androidx.recyclerview.widget.y1().b(wxRecyclerView);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new vs2.a((r45.m66) it.next()));
                }
                vs2.a aVar = (vs2.a) kz5.n0.Z(arrayList2);
                if (aVar != null) {
                    aVar.f439872e = true;
                }
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.uic.FinderPostRedPackCoverUIC$buildItemCoverts$1
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        return new vs2.b();
                    }
                }, arrayList2, false);
                a1Var.f243811i = wxRecyclerAdapter;
                wxRecyclerView.setAdapter(wxRecyclerAdapter);
                wxRecyclerView.i(new dv2.w0(a1Var, finderRedPacketScaleLayoutManager, button));
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.bzh);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487334ob5);
                if (imageView != null) {
                    imageView.setOnClickListener(new dv2.x0(lVar, y1Var));
                }
                com.tencent.mm.ui.bk.s0(textView.getPaint());
                if (button != null) {
                    button.setOnClickListener(new dv2.y0(a1Var, finderRedPacketScaleLayoutManager, y1Var));
                }
                button.setEnabled(((r45.m66) kz5.n0.X(arrayList)).getInteger(2) > 0);
                java.lang.String string = a1Var.getActivity().getResources().getString(com.tencent.mm.R.string.m5s);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                android.text.SpannableString spannableString = new android.text.SpannableString(string);
                spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(string, a1Var.getActivity().getResources().getColor(com.tencent.mm.R.color.f478524a5), a1Var.getActivity().getResources().getColor(com.tencent.mm.R.color.a9e), false, false, new dv2.z0(y1Var, mVar)), 0, string.length(), 17);
                if (textView2 != null) {
                    textView2.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(a1Var.getActivity()));
                }
                if (textView2 != null) {
                    textView2.setText(spannableString);
                }
                y1Var.k(inflate);
                y1Var.s();
            }
        } else {
            pVar.b();
        }
        return jz5.f0.f302826a;
    }
}
