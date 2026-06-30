package com.tencent.mm.ui.widget.sortlist;

/* loaded from: classes15.dex */
public class DragSortListView extends android.widget.ListView {
    public static final /* synthetic */ int I1 = 0;
    public final int A;
    public boolean A1;
    public int B;
    public boolean B1;
    public int C;
    public final vl5.q C1;
    public int D;
    public final vl5.r D1;
    public android.view.View[] E;
    public final vl5.n E1;
    public final vl5.k F;
    public boolean F1;
    public float G;
    public float G1;
    public float H;
    public boolean H1;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f212488J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float P;
    public vl5.j Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f212489d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Point f212490e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Point f212491f;

    /* renamed from: g, reason: collision with root package name */
    public int f212492g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f212493h;

    /* renamed from: i, reason: collision with root package name */
    public final android.database.DataSetObserver f212494i;

    /* renamed from: l1, reason: collision with root package name */
    public final float f212495l1;

    /* renamed from: m, reason: collision with root package name */
    public final float f212496m;

    /* renamed from: n, reason: collision with root package name */
    public float f212497n;

    /* renamed from: o, reason: collision with root package name */
    public int f212498o;

    /* renamed from: p, reason: collision with root package name */
    public int f212499p;

    /* renamed from: p0, reason: collision with root package name */
    public vl5.p f212500p0;

    /* renamed from: p1, reason: collision with root package name */
    public float f212501p1;

    /* renamed from: q, reason: collision with root package name */
    public int f212502q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f212503r;

    /* renamed from: s, reason: collision with root package name */
    public int f212504s;

    /* renamed from: t, reason: collision with root package name */
    public int f212505t;

    /* renamed from: u, reason: collision with root package name */
    public int f212506u;

    /* renamed from: v, reason: collision with root package name */
    public vl5.i f212507v;

    /* renamed from: w, reason: collision with root package name */
    public vl5.o f212508w;

    /* renamed from: x, reason: collision with root package name */
    public vl5.s f212509x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.view.MotionEvent f212510x0;

    /* renamed from: x1, reason: collision with root package name */
    public vl5.h f212511x1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f212512y;

    /* renamed from: y0, reason: collision with root package name */
    public int f212513y0;

    /* renamed from: y1, reason: collision with root package name */
    public final boolean f212514y1;

    /* renamed from: z, reason: collision with root package name */
    public int f212515z;

    /* renamed from: z1, reason: collision with root package name */
    public final vl5.m f212516z1;

