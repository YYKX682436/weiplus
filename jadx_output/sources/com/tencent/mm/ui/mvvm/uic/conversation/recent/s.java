package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class s implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.t f209361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f209362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f209363f;

    public s(com.tencent.mm.ui.mvvm.uic.conversation.recent.t tVar, java.lang.String str, int i17) {
        this.f209361d = tVar;
        this.f209362e = str;
        this.f209363f = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.mvvm.uic.conversation.recent.t tVar = this.f209361d;
        java.lang.String str = this.f209362e;
        int i18 = this.f209363f;
        com.tencent.mm.ui.mvvm.uic.conversation.recent.t.T6(tVar, str, i18);
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e.p(i18, str);
    }
}
