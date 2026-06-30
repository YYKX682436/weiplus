package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class i7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f117145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117146e;

    public i7(boolean z17, com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var) {
        this.f117145d = z17;
        this.f117146e = b8Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.finder.live.viewmodel.b8.f7(this.f117146e, this.f117145d, true);
    }
}
