package com.tencent.mm.plugin.flash;

/* loaded from: classes.dex */
public class k implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.FaceFlashProcessLayout f137224d;

    public k(com.tencent.mm.plugin.flash.FaceFlashProcessLayout faceFlashProcessLayout) {
        this.f137224d = faceFlashProcessLayout;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/FaceFlashProcessLayout$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.sdk.platformtools.o4.M("face-flash").B("show-dialog", 0L);
        db5.t7.makeText(this.f137224d.getContext(), "ok", 1).show();
        yj0.a.i(true, this, "com/tencent/mm/plugin/flash/FaceFlashProcessLayout$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
