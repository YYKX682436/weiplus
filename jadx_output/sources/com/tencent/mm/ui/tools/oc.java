package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class oc implements com.tencent.mm.ui.widget.dialog.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f210625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210626b;

    public oc(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI, java.util.ArrayList arrayList) {
        this.f210626b = showVideoUI;
        this.f210625a = arrayList;
    }

    @Override // com.tencent.mm.ui.widget.dialog.d1
    public void onShow() {
        if (this.f210626b.f210229q) {
            h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
            com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210626b;
            ((g90.s) vVar).aj(showVideoUI, showVideoUI.f210236x, showVideoUI.K, 2, 4, this.f210625a);
        }
    }
}
