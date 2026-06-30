package cw3;

/* loaded from: classes10.dex */
public interface s {
    static /* synthetic */ void h(cw3.s sVar, android.graphics.Rect rect, float f17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDefaultLocation");
        }
        if ((i17 & 2) != 0) {
            f17 = 0.5f;
        }
        sVar.i(rect, f17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    default boolean a(long j17) {
        if (!(this instanceof android.view.View)) {
            return false;
        }
        zu3.a editorData = getEditorData();
        if (editorData != null) {
            bv3.d dVar = editorData.f475760c;
            if ((j17 >= dVar.c() && j17 <= dVar.b()) && o()) {
                android.view.View view = (android.view.View) this;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView", "showAtTime", "(J)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView", "showAtTime", "(J)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView", "showAtTime", "(J)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView", "showAtTime", "(J)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            }
        }
        android.view.View view2 = (android.view.View) this;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView", "showAtTime", "(J)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView", "showAtTime", "(J)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView", "showAtTime", "(J)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView", "showAtTime", "(J)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return false;
    }

    float[] getContentBoundary();

    android.graphics.RectF getDrawRect();

    zu3.a getEditorData();

    cw3.j getType();

    void i(android.graphics.Rect rect, float f17);

    void j(android.graphics.Rect rect, int i17);

    default boolean o() {
        return true;
    }

    void setValidArea(android.graphics.Rect rect);
}
