package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class tm extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.wm f205614s = new com.tencent.mm.ui.chatting.viewitems.wm();

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.im f205615t = new com.tencent.mm.ui.chatting.viewitems.im();

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.ym f205616u = new com.tencent.mm.ui.chatting.viewitems.ym();

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.sq f205617v = new com.tencent.mm.ui.chatting.viewitems.sq();

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f488532w6, (android.view.ViewGroup) null);
        com.tencent.mm.ui.chatting.viewitems.vm vmVar = new com.tencent.mm.ui.chatting.viewitems.vm(this);
        vmVar.f205879c = inflate;
        vmVar.timeTV = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483696br1);
        vmVar.noMoreMsgTip = inflate.findViewById(com.tencent.mm.R.id.bpw);
        vmVar.f205880d = inflate.findViewById(com.tencent.mm.R.id.bqp);
        vmVar.f205881e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.bqo);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.bkl);
        vmVar.f205878b = mMNeat7extView;
        mMNeat7extView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y(mMNeat7extView, new com.tencent.mm.pluginsdk.ui.span.y0(vmVar.f205878b.getContext())));
        vmVar.uploadingPB = (android.widget.ProgressBar) inflate.findViewById(com.tencent.mm.R.id.f487503ot2);
        inflate.setTag(vmVar);
        return inflate;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigSysMsgDelete()) != 1) {
            return false;
        }
        g4Var.c(((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d(), 100, 0, view.getContext().getResources().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean b0() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, final yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.ui.chatting.viewitems.um umVar;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        int type = f9Var.getType();
        com.tencent.mm.ui.chatting.viewitems.um umVar2 = this.f205616u;
        com.tencent.mm.ui.chatting.viewitems.um umVar3 = (type == 10002 || f9Var.getType() == 268445458 || f9Var.getType() == 285222674) ? this.f205615t : f9Var.getType() == 570425393 ? umVar2 : f9Var.getType() == 603979825 ? this.f205617v : this.f205614s;
        if (!f9Var.j().contains("tmpl_type_masssend_sys_tip") && !f9Var.U2()) {
            java.lang.String j17 = f9Var.j();
            if (!(j17 != null && j17.contains("tmpl_type_auto_translation_sys_tip"))) {
                umVar = umVar3;
                umVar.a(g0Var, g0Var, dVar, dVar2, str);
                umVar.b(g0Var, g0Var, dVar, f9Var, str);
                com.tencent.mm.ui.chatting.viewitems.vm vmVar = (com.tencent.mm.ui.chatting.viewitems.vm) g0Var;
                vmVar.f205878b.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), vmVar, null));
                vmVar.f205878b.setForeground(dVar.g().getDrawable(com.tencent.mm.R.drawable.czj));
                vmVar.f205878b.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.tencent.mm.ui.chatting.viewitems.tm$$a
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view) {
                        com.tencent.mm.ui.chatting.viewitems.tm tmVar = com.tencent.mm.ui.chatting.viewitems.tm.this;
                        tmVar.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        yb5.d dVar3 = dVar;
                        arrayList.add(dVar3);
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemSys", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", tmVar, array);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(dVar3);
                        arrayList2.add(view);
                        java.lang.Object[] array2 = arrayList2.toArray();
                        arrayList2.clear();
                        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemSys", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", tmVar, array2);
                        if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigSysMsgDelete()) != 1) {
                            yj0.a.i(false, tmVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemSys", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                            yj0.a.i(false, tmVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemSys", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                            return false;
                        }
                        tmVar.u(dVar3).onLongClick(view);
                        yj0.a.i(true, tmVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemSys", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                        yj0.a.i(true, tmVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemSys", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                        return true;
                    }
                });
            }
        }
        umVar = umVar2;
        umVar.a(g0Var, g0Var, dVar, dVar2, str);
        umVar.b(g0Var, g0Var, dVar, f9Var, str);
        com.tencent.mm.ui.chatting.viewitems.vm vmVar2 = (com.tencent.mm.ui.chatting.viewitems.vm) g0Var;
        vmVar2.f205878b.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), vmVar2, null));
        vmVar2.f205878b.setForeground(dVar.g().getDrawable(com.tencent.mm.R.drawable.czj));
        vmVar2.f205878b.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.tencent.mm.ui.chatting.viewitems.tm$$a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                com.tencent.mm.ui.chatting.viewitems.tm tmVar = com.tencent.mm.ui.chatting.viewitems.tm.this;
                tmVar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                yb5.d dVar3 = dVar;
                arrayList.add(dVar3);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemSys", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", tmVar, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(dVar3);
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemSys", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", tmVar, array2);
                if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigSysMsgDelete()) != 1) {
                    yj0.a.i(false, tmVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemSys", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    yj0.a.i(false, tmVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemSys", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return false;
                }
                tmVar.u(dVar3).onLongClick(view);
                yj0.a.i(true, tmVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemSys", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                yj0.a.i(true, tmVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemSys", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        });
    }
}
