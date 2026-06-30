package rk3;

/* loaded from: classes14.dex */
public final class d extends ek3.b implements db5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rk3.e f396494a;

    public d(rk3.e eVar) {
        this.f396494a = eVar;
    }

    @Override // ek3.b
    public int a(android.view.View view, int i17, int i18) {
        rk3.e eVar = this.f396494a;
        int d17 = eVar.d(0.0f);
        int d18 = eVar.d(1.0f);
        return eVar.f396505p ? java.lang.Math.min(java.lang.Math.max(i17, d18), d17) : java.lang.Math.min(java.lang.Math.max(i17, d17), d18);
    }

    @Override // ek3.b
    public int b(android.view.View view) {
        return this.f396494a.I;
    }

    @Override // ek3.b
    public void c(android.view.View view, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskViewGroup", "onViewCaptured");
        this.f396494a.h();
    }

    @Override // ek3.b
    public void d(int i17) {
        rk3.e eVar = this.f396494a;
        if (eVar.getMDragHelper() != null) {
            ek3.d mDragHelper = eVar.getMDragHelper();
            if (mDragHelper != null && mDragHelper.f253586a == 0) {
                android.view.View view = eVar.D;
                eVar.B = eVar.e(view != null ? view.getLeft() : 0);
                eVar.c();
                float f17 = eVar.B;
                if (f17 == 1.0f) {
                    eVar.l();
                    eVar.setPanelStateInternal(rk3.c.f396488d);
                    return;
                }
                if (f17 == 0.0f) {
                    eVar.setPanelStateInternal(rk3.c.f396489e);
                    return;
                }
                if (f17 >= 0.0f) {
                    eVar.l();
                    if (eVar.f396499g) {
                        eVar.setPanelStateInternal(rk3.c.f396490f);
                        return;
                    } else if (eVar.B <= 0.3f) {
                        eVar.setPanelStateInternal(rk3.c.f396489e);
                        return;
                    } else {
                        eVar.setPanelStateInternal(rk3.c.f396488d);
                        return;
                    }
                }
                eVar.setPanelStateInternal(rk3.c.f396491g);
                android.view.View view2 = eVar.D;
                if (view2 == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout$ViewDragCallback", "onViewDragStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout$ViewDragCallback", "onViewDragStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // ek3.b
    public void e(android.view.View view, int i17, int i18, int i19, int i27) {
        if (view != null) {
            view.toString();
        }
        rk3.e eVar = this.f396494a;
        rk3.e.a(eVar, i17);
        eVar.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ek3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(android.view.View r9, float r10, float r11, float r12, float r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk3.d.f(android.view.View, float, float, float, float):void");
    }

    @Override // ek3.b
    public void g(float f17, float f18, int i17, int i18, int i19, int i27) {
        rk3.e eVar = this.f396494a;
        float f19 = eVar.B;
        synchronized (eVar.f396502m) {
            java.util.Iterator it = eVar.f396502m.iterator();
            while (it.hasNext()) {
                ((rk3.b) it.next()).y0(f19);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // ek3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(android.view.View r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L5
            r7.toString()
        L5:
            rk3.e r7 = r6.f396494a
            java.util.concurrent.CopyOnWriteArrayList r0 = r7.f396502m
            monitor-enter(r0)
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.f396502m     // Catch: java.lang.Throwable -> L9b
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L9b
        L10:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L20
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L9b
            rk3.b r1 = (rk3.b) r1     // Catch: java.lang.Throwable -> L9b
            r1.P()     // Catch: java.lang.Throwable -> L9b
            goto L10
        L20:
            monitor-exit(r0)
            rk3.e r7 = r6.f396494a
            rk3.c r0 = r7.N
            rk3.c r1 = rk3.c.f396489e
            r2 = 8
            r3 = 1
            r4 = 0
            if (r0 != r1) goto L42
            boolean r0 = r7.C
            if (r0 != 0) goto L40
            ek3.d r7 = r7.getMDragHelper()
            if (r7 == 0) goto L3c
            boolean r7 = r7.d(r2, r8)
            goto L3d
        L3c:
            r7 = r4
        L3d:
            if (r7 == 0) goto L40
            goto L41
        L40:
            r3 = r4
        L41:
            return r3
        L42:
            rk3.c r1 = rk3.c.f396488d
            r5 = 4
            if (r0 != r1) goto L5c
            boolean r0 = r7.C
            if (r0 != 0) goto L5a
            ek3.d r7 = r7.getMDragHelper()
            if (r7 == 0) goto L56
            boolean r7 = r7.d(r5, r8)
            goto L57
        L56:
            r7 = r4
        L57:
            if (r7 == 0) goto L5a
            goto L5b
        L5a:
            r3 = r4
        L5b:
            return r3
        L5c:
            rk3.c r1 = rk3.c.f396492h
            if (r0 != r1) goto L61
            return r3
        L61:
            rk3.c r1 = rk3.c.f396490f
            if (r0 != r1) goto L98
            boolean r0 = r7.C
            if (r0 != 0) goto L79
            ek3.d r7 = r7.getMDragHelper()
            if (r7 == 0) goto L74
            boolean r7 = r7.d(r2, r8)
            goto L75
        L74:
            r7 = r4
        L75:
            if (r7 == 0) goto L79
            r7 = r3
            goto L7a
        L79:
            r7 = r4
        L7a:
            rk3.e r0 = r6.f396494a
            boolean r1 = r0.C
            if (r1 != 0) goto L90
            ek3.d r0 = r0.getMDragHelper()
            if (r0 == 0) goto L8b
            boolean r8 = r0.d(r5, r8)
            goto L8c
        L8b:
            r8 = r4
        L8c:
            if (r8 == 0) goto L90
            r8 = r3
            goto L91
        L90:
            r8 = r4
        L91:
            if (r8 != 0) goto L97
            if (r7 == 0) goto L96
            goto L97
        L96:
            r3 = r4
        L97:
            return r3
        L98:
            r7.f396498f = r4
            return r4
        L9b:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rk3.d.h(android.view.View, int):boolean");
    }

    @Override // db5.d
    public void onComplete(boolean z17) {
    }
}
