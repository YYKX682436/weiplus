package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class gd extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment f173913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment) {
        super(3);
        this.f173913d = textStatusLikeListFragment;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).longValue();
        kotlin.jvm.internal.o.g(view, "view");
        qj4.s sVar = qj4.s.f363958a;
        int i17 = com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment.f173642y;
        mj4.h E = ai4.m0.f5173a.E();
        qj4.s.l(sVar, 22L, null, null, 0L, E != null ? ((mj4.k) E).l() : "", 0L, 46, null);
        com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment = this.f173913d;
        textStatusLikeListFragment.f173651v = intValue;
        rl5.r rVar = new rl5.r(textStatusLikeListFragment.getContext());
        rVar.L = new com.tencent.mm.plugin.textstatus.ui.fd(textStatusLikeListFragment);
        db5.t4 t4Var = textStatusLikeListFragment.f173653x;
        int[] iArr = textStatusLikeListFragment.f173648s;
        rVar.g(view, intValue, 0L, textStatusLikeListFragment, t4Var, iArr[0], iArr[1]);
        return java.lang.Boolean.TRUE;
    }
}
