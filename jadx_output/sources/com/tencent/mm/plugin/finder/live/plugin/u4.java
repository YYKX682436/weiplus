package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class u4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a5 f114518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114519e;

    public u4(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var, java.lang.String str) {
        this.f114518d = a5Var;
        this.f114519e = str;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            g4Var.f(this.f114518d.U, this.f114519e);
        }
    }
}
