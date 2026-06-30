package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dv implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f112340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f112341e;

    public dv(com.tencent.mm.plugin.finder.live.plugin.iv ivVar, int i17) {
        this.f112340d = ivVar;
        this.f112341e = i17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f112340d;
        android.content.res.Resources resources = ivVar.B;
        if (this.f112341e == 3) {
            g4Var.f(ivVar.f113028z, resources.getString(com.tencent.mm.R.string.ehz));
        }
        g4Var.f(ivVar.f113025y, resources.getString(com.tencent.mm.R.string.f491699dy4));
    }
}
