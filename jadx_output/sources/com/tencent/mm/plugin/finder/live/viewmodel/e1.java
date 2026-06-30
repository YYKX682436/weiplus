package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class e1 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f117054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.l1 f117055e;

    public e1(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.live.viewmodel.l1 l1Var) {
        this.f117054d = c0Var;
        this.f117055e = l1Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.finder.live.viewmodel.b1 b1Var;
        if (this.f117054d.f310112d || (b1Var = this.f117055e.f117209f) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.viewmodel.b1.B5(b1Var, false, null, null, false, 0, 0L, 62, null);
    }
}
