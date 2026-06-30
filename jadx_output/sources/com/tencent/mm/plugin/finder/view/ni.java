package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class ni implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.si f132715d;

    public ni(com.tencent.mm.plugin.finder.view.si siVar) {
        this.f132715d = siVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.si siVar = this.f132715d;
        android.content.Context context = siVar.f133040b;
        db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.f491301cp3));
        siVar.dismiss();
    }
}
