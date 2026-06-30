package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class ld implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f129472d;

    public ld(boolean z17) {
        this.f129472d = z17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            g4Var.a(4000, com.tencent.mm.R.string.f492028f00);
            g4Var.a(4001, com.tencent.mm.R.string.f3d);
            if (this.f129472d) {
                g4Var.a(com.google.android.gms.wearable.WearableStatusCodes.DATA_ITEM_TOO_LARGE, com.tencent.mm.R.string.cnt);
            }
        }
    }
}
