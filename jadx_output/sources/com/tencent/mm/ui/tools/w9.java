package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class w9 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareImgUI f210885d;

    public w9(com.tencent.mm.ui.tools.ShareImgUI shareImgUI) {
        this.f210885d = shareImgUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.tools.ShareImgUI shareImgUI = this.f210885d;
        java.util.Iterator it = shareImgUI.f210155g.iterator();
        while (it.hasNext()) {
            gm0.j1.d().d((com.tencent.mm.modelbase.m1) it.next());
        }
        shareImgUI.finish();
    }
}
