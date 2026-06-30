package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes3.dex */
class p3 implements com.tencent.mm.ipcinvoker.j {
    private p3() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
        java.lang.String string = bundle.getString("image_path", "");
        ((com.tencent.mm.pluginsdk.model.b2) c5Var).getClass();
        com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent, 1, string);
        doFavoriteEvent.e();
        bundle.putInt("fav_simple_img_result", doFavoriteEvent.f54091h.f6433a);
        rVar.a(bundle);
    }
}
