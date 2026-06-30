package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class d1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.l1 f117021d;

    public d1(com.tencent.mm.plugin.finder.live.viewmodel.l1 l1Var) {
        this.f117021d = l1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.finder.live.viewmodel.b1 b1Var = this.f117021d.f117209f;
        if (b1Var != null) {
            com.tencent.mm.plugin.finder.live.viewmodel.b1.B5(b1Var, false, null, null, false, 0, 0L, 62, null);
        }
    }
}
