package uj3;

/* loaded from: classes14.dex */
public final class n implements com.tencent.xweb.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uj3.p f428331a;

    public n(uj3.p pVar) {
        this.f428331a = pVar;
    }

    @Override // com.tencent.xweb.o1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenFileProjector", "xfile on user cancel finish");
        com.tencent.mm.plugin.multitalk.model.e3.Ri().h();
    }

    @Override // com.tencent.xweb.o1
    public void b(java.lang.String str, java.util.HashMap hashMap) {
    }

    @Override // com.tencent.xweb.o1
    public void c() {
    }

    @Override // com.tencent.xweb.o1
    public void d(int i17, android.graphics.Bitmap thumbnail) {
        kotlin.jvm.internal.o.g(thumbnail, "thumbnail");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenFileProjector", "xfile onThumbnailLoad " + i17);
        uj3.b1 thumbUiLayout = this.f428331a.getThumbUiLayout();
        if (thumbUiLayout != null) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = thumbUiLayout.f428225c;
            if (copyOnWriteArrayList.size() <= i17) {
                copyOnWriteArrayList.add(thumbnail);
            } else {
                copyOnWriteArrayList.set(i17, thumbnail);
            }
            xj3.b bVar = thumbUiLayout.f428229g;
            if (bVar != null) {
                bVar.f454864g = thumbnail.getWidth();
                bVar.f454865h = thumbnail.getHeight();
            }
            xj3.e eVar = thumbUiLayout.f428228f;
            if (eVar != null) {
                xj3.b bVar2 = thumbUiLayout.f428229g;
                int i18 = bVar2 != null ? (int) bVar2.f454867m : 0;
                android.widget.FrameLayout frameLayout = thumbUiLayout.f428231i;
                if (frameLayout != null) {
                    frameLayout.getMeasuredWidth();
                }
                eVar.f454874d = i18;
            }
            com.tencent.mm.plugin.multitalk.ui.widget.projector.recyclerview.ScreenThumbLayoutManager screenThumbLayoutManager = thumbUiLayout.f428227e;
            if (screenThumbLayoutManager != null) {
                xj3.b bVar3 = thumbUiLayout.f428229g;
                int i19 = bVar3 != null ? (int) bVar3.f454867m : 0;
                android.widget.FrameLayout frameLayout2 = thumbUiLayout.f428231i;
                screenThumbLayoutManager.f150394w = frameLayout2 != null ? frameLayout2.getMeasuredWidth() : 0;
                screenThumbLayoutManager.f150393v = i19;
            }
            if (i17 == (thumbUiLayout.f428240r + 1) * 10 || i17 == thumbUiLayout.f428236n - 1) {
                thumbUiLayout.f428238p = false;
                xj3.b bVar4 = thumbUiLayout.f428229g;
                if (bVar4 != null) {
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = new java.util.concurrent.CopyOnWriteArrayList();
                    java.util.Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) it.next();
                        if (bitmap != null) {
                            copyOnWriteArrayList2.add(bitmap);
                        }
                    }
                    bVar4.f454863f = copyOnWriteArrayList2;
                    bVar4.notifyDataSetChanged();
                }
                if (thumbUiLayout.f428240r == thumbUiLayout.f428241s - 1) {
                    thumbUiLayout.f428239q = true;
                    return;
                }
                xj3.b bVar5 = thumbUiLayout.f428229g;
                if (bVar5 != null) {
                    android.graphics.Bitmap m17 = com.tencent.mm.sdk.platformtools.x.m((int) bVar5.f454867m, (int) bVar5.f454868n, android.graphics.Bitmap.Config.ARGB_8888, false);
                    kotlin.jvm.internal.o.f(m17, "createBitmap(...)");
                    bVar5.f454863f.add(m17);
                    bVar5.notifyItemInserted(bVar5.f454863f.size() - 1);
                }
            }
        }
    }

    @Override // com.tencent.xweb.o1
    public void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenFileProjector", "xfile onPageCountUpdate " + i17);
        uj3.p pVar = this.f428331a;
        pVar.setMMaxCount(i17);
        uj3.k1 mScreenReportData = pVar.getMScreenReportData();
        if (mScreenReportData != null) {
            mScreenReportData.f428305a = pVar.K;
        }
        uj3.b1 thumbUiLayout = pVar.getThumbUiLayout();
        if (thumbUiLayout != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(pVar.Q + 1);
            sb6.append('/');
            sb6.append(i17);
            java.lang.String str = sb6.toString();
            kotlin.jvm.internal.o.g(str, "str");
            android.widget.FrameLayout frameLayout = thumbUiLayout.f428233k;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            thumbUiLayout.f428237o = str;
            uj3.y0 y0Var = thumbUiLayout.f428232j;
            if (y0Var != null) {
                y0Var.e(str);
            }
        }
    }

    @Override // com.tencent.xweb.o1
    public void f(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenFileProjector", "xfile onPageChange " + i17 + " and pageWidth " + i18 + " and pageHeight " + i19);
        uj3.p pVar = this.f428331a;
        int i27 = pVar.Q;
        if (i17 > i27 && i27 != -1) {
            pVar.j();
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markScrollFlipPage");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1538L, 12L, 1L);
            uj3.b.a(pVar, uj3.a.f428202p, null, 2, null);
        } else if (i17 < i27 && i27 != -1) {
            pVar.j();
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markScrollFlipPage");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1538L, 12L, 1L);
            uj3.b.a(pVar, uj3.a.f428203q, null, 2, null);
        }
        if (!pVar.L) {
            pVar.L = true;
            uj3.b1 thumbUiLayout = pVar.getThumbUiLayout();
            if (thumbUiLayout != null) {
                thumbUiLayout.b();
            }
        }
        pVar.setMCurrentIndex(i17);
        pVar.setMCurrentScale(1.0f);
        pVar.setMCurrentPageWidth(i18);
        pVar.setMCurrentPageHeight(i19);
        uj3.b1 thumbUiLayout2 = pVar.getThumbUiLayout();
        if (thumbUiLayout2 != null) {
            int mCurrentPageWidth = pVar.getMCurrentPageWidth();
            int mCurrentPageHeight = pVar.getMCurrentPageHeight();
            xj3.b bVar = thumbUiLayout2.f428229g;
            if (bVar != null) {
                bVar.f454866i = i17;
                float f17 = mCurrentPageWidth;
                float f18 = mCurrentPageHeight;
                float f19 = f17 / f18;
                float f27 = xj3.b.f454857q;
                float f28 = f18 / (f17 / f27);
                float f29 = xj3.b.f454858r;
                if (f28 > f29) {
                    float f37 = f17 / (f18 / f29);
                    float f38 = xj3.b.f454859s;
                    if (f37 > f27) {
                        float f39 = f38 / f19;
                        if (f39 <= f29) {
                            f29 = f39;
                        }
                        bVar.f454868n = f29;
                        bVar.f454867m = f38;
                    } else if (f37 < f38) {
                        bVar.f454868n = f28;
                        bVar.f454867m = f38;
                    } else {
                        bVar.f454868n = f29;
                        bVar.f454867m = f37;
                    }
                } else {
                    bVar.f454868n = f28;
                    bVar.f454867m = f27;
                }
                if (bVar.f454864g != -1 && bVar.f454865h != -1) {
                    bVar.notifyItemChanged(i17);
                }
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = thumbUiLayout2.f428230h;
            if (recyclerView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "applyCurrentThumbnail", "(III)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "applyCurrentThumbnail", "(III)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
        pVar.setMCurrentViewStatus(com.tencent.xweb.r1.b(pVar.M, pVar.N));
        if (i18 <= 0 || i19 <= 0 || pVar.getMCurrentViewStatus() == null) {
            return;
        }
        uj3.c multiTalkStrokeContext = pVar.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.f428244c = pVar.getMCurrentPageHeight();
        }
        uj3.c multiTalkStrokeContext2 = pVar.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext2 != null) {
            multiTalkStrokeContext2.f428243b = pVar.getMCurrentPageWidth();
        }
        uj3.c multiTalkStrokeContext3 = pVar.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext3 != null) {
            com.tencent.xweb.p1 mCurrentViewStatus = pVar.getMCurrentViewStatus();
            kotlin.jvm.internal.o.d(mCurrentViewStatus);
            int i28 = mCurrentViewStatus.f220371a;
            com.tencent.xweb.p1 mCurrentViewStatus2 = pVar.getMCurrentViewStatus();
            kotlin.jvm.internal.o.d(mCurrentViewStatus2);
            multiTalkStrokeContext3.c(1.0f, i28, mCurrentViewStatus2.f220372b, false, false);
        }
        ct0.b bVar2 = new ct0.b(null, null, false, 0, 0, null, null, 0, 0, null, null, null, false, null, null, 0, 65535, null);
        com.tencent.xweb.p1 mCurrentViewStatus3 = pVar.getMCurrentViewStatus();
        kotlin.jvm.internal.o.d(mCurrentViewStatus3);
        com.tencent.xweb.p1 mCurrentViewStatus4 = pVar.getMCurrentViewStatus();
        kotlin.jvm.internal.o.d(mCurrentViewStatus4);
        int mCurrentPageWidth2 = pVar.getMCurrentPageWidth();
        com.tencent.xweb.p1 mCurrentViewStatus5 = pVar.getMCurrentViewStatus();
        kotlin.jvm.internal.o.d(mCurrentViewStatus5);
        int i29 = mCurrentPageWidth2 + mCurrentViewStatus5.f220371a;
        int mCurrentPageHeight2 = pVar.getMCurrentPageHeight();
        com.tencent.xweb.p1 mCurrentViewStatus6 = pVar.getMCurrentViewStatus();
        kotlin.jvm.internal.o.d(mCurrentViewStatus6);
        bVar2.f222218o = new android.graphics.Rect(mCurrentViewStatus3.f220371a, mCurrentViewStatus4.f220372b, i29, mCurrentPageHeight2 + mCurrentViewStatus6.f220372b);
        uj3.c multiTalkStrokeContext4 = pVar.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext4 != null) {
            multiTalkStrokeContext4.b(bVar2, new uj3.m(pVar));
        }
        pVar.s(true);
        uj3.b1 thumbUiLayout3 = pVar.getThumbUiLayout();
        if (thumbUiLayout3 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(pVar.Q + 1);
            sb6.append('/');
            sb6.append(pVar.K);
            java.lang.String str = sb6.toString();
            kotlin.jvm.internal.o.g(str, "str");
            android.widget.FrameLayout frameLayout = thumbUiLayout3.f428233k;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            thumbUiLayout3.f428237o = str;
            uj3.y0 y0Var = thumbUiLayout3.f428232j;
            if (y0Var != null) {
                y0Var.e(str);
            }
        }
    }

    @Override // com.tencent.xweb.o1
    public void g(int i17, float f17, int i18, int i19, int i27, int i28) {
        qj3.h hVar;
        qj3.g gVar;
        ym5.w2 w2Var;
        bn5.g gVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenFileProjector", "xfile onViewStatusChange " + i17 + " and pageWidth " + i18 + " and pageHeight " + i19 + " and scale " + f17 + " and transX " + i27 + " and " + i28);
        uj3.c multiTalkStrokeContext = this.f428331a.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext == null || (hVar = multiTalkStrokeContext.f428250i) == null || (gVar = hVar.f363895o) == null || (w2Var = gVar.f363882m) == null || (gVar2 = (bn5.g) w2Var.getBaseBoardView()) == null) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f18 = f17 * gVar2.I;
        matrix.postScale(f18, f18, 0.0f, 0.0f);
        matrix.postTranslate(i27, i28);
        gVar2.f22943g = matrix;
        gVar2.invalidate();
    }

    @Override // com.tencent.xweb.o1
    public void h(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        uj3.b.a(this.f428331a, uj3.a.f428201o, null, 2, null);
    }

    @Override // com.tencent.xweb.o1
    public void i() {
    }

    @Override // com.tencent.xweb.o1
    public void onDoubleTap(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
    }
}
