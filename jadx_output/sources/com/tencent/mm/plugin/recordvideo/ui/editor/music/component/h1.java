package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j1 f156242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j1 j1Var) {
        super(1);
        this.f156242d = j1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j1 j1Var = this.f156242d;
        j1Var.f156277e = intValue;
        yz5.p pVar = j1Var.f156278f;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(j1Var.f156276d), java.lang.Integer.valueOf(j1Var.f156277e));
        }
        return jz5.f0.f302826a;
    }
}
