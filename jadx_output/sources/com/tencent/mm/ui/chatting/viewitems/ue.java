package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes7.dex */
final class ue implements com.tencent.mm.ipcinvoker.j {
    private ue() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.xweb_ext.video.AppBrandWeishiVideoOperation appBrandWeishiVideoOperation = (com.tencent.mm.plugin.appbrand.xweb_ext.video.AppBrandWeishiVideoOperation) obj;
        if (appBrandWeishiVideoOperation != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgWeishiVideo", "[weishi] invoke, cache video");
            bf1.a aVar = bf1.a.f19574e;
            ((bf1.h) aVar.f19575d).h(appBrandWeishiVideoOperation.f92396d, appBrandWeishiVideoOperation.f92397e, appBrandWeishiVideoOperation.f92398f);
        }
    }
}
