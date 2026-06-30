package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f156323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 f156324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f156325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z17, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var, boolean z18) {
        super(2);
        this.f156323d = z17;
        this.f156324e = e0Var;
        this.f156325f = z18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yz5.l lVar;
        yz5.l lVar2;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        boolean z17 = this.f156323d;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = this.f156324e;
        if (z17 && (lVar2 = e0Var.B) != null) {
            lVar2.invoke(java.lang.Integer.valueOf(intValue));
        }
        if (this.f156325f && (lVar = e0Var.C) != null) {
            lVar.invoke(java.lang.Integer.valueOf(intValue2));
        }
        return jz5.f0.f302826a;
    }
}
