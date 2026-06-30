package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ci implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f134020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f134021e;

    public ci(android.content.Context context, xc2.p0 p0Var) {
        this.f134020d = context;
        this.f134021e = p0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        xc2.n nVar = xc2.n.f453212a;
        android.content.Context context = this.f134020d;
        kotlin.jvm.internal.o.g(context, "context");
        xc2.p0 infoEx = this.f134021e;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        xc2.n.d(nVar, context, null, "feed_jumpicon_halfscreenleave", 1, infoEx, 0, 1, null, null, null, com.tencent.wxmm.v2helper.EMethodAudioRecordAction, null);
    }
}
