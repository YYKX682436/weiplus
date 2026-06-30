package wj2;

/* loaded from: classes10.dex */
public final class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f446683d;

    public h(wj2.w wVar) {
        this.f446683d = wVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        java.lang.String str;
        g4Var.clear();
        wj2.w wVar = this.f446683d;
        lj2.v0 v0Var = wVar.f446719i;
        int E = v0Var.a0().E();
        g4Var.g(10001, E > 0 ? wVar.getContext().getResources().getString(com.tencent.mm.R.string.eni, java.lang.Integer.valueOf(E)) : wVar.getContext().getResources().getString(com.tencent.mm.R.string.f491582eg1), com.tencent.mm.R.raw.icon_album);
        g4Var.g(10002, wVar.getContext().getResources().getString(com.tencent.mm.R.string.mnb), com.tencent.mm.R.raw.icon_choose_song_regular);
        lj2.t0 a07 = v0Var.a0();
        km2.q bindLinkMicUser = wVar.getBindLinkMicUser();
        if (bindLinkMicUser == null || (str = bindLinkMicUser.f309170a) == null) {
            str = "";
        }
        if (a07.j(str)) {
            g4Var.g(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, wVar.getContext().getResources().getString(com.tencent.mm.R.string.mjh), com.tencent.mm.R.raw.icon_sound_effects_regular);
            int i17 = wVar.f446725r == 2 ? 3 : 4;
            lf2.a aVar = (lf2.a) v0Var.o(lf2.a.class);
            if (aVar != null) {
                aVar.Z6(1, i17);
            }
            g4Var.g(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, wVar.getContext().getResources().getString(com.tencent.mm.R.string.f491820mo5), com.tencent.mm.R.raw.icon_next_song_regular);
        }
        java.util.List list = g4Var.f228344d;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                v0Var.i0(((android.view.MenuItem) it.next()).getItemId());
            }
        }
    }
}
