package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class yc implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210932d;

    public yc(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
        this.f210932d = showVideoUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        float b17 = i65.a.b(this.f210932d.getContext(), 12);
        if (view != null) {
            view.setOutlineProvider(new zl5.a(true, false, b17));
        }
        if (view == null) {
            return null;
        }
        view.setClipToOutline(true);
        return null;
    }
}
