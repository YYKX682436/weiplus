package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class bi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.ei f131724d;

    public bi(com.tencent.mm.plugin.finder.view.ei eiVar) {
        this.f131724d = eiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.ei eiVar = this.f131724d;
        android.content.Context context = eiVar.f132007b;
        db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.f493757oy1));
        eiVar.dismiss();
    }
}
