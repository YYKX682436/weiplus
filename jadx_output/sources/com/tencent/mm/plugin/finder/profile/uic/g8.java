package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class g8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123732d;

    public g8(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f123732d = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123732d;
        obVar.c7().setVisibility(8);
        if (!obVar.A7()) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.E2).getValue()).r()).intValue() != 1) {
                if (obVar.getFragmentMode()) {
                    obVar.c7().setVisibility(0);
                    obVar.c7().setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.f8(obVar));
                }
                android.widget.TableLayout finderProfileNameContainer = obVar.h7().T;
                kotlin.jvm.internal.o.f(finderProfileNameContainer, "finderProfileNameContainer");
            }
        }
        obVar.c7().setVisibility(8);
        android.widget.TableLayout finderProfileNameContainer2 = obVar.h7().T;
        kotlin.jvm.internal.o.f(finderProfileNameContainer2, "finderProfileNameContainer");
    }
}
