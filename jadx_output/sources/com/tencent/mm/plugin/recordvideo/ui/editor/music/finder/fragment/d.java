package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

/* loaded from: classes5.dex */
public final class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f156362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment f156363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f156364c;

    public d(long j17, com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment finderMusicPickerLikeFragment, boolean z17) {
        this.f156362a = j17;
        this.f156363b = finderMusicPickerLikeFragment;
        this.f156364c = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a f17;
        dv3.c cVar;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f156362a;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment finderMusicPickerLikeFragment = this.f156363b;
        boolean z17 = this.f156364c;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str2 = fVar.f70617c;
        r45.xv0 xv0Var = (r45.xv0) fVar.f70618d;
        boolean z18 = xv0Var.f390474e;
        com.tencent.mm.protobuf.g gVar = xv0Var.f390473d;
        java.util.LinkedList items = xv0Var.f390475f;
        kotlin.jvm.internal.o.f(items, "items");
        finderMusicPickerLikeFragment.G0(z17, i17, i18, str2, z18, gVar, items);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment finderMusicPickerLikeFragment2 = this.f156363b;
        dv3.c cVar2 = finderMusicPickerLikeFragment2.f156381e;
        if (cVar2 == null || (str = cVar2.f243996J) == null) {
            str = "";
        }
        if ((str.length() > 0) && (cVar = finderMusicPickerLikeFragment2.f156381e) != null) {
            cVar.V0(str, rv3.y.f400419a);
        }
        ev3.d dVar = finderMusicPickerLikeFragment2.f156380d;
        if (dVar == null || (f17 = dVar.f()) == null) {
            return null;
        }
        f17.n(finderMusicPickerLikeFragment2.n0(), ((r45.xv0) fVar.f70618d).f390475f.size(), currentTimeMillis);
        return null;
    }
}
