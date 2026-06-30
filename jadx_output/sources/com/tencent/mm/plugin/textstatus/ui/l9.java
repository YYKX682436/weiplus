package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class l9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj4.h f174053e;

    public l9(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity, mj4.h hVar) {
        this.f174052d = textStatusEditActivity;
        this.f174053e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174052d;
        if (textStatusEditActivity.e7().f354974f != 1 || com.tencent.mm.vfs.w6.j(textStatusEditActivity.d7().f173900b)) {
            textStatusEditActivity.t7(textStatusEditActivity.d7().f173900b, textStatusEditActivity.d7().f173902d);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "mediaFilePath not exist,rerun download");
        mj4.h hVar = this.f174053e;
        textStatusEditActivity.v7(hVar != null ? ((mj4.k) hVar).j() : null, null);
    }
}
