package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class f5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderEditTextUI f129120d;

    public f5(com.tencent.mm.plugin.finder.ui.FinderEditTextUI finderEditTextUI) {
        this.f129120d = finderEditTextUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_OPEN_UPLOAD_DRAFT_STRING_SYNC, "");
        this.f129120d.finish();
    }
}
