package com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment;

/* loaded from: classes5.dex */
public final class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment f156411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f156412b;

    public f(com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment musicPickerLikeBgmFragment, boolean z17) {
        this.f156411a = musicPickerLikeBgmFragment;
        this.f156412b = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList<r45.ug4> items = ((r45.wg4) fVar.f70618d).f389147f;
        kotlin.jvm.internal.o.f(items, "items");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (r45.ug4 ug4Var : items) {
            r45.vv0 vv0Var = new r45.vv0();
            vv0Var.f388599d = ug4Var;
            vv0Var.f388600e = -1;
            arrayList.add(vv0Var);
        }
        linkedList.addAll(arrayList);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment musicPickerLikeBgmFragment = this.f156411a;
        boolean z17 = this.f156412b;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        r45.wg4 wg4Var = (r45.wg4) fVar.f70618d;
        musicPickerLikeBgmFragment.G0(z17, i17, i18, str, wg4Var.f389146e, wg4Var.f389145d, linkedList);
        return null;
    }
}
