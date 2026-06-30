package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class x implements com.tencent.mm.ui.widget.snackbar.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.AddFavoriteUI f210890a;

    public x(com.tencent.mm.ui.tools.AddFavoriteUI addFavoriteUI) {
        this.f210890a = addFavoriteUI;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void a() {
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onHide() {
        this.f210890a.finish();
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onShow() {
    }
}
