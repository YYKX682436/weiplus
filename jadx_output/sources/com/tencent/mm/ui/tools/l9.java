package com.tencent.mm.ui.tools;

/* loaded from: classes.dex */
public class l9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareImageRedirectUI f210552d;

    public l9(com.tencent.mm.ui.tools.ShareImageRedirectUI shareImageRedirectUI) {
        this.f210552d = shareImageRedirectUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f210552d.finish();
    }
}
