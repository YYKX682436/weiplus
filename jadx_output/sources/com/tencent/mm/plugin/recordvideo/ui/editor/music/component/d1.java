package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class d1 implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e1 f156192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 f156193e;

    public d1(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e1 e1Var, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 j0Var) {
        this.f156192d = e1Var;
        this.f156193e = j0Var;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
        java.lang.Object obj;
        if (iVar == null || (obj = iVar.f343778a) == null || !(obj instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m0)) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f156192d.f156215n, "onTabReselected " + obj);
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        java.lang.Object obj;
        if (iVar == null || (obj = iVar.f343778a) == null || !(obj instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m0)) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f156192d.f156215n, "onTabUnselected " + obj);
        ((com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m0) obj).a(false);
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        java.lang.Object obj;
        if (iVar == null || (obj = iVar.f343778a) == null || !(obj instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m0)) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f156192d.f156215n, "onTabSelected " + obj);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m0 m0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m0) obj;
        m0Var.a(true);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_tab_to_select", m0Var.f156293c);
        this.f156193e.j(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156245e, bundle);
    }
}
