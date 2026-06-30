package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class z0 implements com.tencent.mm.plugin.lite.ui.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppDragHalfScreenUI f144504a;

    public z0(com.tencent.mm.plugin.lite.ui.WxaLiteAppDragHalfScreenUI wxaLiteAppDragHalfScreenUI) {
        this.f144504a = wxaLiteAppDragHalfScreenUI;
    }

    @Override // com.tencent.mm.plugin.lite.ui.c
    public void a() {
        com.tencent.mars.xlog.Log.i("WxaLiteAppDragHalfScreenUI", "onWholeScreen!");
    }

    @Override // com.tencent.mm.plugin.lite.ui.c
    public void b(float f17) {
        com.tencent.mars.xlog.Log.i("WxaLiteAppDragHalfScreenUI", "onTranslationY " + f17);
    }

    @Override // com.tencent.mm.plugin.lite.ui.c
    public void c(com.tencent.mm.plugin.lite.ui.a type) {
        kotlin.jvm.internal.o.g(type, "type");
        if (type == com.tencent.mm.plugin.lite.ui.a.f144378d) {
            this.f144504a.finish();
        }
    }

    @Override // com.tencent.mm.plugin.lite.ui.c
    public void d(com.tencent.mm.plugin.lite.ui.a type) {
        kotlin.jvm.internal.o.g(type, "type");
    }
}
