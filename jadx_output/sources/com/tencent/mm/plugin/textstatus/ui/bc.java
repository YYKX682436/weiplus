package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes8.dex */
public final class bc {
    public bc(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity.class);
        intent.putExtra("status_id", str);
        pf5.j0.a(intent, com.tencent.mm.plugin.textstatus.ui.p.class);
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        cVar.f20922a.f20924a = context;
        cVar.e(true);
        cVar.b(com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment.class);
        cVar.a("com.tencent.mm.plugin.textstatus.ui.TextStatusHalfScreenLikeListUI");
        cVar.h(1);
    }
}
