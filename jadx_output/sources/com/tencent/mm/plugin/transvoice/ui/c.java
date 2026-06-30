package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class c extends c.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.e f175414a;

    public c(com.tencent.mm.plugin.transvoice.ui.e eVar) {
        this.f175414a = eVar;
    }

    @Override // c.c
    public void a(android.view.View bottomSheet, float f17) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        this.f175414a.f175426p = 0.7f >= f17;
    }

    @Override // c.c
    public void b(android.view.View bottomSheet, int i17) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        if (2 == i17) {
            com.tencent.mm.plugin.transvoice.ui.e eVar = this.f175414a;
            if (eVar.f175426p) {
                eVar.dismiss();
                return;
            }
            android.support.design.widget.MMBottomSheetBehavior mMBottomSheetBehavior = eVar.f175425o;
            if (mMBottomSheetBehavior == null) {
                return;
            }
            mMBottomSheetBehavior.C(3);
        }
    }
}
