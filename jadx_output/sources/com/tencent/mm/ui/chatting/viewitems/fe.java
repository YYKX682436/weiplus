package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes11.dex */
public class fe extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.ting.widget.TingChatRoomView f203962b;

    public static void b(com.tencent.mm.ui.chatting.viewitems.a0 a0Var, com.tencent.mm.ui.chatting.viewitems.fe feVar, rd5.d dVar, boolean z17, com.tencent.mm.ui.chatting.adapter.q qVar, yb5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (feVar == null) {
            return;
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        com.tencent.mm.plugin.ting.widget.TingChatRoomView tingChatRoomView = feVar.f203962b;
        tingChatRoomView.getClass();
        tingChatRoomView.b(nm4.m.f338500d);
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingChatRoomItemHolder", "null == content");
            return;
        }
        if (118 == v17.f348666i) {
            il4.b bVar = (il4.b) v17.y(il4.b.class);
            feVar.f203962b.setCategoryId(bVar.f292099e);
            feVar.f203962b.setContainerBackgroundColor(dVar2.g().getResources().getColor(com.tencent.mm.R.color.f478494f));
            feVar.f203962b.c(il4.d.d(dVar2.g(), v17.f348654f, bVar.f292100f, bVar.f292101g));
            c(feVar.f203962b, bVar.f292099e);
            feVar.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar, dVar2.D(), feVar, null));
            feVar.clickArea.setOnClickListener(a0Var.w(dVar2));
            feVar.clickArea.setOnLongClickListener(a0Var.u(dVar2));
            feVar.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar2.f460708c.a(sb5.z.class))).B1);
            feVar.clickArea.addOnAttachStateChangeListener(new com.tencent.mm.ui.chatting.viewitems.ge(feVar, bVar));
        }
    }

    public static void c(com.tencent.mm.plugin.ting.widget.TingChatRoomView tingChatRoomView, final java.lang.String categoryId) {
        jm4.g3 f17;
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(tingChatRoomView);
        qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.chatting.viewitems.fe$$a
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                bw5.p90 p90Var = (bw5.p90) obj;
                com.tencent.mm.plugin.ting.widget.TingChatRoomView tingChatRoomView2 = (com.tencent.mm.plugin.ting.widget.TingChatRoomView) weakReference.get();
                if (p90Var == null || tingChatRoomView2 == null) {
                    return null;
                }
                if (!categoryId.equals(tingChatRoomView2.getCategoryId())) {
                    return null;
                }
                tingChatRoomView2.b(p90Var.f31520t ? nm4.m.f338501e : nm4.m.f338502f);
                return null;
            }
        };
        ((ef0.l4) i9Var).getClass();
        kotlin.jvm.internal.o.g(categoryId, "categoryId");
        jm4.v2 v2Var = jm4.w2.f300435d;
        jm4.u2 a17 = v2Var.a();
        bw5.eq0 eq0Var = bw5.eq0.TingChatRoom;
        jm4.d1 d1Var = null;
        jm4.n2 a18 = a17 != null ? ((jm4.w2) a17).a(eq0Var) : null;
        if (a18 == null) {
            jm4.u2 a19 = v2Var.a();
            a18 = a19 != null ? ((jm4.w2) a19).d(eq0Var) : null;
        }
        if (a18 != null && (f17 = ((jm4.p2) a18).f()) != null) {
            d1Var = ((jm4.h3) f17).p();
        }
        if (d1Var != null) {
            jm4.x1 x1Var = new jm4.x1();
            x1Var.f300449o = lVar;
            urgen.ur_0025.UR_5D5A.UR_7B41(((jm4.e1) d1Var).getCppPointer(), categoryId, x1Var);
        }
    }

    public com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View view, boolean z17) {
        super.create(view);
        this.f203962b = (com.tencent.mm.plugin.ting.widget.TingChatRoomView) view.findViewById(com.tencent.mm.R.id.srq);
        this.clickArea = view.findViewById(com.tencent.mm.R.id.bkg);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
        if (!z17) {
        }
        return this;
    }
}
