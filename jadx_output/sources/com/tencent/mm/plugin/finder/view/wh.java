package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class wh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.ei f133295d;

    public wh(com.tencent.mm.plugin.finder.view.ei eiVar) {
        this.f133295d = eiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.ei eiVar = this.f133295d;
        android.content.Context context = eiVar.f132007b;
        db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.f493757oy1));
        eiVar.dismiss();
    }
}
