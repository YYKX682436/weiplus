package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.a0.class)
/* loaded from: classes9.dex */
public final class o4 extends com.tencent.mm.ui.chatting.component.a implements sb5.a0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f199620e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f199621f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f199622g = new java.util.LinkedHashSet();

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        ((java.util.LinkedHashMap) this.f199620e).clear();
        ((java.util.LinkedHashMap) this.f199621f).clear();
        this.f199622g.clear();
    }

    public void m0(com.tencent.mm.storage.f9 msgInfo) {
        com.tencent.mm.mvvm.MvvmView mvvmView;
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) this.f199620e).get(ic5.f.f290437c.a(msgInfo));
        if (weakReference == null || (mvvmView = (com.tencent.mm.mvvm.MvvmView) weakReference.get()) == null) {
            return;
        }
        z01.l lVar = (z01.l) mvvmView.getViewModel();
        if (lVar != null) {
            lVar.f469089f = false;
        } else {
            lVar = null;
        }
        mvvmView.setViewModel(lVar);
    }

    public void n0(java.lang.String groupId) {
        java.util.List list;
        kotlin.jvm.internal.o.g(groupId, "groupId");
        if (r26.n0.N(groupId) || !this.f199622g.remove(groupId) || (list = (java.util.List) ((java.util.LinkedHashMap) this.f199621f).get(groupId)) == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) it.next()).get();
            if (view == null) {
                it.remove();
            } else {
                n3.l1.a(view).b();
                n3.z1 a17 = n3.l1.a(view);
                a17.a(1.0f);
                a17.c(150L);
                a17.f();
            }
        }
    }

    public int o0(long j17, java.lang.String talker) {
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(talker, j17);
        if (k17 == null) {
            return 0;
        }
        up5.x a17 = c95.d.f39747a.a(ic5.f.f290437c.a(k17));
        if (a17 != null) {
            return a17.f430119e;
        }
        return 0;
    }

    public void p0(android.view.View optView) {
        java.lang.Object obj;
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(optView, "optView");
        int width = optView.getWidth();
        int height = optView.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        java.util.Iterator it = q26.y.d(optView.getParent(), n3.w1.f334433d).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((android.view.ViewParent) obj) instanceof androidx.recyclerview.widget.RecyclerView) {
                    break;
                }
            }
        }
        android.view.ViewGroup viewGroup = obj instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj : null;
        if (viewGroup == null) {
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingItemMediaGroupCommonComponent", "startOptViewFadeOutOverlay", "(Landroid/view/View;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/ui/chatting/component/ChattingItemMediaGroupCommonComponent", "startOptViewFadeOutOverlay", "(Landroid/view/View;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            optView.draw(new android.graphics.Canvas(createBitmap));
            m521constructorimpl = kotlin.Result.m521constructorimpl(createBitmap);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
        if (bitmap == null) {
            return;
        }
        int[] iArr = new int[2];
        optView.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        viewGroup.getLocationInWindow(iArr2);
        int i17 = iArr[0] - iArr2[0];
        int i18 = iArr[1] - iArr2[1];
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(viewGroup.getResources(), bitmap);
        bitmapDrawable.setBounds(i17, i18, width + i17, height + i18);
        viewGroup.getOverlay().add(bitmapDrawable);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(255, 0);
        ofInt.setDuration(150L);
        ofInt.addUpdateListener(new com.tencent.mm.ui.chatting.component.l4(bitmapDrawable));
        ofInt.addListener(new com.tencent.mm.ui.chatting.component.k4(new com.tencent.mm.ui.chatting.component.m4(viewGroup, bitmapDrawable, bitmap)));
        ofInt.start();
    }

    public void q0(com.tencent.mm.storage.f9 msgInfo, android.view.View optView) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(optView, "optView");
        java.lang.String b17 = ic5.f.f290437c.b(msgInfo);
        if (r26.n0.N(b17)) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f199621f;
        java.lang.Object obj = linkedHashMap.get(b17);
        if (obj == null) {
            obj = new java.util.ArrayList();
            linkedHashMap.put(b17, obj);
        }
        java.util.List list = (java.util.List) obj;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) it.next()).get();
            if (view == null || view == optView) {
                it.remove();
            }
        }
        list.add(new java.lang.ref.WeakReference(optView));
    }
}
