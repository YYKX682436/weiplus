package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class m4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a5 f113461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113462e;

    public m4(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var, java.lang.String str) {
        this.f113461d = a5Var;
        this.f113462e = str;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            g4Var.f(this.f113461d.U, this.f113462e);
        }
    }
}
