package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class jb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210519d;

    public jb(com.tencent.mm.ui.tools.ShowImageUI showImageUI) {
        this.f210519d = showImageUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f210519d.finish();
    }
}
