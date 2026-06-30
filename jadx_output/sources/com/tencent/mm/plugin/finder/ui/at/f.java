package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public final class f implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.at.l f128881d;

    public f(com.tencent.mm.plugin.finder.ui.at.l lVar) {
        this.f128881d = lVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.ui.at.l lVar;
        com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar;
        if (((ym3.o) obj).f463177a != ym3.p.f463181f || (alphabetScrollBar = (lVar = this.f128881d).f128891v) == null) {
            return;
        }
        alphabetScrollBar.setAlphabet((java.lang.String[]) lVar.R().C.toArray(new java.lang.String[0]));
    }
}
