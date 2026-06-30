package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes9.dex */
public final class hg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI f173965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj4.h f173966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f173967f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173968g;

    public hg(com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI textStatusShowStatusCardUI, mj4.h hVar, android.view.ViewGroup viewGroup, java.lang.String str) {
        this.f173965d = textStatusShowStatusCardUI;
        this.f173966e = hVar;
        this.f173967f = viewGroup;
        this.f173968g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Long valueOf;
        com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI textStatusShowStatusCardUI = this.f173965d;
        int i17 = textStatusShowStatusCardUI.f173698e;
        android.view.ViewGroup viewGroup = this.f173967f;
        mj4.h hVar = this.f173966e;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            com.tencent.mm.plugin.textstatus.ui.bc bcVar = com.tencent.mm.plugin.textstatus.ui.TextStatusHalfScreenLikeListUI.f173626i;
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            bcVar.a(context, ((mj4.k) hVar).l());
            return;
        }
        boolean w17 = ((mj4.k) hVar).w();
        com.tencent.mm.plugin.textstatus.ui.gg ggVar = com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173693f;
        if (com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173696i)) {
            valueOf = 0L;
        } else {
            java.lang.String str = com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173696i;
            valueOf = str != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(str)) : null;
        }
        java.lang.Long l17 = valueOf;
        com.tencent.mm.plugin.textstatus.ui.i5 i5Var = com.tencent.mm.plugin.textstatus.ui.TextStatusCommentTransparentActivity.f173501d;
        android.content.Context context2 = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.textstatus.ui.i5.a(i5Var, context2, textStatusShowStatusCardUI.f173698e, this.f173968g, ((mj4.k) hVar).l(), java.lang.Boolean.valueOf(w17), l17, 11, 0, 128, null);
    }
}
