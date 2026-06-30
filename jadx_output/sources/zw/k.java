package zw;

/* loaded from: classes8.dex */
public final class k implements rv.f3 {
    @Override // rv.f3
    public void a(java.lang.String filePath, java.lang.String picId, java.lang.String prompt, java.lang.Long l17, java.lang.String templateId, java.lang.String dataBuf, java.lang.String style) {
        l17.longValue();
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(picId, "picId");
        kotlin.jvm.internal.o.g(prompt, "prompt");
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(dataBuf, "dataBuf");
        kotlin.jvm.internal.o.g(style, "style");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterSelectPhotoHandler", "textCoverCallback onResult: ".concat(picId));
    }

    @Override // rv.f3
    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterSelectPhotoHandler", "textCoverCallback onRequestNativeBottomOverlayVisible: " + z17);
        rr1.a aVar = com.tencent.mm.plugin.brandservice.ui.flutter.BizTextCoverUI.f94058i;
        if (aVar != null) {
            com.tencent.mm.plugin.brandservice.ui.flutter.BizTextCoverUI bizTextCoverUI = (com.tencent.mm.plugin.brandservice.ui.flutter.BizTextCoverUI) aVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTextCoverUI", "onVisibleChanged visible=" + z17);
            android.view.View view = null;
            if (z17) {
                xg5.a aVar2 = bizTextCoverUI.f208685e;
                if (aVar2 != null) {
                    view = (android.view.View) ((jz5.n) ((b33.f) aVar2).f17663f).getValue();
                    kotlin.jvm.internal.o.f(view, "<get-bottomContainer>(...)");
                }
                if (view == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view2 = view;
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/flutter/BizTextCoverUI", "onBottomOverlayVisibleChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/ui/flutter/BizTextCoverUI", "onBottomOverlayVisibleChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            xg5.a aVar3 = bizTextCoverUI.f208685e;
            if (aVar3 != null) {
                view = (android.view.View) ((jz5.n) ((b33.f) aVar3).f17663f).getValue();
                kotlin.jvm.internal.o.f(view, "<get-bottomContainer>(...)");
            }
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view3 = view;
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/flutter/BizTextCoverUI", "onBottomOverlayVisibleChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/brandservice/ui/flutter/BizTextCoverUI", "onBottomOverlayVisibleChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // rv.f3
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterSelectPhotoHandler", "textCoverCallback onCancel");
    }
}
