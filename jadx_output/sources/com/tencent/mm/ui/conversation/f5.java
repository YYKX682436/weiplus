package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class f5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.o5 f207673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s35.b f207674e;

    public f5(com.tencent.mm.ui.conversation.o5 o5Var, s35.b bVar) {
        this.f207673d = o5Var;
        this.f207674e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/FolderHelper$initBanner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.conversation.o5 o5Var = this.f207673d;
        if (currentTimeMillis - o5Var.f207923J < 1000) {
            yj0.a.h(this, "com/tencent/mm/ui/conversation/FolderHelper$initBanner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        o5Var.f207923J = currentTimeMillis;
        if (this.f207674e.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FolderHelper", "fold banner clicked !");
            o5Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/FolderHelper$initBanner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
