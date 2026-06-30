package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class sa extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f205503b;

    public com.tencent.mm.ui.chatting.viewitems.sa a(android.view.View view) {
        super.create(view);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) view.findViewById(com.tencent.mm.R.id.bkl);
        this.f205503b = mMNeat7extView;
        mMNeat7extView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y(mMNeat7extView, new com.tencent.mm.pluginsdk.ui.span.y0(this.f205503b.getContext())));
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
        return this;
    }

    public void b(com.tencent.mm.ui.chatting.viewitems.sa saVar, com.tencent.mm.ui.chatting.adapter.q qVar, yb5.d dVar, rd5.d dVar2, java.lang.String str, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, boolean z17) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || v17.f348666i != 47) {
            return;
        }
        java.lang.String str2 = v17.f348686n;
        android.os.Bundle bundle = new android.os.Bundle();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(v17.f348683m0)) {
            if (str2.contains("{recver}")) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str3 = v17.f348683m0;
                ((sg3.a) v0Var).getClass();
                str2 = str2.replace("{recver}", c01.a2.e(str3));
            }
            bundle.putString("receiver_name", v17.f348683m0);
        }
        bundle.putString("rawUrl", v17.f348674k);
        bundle.putString("sender_name", f9Var.Q0());
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int textSize = (int) saVar.f205503b.getTextSize();
        ((ke0.e) xVar).getClass();
        saVar.f205503b.c(com.tencent.mm.pluginsdk.ui.span.c0.l(context, str2, textSize, 4, bundle, true), android.widget.TextView.BufferType.SPANNABLE, null);
        saVar.f205503b.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), saVar, f9Var.Q0()));
        if (c01.d9.b().E()) {
            saVar.f205503b.setOnLongClickListener(a0Var.u(dVar));
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f205503b;
    }
}
