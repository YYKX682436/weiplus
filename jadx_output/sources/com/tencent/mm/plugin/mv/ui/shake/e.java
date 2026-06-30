package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes5.dex */
public class e implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew f150942d;

    public e(com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew) {
        this.f150942d = musicMainUINew;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (1 == i17 && i18 == -1) {
            com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew = this.f150942d;
            dp.a.makeText(musicMainUINew.getContext(), musicMainUINew.getContext().getResources().getString(com.tencent.mm.R.string.j3v), 0).show();
        }
    }
}
