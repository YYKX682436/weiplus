package wj2;

/* loaded from: classes10.dex */
public final class g implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f446676d;

    public g(wj2.w wVar) {
        this.f446676d = wVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        r45.xn1 xn1Var;
        g4Var.clear();
        wj2.w wVar = this.f446676d;
        if (wVar.B()) {
            ((db5.h4) g4Var.i(2, wVar.getContext().getResources().getString(com.tencent.mm.R.string.dxz), android.graphics.Color.parseColor("#B4B4B4"), com.tencent.mm.R.raw.icons_outlined_mic_on, android.graphics.Color.parseColor("#B4B4B4"))).f228375s = true;
        } else if (wVar.f446719i.a0().F()) {
            g4Var.h(2, wVar.getContext().getResources().getString(com.tencent.mm.R.string.dwx), com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.icons_outlined_microphone_mute_on_dark : com.tencent.mm.R.raw.icons_outlined_microphone_mute_on_light, 0);
        } else {
            g4Var.g(2, wVar.getContext().getResources().getString(com.tencent.mm.R.string.dxy), com.tencent.mm.R.raw.icons_outlined_mic_off);
        }
        if (wVar.z()) {
            if (wVar.f446721n == 1) {
                km2.q bindLinkMicUser = wVar.getBindLinkMicUser();
                if (!((bindLinkMicUser == null || (xn1Var = bindLinkMicUser.f309187r) == null || !km2.o.a(xn1Var)) ? false : true)) {
                    g4Var.g(7, wVar.getContext().getResources().getString(com.tencent.mm.R.string.dyc), com.tencent.mm.R.raw.icons_outlined_video_call);
                }
            } else {
                g4Var.g(6, wVar.getContext().getResources().getString(com.tencent.mm.R.string.dya), com.tencent.mm.R.raw.icons_outlined_call);
            }
        }
        if (wVar.C()) {
            g4Var.g(3, wVar.getContext().getResources().getString(com.tencent.mm.R.string.f491615do1), com.tencent.mm.R.raw.icons_outlined_camera_switch);
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R).getValue()).r()).intValue() == 1) {
                g4Var.g(5, wVar.getContext().getResources().getString(com.tencent.mm.R.string.dun), com.tencent.mm.R.raw.icons_outlined_screen_effect_regular);
            }
        }
        g4Var.g(4, wVar.getContext().getResources().getString(com.tencent.mm.R.string.f491605dn1), com.tencent.mm.R.raw.finder_live_unmic);
    }
}
