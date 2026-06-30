package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f137132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f137133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout f137134f;

    public f(com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout, int i17, java.lang.String str) {
        this.f137134f = faceFlashActionPreviewLayout;
        this.f137132d = i17;
        this.f137133e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "click AlertDialog");
        dialogInterface.dismiss();
        this.f137134f.f137078s.W6(this.f137132d, this.f137133e);
    }
}
