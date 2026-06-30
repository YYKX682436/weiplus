package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class p9 implements android.view.View.OnDragListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.q9 f199680d;

    public p9(com.tencent.mm.ui.chatting.component.q9 q9Var) {
        this.f199680d = q9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    @Override // android.view.View.OnDragListener
    public boolean onDrag(android.view.View view, android.view.DragEvent dragEvent) {
        com.tencent.mm.ui.chatting.component.q9 q9Var = this.f199680d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(dragEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", this, array);
        ?? r112 = 0;
        boolean z17 = false;
        try {
            int action = dragEvent.getAction();
            if (action == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_STARTED");
            } else if (action == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_LOCATION");
            } else if (action == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DROP");
                android.content.ClipData clipData = dragEvent.getClipData();
                android.app.Activity g17 = q9Var.f199760d.f198580d.g();
                int i17 = z2.h.f469448a;
                android.view.DragAndDropPermissions b17 = n3.m.b(g17, dragEvent);
                n3.n nVar = b17 != null ? new n3.n(b17) : null;
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    com.tencent.mm.ui.chatting.component.r9 r9Var = q9Var.f199760d;
                    if (itemCount > 9) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.setClass(r9Var.f198580d.g(), com.tencent.mm.ui.transmit.SelectNoSupportUI.class);
                        intent.putExtra("sharePictureTo", "friend");
                        intent.addFlags(268435456).addFlags(67108864);
                        yb5.d dVar = r9Var.f198580d;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(dVar, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        dVar.a0((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                        return true;
                    }
                    int i18 = 0;
                    while (i18 < itemCount) {
                        android.content.ClipData.Item itemAt = clipData.getItemAt(i18);
                        if (itemAt == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.DragDropComponent", "item == null");
                        } else if (itemAt.getUri() != null) {
                            com.tencent.mm.pluginsdk.ui.tools.m7 m7Var = new com.tencent.mm.pluginsdk.ui.tools.m7(r9Var.f198580d.g(), itemAt.getUri());
                            boolean wi6 = ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).wi();
                            long k17 = com.tencent.mm.vfs.w6.k(m7Var.f191776a);
                            long Ai = ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai();
                            if (itemCount == 1 && wi6 && k17 > Ai) {
                                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(r9Var.f198580d.g());
                                android.app.Activity g18 = r9Var.f198580d.g();
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                objArr[r112] = com.tencent.mm.sdk.platformtools.t8.f0(Ai);
                                u1Var.u(g18.getString(com.tencent.mm.R.string.ngn, objArr));
                                u1Var.n(r9Var.f198580d.g().getString(com.tencent.mm.R.string.fil));
                                u1Var.l(new com.tencent.mm.plugin.fav.ui.gallery.u0$$a());
                                u1Var.q(r112);
                            } else if (m7Var.f191777b == 0 || m7Var.f191776a == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.DragDropComponent", "get file path failed");
                            } else {
                                if (wi6) {
                                    d40.n nVar2 = (d40.n) ((e40.v) i95.n0.c(e40.v.class));
                                    nVar2.getClass();
                                    ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).getClass();
                                    if (k17 > ez.v0.f257777a.h() && k17 < nVar2.Bi()) {
                                        com.tencent.mm.ui.chatting.component.r9.m0(r9Var, m7Var);
                                    }
                                }
                                int i19 = m7Var.f191777b;
                                if (i19 == 3) {
                                    java.lang.String str = m7Var.f191776a;
                                    ((com.tencent.mm.ui.chatting.component.lk) ((sb5.w1) r9Var.f198580d.f460708c.a(sb5.w1.class))).o0(c01.z1.a(str, r9Var.f198580d.x(), true) ? 1 : 0, 0, 0, str, "");
                                } else if (i19 != 4) {
                                    com.tencent.mm.ui.chatting.component.r9.m0(r9Var, m7Var);
                                } else {
                                    android.content.Intent intent2 = new android.content.Intent();
                                    intent2.setData(itemAt.getUri());
                                    ((com.tencent.mm.ui.chatting.component.jo) ((sb5.p2) r9Var.f198580d.f460708c.a(sb5.p2.class))).p0(intent2, r9Var.f198580d.x());
                                }
                            }
                        } else if (itemAt.getText() != null && itemAt.getText().length() > 0) {
                            ((com.tencent.mm.ui.chatting.component.sk) ((sb5.f2) r9Var.f198580d.f460708c.a(sb5.f2.class))).q0(itemAt.getText().toString(), null);
                            i18++;
                            r112 = 0;
                        }
                        i18++;
                        r112 = 0;
                    }
                }
                if (nVar != null) {
                    n3.m.a(nVar.f334375a);
                }
            } else if (action == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_ENDED");
            } else {
                if (action != 5) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.DragDropComponent", "Unknown action type received by OnDragListener.");
                    yj0.a.i(z17, this, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                    return z17;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_ENTERED");
            }
            z17 = true;
            yj0.a.i(z17, this, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingUI.DragDropComponent", th6, "initDragDropEvent", new java.lang.Object[0]);
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
            return false;
        }
    }
}
