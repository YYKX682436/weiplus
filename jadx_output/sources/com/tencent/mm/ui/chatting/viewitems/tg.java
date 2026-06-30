package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class tg extends com.tencent.mm.ui.chatting.viewitems.a0 implements we5.b {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.dnk);
        com.tencent.mm.ui.chatting.viewitems.vg vgVar = new com.tencent.mm.ui.chatting.viewitems.vg();
        vgVar.a(xgVar);
        xgVar.setTag(vgVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean N() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (erVar == null) {
            return false;
        }
        g4Var.c(erVar.d(), 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // we5.b
    public rd5.d b(we5.a aVar) {
        return new com.tencent.mm.ui.chatting.viewitems.ug(aVar);
    }

    @Override // we5.b
    public boolean c() {
        return false;
    }

    public final java.lang.String d0(java.util.Map map) {
        try {
            java.lang.String str = (java.lang.String) map.get(".msg.brandecsmsg.version");
            java.lang.String str2 = (java.lang.String) map.get(".msg.brandecsmsg.digest");
            if (str != null) {
                if (str.equals("1")) {
                    if (str2 != null) {
                        try {
                            byte[] decode = android.util.Base64.decode(str2, 2);
                            kotlin.jvm.internal.o.f(decode, "decode(...)");
                            str2 = new java.lang.String(decode, r26.c.f368865a);
                        } catch (java.lang.Exception unused) {
                        }
                    } else {
                        str2 = "";
                    }
                }
            }
            return str2 != null ? str2 : "";
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemBrandEcsPrivateNoticeMsg", e17, "getFinalDigest failed", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // we5.b
    public void e(final yb5.d dVar, final rd5.d dVar2, java.lang.String str, we5.y0 y0Var) {
        final com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        final java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null);
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.tg$$a
            @Override // we5.t0
            public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                final java.util.Map map = d17;
                final yb5.d dVar3 = dVar;
                final com.tencent.mm.ui.chatting.viewitems.vg vgVar = (com.tencent.mm.ui.chatting.viewitems.vg) g0Var;
                final com.tencent.mm.ui.chatting.viewitems.tg tgVar = com.tencent.mm.ui.chatting.viewitems.tg.this;
                tgVar.getClass();
                kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
                android.widget.ImageView imageView = vgVar.f205855c;
                final com.tencent.mm.storage.f9 f9Var2 = f9Var;
                ((com.tencent.mm.feature.avatar.w) zVar).Ni(imageView, f9Var2.Q0());
                com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er();
                erVar.f203908d = vgVar;
                erVar.f203905a = dVar2;
                erVar.f203906b = f9Var2.Q0();
                vgVar.f205856d.setTag(erVar);
                vgVar.f205856d.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.chatting.viewitems.tg$$c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        com.tencent.mm.ui.chatting.viewitems.tg tgVar2 = com.tencent.mm.ui.chatting.viewitems.tg.this;
                        tgVar2.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        com.tencent.mm.ui.chatting.viewitems.vg vgVar2 = vgVar;
                        arrayList.add(vgVar2);
                        com.tencent.mm.storage.f9 f9Var3 = f9Var2;
                        arrayList.add(f9Var3);
                        java.util.Map map2 = map;
                        arrayList.add(map2);
                        yb5.d dVar4 = dVar3;
                        arrayList.add(dVar4);
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemBrandEcsPrivateNoticeMsg", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", tgVar2, array);
                        if (map2 != null) {
                            try {
                                com.tencent.wechat.aff.brand_service.a aVar = com.tencent.wechat.aff.brand_service.a.f216045b;
                                com.tencent.wechat.mm.brand_service.y yVar = new com.tencent.wechat.mm.brand_service.y();
                                com.tencent.wechat.mm.brand_service.x xVar = new com.tencent.wechat.mm.brand_service.x();
                                xVar.f219215g = com.tencent.wechat.mm.brand_service.w.Click;
                                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                xVar.f219214f = java.lang.System.currentTimeMillis();
                                java.lang.String Q0 = f9Var3.Q0();
                                java.lang.String str2 = "";
                                if (Q0 == null) {
                                    Q0 = "";
                                }
                                xVar.f219213e = Q0;
                                xVar.f219212d = aVar.b();
                                xVar.f219216h = "102_1";
                                xVar.f219217i = "private_message";
                                java.lang.String str3 = (java.lang.String) map2.get(".msg.brandecsmsg.orginmsgsvrid");
                                if (str3 != null) {
                                    str2 = str3;
                                }
                                xVar.f219218m = str2;
                                xVar.f219220o = java.lang.String.valueOf(vgVar2.getAdapterPosition() + 1);
                                cl0.g h17 = new cl0.g().h("content", tgVar2.d0(map2));
                                h17.p("send_timestamp", f9Var3.getCreateTime() / 1000);
                                h17.p("msg_svr_id", f9Var3.I0());
                                xVar.f219222q = h17.toString();
                                yVar.f219254d = xVar;
                                aVar.f(yVar);
                            } catch (cl0.f e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemBrandEcsPrivateNoticeMsg", "json error: %s" + e17);
                            }
                        }
                        if (c01.e2.J(f9Var3.Q0())) {
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("Chat_User", f9Var3.Q0());
                            intent.putExtra("finish_direct", true);
                            intent.putExtra("from_global_search", true);
                            java.util.Map d18 = com.tencent.mm.sdk.platformtools.aa.d(f9Var3.j(), "msg", null);
                            if (d18 != null) {
                                long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d18.get(".msg.brandecsmsg.orginmsgid"), -1L);
                                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBrandEcsPrivateNoticeMsg", "goChattingUI msgId:%d", java.lang.Long.valueOf(V));
                                intent.putExtra("msg_local_id", V);
                            }
                            intent.setClass(dVar4.g(), com.tencent.mm.ui.chatting.ChattingUI.class);
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(intent);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(dVar4, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBrandEcsPrivateNoticeMsg", "goChattingUI", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            dVar4.a0((android.content.Intent) arrayList2.get(0));
                            yj0.a.f(dVar4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBrandEcsPrivateNoticeMsg", "goChattingUI", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else {
                            android.app.Activity g17 = dVar4.g();
                            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(g17);
                            e4Var.f211776c = dVar4.g().getString(com.tencent.mm.R.string.mds);
                            e4Var.c();
                        }
                        yj0.a.h(tgVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBrandEcsPrivateNoticeMsg", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                vgVar.f205856d.setOnLongClickListener(tgVar.u(dVar3));
                vgVar.f205856d.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar3.f460708c.a(sb5.z.class))).B1);
                if (map == null) {
                    return;
                }
                com.tencent.mm.ui.chatting.component.h0 h0Var = (com.tencent.mm.ui.chatting.component.h0) ((sb5.g) dVar3.f460708c.a(sb5.g.class));
                if (h0Var.f199134e.contains(java.lang.Long.valueOf(f9Var2.getMsgId()))) {
                    return;
                }
                h0Var.f199134e.add(java.lang.Long.valueOf(f9Var2.getMsgId()));
                try {
                    com.tencent.wechat.aff.brand_service.a aVar = com.tencent.wechat.aff.brand_service.a.f216045b;
                    com.tencent.wechat.mm.brand_service.y yVar = new com.tencent.wechat.mm.brand_service.y();
                    com.tencent.wechat.mm.brand_service.x xVar = new com.tencent.wechat.mm.brand_service.x();
                    xVar.f219215g = com.tencent.wechat.mm.brand_service.w.Expose;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    xVar.f219214f = java.lang.System.currentTimeMillis();
                    java.lang.String Q0 = f9Var2.Q0();
                    java.lang.String str2 = "";
                    if (Q0 == null) {
                        Q0 = "";
                    }
                    xVar.f219213e = Q0;
                    xVar.f219212d = aVar.b();
                    xVar.f219216h = "102_1";
                    xVar.f219217i = "private_message";
                    java.lang.String str3 = (java.lang.String) map.get(".msg.brandecsmsg.orginmsgsvrid");
                    if (str3 != null) {
                        str2 = str3;
                    }
                    xVar.f219218m = str2;
                    xVar.f219220o = java.lang.String.valueOf(vgVar.getAdapterPosition() + 1);
                    cl0.g h17 = new cl0.g().h("content", tgVar.d0(map));
                    h17.p("send_timestamp", f9Var2.getCreateTime() / 1000);
                    h17.p("msg_svr_id", f9Var2.I0());
                    xVar.f219222q = h17.toString();
                    yVar.f219254d = xVar;
                    aVar.f(yVar);
                } catch (cl0.f e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemBrandEcsPrivateNoticeMsg", "json error: %s" + e17);
                }
            }
        });
        if (d17 != null) {
            java.lang.String d07 = d0(d17);
            android.app.Activity g17 = dVar.g();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            final java.lang.String string = g17.getString(com.tencent.mm.R.string.mdk, c01.a2.b(f9Var.Q0()), d07);
            y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.tg$$b
                @Override // we5.t0
                public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                    com.tencent.mm.ui.chatting.viewitems.vg vgVar = (com.tencent.mm.ui.chatting.viewitems.vg) g0Var;
                    android.widget.TextView textView = vgVar.f205854b;
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.app.Activity g18 = yb5.d.this.g();
                    float textSize = vgVar.f205854b.getTextSize();
                    ((ke0.e) xVar).getClass();
                    textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(g18, string, textSize));
                }
            });
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        e(dVar, dVar2, str, we5.y0.a((com.tencent.mm.ui.chatting.viewitems.vg) g0Var));
    }
}
