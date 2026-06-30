package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes14.dex */
public final class c extends androidx.customview.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ActivityPullDownCloseLayout f200825a;

    public c(com.tencent.mm.ui.chatting.gallery.ActivityPullDownCloseLayout activityPullDownCloseLayout) {
        this.f200825a = activityPullDownCloseLayout;
    }

    @Override // androidx.customview.widget.k
    public int a(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        return 0;
    }

    @Override // androidx.customview.widget.k
    public int b(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        if (i17 >= 0) {
            return i17;
        }
        return 0;
    }

    @Override // androidx.customview.widget.k
    public int d(android.view.View child) {
        int mDialogHeight;
        kotlin.jvm.internal.o.g(child, "child");
        mDialogHeight = this.f200825a.getMDialogHeight();
        return mDialogHeight;
    }

    @Override // androidx.customview.widget.k
    public void g(android.view.View child, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        com.tencent.mm.ui.chatting.gallery.ActivityPullDownCloseLayout activityPullDownCloseLayout = this.f200825a;
        db5.f.c(activityPullDownCloseLayout.f200532g, new com.tencent.mm.ui.chatting.gallery.b(atomicInteger, activityPullDownCloseLayout));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    @Override // androidx.customview.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.view.View r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            java.lang.String r2 = "changedView"
            kotlin.jvm.internal.o.g(r1, r2)
            com.tencent.mm.ui.chatting.gallery.ActivityPullDownCloseLayout r2 = r0.f200825a
            android.view.View r4 = r2.f200531f
            boolean r4 = kotlin.jvm.internal.o.b(r1, r4)
            if (r4 == 0) goto L11
            r2.f200539q = r3
        L11:
            android.view.View r4 = r2.f200531f
            if (r1 != r4) goto L1d
            int r4 = com.tencent.mm.ui.chatting.gallery.ActivityPullDownCloseLayout.a(r2)
            if (r3 < r4) goto L1d
            r4 = 1
            goto L1e
        L1d:
            r4 = 0
        L1e:
            if (r3 <= 0) goto L2a
            yz5.l r2 = r2.getDragTranslationListener()
            if (r2 == 0) goto L33
            r2.invoke(r1)
            goto L33
        L2a:
            yz5.l r2 = r2.getDragFullScreenListener()
            if (r2 == 0) goto L33
            r2.invoke(r1)
        L33:
            if (r4 == 0) goto L38
            r0.l()
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.c.i(android.view.View, int, int, int, int):void");
    }

    @Override // androidx.customview.widget.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        int mDialogHeight;
        kotlin.jvm.internal.o.g(releasedChild, "releasedChild");
        float top = releasedChild.getTop();
        com.tencent.mm.ui.chatting.gallery.ActivityPullDownCloseLayout activityPullDownCloseLayout = this.f200825a;
        mDialogHeight = activityPullDownCloseLayout.getMDialogHeight();
        if (top <= ((float) mDialogHeight) * activityPullDownCloseLayout.f200534i) {
            androidx.customview.widget.l lVar = activityPullDownCloseLayout.f200533h;
            if (lVar != null) {
                lVar.s(0, 0);
            }
        } else {
            l();
        }
        activityPullDownCloseLayout.invalidate();
    }

    @Override // androidx.customview.widget.k
    public boolean k(android.view.View child, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        android.view.ViewGroup viewGroup = this.f200825a.f200530e;
        if (viewGroup == null) {
            return true;
        }
        viewGroup.setBackgroundColor(0);
        return true;
    }

    public final void l() {
        android.app.Activity activity;
        com.tencent.mm.ui.chatting.gallery.ActivityPullDownCloseLayout activityPullDownCloseLayout = this.f200825a;
        if (activityPullDownCloseLayout.f200537o) {
            return;
        }
        activityPullDownCloseLayout.f200537o = true;
        yz5.a dragFinishInterceptor = activityPullDownCloseLayout.getDragFinishInterceptor();
        if ((dragFinishInterceptor != null && ((java.lang.Boolean) dragFinishInterceptor.invoke()).booleanValue()) || (activity = activityPullDownCloseLayout.f200532g) == null) {
            return;
        }
        activity.finish();
    }
}
