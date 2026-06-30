package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class kb implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210534d;

    public kb(com.tencent.mm.ui.tools.ShowImageUI showImageUI) {
        this.f210534d = showImageUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        float b17 = i65.a.b(this.f210534d.getContext(), 0);
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
