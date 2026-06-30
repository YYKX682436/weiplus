package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class a implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public int f148969d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f148970e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f148971f;

    /* renamed from: g, reason: collision with root package name */
    public int f148972g;

    /* renamed from: h, reason: collision with root package name */
    public float f148973h;

    /* renamed from: i, reason: collision with root package name */
    public float f148974i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar f148975m;

    public a(com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar editSliderSeekBar) {
        this.f148975m = editSliderSeekBar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.lang.String str;
        int i17;
        int rightSliderBound;
        long leftSliderBound;
        long rightSliderBound2;
        boolean z17;
        com.tencent.mm.plugin.mmsight.segment.a aVar = this;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar editSliderSeekBar = aVar.f148975m;
        int i18 = 0;
        if (!editSliderSeekBar.f148837e) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z18 = true;
        if (actionMasked != 0) {
            java.lang.String str2 = "recyclerView";
            if (actionMasked != 1) {
                int i19 = 2;
                if (actionMasked == 2) {
                    if (!editSliderSeekBar.e(true) && !editSliderSeekBar.e(false)) {
                        yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return false;
                    }
                    editSliderSeekBar.getClass();
                    aVar.f148972g = 0;
                    boolean z19 = false;
                    while (aVar.f148972g < motionEvent.getPointerCount()) {
                        int pointerId = motionEvent.getPointerId(aVar.f148972g);
                        aVar.f148971f = pointerId;
                        int i27 = aVar.f148969d;
                        if (pointerId == i27 || pointerId == aVar.f148970e) {
                            boolean f17 = editSliderSeekBar.f(pointerId == i27 ? z18 : i18, motionEvent.getX(aVar.f148972g));
                            if (editSliderSeekBar.f148841i && f17 && !editSliderSeekBar.f148840h) {
                                editSliderSeekBar.performHapticFeedback(i18, i19);
                            }
                            editSliderSeekBar.f148840h = f17;
                            if (editSliderSeekBar.f148836d != null) {
                                int[] iArr = new int[i19];
                                editSliderSeekBar.getLocationOnScreen(iArr);
                                boolean z27 = aVar.f148971f == aVar.f148969d ? z18 : i18;
                                if (z27) {
                                    i17 = iArr[i18];
                                    rightSliderBound = editSliderSeekBar.getLeftSliderBound();
                                } else {
                                    i17 = iArr[i18];
                                    rightSliderBound = editSliderSeekBar.getRightSliderBound();
                                }
                                float f18 = i17 + rightSliderBound;
                                float f19 = f18 + editSliderSeekBar.f148854y;
                                kp4.e eVar = (kp4.e) editSliderSeekBar.f148836d;
                                kp4.c1 c1Var = eVar.f311099a;
                                kp4.f fVar = eVar.f311100b;
                                if (z27) {
                                    leftSliderBound = (fVar.f311105g.getLeftSliderBound() / fVar.f311104f.getFrameWidth()) * ((float) c1Var.f311075e);
                                    str = str2;
                                } else {
                                    str = str2;
                                    leftSliderBound = c1Var.f311074d + ((fVar.f311105g.getLeftSliderBound() / fVar.f311104f.getFrameWidth()) * ((float) (c1Var.d() - c1Var.f311074d)));
                                }
                                if (z27) {
                                    rightSliderBound2 = (fVar.f311105g.getRightSliderBound() / fVar.f311104f.getFrameWidth()) * ((float) c1Var.f311075e);
                                } else {
                                    rightSliderBound2 = c1Var.f311074d + ((fVar.f311105g.getRightSliderBound() / fVar.f311104f.getFrameWidth()) * ((float) (c1Var.d() - c1Var.f311074d)));
                                    leftSliderBound = leftSliderBound;
                                }
                                c1Var.f311074d = leftSliderBound;
                                c1Var.f311075e = rightSliderBound2;
                                kp4.h hVar = eVar.f311101c;
                                java.lang.String str3 = hVar.f311109d;
                                fVar.f311105g.getLeftSliderBound();
                                fVar.f311105g.getRightSliderBound();
                                com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView editFrameListView = fVar.f311104f;
                                editFrameListView.getFrameWidth();
                                android.view.View view2 = fVar.itemView;
                                android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                int validWidth = layoutParams.width - editFrameListView.getValidWidth();
                                layoutParams.width = editFrameListView.getValidWidth();
                                view2.setLayoutParams(layoutParams);
                                kp4.g gVar = hVar.f311112g;
                                if (gVar != null) {
                                    int adapterPosition = fVar.getAdapterPosition();
                                    com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView = ((kp4.f0) gVar).f311107a;
                                    kp4.c1 c1Var2 = multiTrackCropView.getTrackList().get(adapterPosition);
                                    kotlin.jvm.internal.o.f(c1Var2, "get(...)");
                                    kp4.c1 c1Var3 = c1Var2;
                                    com.tencent.mm.plugin.vlog.model.i1 i1Var = c1Var3.f311097n;
                                    if (z27) {
                                        float f27 = i1Var.f175627l.f397506h;
                                        kp4.c0 callback = multiTrackCropView.getCallback();
                                        if (callback != null) {
                                            callback.seekTo(c1Var3.f311080j + (((float) c1Var3.f311074d) / i1Var.f175627l.f397506h));
                                        }
                                        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView = multiTrackCropView.f176023d;
                                        if (multiTrackRecyclerView == null) {
                                            kotlin.jvm.internal.o.o(str);
                                            throw null;
                                        }
                                        multiTrackRecyclerView.scrollBy(-validWidth, 0);
                                    } else {
                                        float f28 = i1Var.f175627l.f397506h;
                                        kp4.c0 callback2 = multiTrackCropView.getCallback();
                                        if (callback2 != null) {
                                            callback2.seekTo(c1Var3.f311080j + (((float) (c1Var3.f311075e - c1Var3.f311074d)) / i1Var.f175627l.f397506h));
                                        }
                                    }
                                    kp4.c0 callback3 = multiTrackCropView.getCallback();
                                    if (callback3 != null) {
                                        callback3.c(adapterPosition - 1, z27, multiTrackCropView.getTrackList().get(adapterPosition).f311074d, multiTrackCropView.getTrackList().get(adapterPosition).f311075e);
                                    }
                                    int i28 = multiTrackCropView.f176040x;
                                    int i29 = multiTrackCropView.f176041y;
                                    float f29 = i28 - i29;
                                    if (f19 > f29) {
                                        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView2 = multiTrackCropView.f176023d;
                                        if (multiTrackRecyclerView2 == null) {
                                            kotlin.jvm.internal.o.o(str);
                                            throw null;
                                        }
                                        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView3 = multiTrackCropView.f176023d;
                                        if (multiTrackRecyclerView3 == null) {
                                            kotlin.jvm.internal.o.o(str);
                                            throw null;
                                        }
                                        multiTrackRecyclerView2.measure(makeMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(multiTrackRecyclerView3.getHeight(), 1073741824));
                                        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView4 = multiTrackCropView.f176023d;
                                        if (multiTrackRecyclerView4 == null) {
                                            kotlin.jvm.internal.o.o(str);
                                            throw null;
                                        }
                                        int width = multiTrackRecyclerView4.getWidth();
                                        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView5 = multiTrackCropView.f176023d;
                                        if (multiTrackRecyclerView5 == null) {
                                            kotlin.jvm.internal.o.o(str);
                                            throw null;
                                        }
                                        multiTrackRecyclerView4.layout(0, 0, width, multiTrackRecyclerView5.getHeight());
                                        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView6 = multiTrackCropView.f176023d;
                                        if (multiTrackRecyclerView6 == null) {
                                            kotlin.jvm.internal.o.o(str);
                                            throw null;
                                        }
                                        multiTrackRecyclerView6.scrollBy((int) (f19 - f29), 0);
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    int i37 = multiTrackCropView.f176042z;
                                    if (f19 < i37 + i29) {
                                        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView7 = multiTrackCropView.f176023d;
                                        if (multiTrackRecyclerView7 == null) {
                                            kotlin.jvm.internal.o.o(str);
                                            throw null;
                                        }
                                        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView8 = multiTrackCropView.f176023d;
                                        if (multiTrackRecyclerView8 == null) {
                                            kotlin.jvm.internal.o.o(str);
                                            throw null;
                                        }
                                        multiTrackRecyclerView7.measure(makeMeasureSpec2, android.view.View.MeasureSpec.makeMeasureSpec(multiTrackRecyclerView8.getHeight(), 1073741824));
                                        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView9 = multiTrackCropView.f176023d;
                                        if (multiTrackRecyclerView9 == null) {
                                            kotlin.jvm.internal.o.o(str);
                                            throw null;
                                        }
                                        int width2 = multiTrackRecyclerView9.getWidth();
                                        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView10 = multiTrackCropView.f176023d;
                                        if (multiTrackRecyclerView10 == null) {
                                            kotlin.jvm.internal.o.o(str);
                                            throw null;
                                        }
                                        multiTrackRecyclerView9.layout(0, 0, width2, multiTrackRecyclerView10.getHeight());
                                        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView11 = multiTrackCropView.f176023d;
                                        if (multiTrackRecyclerView11 == null) {
                                            kotlin.jvm.internal.o.o(str);
                                            throw null;
                                        }
                                        multiTrackRecyclerView11.scrollBy((int) ((f19 - i37) - i29), 0);
                                        z17 = true;
                                    }
                                    if (z17) {
                                        java.lang.Runnable runnable = multiTrackCropView.G;
                                        multiTrackCropView.removeCallbacks(runnable);
                                        multiTrackCropView.postDelayed(runnable, multiTrackCropView.F);
                                    }
                                }
                            } else {
                                str = str2;
                            }
                            z19 = true;
                            aVar = this;
                        } else {
                            str = str2;
                        }
                        aVar.f148972g++;
                        z18 = true;
                        str2 = str;
                        i19 = 2;
                        i18 = 0;
                    }
                    boolean z28 = z18;
                    if (z19) {
                        com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar.b(editSliderSeekBar, z28);
                    }
                    yj0.a.i(z19, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return z19;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            return false;
                        }
                    }
                }
            }
            int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
            aVar.f148971f = pointerId2;
            int i38 = aVar.f148969d;
            if (pointerId2 != i38 && pointerId2 != aVar.f148970e) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            com.tencent.mm.plugin.mmsight.segment.b bVar = editSliderSeekBar.f148836d;
            if (bVar != null) {
                boolean z29 = pointerId2 == i38;
                kp4.e eVar2 = (kp4.e) bVar;
                kp4.c1 c1Var4 = eVar2.f311099a;
                c1Var4.f311083m = false;
                c1Var4.f311082l = false;
                kp4.f fVar2 = eVar2.f311100b;
                long leftSliderBound2 = z29 ? (fVar2.f311105g.getLeftSliderBound() / fVar2.f311104f.getFrameWidth()) * ((float) c1Var4.f311075e) : c1Var4.f311074d + ((fVar2.f311105g.getLeftSliderBound() / fVar2.f311104f.getFrameWidth()) * ((float) (c1Var4.d() - c1Var4.f311074d)));
                long rightSliderBound3 = z29 ? (fVar2.f311105g.getRightSliderBound() / fVar2.f311104f.getFrameWidth()) * ((float) c1Var4.f311075e) : c1Var4.f311074d + ((fVar2.f311105g.getRightSliderBound() / fVar2.f311104f.getFrameWidth()) * ((float) (c1Var4.d() - c1Var4.f311074d)));
                c1Var4.f311074d = leftSliderBound2;
                c1Var4.f311075e = rightSliderBound3;
                kp4.h hVar2 = eVar2.f311101c;
                java.lang.String str4 = hVar2.f311109d;
                fVar2.f311104f.a(c1Var4, fVar2.f311102d, true, true);
                com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView editFrameListView2 = fVar2.f311104f;
                int showWidth = editFrameListView2.getShowWidth();
                int i39 = fVar2.f311103e;
                int minWidth = editFrameListView2.getMinWidth();
                com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar editSliderSeekBar2 = fVar2.f311105g;
                editSliderSeekBar2.d(showWidth - (i39 * 2), minWidth, i39);
                android.view.ViewGroup.LayoutParams layoutParams2 = editSliderSeekBar2.getLayoutParams();
                layoutParams2.width = editFrameListView2.getValidWidth();
                editSliderSeekBar2.setLayoutParams(layoutParams2);
                android.view.View view3 = fVar2.itemView;
                android.view.ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                layoutParams3.width = editFrameListView2.getValidWidth();
                view3.setLayoutParams(layoutParams3);
                android.view.ViewGroup.LayoutParams layoutParams4 = editFrameListView2.getLayoutParams();
                layoutParams4.width = editFrameListView2.getValidWidth();
                editFrameListView2.setLayoutParams(layoutParams4);
                fVar2.itemView.setLayoutDirection(0);
                c1Var4.d();
                editFrameListView2.getTotalFrameWidth();
                kp4.g gVar2 = hVar2.f311112g;
                if (gVar2 != null) {
                    int adapterPosition2 = fVar2.getAdapterPosition();
                    com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView2 = ((kp4.f0) gVar2).f311107a;
                    multiTrackCropView2.f176039w = false;
                    multiTrackCropView2.c(false);
                    com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView.a(multiTrackCropView2);
                    multiTrackCropView2.f176034r = true;
                    com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView12 = multiTrackCropView2.f176023d;
                    if (multiTrackRecyclerView12 == null) {
                        kotlin.jvm.internal.o.o("recyclerView");
                        throw null;
                    }
                    int makeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView13 = multiTrackCropView2.f176023d;
                    if (multiTrackRecyclerView13 == null) {
                        kotlin.jvm.internal.o.o("recyclerView");
                        throw null;
                    }
                    multiTrackRecyclerView12.measure(makeMeasureSpec3, android.view.View.MeasureSpec.makeMeasureSpec(multiTrackRecyclerView13.getHeight(), 1073741824));
                    com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView14 = multiTrackCropView2.f176023d;
                    if (multiTrackRecyclerView14 == null) {
                        kotlin.jvm.internal.o.o("recyclerView");
                        throw null;
                    }
                    int width3 = multiTrackRecyclerView14.getWidth();
                    com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView15 = multiTrackCropView2.f176023d;
                    if (multiTrackRecyclerView15 == null) {
                        kotlin.jvm.internal.o.o("recyclerView");
                        throw null;
                    }
                    multiTrackRecyclerView14.layout(0, 0, width3, multiTrackRecyclerView15.getHeight());
                    int i47 = adapterPosition2 - 1;
                    long j17 = multiTrackCropView2.getTrackList().get(adapterPosition2).f311074d;
                    long j18 = multiTrackCropView2.getTrackList().get(adapterPosition2).f311075e;
                    kp4.c0 callback4 = multiTrackCropView2.getCallback();
                    if (callback4 != null) {
                        callback4.a(i47, z29, multiTrackCropView2.getTrackList().get(adapterPosition2).f311074d, multiTrackCropView2.getTrackList().get(adapterPosition2).f311075e);
                    }
                    multiTrackCropView2.removeCallbacks(multiTrackCropView2.G);
                }
            }
            com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar.c(editSliderSeekBar, aVar.f148971f == aVar.f148969d, false);
            if (aVar.f148971f == aVar.f148969d) {
                aVar.f148969d = -1;
            } else {
                aVar.f148970e = -1;
            }
            editSliderSeekBar.f148840h = false;
            com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar.b(editSliderSeekBar, false);
            yj0.a.i(true, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        int actionIndex = motionEvent.getActionIndex();
        aVar.f148972g = actionIndex;
        aVar.f148971f = motionEvent.getPointerId(actionIndex);
        aVar.f148973h = motionEvent.getX(aVar.f148972g);
        float y17 = motionEvent.getY(aVar.f148972g);
        aVar.f148974i = y17;
        if (com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar.a(editSliderSeekBar, editSliderSeekBar.f148842m, aVar.f148973h, y17)) {
            if (editSliderSeekBar.e(true)) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            com.tencent.mm.plugin.mmsight.segment.b bVar2 = editSliderSeekBar.f148836d;
            if (bVar2 != null) {
                ((kp4.e) bVar2).a(true);
            }
            aVar.f148969d = aVar.f148971f;
            int i48 = editSliderSeekBar.f148842m.getBounds().left;
            editSliderSeekBar.getClass();
            com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar.c(editSliderSeekBar, true, true);
            com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar.b(editSliderSeekBar, true);
            yj0.a.i(true, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (!com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar.a(editSliderSeekBar, editSliderSeekBar.f148843n, aVar.f148973h, aVar.f148974i)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (editSliderSeekBar.e(false)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        com.tencent.mm.plugin.mmsight.segment.b bVar3 = editSliderSeekBar.f148836d;
        if (bVar3 != null) {
            ((kp4.e) bVar3).a(false);
        }
        aVar.f148970e = aVar.f148971f;
        int i49 = editSliderSeekBar.f148843n.getBounds().right;
        editSliderSeekBar.getClass();
        com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar.c(editSliderSeekBar, false, true);
        com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar.b(editSliderSeekBar, true);
        yj0.a.i(true, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
