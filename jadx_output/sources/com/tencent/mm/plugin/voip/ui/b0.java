package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI f176938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI repairerVoipFaceBeautyUI) {
        super(0);
        this.f176938d = repairerVoipFaceBeautyUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI repairerVoipFaceBeautyUI = this.f176938d;
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI$paramsAdapter$2$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.voip.ui.d(new com.tencent.mm.plugin.voip.ui.a0(repairerVoipFaceBeautyUI));
            }
        };
        int i17 = com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI.g;
        return new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, repairerVoipFaceBeautyUI.U6(), false);
    }
}
