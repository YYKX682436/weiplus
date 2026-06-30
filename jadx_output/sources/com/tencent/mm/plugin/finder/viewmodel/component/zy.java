package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class zy implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.iz f136725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.SpringBackLayout f136726e;

    public zy(com.tencent.mm.plugin.finder.viewmodel.component.iz izVar, com.tencent.mm.plugin.finder.view.SpringBackLayout springBackLayout) {
        this.f136725d = izVar;
        this.f136726e = springBackLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.iz izVar = this.f136725d;
        if (izVar.f134774g.size() > 5) {
            com.tencent.mm.plugin.finder.view.SpringBackLayout springBackLayout = this.f136726e;
            kotlin.jvm.internal.o.f(springBackLayout, "$springBackLayout");
            hc2.f1.d(springBackLayout);
            izVar.getClass();
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.app.Activity context = izVar.getContext();
            java.lang.String promptWording = izVar.f134778n;
            com.tencent.mm.protobuf.g gVar = izVar.f134777m;
            int i17 = izVar.f134776i;
            i0Var.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(promptWording, "promptWording");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, com.tencent.mm.plugin.finder.ui.FinderContinueWatchUI.class);
            intent.putExtra("key_continue_prompt", promptWording);
            intent.putExtra("key_continue_lastbuf", gVar != null ? gVar.f192156a : null);
            intent.putExtra("key_continue_flag", i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderContinueWatchUI", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/protobuf/ByteString;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderContinueWatchUI", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/protobuf/ByteString;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
