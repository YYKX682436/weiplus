package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class f3 implements com.tencent.mm.pluginsdk.ui.tools.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.g3 f149331d;

    public f3(com.tencent.mm.plugin.mmsight.ui.g3 g3Var) {
        this.f149331d = g3Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.e4
    public void v() {
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.mmsight.ui.e3(this), 50L);
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149331d.f149335d;
        if (sightCaptureUI.V.f148828r) {
            sightCaptureUI.f149248x.setVisibility(0);
        }
    }
}
