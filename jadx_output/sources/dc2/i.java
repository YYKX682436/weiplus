package dc2;

/* loaded from: classes3.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout f228702d;

    public i(com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout) {
        this.f228702d = finderLiveFixRatioPhoneEditPluginLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout.f105304x;
        com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout = this.f228702d;
        l45.q qVar = finderLiveFixRatioPhoneEditPluginLayout.getEditPhotoWrapper().f465587o;
        kotlin.jvm.internal.o.e(qVar, "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter");
        android.graphics.Bitmap h17 = ((l45.n) qVar).h();
        android.content.Context context = finderLiveFixRatioPhoneEditPluginLayout.getContext();
        kotlin.jvm.internal.o.d(context);
        y9.i iVar = new y9.i(context, com.tencent.mm.R.style.f30do);
        android.view.View inflate = android.view.View.inflate(finderLiveFixRatioPhoneEditPluginLayout.getContext(), com.tencent.mm.R.layout.bqs, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hrq);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = i65.a.b(finderLiveFixRatioPhoneEditPluginLayout.getContext(), 64) + com.tencent.mm.ui.bl.c(finderLiveFixRatioPhoneEditPluginLayout.getContext());
        }
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.nby);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.nfs);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nc9);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nft);
        kotlin.jvm.internal.o.d(textView2);
        com.tencent.mm.ui.fk.a(textView2);
        kotlin.jvm.internal.o.d(textView3);
        com.tencent.mm.ui.fk.a(textView3);
        com.tencent.mm.ui.fk.a(textView);
        imageView.setImageBitmap(h17);
        imageView2.setImageBitmap(h17);
        android.widget.ImageView imageView3 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.s6s);
        if (imageView3 != null) {
            imageView3.setImageDrawable(com.tencent.mm.ui.uk.e(imageView3.getContext(), com.tencent.mm.R.raw.icons_filled_channel, i65.a.d(imageView3.getContext(), com.tencent.mm.R.color.f478526a7)));
        }
        java.lang.String Fj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Fj();
        boolean Bi = ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).Bi();
        boolean z17 = ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).wi() || ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).Ai();
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "previewBtnOnClick: desc=" + Fj + ", enableShowDescInSquare=" + Bi + ", enableShowDescInForward=" + z17);
        if (Fj.length() > 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i18 = com.tencent.mm.pluginsdk.ui.span.c0.i(context2, Fj);
            android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n8d);
            if (textView4 != null) {
                if (z17) {
                    textView4.setVisibility(0);
                    textView4.setText(i18);
                } else {
                    textView4.setVisibility(8);
                }
            }
            android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ebv);
            if (textView5 != null) {
                if (Bi) {
                    textView5.setVisibility(0);
                    textView5.setText(i18);
                } else {
                    textView5.setVisibility(8);
                }
            }
        } else {
            android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n8d);
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            android.widget.TextView textView7 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ebv);
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
        }
        android.widget.TextView textView8 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.s6t);
        android.widget.ImageView imageView4 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.s6r);
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.d(textView8);
        kotlin.jvm.internal.o.d(imageView4);
        ((com.tencent.mm.feature.finder.live.v4) w0Var).ek(null, textView8, imageView4);
        android.widget.ImageView imageView5 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.e_e);
        android.widget.TextView textView9 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.fuv);
        android.widget.ImageView imageView6 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f483299a85);
        s40.w0 w0Var2 = (s40.w0) i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.d(textView9);
        kotlin.jvm.internal.o.d(imageView6);
        ((com.tencent.mm.feature.finder.live.v4) w0Var2).ek(imageView5, textView9, imageView6);
        textView.setOnClickListener(new dc2.h(iVar));
        iVar.setContentView(inflate);
        iVar.show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