    public DragSortListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int i17;
        float f17;
        this.f212490e = new android.graphics.Point();
        this.f212491f = new android.graphics.Point();
        this.f212493h = false;
        this.f212496m = 1.0f;
        this.f212497n = 1.0f;
        this.f212503r = false;
        this.f212512y = true;
        this.f212515z = 0;
        this.A = 1;
        this.D = 0;
        this.E = new android.view.View[1];
        this.G = 0.33333334f;
        this.H = 0.33333334f;
        this.P = 0.5f;
        this.Q = new vl5.e(this);
        this.U = 0;
        this.V = false;
        this.W = false;
        this.f212500p0 = null;
        this.f212513y0 = 0;
        this.f212495l1 = 0.25f;
        this.f212501p1 = 0.0f;
        this.f212514y1 = false;
        this.A1 = false;
        this.B1 = false;
        this.C1 = new vl5.q(this, 3, null);
        this.G1 = 0.0f;
        this.H1 = false;
        int i18 = 150;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, yl5.a.f463100g, 0, 0);
            this.A = java.lang.Math.max(1, obtainStyledAttributes.getDimensionPixelSize(1, 1));
            boolean z17 = obtainStyledAttributes.getBoolean(16, false);
            this.f212514y1 = z17;
            if (z17) {
                this.f212516z1 = new vl5.m(this);
            }
            float f18 = obtainStyledAttributes.getFloat(8, 1.0f);
            this.f212496m = f18;
            this.f212497n = f18;
            this.f212512y = obtainStyledAttributes.getBoolean(2, this.f212512y);
            float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, 1.0f - obtainStyledAttributes.getFloat(14, 0.75f)));
            this.f212495l1 = max;
            this.f212503r = max > 0.0f;
            setDragScrollStart(obtainStyledAttributes.getFloat(4, this.G));
            this.P = obtainStyledAttributes.getFloat(10, this.P);
            int i19 = obtainStyledAttributes.getInt(11, 150);
            i17 = obtainStyledAttributes.getInt(6, 150);
            if (obtainStyledAttributes.getBoolean(17, true)) {
                boolean z18 = obtainStyledAttributes.getBoolean(12, false);
                int i27 = obtainStyledAttributes.getInt(13, 1);
                boolean z19 = obtainStyledAttributes.getBoolean(15, true);
                int i28 = obtainStyledAttributes.getInt(5, 0);
                int resourceId = obtainStyledAttributes.getResourceId(3, 0);
                int resourceId2 = obtainStyledAttributes.getResourceId(7, 0);
                int resourceId3 = obtainStyledAttributes.getResourceId(0, 0);
                int color = obtainStyledAttributes.getColor(9, -16777216);
                vl5.b bVar = new vl5.b(this, resourceId, i28, i27, resourceId3, resourceId2);
                bVar.f437909n = z18;
                bVar.f437907i = z19;
                bVar.f437969f = color;
                this.f212500p0 = bVar;
                setOnTouchListener(bVar);
            }
            obtainStyledAttributes.recycle();
            i18 = i19;
        } else {
            i17 = 150;
        }
        this.F = new vl5.k(this);
        if (i18 > 0) {
            f17 = 0.5f;
            this.D1 = new vl5.r(this, 0.5f, i18, null);
        } else {
            f17 = 0.5f;
        }
        if (i17 > 0) {
            this.E1 = new vl5.n(this, f17, i17, null);
        }
        this.f212510x0 = android.view.MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        this.f212494i = new vl5.f(this);
    }

    public final void b() {
        int firstVisiblePosition = getFirstVisiblePosition();
        int lastVisiblePosition = getLastVisiblePosition();
        int min = java.lang.Math.min(lastVisiblePosition - firstVisiblePosition, ((getCount() - 1) - getFooterViewsCount()) - firstVisiblePosition);
        for (int max = java.lang.Math.max(0, getHeaderViewsCount() - firstVisiblePosition); max <= min; max++) {
            android.view.View childAt = getChildAt(max);
            if (childAt != null) {
                c(firstVisiblePosition + max, childAt, false);
            }
        }
    }

    public final void c(int i17, android.view.View view, boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int f17 = (i17 == this.f212504s || i17 == this.f212499p || i17 == this.f212502q) ? f(i17, p(i17, view, z17)) : -2;
        if (f17 != layoutParams.height) {
            layoutParams.height = f17;
            view.setLayoutParams(layoutParams);
        }
        if (i17 == this.f212499p || i17 == this.f212502q) {
            int i18 = this.f212504s;
            if (i17 < i18) {
                ((vl5.c) view).setGravity(80);
            } else if (i17 > i18) {
                ((vl5.c) view).setGravity(48);
            }
        }
        int visibility = view.getVisibility();
        int i19 = (i17 != this.f212504s || this.f212489d == null) ? 0 : 4;
        if (i19 != visibility) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/sortlist/DragSortListView", "adjustItem", "(ILandroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/widget/sortlist/DragSortListView", "adjustItem", "(ILandroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void d() {
        int firstVisiblePosition = getFirstVisiblePosition();
        if (this.f212504s < firstVisiblePosition) {
            android.view.View childAt = getChildAt(0);
            setSelectionFromTop(firstVisiblePosition - 1, (childAt != null ? childAt.getTop() : 0) - getPaddingTop());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        float f17;
        super.dispatchDraw(canvas);
        if (this.f212515z != 0) {
            int i17 = this.f212499p;
            if (i17 != this.f212504s) {
                m(i17, canvas);
            }
            int i18 = this.f212502q;
            if (i18 != this.f212499p && i18 != this.f212504s) {
                m(i18, canvas);
            }
        }
        android.view.View view = this.f212489d;
        if (view != null) {
            int width = view.getWidth();
            int height = this.f212489d.getHeight();
            int i19 = this.f212490e.x;
            int width2 = getWidth();
            if (i19 < 0) {
                i19 = -i19;
            }
            if (i19 < width2) {
                float f18 = (width2 - i19) / width2;
                f17 = f18 * f18;
            } else {
                f17 = 0.0f;
            }
            int i27 = (int) (this.f212497n * 255.0f * f17);
            canvas.save();
            canvas.translate(r2.x, r2.y);
            canvas.clipRect(0, 0, width, height);
            canvas.saveLayerAlpha(0.0f, 0.0f, width, height, i27, 31);
            this.f212489d.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    public final int f(int i17, int i18) {
        boolean z17 = this.f212503r && this.f212499p != this.f212502q;
        int i19 = this.B;
        int i27 = this.A;
        int i28 = i19 - i27;
        int i29 = (int) (this.f212501p1 * i28);
        int i37 = this.f212504s;
        return i17 == i37 ? i37 == this.f212499p ? z17 ? i29 + i27 : i19 : i37 == this.f212502q ? i19 - i29 : i27 : i17 == this.f212499p ? z17 ? i18 + i29 : i18 + i28 : i17 == this.f212502q ? (i18 + i28) - i29 : i18;
    }

    public void g() {
        if (this.f212515z == 4) {
            this.F.b(true);
            h();
            this.f212504s = -1;
            this.f212499p = -1;
            this.f212502q = -1;
            this.f212498o = -1;
            b();
            if (this.W) {
                this.f212515z = 3;
            } else {
                this.f212515z = 0;
            }
        }
    }

    public float getFloatAlpha() {
        return this.f212497n;
    }

    public android.widget.ListAdapter getInputAdapter() {
        vl5.h hVar = this.f212511x1;
        if (hVar == null) {
            return null;
        }
        return hVar.f437926d;
    }

    public final void h() {
        android.view.View view = this.f212489d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/sortlist/DragSortListView", "destroyFloatView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/widget/sortlist/DragSortListView", "destroyFloatView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            vl5.p pVar = this.f212500p0;
            if (pVar != null) {
                android.view.View view2 = this.f212489d;
                vl5.u uVar = (vl5.u) pVar;
                uVar.getClass();
                if (view2 instanceof android.widget.ImageView) {
                    ((android.widget.ImageView) view2).setImageDrawable(null);
                }
                com.tencent.mm.ui.yk.c("MicroMsg.SimpleFloatViewManager", "bitmap recycle %s", uVar.f437967d.toString());
                uVar.f437967d.recycle();
                uVar.f437967d = null;
            }
            this.f212489d = null;
            invalidate();
        }
    }

    public final void i() {
        this.f212513y0 = 0;
        this.W = false;
        if (this.f212515z == 3) {
            this.f212515z = 0;
        }
        this.f212497n = this.f212496m;
        this.H1 = false;
        vl5.q qVar = this.C1;
        qVar.f437947a.clear();
        qVar.f437948b.clear();
    }

    public final void j(int i17, android.view.View view, boolean z17) {
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        boolean z18;
        int i37;
        int i38;
        this.A1 = true;
        vl5.p pVar = this.f212500p0;
        android.graphics.Point point = this.f212490e;
        if (pVar != null) {
            this.f212491f.set(this.R, this.S);
            vl5.b bVar = (vl5.b) this.f212500p0;
            if (bVar.f437909n && bVar.f437910o) {
                bVar.G = point.x;
            }
        }
        int i39 = point.x;
        int i47 = point.y;
        int paddingLeft = getPaddingLeft();
        int i48 = this.U;
        if ((i48 & 1) == 0 && i39 > paddingLeft) {
            point.x = paddingLeft;
        } else if ((i48 & 2) == 0 && i39 < paddingLeft) {
            point.x = paddingLeft;
        }
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = getFooterViewsCount();
        int firstVisiblePosition = getFirstVisiblePosition();
        int lastVisiblePosition = getLastVisiblePosition();
        int paddingTop = getPaddingTop();
        if (firstVisiblePosition < headerViewsCount) {
            paddingTop = getChildAt((headerViewsCount - firstVisiblePosition) - 1).getBottom();
        }
        if ((this.U & 8) == 0 && firstVisiblePosition <= (i38 = this.f212504s)) {
            paddingTop = java.lang.Math.max(getChildAt(i38 - firstVisiblePosition).getTop(), paddingTop);
        }
        int height = getHeight() - getPaddingBottom();
        if (lastVisiblePosition >= (getCount() - footerViewsCount) - 1) {
            height = getChildAt(((getCount() - footerViewsCount) - 1) - firstVisiblePosition).getBottom();
        }
        if ((this.U & 4) == 0 && lastVisiblePosition >= (i37 = this.f212504s)) {
            height = java.lang.Math.min(getChildAt(i37 - firstVisiblePosition).getBottom(), height);
        }
        if (i47 < paddingTop) {
            point.y = paddingTop;
        } else {
            int i49 = this.B;
            if (i47 + i49 > height) {
                point.y = height - i49;
            }
        }
        this.f212492g = point.y + this.C;
        int i57 = this.f212499p;
        int i58 = this.f212502q;
        int firstVisiblePosition2 = getFirstVisiblePosition();
        int i59 = this.f212499p;
        android.view.View childAt = getChildAt(i59 - firstVisiblePosition2);
        if (childAt == null) {
            i59 = (getChildCount() / 2) + firstVisiblePosition2;
            childAt = getChildAt(i59 - firstVisiblePosition2);
        }
        int top = childAt.getTop();
        int height2 = childAt.getHeight();
        int r17 = r(i59, top);
        int dividerHeight = getDividerHeight();
        if (this.f212492g < r17) {
            while (i59 >= 0) {
                i59--;
                int q17 = q(i59);
                if (i59 == 0) {
                    i18 = (top - dividerHeight) - q17;
                    i19 = i18;
                    break;
                } else {
                    top -= q17 + dividerHeight;
                    i19 = r(i59, top);
                    if (this.f212492g >= i19) {
                        break;
                    } else {
                        r17 = i19;
                    }
                }
            }
            i19 = r17;
        } else {
            int count = getCount();
            while (i59 < count) {
                if (i59 == count - 1) {
                    i18 = top + dividerHeight + height2;
                    i19 = i18;
                    break;
                }
                top += height2 + dividerHeight;
                int i66 = i59 + 1;
                int q18 = q(i66);
                int r18 = r(i66, top);
                if (this.f212492g < r18) {
                    i19 = r18;
                    break;
                } else {
                    i59 = i66;
                    height2 = q18;
                    r17 = r18;
                }
            }
            i19 = r17;
        }
        int headerViewsCount2 = getHeaderViewsCount();
        int footerViewsCount2 = getFooterViewsCount();
        int i67 = this.f212499p;
        int i68 = this.f212502q;
        float f17 = this.f212501p1;
        if (this.f212503r) {
            int abs = java.lang.Math.abs(i19 - r17);
            int i69 = this.f212492g;
            if (i69 < i19) {
                int i76 = r17;
                r17 = i19;
                i19 = i76;
            }
            int i77 = (int) (this.f212495l1 * 0.5f * abs);
            float f18 = i77;
            int i78 = i19 + i77;
            int i79 = r17 - i77;
            if (i69 < i78) {
                this.f212499p = i59 - 1;
                this.f212502q = i59;
                this.f212501p1 = ((i78 - i69) * 0.5f) / f18;
            } else if (i69 < i79) {
                this.f212499p = i59;
                this.f212502q = i59;
            } else {
                this.f212499p = i59;
                this.f212502q = i59 + 1;
                this.f212501p1 = (((r17 - i69) / f18) + 1.0f) * 0.5f;
            }
        } else {
            this.f212499p = i59;
            this.f212502q = i59;
        }
        if (this.f212499p < headerViewsCount2) {
            this.f212499p = headerViewsCount2;
            this.f212502q = headerViewsCount2;
            i59 = headerViewsCount2;
        } else if (this.f212502q >= getCount() - footerViewsCount2) {
            i59 = (getCount() - footerViewsCount2) - 1;
            this.f212499p = i59;
            this.f212502q = i59;
        }
        boolean z19 = (this.f212499p == i67 && this.f212502q == i68 && java.lang.Math.abs(this.f212501p1 - f17) <= 0.0f) ? false : true;
        int i86 = this.f212498o;
        if (i59 != i86) {
            vl5.i iVar = this.f212507v;
            if (iVar != null) {
                int i87 = i86 - headerViewsCount2;
                int i88 = i59 - headerViewsCount2;
                com.tencent.mm.plugin.emoji.ui.EmojiSortFragment emojiSortFragment = ((com.tencent.mm.plugin.emoji.ui.h3) iVar).f98051a;
                emojiSortFragment.f97833h.vibrate(50L);
                la5.c cVar = la5.b.f317600a;
                if (cVar.g(true)) {
                    if (emojiSortFragment.f97834i == -1) {
                        emojiSortFragment.f97834i = i87;
                    }
                    m22.i iVar2 = (m22.i) emojiSortFragment.f97829d.getItem(i88);
                    if (i87 > i88) {
                        if (i88 >= emojiSortFragment.f97834i) {
                            i12.k kVar = emojiSortFragment.f97829d;
                            iVar2 = (m22.i) kVar.getItem(java.lang.Math.min(i88 + 1, kVar.getCount() - 1));
                        }
                        cVar.i(emojiSortFragment.f97830e, emojiSortFragment.getResources().getString(com.tencent.mm.R.string.nfa, iVar2.c()));
                    } else {
                        if (i88 <= emojiSortFragment.f97834i) {
                            z18 = true;
                            iVar2 = (m22.i) emojiSortFragment.f97829d.getItem(java.lang.Math.max(i88 - 1, 0));
                        } else {
                            z18 = true;
                        }
                        cVar.i(emojiSortFragment.f97830e, emojiSortFragment.getResources().getString(com.tencent.mm.R.string.nf_, iVar2.c()));
                        this.f212498o = i59;
                        z19 = z18;
                    }
                }
            }
            z18 = true;
            this.f212498o = i59;
            z19 = z18;
        }
        if (z19) {
            b();
            int o17 = o(i17);
            int height3 = view.getHeight();
            int f19 = f(i17, o17);
            int i89 = this.f212504s;
            if (i17 != i89) {
                i27 = height3 - o17;
                i28 = f19 - o17;
            } else {
                i27 = height3;
                i28 = f19;
            }
            int i96 = this.B;
            int i97 = this.f212499p;
            if (i89 != i97 && i89 != this.f212502q) {
                i96 -= this.A;
            }
            if (i17 <= i57) {
                if (i17 > i97) {
                    i29 = (i96 - i28) + 0;
                    setSelectionFromTop(i17, (view.getTop() + i29) - getPaddingTop());
                    layoutChildren();
                }
                i29 = 0;
                setSelectionFromTop(i17, (view.getTop() + i29) - getPaddingTop());
                layoutChildren();
            } else {
                if (i17 == i58) {
                    if (i17 <= i97) {
                        i27 -= i96;
                    } else if (i17 == this.f212502q) {
                        i29 = (height3 - f19) + 0;
                    }
                    i29 = 0 + i27;
                } else if (i17 <= i97) {
                    i29 = 0 - i96;
                } else {
                    if (i17 == this.f212502q) {
                        i29 = 0 - i28;
                    }
                    i29 = 0;
                }
                setSelectionFromTop(i17, (view.getTop() + i29) - getPaddingTop());
                layoutChildren();
            }
        }
        if (z19 || z17) {
            invalidate();
        }
        this.A1 = false;
    }

    public final void k(boolean z17) {
        int firstVisiblePosition = getFirstVisiblePosition() + (getChildCount() / 2);
        android.view.View childAt = getChildAt(getChildCount() / 2);
        if (childAt == null) {
            return;
        }
        j(firstVisiblePosition, childAt, z17);
    }

    public final void l(int i17) {
        this.f212515z = 1;
        vl5.s sVar = this.f212509x;
        if (sVar != null) {
            sVar.remove(i17);
        }
        h();
        d();
        this.f212504s = -1;
        this.f212499p = -1;
        this.f212502q = -1;
        this.f212498o = -1;
        if (this.W) {
            this.f212515z = 3;
        } else {
            this.f212515z = 0;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        super.layoutChildren();
        android.view.View view = this.f212489d;
        if (view != null) {
            if (view.isLayoutRequested() && !this.f212493h) {
                s();
            }
            android.view.View view2 = this.f212489d;
            view2.layout(0, 0, view2.getMeasuredWidth(), this.f212489d.getMeasuredHeight());
            this.f212493h = false;
        }
    }

    public final void m(int i17, android.graphics.Canvas canvas) {
        android.view.ViewGroup viewGroup;
        int i18;
        int i19;
        android.graphics.drawable.Drawable divider = getDivider();
        int dividerHeight = getDividerHeight();
        if (divider == null || dividerHeight == 0 || (viewGroup = (android.view.ViewGroup) getChildAt(i17 - getFirstVisiblePosition())) == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = viewGroup.getChildAt(0).getHeight();
        if (i17 > this.f212504s) {
            i19 = viewGroup.getTop() + height;
            i18 = dividerHeight + i19;
        } else {
            int bottom = viewGroup.getBottom() - height;
            int i27 = bottom - dividerHeight;
            i18 = bottom;
            i19 = i27;
        }
        canvas.save();
        canvas.clipRect(paddingLeft, i19, width, i18);
        divider.setBounds(paddingLeft, i19, width, i18);
        divider.draw(canvas);
        canvas.restore();
    }

    public final void n() {
        int i17;
        this.f212515z = 2;
        if (this.f212508w != null && (i17 = this.f212498o) >= 0 && i17 < getCount()) {
            int headerViewsCount = getHeaderViewsCount();
            this.f212508w.a(this.f212504s - headerViewsCount, this.f212498o - headerViewsCount);
        }
        h();
        d();
        this.f212504s = -1;
        this.f212499p = -1;
        this.f212502q = -1;
        this.f212498o = -1;
        b();
        if (this.W) {
            this.f212515z = 3;
        } else {
            this.f212515z = 0;
        }
    }

    public final int o(int i17) {
        android.view.View view;
        if (i17 == this.f212504s) {
            return 0;
        }
        android.view.View childAt = getChildAt(i17 - getFirstVisiblePosition());
        if (childAt != null) {
            return p(i17, childAt, false);
        }
        vl5.q qVar = this.C1;
        int i18 = qVar.f437947a.get(i17, -1);
        if (i18 != -1) {
            return i18;
        }
        android.widget.ListAdapter adapter = getAdapter();
        int itemViewType = adapter.getItemViewType(i17);
        int viewTypeCount = adapter.getViewTypeCount();
        if (viewTypeCount != this.E.length) {
            this.E = new android.view.View[viewTypeCount];
        }
        if (itemViewType >= 0) {
            android.view.View view2 = this.E[itemViewType];
            if (view2 == null) {
                view = adapter.getView(i17, null, this);
                this.E[itemViewType] = view;
            } else {
                view = adapter.getView(i17, view2, this);
            }
        } else {
            view = adapter.getView(i17, null, this);
        }
        int p17 = p(i17, view, true);
        android.util.SparseIntArray sparseIntArray = qVar.f437947a;
        int i19 = sparseIntArray.get(i17, -1);
        if (i19 != p17) {
            java.util.ArrayList arrayList = qVar.f437948b;
            if (i19 != -1) {
                arrayList.remove(java.lang.Integer.valueOf(i17));
            } else if (sparseIntArray.size() == qVar.f437949c) {
                sparseIntArray.delete(((java.lang.Integer) arrayList.remove(0)).intValue());
            }
            sparseIntArray.put(i17, p17);
            arrayList.add(java.lang.Integer.valueOf(i17));
        }
        return p17;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f212514y1) {
            vl5.m mVar = this.f212516z1;
            if (mVar.f437940e) {
                java.lang.StringBuilder sb6 = mVar.f437936a;
                sb6.append("<DSLVState>\n");
                com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = mVar.f437941f;
                int childCount = dragSortListView.getChildCount();
                int firstVisiblePosition = dragSortListView.getFirstVisiblePosition();
                sb6.append("    <Positions>");
                for (int i17 = 0; i17 < childCount; i17++) {
                    sb6.append(firstVisiblePosition + i17);
                    sb6.append(",");
                }
                sb6.append("</Positions>\n");
                sb6.append("    <Tops>");
                for (int i18 = 0; i18 < childCount; i18++) {
                    sb6.append(dragSortListView.getChildAt(i18).getTop());
                    sb6.append(",");
                }
                sb6.append("</Tops>\n");
                sb6.append("    <Bottoms>");
                for (int i19 = 0; i19 < childCount; i19++) {
                    sb6.append(dragSortListView.getChildAt(i19).getBottom());
                    sb6.append(",");
                }
                sb6.append("</Bottoms>\n");
                sb6.append("    <FirstExpPos>");
                sb6.append(dragSortListView.f212499p);
                sb6.append("</FirstExpPos>\n");
                sb6.append("    <FirstExpBlankHeight>");
                sb6.append(dragSortListView.q(dragSortListView.f212499p) - dragSortListView.o(dragSortListView.f212499p));
                sb6.append("</FirstExpBlankHeight>\n");
                sb6.append("    <SecondExpPos>");
                sb6.append(dragSortListView.f212502q);
                sb6.append("</SecondExpPos>\n");
                sb6.append("    <SecondExpBlankHeight>");
                sb6.append(dragSortListView.q(dragSortListView.f212502q) - dragSortListView.o(dragSortListView.f212502q));
                sb6.append("</SecondExpBlankHeight>\n");
                sb6.append("    <SrcPos>");
                sb6.append(dragSortListView.f212504s);
                sb6.append("</SrcPos>\n");
                sb6.append("    <SrcHeight>");
                sb6.append(dragSortListView.B + dragSortListView.getDividerHeight());
                sb6.append("</SrcHeight>\n");
                sb6.append("    <ViewHeight>");
                sb6.append(dragSortListView.getHeight());
                sb6.append("</ViewHeight>\n");
                sb6.append("    <LastY>");
                sb6.append(dragSortListView.T);
                sb6.append("</LastY>\n");
                sb6.append("    <FloatY>");
                sb6.append(dragSortListView.f212492g);
                sb6.append("</FloatY>\n");
                sb6.append("    <ShuffleEdges>");
                for (int i27 = 0; i27 < childCount; i27++) {
                    sb6.append(dragSortListView.r(firstVisiblePosition + i27, dragSortListView.getChildAt(i27).getTop()));
                    sb6.append(",");
                }
                sb6.append("</ShuffleEdges>\n");
                sb6.append("</DSLVState>\n");
                int i28 = mVar.f437938c + 1;
                mVar.f437938c = i28;
                if (i28 > 1000) {
                    mVar.a();
                    mVar.f437938c = 0;
                }
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17;
        if (!this.f212512y) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        v(motionEvent);
        this.V = true;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f212515z != 0) {
                this.B1 = true;
                return true;
            }
            this.W = true;
        }
        if (this.f212489d != null) {
            z17 = true;
        } else {
            if (super.onInterceptTouchEvent(motionEvent)) {
                this.H1 = true;
                z17 = true;
            } else {
                z17 = false;
            }
            if (action == 1 || action == 3) {
                i();
            } else if (z17) {
                this.f212513y0 = 1;
            } else {
                this.f212513y0 = 2;
            }
        }
        if (action == 1 || action == 3) {
            this.W = false;
        }
        return z17;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        android.view.View view = this.f212489d;
        if (view != null) {
            if (view.isLayoutRequested()) {
                s();
            }
            this.f212493h = true;
        }
        this.D = i17;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        y();
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17 = false;
        if (this.B1) {
            this.B1 = false;
            return false;
        }
        if (!this.f212512y) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z18 = this.V;
        this.V = false;
        if (!z18) {
            v(motionEvent);
        }
        int i17 = this.f212515z;
        if (i17 != 4) {
            if (i17 == 0 && super.onTouchEvent(motionEvent)) {
                z17 = true;
            }
            int action = motionEvent.getAction() & 255;
            if (action == 1 || action == 3) {
                i();
            } else if (z17) {
                this.f212513y0 = 1;
            }
            return z17;
        }
        int action2 = motionEvent.getAction() & 255;
        if (action2 == 1) {
            if (this.f212515z == 4) {
                this.F1 = false;
                x(false, 0.0f);
            }
            i();
            return true;
        }
        if (action2 != 2) {
            if (action2 != 3) {
                return true;
            }
            if (this.f212515z == 4) {
                g();
            }
            i();
            return true;
        }
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        android.graphics.Point point = this.f212490e;
        point.x = x17 - this.f212505t;
        point.y = y17 - this.f212506u;
        k(true);
        int min = java.lang.Math.min(y17, this.f212492g + this.C);
        int max = java.lang.Math.max(y17, this.f212492g - this.C);
        vl5.k kVar = this.F;
        boolean z19 = kVar.f437934m;
        int i18 = z19 ? kVar.f437932h : -1;
        int i19 = this.T;
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = kVar.f437935n;
        if (min > i19 && min > this.f212488J && i18 != 1) {
            if (i18 != -1) {
                kVar.b(true);
            }
            if (kVar.f437934m) {
                return true;
            }
            kVar.f437928d = false;
            kVar.f437934m = true;
            kVar.f437929e = android.os.SystemClock.uptimeMillis();
            kVar.f437932h = 1;
            dragSortListView.post(kVar);
            return true;
        }
        if (max >= i19 || max >= this.I || i18 == 0) {
            if (max < this.I || min > this.f212488J || !z19) {
                return true;
            }
            kVar.b(true);
            return true;
        }
        if (i18 != -1) {
            kVar.b(true);
        }
        if (kVar.f437934m) {
            return true;
        }
        kVar.f437928d = false;
        kVar.f437934m = true;
        kVar.f437929e = android.os.SystemClock.uptimeMillis();
        kVar.f437932h = 0;
        dragSortListView.post(kVar);
        return true;
    }

    public final int p(int i17, android.view.View view, boolean z17) {
        int i18;
        if (i17 == this.f212504s) {
            return 0;
        }
        if (i17 >= getHeaderViewsCount() && i17 < getCount() - getFooterViewsCount()) {
            view = ((android.view.ViewGroup) view).getChildAt(0);
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (i18 = layoutParams.height) > 0) {
            return i18;
        }
        int height = view.getHeight();
        if (height != 0 && !z17) {
            return height;
        }
        t(view);
        return view.getMeasuredHeight();
    }

    public final int q(int i17) {
        android.view.View childAt = getChildAt(i17 - getFirstVisiblePosition());
        return childAt != null ? childAt.getHeight() : f(i17, o(i17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r8 <= r5) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(int r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.getHeaderViewsCount()
            int r1 = r7.getFooterViewsCount()
            if (r8 <= r0) goto L65
            int r0 = r7.getCount()
            int r0 = r0 - r1
            if (r8 < r0) goto L12
            goto L65
        L12:
            int r0 = r7.getDividerHeight()
            int r1 = r7.B
            int r2 = r7.A
            int r1 = r1 - r2
            int r2 = r7.o(r8)
            int r3 = r7.q(r8)
            int r4 = r7.f212502q
            int r5 = r7.f212504s
            if (r4 > r5) goto L3e
            if (r8 != r4) goto L38
            int r6 = r7.f212499p
            if (r6 == r4) goto L38
            if (r8 != r5) goto L35
            int r9 = r9 + r3
            int r1 = r7.B
            goto L3c
        L35:
            int r3 = r3 - r2
            int r9 = r9 + r3
            goto L3c
        L38:
            if (r8 <= r4) goto L4e
            if (r8 > r5) goto L4e
        L3c:
            int r9 = r9 - r1
            goto L4e
        L3e:
            if (r8 <= r5) goto L46
            int r6 = r7.f212499p
            if (r8 > r6) goto L46
            int r9 = r9 + r1
            goto L4e
        L46:
            if (r8 != r4) goto L4e
            int r1 = r7.f212499p
            if (r1 == r4) goto L4e
            int r3 = r3 - r2
            int r9 = r9 + r3
        L4e:
            if (r8 > r5) goto L5e
            int r1 = r7.B
            int r1 = r1 - r0
            int r8 = r8 + (-1)
            int r8 = r7.o(r8)
            int r1 = r1 - r8
            int r1 = r1 / 2
            int r9 = r9 + r1
            goto L65
        L5e:
            int r2 = r2 - r0
            int r8 = r7.B
            int r2 = r2 - r8
            int r2 = r2 / 2
            int r9 = r9 + r2
        L65:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.sortlist.DragSortListView.r(int, int):int");
    }

    @Override // android.widget.AbsListView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.A1) {
            return;
        }
        super.requestLayout();
    }

    public final void s() {
        android.view.View view = this.f212489d;
        if (view != null) {
            t(view);
            int measuredHeight = this.f212489d.getMeasuredHeight();
            this.B = measuredHeight;
            this.C = measuredHeight / 2;
        }
    }

    public void setDragEnabled(boolean z17) {
        this.f212512y = z17;
    }

    public void setDragListener(vl5.i iVar) {
        this.f212507v = iVar;
    }

    public void setDragScrollProfile(vl5.j jVar) {
        if (jVar != null) {
            this.Q = jVar;
        }
    }

    public void setDragScrollStart(float f17) {
        if (f17 > 0.5f) {
            this.H = 0.5f;
        } else {
            this.H = f17;
        }
        if (f17 > 0.5f) {
            this.G = 0.5f;
        } else {
            this.G = f17;
        }
        if (getHeight() != 0) {
            y();
        }
    }

    public void setDragSortListener(vl5.l lVar) {
        setDropListener(lVar);
        setDragListener(lVar);
        setRemoveListener(lVar);
    }

    public void setDropListener(vl5.o oVar) {
        this.f212508w = oVar;
    }

    public void setFloatAlpha(float f17) {
        this.f212497n = f17;
    }

    public void setFloatViewManager(vl5.p pVar) {
        this.f212500p0 = pVar;
    }

    public void setMaxScrollSpeed(float f17) {
        this.P = f17;
    }

    public void setRemoveListener(vl5.s sVar) {
        this.f212509x = sVar;
    }

    public final void t(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.AbsListView.LayoutParams(-1, -2);
            view.setLayoutParams(layoutParams);
        }
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.D, getListPaddingLeft() + getListPaddingRight(), layoutParams.width);
        int i17 = layoutParams.height;
        view.measure(childMeasureSpec, i17 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i17, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void u(int i17, float f17) {
        int i18 = this.f212515z;
        if (i18 == 0 || i18 == 4) {
            if (i18 == 0) {
                int headerViewsCount = getHeaderViewsCount() + i17;
                this.f212504s = headerViewsCount;
                this.f212499p = headerViewsCount;
                this.f212502q = headerViewsCount;
                this.f212498o = headerViewsCount;
                android.view.View childAt = getChildAt(headerViewsCount - getFirstVisiblePosition());
                if (childAt != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/ui/widget/sortlist/DragSortListView", "removeItem", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(childAt, "com/tencent/mm/ui/widget/sortlist/DragSortListView", "removeItem", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            this.f212515z = 1;
            this.G1 = f17;
            if (this.W) {
                int i19 = this.f212513y0;
                android.view.MotionEvent motionEvent = this.f212510x0;
                if (i19 == 1) {
                    super.onTouchEvent(motionEvent);
                } else if (i19 == 2) {
                    super.onInterceptTouchEvent(motionEvent);
                }
            }
            vl5.r rVar = this.D1;
            if (rVar == null) {
                l(i17);
                return;
            }
            rVar.f437958d = android.os.SystemClock.uptimeMillis();
            rVar.f437965n = false;
            rVar.c();
            rVar.f437966o.post(rVar);
        }
    }

    public final void v(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            this.T = this.S;
        }
        this.R = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        this.S = y17;
        if (action == 0) {
            this.T = y17;
        }
        motionEvent.getRawX();
        motionEvent.getRawY();
    }

    public boolean w(int i17, int i18, int i19, int i27) {
        vl5.p pVar;
        android.widget.ImageView imageView;
        if (!this.W || (pVar = this.f212500p0) == null) {
            return false;
        }
        vl5.u uVar = (vl5.u) pVar;
        android.widget.ListView listView = uVar.f437970g;
        android.view.View childAt = listView.getChildAt((i17 + listView.getHeaderViewsCount()) - listView.getFirstVisiblePosition());
        if (childAt == null) {
            imageView = null;
        } else {
            childAt.setPressed(false);
            childAt.setDrawingCacheEnabled(true);
            android.graphics.Bitmap drawingCache = childAt.getDrawingCache();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(drawingCache);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/widget/sortlist/SimpleFloatViewManager", "onCreateFloatView", "(I)Landroid/view/View;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/widget/sortlist/SimpleFloatViewManager", "onCreateFloatView", "(I)Landroid/view/View;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;");
            uVar.f437967d = createBitmap;
            childAt.setDrawingCacheEnabled(false);
            if (uVar.f437968e == null) {
                uVar.f437968e = new android.widget.ImageView(listView.getContext());
            }
            uVar.f437968e.setBackgroundColor(uVar.f437969f);
            uVar.f437968e.setPadding(0, 0, 0, 0);
            uVar.f437968e.setImageBitmap(uVar.f437967d);
            uVar.f437968e.setLayoutParams(new android.view.ViewGroup.LayoutParams(childAt.getWidth(), childAt.getHeight()));
            imageView = uVar.f437968e;
        }
        if (imageView == null || this.f212515z != 0 || !this.W || this.f212489d != null || !this.f212512y) {
            return false;
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int headerViewsCount = i17 + getHeaderViewsCount();
        this.f212499p = headerViewsCount;
        this.f212502q = headerViewsCount;
        this.f212504s = headerViewsCount;
        this.f212498o = headerViewsCount;
        this.f212515z = 4;
        this.U = 0 | i18;
        this.f212489d = imageView;
        s();
        this.f212505t = i19;
        this.f212506u = i27;
        int i28 = this.S;
        android.graphics.Point point = this.f212490e;
        point.x = this.R - i19;
        point.y = i28 - i27;
        android.view.View childAt2 = getChildAt(this.f212504s - getFirstVisiblePosition());
        if (childAt2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(childAt2, arrayList2.toArray(), "com/tencent/mm/ui/widget/sortlist/DragSortListView", "startDrag", "(ILandroid/view/View;III)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(childAt2, "com/tencent/mm/ui/widget/sortlist/DragSortListView", "startDrag", "(ILandroid/view/View;III)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f212514y1) {
            vl5.m mVar = this.f212516z1;
            mVar.f437936a.append("<DSLVStates>\n");
            mVar.f437939d = 0;
            mVar.f437940e = true;
        }
        int i29 = this.f212513y0;
        android.view.MotionEvent motionEvent = this.f212510x0;
        if (i29 == 1) {
            super.onTouchEvent(motionEvent);
        } else if (i29 == 2) {
            super.onInterceptTouchEvent(motionEvent);
        }
        requestLayout();
        return true;
    }

    public boolean x(boolean z17, float f17) {
        if (this.f212489d == null) {
            return false;
        }
        this.F.b(true);
        if (z17) {
            u(this.f212504s - getHeaderViewsCount(), f17);
        } else {
            vl5.n nVar = this.E1;
            if (nVar != null) {
                nVar.f437958d = android.os.SystemClock.uptimeMillis();
                nVar.f437965n = false;
                nVar.d();
                nVar.f437966o.post(nVar);
            } else {
                n();
            }
        }
        if (this.f212514y1) {
            vl5.m mVar = this.f212516z1;
            if (mVar.f437940e) {
                mVar.f437936a.append("</DSLVStates>\n");
                mVar.a();
                mVar.f437940e = false;
            }
        }
        return true;
    }

    public final void y() {
        int paddingTop = getPaddingTop();
        float height = (getHeight() - paddingTop) - getPaddingBottom();
        float f17 = paddingTop;
        float f18 = (this.G * height) + f17;
        this.L = f18;
        float f19 = ((1.0f - this.H) * height) + f17;
        this.K = f19;
        this.I = (int) f18;
        this.f212488J = (int) f19;
        this.M = f18 - f17;
        this.N = (paddingTop + r1) - f19;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.ListAdapter listAdapter) {
        if (listAdapter != null) {
            this.f212511x1 = new vl5.h(this, listAdapter, null);
            listAdapter.registerDataSetObserver(this.f212494i);
            if (listAdapter instanceof vl5.o) {
                setDropListener((vl5.o) listAdapter);
            }
            if (listAdapter instanceof vl5.i) {
                setDragListener((vl5.i) listAdapter);
            }
            if (listAdapter instanceof vl5.s) {
                setRemoveListener((vl5.s) listAdapter);
            }
        } else {
            this.f212511x1 = null;
        }
        super.setAdapter((android.widget.ListAdapter) this.f212511x1);
    }
}
