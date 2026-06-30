package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI f184814d;

    public i(com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI) {
        this.f184814d = createAvatarUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f184814d, 1, false);
        k0Var.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.webview.ui.tools.i$$a
            @Override // db5.o4
            public final void onCreateMMMenu(db5.g4 g4Var) {
                com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI = com.tencent.mm.plugin.webview.ui.tools.i.this.f184814d;
                g4Var.f(1, createAvatarUI.getContext().getResources().getString(com.tencent.mm.R.string.lsr));
                g4Var.f(0, createAvatarUI.getContext().getResources().getString(com.tencent.mm.R.string.lsq));
            }
        };
        k0Var.f211881s = new db5.t4() { // from class: com.tencent.mm.plugin.webview.ui.tools.i$$b
            @Override // db5.t4
            public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
                com.tencent.mm.plugin.webview.ui.tools.i iVar = com.tencent.mm.plugin.webview.ui.tools.i.this;
                iVar.getClass();
                int itemId = menuItem.getItemId();
                com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI = iVar.f184814d;
                if (itemId != 0) {
                    if (itemId != 1) {
                        return;
                    }
                    ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                    com.tencent.mm.pluginsdk.ui.tools.l7.e(createAvatarUI, 4, 1, 5, null);
                    return;
                }
                java.lang.String str = createAvatarUI.f183588h;
                com.tencent.mars.xlog.Log.i("MicroMsg.CreateAvatarUI", "doGetRandomAvatar appid: %s", str);
                gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.e1(str));
                createAvatarUI.f183601x = java.lang.System.currentTimeMillis();
            }
        };
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
