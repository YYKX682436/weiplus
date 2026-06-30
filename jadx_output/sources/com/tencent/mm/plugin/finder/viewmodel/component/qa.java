package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class qa extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC f135678d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC) {
        super(1);
        this.f135678d = finderEmojiListUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gr.a0 a0Var = (gr.a0) obj;
        kotlin.jvm.internal.o.d(a0Var);
        com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC = this.f135678d;
        finderEmojiListUIC.getClass();
        if (finderEmojiListUIC.getActivity() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) {
            java.lang.String ProductID = ((so2.p) a0Var).f410535d.f32456d;
            kotlin.jvm.internal.o.f(ProductID, "ProductID");
            qk.c0 c0Var = new qk.c0(ProductID);
            c0Var.f364198g = 106;
            c0Var.f364155a = 57;
            com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
            if (p6Var == null) {
                com.tencent.mars.xlog.Log.e("FinderEmojiListUIC", "emoticon liteapp service not found");
            } else {
                ((com.tencent.mm.feature.emoji.f4) p6Var).wi(finderEmojiListUIC.getContext(), c0Var);
            }
        } else if (finderEmojiListUIC.getActivity() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderEmojiSelectUI) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            finderJumpInfo.setJumpinfo_type(3);
            finderJumpInfo.setBusiness_type(6);
            bw5.ra raVar = ((so2.p) a0Var).f410535d;
            finderJumpInfo.setWording(raVar.f32458f);
            finderJumpInfo.setRecommend_reason("表情专辑");
            finderJumpInfo.setSource(1);
            com.tencent.mm.protocal.protobuf.NativeInfo nativeInfo = new com.tencent.mm.protocal.protobuf.NativeInfo();
            nativeInfo.setNative_type(6);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("productId", raVar.f32456d);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, raVar.f32458f);
            nativeInfo.setNecessary_params(jSONObject.toString());
            finderJumpInfo.setNative_info(nativeInfo);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("JUMP_INFO", finderJumpInfo.toByteArray());
            finderEmojiListUIC.getActivity().setResult(-1, intent);
            finderEmojiListUIC.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
