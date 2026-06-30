package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class h0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.AddFavoriteUI f210450d;

    public h0(com.tencent.mm.ui.tools.AddFavoriteUI addFavoriteUI) {
        this.f210450d = addFavoriteUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f210450d.finish();
    }
}
