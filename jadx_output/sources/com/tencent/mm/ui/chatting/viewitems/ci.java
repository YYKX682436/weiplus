package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ci implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f203732a;

    public ci(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f203732a = chattingItemDyeingTemplate;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        final km5.b b17 = km5.u.b();
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f203732a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = chattingItemDyeingTemplate.f203176t;
        if (u3Var != null && u3Var.isShowing()) {
            chattingItemDyeingTemplate.f203176t.dismiss();
        }
        chattingItemDyeingTemplate.f203176t = db5.e1.Q(chattingItemDyeingTemplate.f203175s.g(), chattingItemDyeingTemplate.f203175s.s().getString(com.tencent.mm.R.string.f490573yv), chattingItemDyeingTemplate.f203175s.s().getString(com.tencent.mm.R.string.f490604zq), true, true, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.mm.ui.chatting.viewitems.ci$$a
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(android.content.DialogInterface dialogInterface) {
                km5.b.this.a(new com.tencent.mm.ui.chatting.viewitems.b(0, "cancel by user"));
            }
        });
        chattingItemDyeingTemplate.W = true;
        return null;
    }
}
