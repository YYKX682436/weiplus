package o12;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f342164d;

    /* renamed from: e, reason: collision with root package name */
    public float f342165e;

    /* renamed from: f, reason: collision with root package name */
    public float f342166f;

    /* renamed from: g, reason: collision with root package name */
    public float f342167g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f342168h;

    /* renamed from: i, reason: collision with root package name */
    public float f342169i;

    /* renamed from: m, reason: collision with root package name */
    public float f342170m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer f342171n;

    public q(com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer emojiEditorTextDecorationsContainer) {
        this.f342171n = emojiEditorTextDecorationsContainer;
    }

    public final float a(android.view.MotionEvent motionEvent) {
        return (float) java.lang.Math.toDegrees((float) java.lang.Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0)));
    }

    public final float b(android.view.MotionEvent motionEvent) {
        return (float) java.lang.Math.hypot(java.lang.Math.abs(motionEvent.getX(1) - motionEvent.getX(0)), java.lang.Math.abs(motionEvent.getY(1) - motionEvent.getY(0)));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
        boolean z17;
        yz5.a onTextScaleEnd;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextDecorationsContainer$TextDecorationGesture", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer emojiEditorTextDecorationsContainer = this.f342171n;
        if (!emojiEditorTextDecorationsContainer.isEnabled()) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextDecorationsContainer$TextDecorationGesture", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextInputViewController.TextDecoration");
        o12.u uVar = (o12.u) tag;
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            android.graphics.Rect rect = uVar.f342186d;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!emojiEditorTextDecorationsContainer.f97501i && !this.f342168h) {
                        float abs = java.lang.Math.abs(event.getRawX() - this.f342164d);
                        float abs2 = java.lang.Math.abs(event.getRawY() - this.f342165e);
                        int i17 = emojiEditorTextDecorationsContainer.f97500h;
                        if (abs > i17 || abs2 > i17) {
                            emojiEditorTextDecorationsContainer.f97501i = true;
                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = emojiEditorTextDecorationsContainer.f97497e;
                            if (weImageView == null) {
                                kotlin.jvm.internal.o.o("removeTextIcon");
                                throw null;
                            }
                            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_delete);
                            android.widget.TextView textView = emojiEditorTextDecorationsContainer.f97498f;
                            if (textView == null) {
                                kotlin.jvm.internal.o.o("removeTextLabel");
                                throw null;
                            }
                            textView.setText(com.tencent.mm.R.string.bw7);
                            android.view.ViewGroup viewGroup = emojiEditorTextDecorationsContainer.f97496d;
                            if (viewGroup == null) {
                                kotlin.jvm.internal.o.o("removeTextArea");
                                throw null;
                            }
                            viewGroup.setActivated(false);
                            emojiEditorTextDecorationsContainer.f(view);
                            yz5.a onTextDragStart = emojiEditorTextDecorationsContainer.getOnTextDragStart();
                            if (onTextDragStart != null) {
                                onTextDragStart.invoke();
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorTextDecorationsContainer", "start dragging");
                        }
                    }
                    if (emojiEditorTextDecorationsContainer.f97501i) {
                        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.leftMargin += (int) (event.getRawX() - this.f342166f);
                        int rawY = layoutParams2.topMargin + ((int) (event.getRawY() - this.f342167g));
                        layoutParams2.topMargin = rawY;
                        rect.offsetTo(layoutParams2.leftMargin, rawY);
                        view.requestLayout();
                        boolean contains = emojiEditorTextDecorationsContainer.f97503n.contains((int) event.getRawX(), (int) event.getRawY());
                        if (contains != emojiEditorTextDecorationsContainer.f97502m) {
                            emojiEditorTextDecorationsContainer.f97502m = contains;
                            if (contains) {
                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = emojiEditorTextDecorationsContainer.f97497e;
                                if (weImageView2 == null) {
                                    kotlin.jvm.internal.o.o("removeTextIcon");
                                    throw null;
                                }
                                weImageView2.setImageResource(com.tencent.mm.R.raw.icons_filled_delete_on);
                                android.widget.TextView textView2 = emojiEditorTextDecorationsContainer.f97498f;
                                if (textView2 == null) {
                                    kotlin.jvm.internal.o.o("removeTextLabel");
                                    throw null;
                                }
                                textView2.setText(com.tencent.mm.R.string.bw8);
                                android.view.ViewGroup viewGroup2 = emojiEditorTextDecorationsContainer.f97496d;
                                if (viewGroup2 == null) {
                                    kotlin.jvm.internal.o.o("removeTextArea");
                                    throw null;
                                }
                                viewGroup2.setActivated(true);
                            } else {
                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = emojiEditorTextDecorationsContainer.f97497e;
                                if (weImageView3 == null) {
                                    kotlin.jvm.internal.o.o("removeTextIcon");
                                    throw null;
                                }
                                weImageView3.setImageResource(com.tencent.mm.R.raw.icons_filled_delete);
                                android.widget.TextView textView3 = emojiEditorTextDecorationsContainer.f97498f;
                                if (textView3 == null) {
                                    kotlin.jvm.internal.o.o("removeTextLabel");
                                    throw null;
                                }
                                textView3.setText(com.tencent.mm.R.string.bw7);
                                android.view.ViewGroup viewGroup3 = emojiEditorTextDecorationsContainer.f97496d;
                                if (viewGroup3 == null) {
                                    kotlin.jvm.internal.o.o("removeTextArea");
                                    throw null;
                                }
                                viewGroup3.setActivated(false);
                            }
                        }
                    } else if (this.f342168h && event.getPointerCount() >= 2) {
                        float b17 = b(event);
                        float f17 = uVar.f342189g * (b17 / this.f342169i);
                        uVar.f342189g = f17;
                        view.setScaleX(f17);
                        view.setScaleY(uVar.f342189g);
                        float a17 = a(event);
                        float f18 = uVar.f342190h + (a17 - this.f342170m);
                        uVar.f342190h = f18;
                        view.setRotation(f18);
                        this.f342169i = b17;
                        this.f342170m = a17;
                    }
                    this.f342166f = event.getRawX();
                    this.f342167g = event.getRawY();
                } else if (actionMasked == 5) {
                    emojiEditorTextDecorationsContainer.f97501i = false;
                    this.f342168h = true;
                    this.f342169i = b(event);
                    this.f342170m = a(event);
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorTextDecorationsContainer", "ACTION_POINTER_DOWN");
                } else if (actionMasked == 6) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorTextDecorationsContainer", "ACTION_POINTER_UP");
                    if (this.f342168h && (onTextScaleEnd = emojiEditorTextDecorationsContainer.getOnTextScaleEnd()) != null) {
                        onTextScaleEnd.invoke();
                    }
                }
            } else {
                if (this.f342168h) {
                    this.f342168h = false;
                    yj0.a.i(true, this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextDecorationsContainer$TextDecorationGesture", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
                if (emojiEditorTextDecorationsContainer.f97501i) {
                    if (emojiEditorTextDecorationsContainer.f97502m) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorTextDecorationsContainer", "remove text decoration: " + view.getTag());
                        emojiEditorTextDecorationsContainer.removeView(view);
                        z17 = false;
                        emojiEditorTextDecorationsContainer.f97502m = false;
                        yz5.a onTextRemoved = emojiEditorTextDecorationsContainer.getOnTextRemoved();
                        if (onTextRemoved != null) {
                            onTextRemoved.invoke();
                        }
                    } else {
                        z17 = false;
                    }
                    emojiEditorTextDecorationsContainer.f97501i = z17;
                    yz5.a onTextDragEnd = emojiEditorTextDecorationsContainer.getOnTextDragEnd();
                    if (onTextDragEnd != null) {
                        onTextDragEnd.invoke();
                    }
                    android.graphics.Rect rect2 = (android.graphics.Rect) emojiEditorTextDecorationsContainer.getGetRenderingBounds().invoke();
                    int a18 = ym5.x.a(emojiEditorTextDecorationsContainer.getContext(), 24.0f);
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorTextDecorationsContainer", "drag stops at (" + view.getLeft() + ", " + view.getTop() + ", " + view.getRight() + ", " + view.getBottom() + "), bounds: " + rect2 + ", margin: " + a18);
                    if (view.getRight() - a18 < rect2.left || view.getLeft() + a18 > rect2.right || view.getTop() + a18 > rect2.bottom || view.getBottom() - a18 < rect2.top) {
                        android.graphics.Rect rect3 = (android.graphics.Rect) emojiEditorTextDecorationsContainer.getGetRenderingBounds().invoke();
                        int width = (rect3.left + (rect3.width() / 2)) - (rect.width() / 2);
                        int height = rect3.bottom - rect.height();
                        android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
                        int i18 = layoutParams4.leftMargin;
                        int i19 = layoutParams4.topMargin;
                        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorTextDecorationsContainer", "animate text from (" + i18 + ", " + i19 + ") to (" + width + ", " + height + ')');
                        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setDuration(300L);
                        ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                        ofFloat.addUpdateListener(new o12.r(layoutParams4, i18, width, i19, height, uVar, view));
                        ofFloat.addListener(new o12.s(emojiEditorTextDecorationsContainer));
                        ofFloat.start();
                    } else {
                        yz5.a onAnimateResetEnd = emojiEditorTextDecorationsContainer.getOnAnimateResetEnd();
                        if (onAnimateResetEnd != null) {
                            onAnimateResetEnd.invoke();
                        }
                    }
                } else if (kotlin.jvm.internal.o.b(view, emojiEditorTextDecorationsContainer.f97499g)) {
                    view.performClick();
                } else {
                    emojiEditorTextDecorationsContainer.f(view);
                }
                emojiEditorTextDecorationsContainer.invalidate();
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorTextDecorationsContainer", "ACTION_DOWN");
            this.f342164d = event.getRawX();
            this.f342166f = event.getRawX();
            this.f342165e = event.getRawY();
            this.f342167g = event.getRawY();
            emojiEditorTextDecorationsContainer.f97502m = false;
            emojiEditorTextDecorationsContainer.f97501i = false;
            android.view.ViewGroup viewGroup4 = emojiEditorTextDecorationsContainer.f97496d;
            if (viewGroup4 == null) {
                kotlin.jvm.internal.o.o("removeTextArea");
                throw null;
            }
            viewGroup4.getGlobalVisibleRect(emojiEditorTextDecorationsContainer.f97503n);
            this.f342168h = false;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextDecorationsContainer$TextDecorationGesture", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
