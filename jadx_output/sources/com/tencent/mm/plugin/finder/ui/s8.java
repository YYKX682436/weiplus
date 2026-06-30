package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class s8 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f129797d;

    public s8(kotlinx.coroutines.q qVar) {
        this.f129797d = qVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f129797d.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }
}
