package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class d0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.h0 f197795d;

    public d0(com.tencent.mm.ui.base.preference.h0 h0Var) {
        this.f197795d = h0Var;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = ((com.tencent.mm.ui.base.preference.Preference) obj).f197780q;
        com.tencent.mm.ui.base.preference.h0 h0Var = this.f197795d;
        return h0Var.n(str) - h0Var.n(((com.tencent.mm.ui.base.preference.Preference) obj2).f197780q);
    }
}
