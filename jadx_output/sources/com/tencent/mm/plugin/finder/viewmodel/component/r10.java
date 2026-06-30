package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class r10 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f135757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135758e;

    public r10(int i17, java.lang.String str) {
        this.f135757d = i17;
        this.f135758e = str;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            g4Var.d(1, this.f135757d, this.f135758e);
        }
    }
}
