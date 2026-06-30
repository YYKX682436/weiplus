package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class w7 implements com.tencent.mm.plugin.sight.decode.model.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoSightView f191970a;

    public w7(com.tencent.mm.pluginsdk.ui.tools.VideoSightView videoSightView) {
        this.f191970a = videoSightView;
    }

    @Override // com.tencent.mm.plugin.sight.decode.model.k
    public void a(com.tencent.mm.plugin.sight.decode.model.s sVar, int i17) {
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var;
        com.tencent.mm.pluginsdk.ui.tools.VideoSightView videoSightView = this.f191970a;
        if (-1 == i17) {
            com.tencent.mm.pluginsdk.ui.tools.a4 a4Var2 = videoSightView.L;
            if (a4Var2 != null) {
                a4Var2.onError(0, 0);
                return;
            }
            return;
        }
        if (i17 != 0 || (a4Var = videoSightView.L) == null) {
            return;
        }
        a4Var.onCompletion();
    }
}
