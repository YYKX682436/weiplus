package com.tencent.mm.ui.chatting.component;

/* loaded from: classes3.dex */
public final class k9 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f199355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f199356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f199357f;

    public k9(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.r2 r2Var, yz5.a aVar) {
        this.f199355d = c0Var;
        this.f199356e = r2Var;
        this.f199357f = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f199355d.f310112d = true;
        kotlinx.coroutines.p2.a(this.f199356e, null, 1, null);
        this.f199357f.invoke();
    }
}
