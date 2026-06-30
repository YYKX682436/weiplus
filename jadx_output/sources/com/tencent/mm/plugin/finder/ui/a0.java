package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class a0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f128837d;

    public a0(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f128837d = mMActivity;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            g4Var.d(3, android.graphics.Color.parseColor("#FA5151"), this.f128837d.getResources().getString(com.tencent.mm.R.string.mag));
        }
    }
}
