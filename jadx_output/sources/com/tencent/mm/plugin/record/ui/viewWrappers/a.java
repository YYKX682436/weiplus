package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes12.dex */
public class a implements com.tencent.mm.plugin.record.ui.g0 {

    /* renamed from: a, reason: collision with root package name */
    public q31.n f155502a = null;

    @Override // com.tencent.mm.plugin.record.ui.g0
    public android.view.View a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.dvx, null);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.rpb);
        ft3.g gVar = new ft3.g();
        this.f155502a = gVar;
        android.view.View a17 = gVar.a(context);
        viewGroup.removeAllViews();
        viewGroup.addView(a17);
        return inflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d4  */
    @Override // com.tencent.mm.plugin.record.ui.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.view.View r32, int r33, final et3.b r34, java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.record.ui.viewWrappers.a.b(android.view.View, int, et3.b, java.lang.Object):void");
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public void destroy() {
        this.f155502a = null;
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public void pause() {
    }
}
