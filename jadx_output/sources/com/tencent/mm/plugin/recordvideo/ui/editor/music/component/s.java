package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 f156311d;

    public s(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var) {
        this.f156311d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Boolean bool;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent$initMuteOrigin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = this.f156311d;
        java.lang.Boolean bool2 = (java.lang.Boolean) e0Var.F.get(2);
        boolean booleanValue = bool2 == null ? false : bool2.booleanValue();
        fv3.c cVar = e0Var.f266982d;
        if (!booleanValue) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("key_boolean", e0Var.s(2));
            bundle.putInt("key_option_type", 2);
            cVar.j(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156255r, bundle);
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent$initMuteOrigin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView icon = (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) e0Var.f156199n).getValue();
        kotlin.jvm.internal.o.g(icon, "icon");
        java.util.HashMap hashMap = e0Var.E;
        if (hashMap.containsKey(2) && (bool = (java.lang.Boolean) hashMap.get(2)) != null) {
            bool.booleanValue();
            boolean z17 = !bool.booleanValue();
            e0Var.J(2, z17);
            if (z17) {
                e0Var.z(icon, z17);
            } else {
                e0Var.z(icon, z17);
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("key_boolean", z17);
            cVar.j(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156251n, bundle2);
        }
        e0Var.I(e0Var.u(), e0Var.v().getText().toString(), e0Var.s(2));
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent$initMuteOrigin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
