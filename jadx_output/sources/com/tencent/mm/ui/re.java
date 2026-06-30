package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class re implements zy2.ja {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.he f209609a;

    public re(com.tencent.mm.ui.he heVar) {
        this.f209609a = heVar;
    }

    public void b(java.lang.String str, boolean z17) {
        com.tencent.mm.ui.he heVar = this.f209609a;
        if (heVar.f208866g != null) {
            ((com.tencent.mm.plugin.finder.extension.reddot.g) heVar.f208865f).getClass();
            if (!((com.tencent.mm.plugin.finder.storage.aj0.f126440a.K() ? ((java.lang.Number) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "发现页底部字符红点：视频号空字符只能覆盖视频号设置过的字符", e42.c0.clicfg_finder_only_reset_discovery_reddot_for_finder, 1, false, com.tencent.mm.plugin.finder.storage.hf0.f126892d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.f126463q).getValue()).r()).intValue()) == 1)) {
                ((com.tencent.mm.ui.LauncherUIBottomTabView) heVar.f208866g).g(true, str);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str) || z17) {
                ((com.tencent.mm.ui.LauncherUIBottomTabView) heVar.f208866g).g(true, str);
            }
        }
    }
}
