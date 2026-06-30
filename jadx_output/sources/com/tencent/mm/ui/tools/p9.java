package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class p9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareImgUI f210640d;

    public p9(com.tencent.mm.ui.tools.ShareImgUI shareImgUI) {
        this.f210640d = shareImgUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f210640d.finish();
    }
}
