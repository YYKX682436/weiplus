package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes.dex */
public final class a1 implements com.tencent.mm.ui.chatting.gallery.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f200774a;

    /* renamed from: b, reason: collision with root package name */
    public final int f200775b;

    /* renamed from: c, reason: collision with root package name */
    public final int f200776c;

    public a1(android.view.View view, int i17, int i18) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f200774a = view;
        this.f200775b = i17;
        this.f200776c = i18;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int a() {
        android.view.View view = this.f200774a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/FlexibleHideViewItem", "compress", "()I", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/FlexibleHideViewItem", "compress", "()I", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return 0;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int getMinWidth() {
        return 0;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int getPriority() {
        return this.f200776c;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int getWidth() {
        if (this.f200774a.getVisibility() == 0) {
            return this.f200775b;
        }
        return 0;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int reset() {
        return getWidth();
    }
}
