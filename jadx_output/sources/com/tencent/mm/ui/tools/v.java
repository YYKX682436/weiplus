package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class v implements com.tencent.mm.ui.widget.snackbar.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.AddFavoriteUI f210832a;

    public v(com.tencent.mm.ui.tools.AddFavoriteUI addFavoriteUI) {
        this.f210832a = addFavoriteUI;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void a() {
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onHide() {
        this.f210832a.finish();
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onShow() {
    }
}
