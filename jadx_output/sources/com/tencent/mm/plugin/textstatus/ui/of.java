package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class of extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.tf f174154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(com.tencent.mm.plugin.textstatus.ui.tf tfVar) {
        super(0);
        this.f174154d = tfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment = new com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment();
        textStatusLikeListFragment.setArguments(this.f174154d.getIntent().getExtras());
        return textStatusLikeListFragment;
    }
}
