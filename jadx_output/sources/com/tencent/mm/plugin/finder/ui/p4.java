package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class p4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI f129618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129619e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI finderCropAvatarUI, java.lang.String str) {
        super(2);
        this.f129618d = finderCropAvatarUI;
        this.f129619e = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        e60.h1 result = (e60.h1) obj2;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI finderCropAvatarUI = this.f129618d;
        com.tencent.mm.sdk.platformtools.u3.l(finderCropAvatarUI.G);
        android.app.Dialog dialog = finderCropAvatarUI.F;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (booleanValue) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_result_img_path", this.f129619e);
            finderCropAvatarUI.setResult(-1, intent);
            finderCropAvatarUI.finish();
        } else {
            pm0.v.X(new com.tencent.mm.plugin.finder.ui.o4(finderCropAvatarUI));
        }
        return jz5.f0.f302826a;
    }
}
