package ub3;

/* loaded from: classes15.dex */
public class r0 implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView f426134d;

    public r0(com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView) {
        this.f426134d = shuffleView;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426134d;
        if (shuffleView.f145113e.f426142b == 4) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            for (int i17 = 0; i17 < shuffleView.f145127v; i17++) {
                android.graphics.Rect f17 = shuffleView.f(i17);
                if (f17 != null && f17.contains(x17, y17)) {
                    android.view.View view = (android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17);
                    android.view.View view2 = shuffleView.f145123r;
                    if (view2 != view && view2 != null) {
                        shuffleView.d();
                    } else if (view2 == view) {
                        com.tencent.mars.xlog.Log.i("ShuffleView", "down on the select card");
                        return true;
                    }
                    com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.a(shuffleView, i17);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mars.xlog.Log.i("ShuffleView", "fling up " + f18);
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426134d;
        if (f18 >= (-shuffleView.C)) {
            return false;
        }
        if (shuffleView.f145113e.f426142b != 4) {
            return true;
        }
        if (shuffleView.f145123r != null) {
            shuffleView.d();
        }
        if (shuffleView.f145125t == null) {
            return true;
        }
        ub3.u0 u0Var = shuffleView.f145120o;
        if (u0Var != null) {
            ((ub3.f) u0Var).b(shuffleView.f145126u, shuffleView.f145127v);
        }
        shuffleView.j(shuffleView.f145126u);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        if (motionEvent2.getActionMasked() == 2) {
            int x17 = (int) motionEvent2.getX();
            int y17 = (int) motionEvent2.getY();
            com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426134d;
            if (shuffleView.f145113e.f426142b == 4) {
                if (java.lang.Math.abs(f18) < shuffleView.B) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= shuffleView.f145127v) {
                            break;
                        }
                        android.graphics.Rect f19 = shuffleView.f(i17);
                        if (f19 != null && f19.contains(x17, y17)) {
                            android.view.View view = (android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17);
                            android.view.View view2 = shuffleView.f145123r;
                            if (view2 != view && view2 != null) {
                                shuffleView.d();
                            } else if (view2 == view) {
                                com.tencent.mars.xlog.Log.i("ShuffleView", "scroll on the select card");
                                break;
                            }
                            if (shuffleView.f145125t != view) {
                                shuffleView.e();
                                com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.a(shuffleView, i17);
                            }
                        }
                        i17++;
                    }
                }
                if (java.lang.Math.abs(f17) < shuffleView.B) {
                    android.view.View view3 = shuffleView.f145125t;
                    if (view3 == null && (view3 = shuffleView.f145123r) == null) {
                        view3 = null;
                    }
                    if (view3 != null) {
                        com.tencent.mars.xlog.Log.i("ShuffleView", "scroll translationY:" + view3.getTranslationY() + "," + (view3.getHeight() / 7));
                        if (((int) view3.getTranslationY()) <= (-view3.getHeight()) / 7) {
                            if (f18 < 0.0f && java.lang.Math.abs(f18) > shuffleView.B) {
                                if (((int) f18) <= (-view3.getHeight()) / 7) {
                                    view3.setTranslationY(0.0f);
                                } else {
                                    view3.setTranslationY(view3.getTranslationY() - f18);
                                }
                                android.view.View view4 = shuffleView.f145123r;
                                if (view3 == view4) {
                                    shuffleView.f145125t = view4;
                                    shuffleView.f145126u = shuffleView.f145124s;
                                    if (shuffleView.f145117i.isStarted()) {
                                        com.tencent.mars.xlog.Log.i("ShuffleView", "scroll when select view is animation");
                                        shuffleView.f145117i.cancel();
                                    }
                                    shuffleView.f145123r = null;
                                    shuffleView.f145124s = 0;
                                }
                            }
                        } else if (view3.getTranslationY() == 0.0f) {
                            if (f18 > 0.0f && java.lang.Math.abs(f18) > shuffleView.B) {
                                if (((int) f18) >= view3.getHeight() / 7) {
                                    view3.setTranslationY((-view3.getHeight()) / 7);
                                } else {
                                    view3.setTranslationY(view3.getTranslationY() - f18);
                                }
                            }
                        } else if (f18 < 0.0f) {
                            if (view3.getTranslationY() - f18 >= 0.0f) {
                                view3.setTranslationY(0.0f);
                            } else {
                                view3.setTranslationY(view3.getTranslationY() - f18);
                            }
                        } else if (((int) (view3.getTranslationY() - f18)) <= (-view3.getHeight()) / 7) {
                            view3.setTranslationY((-view3.getHeight()) / 7);
                        } else {
                            view3.setTranslationY(view3.getTranslationY() - f18);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426134d;
        if (shuffleView.f145113e.f426142b != 4) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (shuffleView.f145123r != null) {
            ub3.u0 u0Var = shuffleView.f145120o;
            if (u0Var != null) {
                ((ub3.f) u0Var).a(shuffleView.f145124s, shuffleView.f145127v);
            }
            shuffleView.d();
        }
        if (shuffleView.f145125t != null) {
            ub3.u0 u0Var2 = shuffleView.f145120o;
            if (u0Var2 != null) {
                ((ub3.f) u0Var2).b(shuffleView.f145126u, shuffleView.f145127v);
            }
            shuffleView.j(shuffleView.f145126u);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }
}
