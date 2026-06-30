package com.tencent.mm.ui.mogic;

/* loaded from: classes15.dex */
public class WxViewPager extends android.view.ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final java.lang.String TAG = "WxViewPager";
    private static final boolean USE_CACHE = false;
    public boolean enableChildScroll;
    private java.util.List<androidx.viewpager.widget.ViewPager.OnPageChangeListener> listeners;
    private int mActivePointerId;
    private androidx.viewpager.widget.a mAdapter;
    private ii5.i mAdapterChangeListener;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    private int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private java.util.ArrayList<android.view.View> mDrawingOrderedChildren;
    private final java.lang.Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mIgnoreGutter;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private androidx.viewpager.widget.ViewPager.OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private final java.util.ArrayList<ii5.g> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private androidx.core.widget.i mLeftEdge;
    private android.graphics.drawable.Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private ii5.j mObserver;
    private int mOffscreenPageLimit;
    private androidx.viewpager.widget.ViewPager.OnPageChangeListener mOnPageChangeListener;
    private int mPageMargin;
    private androidx.viewpager.widget.m mPageTransformer;
    private boolean mPopulatePending;
    private android.os.Parcelable mRestoredAdapterState;
    private java.lang.ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private androidx.core.widget.i mRightEdge;
    private int mScrollState;
    private android.widget.Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private java.lang.reflect.Method mSetChildrenDrawingOrderEnabled;
    private final ii5.g mTempItem;
    private final android.graphics.Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private android.view.VelocityTracker mVelocityTracker;
    private static final int[] LAYOUT_ATTRS = {android.R.attr.layout_gravity};
    private static final java.util.Comparator<ii5.g> COMPARATOR = new ii5.d();
    private static final android.view.animation.Interpolator sInterpolator = new ii5.e();
    private static final com.tencent.mm.ui.mogic.b sPositionComparator = new com.tencent.mm.ui.mogic.b();

    /* loaded from: classes13.dex */
    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.tencent.mm.ui.mogic.WxViewPager.SavedState> CREATOR = new j3.r(new com.tencent.mm.ui.mogic.a());

        /* renamed from: d, reason: collision with root package name */
        public int f209249d;

        /* renamed from: e, reason: collision with root package name */
        public android.os.Parcelable f209250e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.ClassLoader f209251f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f209249d = parcel.readInt();
            this.f209250e = parcel.readParcelable(classLoader);
            this.f209251f = classLoader;
        }

        public java.lang.String toString() {
            return "FragmentPager.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " position=" + this.f209249d + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f209249d);
            parcel.writeParcelable(this.f209250e, i17);
        }
    }

    public WxViewPager(android.content.Context context) {
        super(context);
        this.mItems = new java.util.ArrayList<>();
        this.mTempItem = new ii5.g();
        this.mTempRect = new android.graphics.Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.enableChildScroll = true;
        this.mEndScrollRunnable = new ii5.f(this);
        this.mScrollState = 0;
        this.listeners = new java.util.ArrayList();
        initViewPager();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i17) {
        if (this.mScrollState == i17) {
            return;
        }
        this.mScrollState = i17;
        if (this.mPageTransformer != null) {
            boolean z17 = i17 != 0;
            int childCount = getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                int i19 = z17 ? 2 : 0;
                android.view.View childAt = getChildAt(i18);
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                childAt.setLayerType(i19, null);
            }
        }
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i17);
        }
        java.util.Iterator<androidx.viewpager.widget.ViewPager.OnPageChangeListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPageScrollStateChanged(i17);
        }
    }

    private void setScrollingCacheEnabled(boolean z17) {
        if (this.mScrollingCacheEnabled != z17) {
            this.mScrollingCacheEnabled = z17;
        }
    }

    public final void a(boolean z17) {
        boolean z18 = this.mScrollState == 2;
        if (z18) {
            setScrollingCacheEnabled(false);
            this.mScroller.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.mPopulatePending = false;
        for (int i17 = 0; i17 < this.mItems.size(); i17++) {
            ii5.g gVar = this.mItems.get(i17);
            if (gVar.f291659c) {
                gVar.f291659c = false;
                z18 = true;
            }
        }
        if (z18) {
            if (!z17) {
                this.mEndScrollRunnable.run();
                return;
            }
            java.lang.Runnable runnable = this.mEndScrollRunnable;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.m(this, runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> arrayList, int i17, int i18) {
        ii5.g infoForChild;
        iz5.a.d(null, arrayList);
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i19 = 0; i19 < getChildCount(); i19++) {
                android.view.View childAt = getChildAt(i19);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f291658b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i17, i18);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i18 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    public ii5.g addNewItem(int i17, int i18) {
        ii5.g gVar = new ii5.g();
        gVar.f291658b = i17;
        gVar.f291657a = this.mAdapter.instantiateItem((android.view.ViewGroup) this, i17);
        gVar.f291660d = this.mAdapter.getPageWidth(i17);
        if (i18 < 0 || i18 >= this.mItems.size()) {
            this.mItems.add(gVar);
        } else {
            this.mItems.add(i18, gVar);
        }
        return gVar;
    }

    public void addOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener) {
        if (this.listeners.contains(onPageChangeListener)) {
            return;
        }
        this.listeners.add(onPageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(java.util.ArrayList<android.view.View> arrayList) {
        ii5.g infoForChild;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f291658b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        iz5.a.d(null, layoutParams);
        com.tencent.mm.ui.mogic.WxViewPager.LayoutParams layoutParams2 = (com.tencent.mm.ui.mogic.WxViewPager.LayoutParams) layoutParams;
        boolean z17 = layoutParams2.f209243a | false;
        layoutParams2.f209243a = z17;
        if (!this.mInLayout) {
            super.addView(view, i17, layoutParams);
        } else {
            if (z17) {
                throw new java.lang.IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f209246d = true;
            addViewInLayout(view, i17, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean arrowScroll(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L41
        Lb:
            if (r0 == 0) goto L41
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = r1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L9
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L41:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L92
            if (r3 == r0) goto L92
            if (r7 != r5) goto L72
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.f(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.f(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L6c
            if (r1 < r2) goto L6c
            boolean r0 = r6.pageLeft()
            goto L70
        L6c:
            boolean r0 = r3.requestFocus()
        L70:
            r2 = r0
            goto La5
        L72:
            if (r7 != r4) goto La5
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.f(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.f(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L8d
            if (r1 > r2) goto L8d
            boolean r0 = r6.pageRight()
            goto L70
        L8d:
            boolean r0 = r3.requestFocus()
            goto L70
        L92:
            if (r7 == r5) goto La1
            if (r7 != r1) goto L97
            goto La1
        L97:
            if (r7 == r4) goto L9c
            r0 = 2
            if (r7 != r0) goto La5
        L9c:
            boolean r2 = r6.pageRight()
            goto La5
        La1:
            boolean r2 = r6.pageLeft()
        La5:
            if (r2 == 0) goto Lae
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.mogic.WxViewPager.arrowScroll(int):boolean");
    }

    public final int b(int i17, float f17, int i18, int i19) {
        if (java.lang.Math.abs(i19) <= this.mFlingDistance || java.lang.Math.abs(i18) <= this.mMinimumVelocity) {
            i17 = (int) (i17 + f17 + (i17 >= this.mCurItem ? 0.6f : 0.4f));
        } else if (i18 <= 0) {
            i17++;
        }
        return this.mItems.size() > 0 ? java.lang.Math.max(firstItemPosForDetermine(), java.lang.Math.min(i17, lastItemPosForDetermine())) : i17;
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public final void c() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        this.mIgnoreGutter = false;
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public boolean canScroll(android.view.View view, boolean z17, int i17, int i18, int i19) {
        int i27;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                int i28 = i18 + scrollX;
                if (i28 >= childAt.getLeft() && i28 < childAt.getRight() && (i27 = i19 + scrollY) >= childAt.getTop() && i27 < childAt.getBottom() && canScroll(childAt, true, i17, i28 - childAt.getLeft(), i27 - childAt.getTop()) && childAt.isEnabled()) {
                    if (this.enableChildScroll) {
                        return true;
                    }
                }
            }
        }
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (view.canScrollHorizontally(-i17)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i17 < 0 ? scrollX > ((int) (((float) clientWidth) * this.mFirstOffset)) : i17 > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof com.tencent.mm.ui.mogic.WxViewPager.LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!j(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.k(this);
    }

    public void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z17 = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int i17 = this.mCurItem;
        int i18 = 0;
        boolean z18 = false;
        while (i18 < this.mItems.size()) {
            ii5.g gVar = this.mItems.get(i18);
            int itemPosition = this.mAdapter.getItemPosition(gVar.f291657a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i18);
                    i18--;
                    if (!z18) {
                        this.mAdapter.startUpdate((android.view.ViewGroup) this);
                        z18 = true;
                    }
                    this.mAdapter.destroyItem((android.view.ViewGroup) this, gVar.f291658b, gVar.f291657a);
                    int i19 = this.mCurItem;
                    if (i19 == gVar.f291658b) {
                        i17 = java.lang.Math.max(0, java.lang.Math.min(i19, count - 1));
                    }
                } else {
                    int i27 = gVar.f291658b;
                    if (i27 != itemPosition) {
                        if (i27 == this.mCurItem) {
                            i17 = itemPosition;
                        }
                        gVar.f291658b = itemPosition;
                    }
                }
                z17 = true;
            }
            i18++;
        }
        if (z18) {
            this.mAdapter.finishUpdate((android.view.ViewGroup) this);
        }
        java.util.Collections.sort(this.mItems, COMPARATOR);
        if (z17) {
            int childCount = getChildCount();
            for (int i28 = 0; i28 < childCount; i28++) {
                com.tencent.mm.ui.mogic.WxViewPager.LayoutParams layoutParams = (com.tencent.mm.ui.mogic.WxViewPager.LayoutParams) getChildAt(i28).getLayoutParams();
                if (!layoutParams.f209243a) {
                    layoutParams.f209245c = 0.0f;
                }
            }
            setCurrentItemInternal(i17, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        ii5.g infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f291658b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f17) {
        return (float) java.lang.Math.sin((float) ((f17 - 0.5f) * 0.4712389167638204d));
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        int overScrollMode = getOverScrollMode();
        boolean z17 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.mAdapter) != null && aVar.getCount() > 1)) {
            if (!this.mLeftEdge.b()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.f11102a.setSize(height, width);
                z17 = false | this.mLeftEdge.f11102a.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.b()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.f11102a.setSize(height2, width2);
                z17 |= this.mRightEdge.f11102a.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.mLeftEdge.f11102a.finish();
            this.mRightEdge.f11102a.finish();
        }
        if (z17) {
            n3.u0.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public void endFakeDrag() {
        if (!this.mFakeDragging) {
            throw new java.lang.IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
        int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
        this.mPopulatePending = true;
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        ii5.g g17 = g();
        if (g17 != null) {
            setCurrentItemInternal(b(g17.f291658b, ((scrollX / clientWidth) - g17.f291661e) / g17.f291660d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        c();
        this.mFakeDragging = false;
    }

    public boolean executeKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return arrowScroll(17);
            }
            if (keyCode == 22) {
                return arrowScroll(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return arrowScroll(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return arrowScroll(1);
                }
            }
        }
        return false;
    }

    public final android.graphics.Rect f(android.graphics.Rect rect, android.view.View view) {
        if (rect == null) {
            rect = new android.graphics.Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        android.view.ViewParent parent = view.getParent();
        while ((parent instanceof android.view.ViewGroup) && parent != this) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public void fakeDragBy(float f17) {
        if (!this.mFakeDragging) {
            throw new java.lang.IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        this.mLastMotionX += f17;
        float scrollX = getScrollX() - f17;
        float clientWidth = getClientWidth();
        float f18 = this.mFirstOffset * clientWidth;
        float f19 = this.mLastOffset * clientWidth;
        ii5.g gVar = this.mItems.get(0);
        ii5.g gVar2 = this.mItems.get(r4.size() - 1);
        if (gVar.f291658b != 0) {
            f18 = gVar.f291661e * clientWidth;
        }
        if (gVar2.f291658b != this.mAdapter.getCount() - 1) {
            f19 = gVar2.f291661e * clientWidth;
        }
        if (scrollX < f18) {
            scrollX = f18;
        } else if (scrollX > f19) {
            scrollX = f19;
        }
        int i17 = (int) scrollX;
        this.mLastMotionX += scrollX - i17;
        scrollTo(i17, getScrollY());
        j(i17);
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(this.mFakeDragBeginTime, android.os.SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
    }

    public int firstItemPosForDetermine() {
        return this.mItems.get(0).f291658b;
    }

    public final ii5.g g() {
        int i17;
        int clientWidth = getClientWidth();
        float f17 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f18 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        int i18 = 0;
        boolean z17 = true;
        ii5.g gVar = null;
        int i19 = -1;
        float f19 = 0.0f;
        while (i18 < this.mItems.size()) {
            ii5.g gVar2 = this.mItems.get(i18);
            if (!z17 && gVar2.f291658b != (i17 = i19 + 1)) {
                gVar2 = this.mTempItem;
                gVar2.f291661e = f17 + f19 + f18;
                gVar2.f291658b = i17;
                gVar2.f291660d = this.mAdapter.getPageWidth(i17);
                i18--;
            }
            ii5.g gVar3 = gVar2;
            f17 = gVar3.f291661e;
            float f27 = gVar3.f291660d + f17 + f18;
            if (!z17 && scrollX < f17) {
                return gVar;
            }
            if (scrollX < f27 || i18 == this.mItems.size() - 1) {
                return gVar3;
            }
            int i27 = gVar3.f291658b;
            float f28 = gVar3.f291660d;
            i18++;
            z17 = false;
            i19 = i27;
            f19 = f28;
            gVar = gVar3;
        }
        return gVar;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.tencent.mm.ui.mogic.WxViewPager.LayoutParams();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i17, int i18) {
        if (this.mDrawingOrder == 2) {
            i18 = (i17 - 1) - i18;
        }
        return ((com.tencent.mm.ui.mogic.WxViewPager.LayoutParams) this.mDrawingOrderedChildren.get(i18).getLayoutParams()).f209248f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public final void h(int i17) {
        java.util.Iterator<androidx.viewpager.widget.ViewPager.OnPageChangeListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPageSelected(i17);
        }
    }

    public final void i(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i17 = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i17);
            this.mActivePointerId = motionEvent.getPointerId(i17);
            android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public ii5.g infoForAnyChild(android.view.View view) {
        while (true) {
            java.lang.Object parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof android.view.View)) {
                return null;
            }
            view = (android.view.View) parent;
        }
    }

    public ii5.g infoForChild(android.view.View view) {
        for (int i17 = 0; i17 < this.mItems.size(); i17++) {
            ii5.g gVar = this.mItems.get(i17);
            if (this.mAdapter.isViewFromObject(view, gVar.f291657a)) {
                return gVar;
            }
        }
        return null;
    }

    public ii5.g infoForPosition(int i17) {
        for (int i18 = 0; i18 < this.mItems.size(); i18++) {
            ii5.g gVar = this.mItems.get(i18);
            if (gVar.f291658b == i17) {
                return gVar;
            }
        }
        return null;
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        android.content.Context context = getContext();
        this.mScroller = new android.widget.Scroller(context, sInterpolator);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        float f17 = context.getResources().getDisplayMetrics().density;
        java.lang.reflect.Method method = n3.o1.f334378a;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f17);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new androidx.core.widget.i(context);
        this.mRightEdge = new androidx.core.widget.i(context);
        this.mFlingDistance = (int) (25.0f * f17);
        this.mCloseEnough = (int) (2.0f * f17);
        this.mDefaultGutterSize = (int) (f17 * 16.0f);
        n3.l1.l(this, new ii5.h(this));
        if (n3.u0.c(this) == 0) {
            n3.u0.s(this, 1);
        }
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    public boolean isGutterDrag(float f17, float f18) {
        return (f17 < ((float) this.mGutterSize) && f18 > 0.0f) || (f17 > ((float) (getWidth() - this.mGutterSize)) && f18 < 0.0f);
    }

    public final boolean j(int i17) {
        if (this.mItems.size() == 0) {
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ii5.g g17 = g();
        if (g17 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int i18 = this.mPageMargin;
        int i19 = clientWidth + i18;
        float f17 = clientWidth;
        int i27 = g17.f291658b;
        float f18 = ((i17 / f17) - g17.f291661e) / (g17.f291660d + (i18 / f17));
        this.mCalledSuper = false;
        onPageScrolled(i27, f18, (int) (i19 * f18));
        if (this.mCalledSuper) {
            return true;
        }
        throw new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean k(float f17) {
        boolean z17;
        boolean z18;
        float f18 = this.mLastMotionX - f17;
        this.mLastMotionX = f17;
        float scrollX = getScrollX() + f18;
        float clientWidth = getClientWidth();
        float f19 = this.mFirstOffset * clientWidth;
        float f27 = this.mLastOffset * clientWidth;
        boolean z19 = false;
        ii5.g gVar = this.mItems.get(0);
        java.util.ArrayList<ii5.g> arrayList = this.mItems;
        ii5.g gVar2 = arrayList.get(arrayList.size() - 1);
        if (gVar.f291658b != 0) {
            f19 = gVar.f291661e * clientWidth;
            z17 = false;
        } else {
            z17 = true;
        }
        if (gVar2.f291658b != this.mAdapter.getCount() - 1) {
            f27 = gVar2.f291661e * clientWidth;
            z18 = false;
        } else {
            z18 = true;
        }
        if (scrollX < f19) {
            if (z17) {
                this.mLeftEdge.c(java.lang.Math.abs(f19 - scrollX) / clientWidth);
                z19 = true;
            }
            scrollX = f19;
        } else if (scrollX > f27) {
            if (z18) {
                this.mRightEdge.c(java.lang.Math.abs(scrollX - f27) / clientWidth);
                z19 = true;
            }
            scrollX = f27;
        }
        int i17 = (int) scrollX;
        this.mLastMotionX += scrollX - i17;
        scrollTo(i17, getScrollY());
        j(i17);
        return z19;
    }

    public final void l(int i17, int i18, int i19, int i27) {
        if (i18 <= 0 || this.mItems.isEmpty()) {
            ii5.g infoForPosition = infoForPosition(this.mCurItem);
            int min = (int) ((infoForPosition != null ? java.lang.Math.min(infoForPosition.f291661e, this.mLastOffset) : 0.0f) * ((i17 - getPaddingLeft()) - getPaddingRight()));
            if (min != getScrollX()) {
                a(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        int scrollX = (int) ((getScrollX() / (((i18 - getPaddingLeft()) - getPaddingRight()) + i27)) * (((i17 - getPaddingLeft()) - getPaddingRight()) + i19));
        scrollTo(scrollX, getScrollY());
        if (this.mScroller.isFinished()) {
            return;
        }
        int duration = this.mScroller.getDuration() - this.mScroller.timePassed();
        ii5.g infoForPosition2 = infoForPosition(this.mCurItem);
        if (infoForPosition2 != null) {
            this.mScroller.startScroll(scrollX, 0, (int) (infoForPosition2.f291661e * i17), 0, duration);
        }
    }

    public int lastItemPosForDetermine() {
        return this.mItems.get(r0.size() - 1).f291658b;
    }

    public final void n(int i17, boolean z17, int i18, boolean z18) {
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener;
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener2;
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener3;
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener4;
        ii5.g infoForPosition = infoForPosition(i17);
        int clientWidth = infoForPosition != null ? (int) (getClientWidth() * java.lang.Math.max(this.mFirstOffset, java.lang.Math.min(infoForPosition.f291661e, this.mLastOffset))) : 0;
        if (z17) {
            smoothScrollTo(clientWidth, 0, i18);
            if (z18 && (onPageChangeListener4 = this.mOnPageChangeListener) != null) {
                onPageChangeListener4.onPageSelected(i17);
            }
            if (z18 && (onPageChangeListener3 = this.mInternalPageChangeListener) != null) {
                onPageChangeListener3.onPageSelected(i17);
            }
            if (z18) {
                h(i17);
                return;
            }
            return;
        }
        if (z18 && (onPageChangeListener2 = this.mOnPageChangeListener) != null) {
            onPageChangeListener2.onPageSelected(i17);
        }
        if (z18 && (onPageChangeListener = this.mInternalPageChangeListener) != null) {
            onPageChangeListener.onPageSelected(i17);
        }
        if (z18) {
            h(i17);
        }
        a(false);
        scrollTo(clientWidth, 0);
        j(clientWidth);
    }

    public final void o() {
        if (this.mDrawingOrder != 0) {
            java.util.ArrayList<android.view.View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new java.util.ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                this.mDrawingOrderedChildren.add(getChildAt(i17));
            }
            java.util.Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        float f17;
        float f18;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f19 = this.mPageMargin / width;
        int i18 = 0;
        ii5.g gVar = this.mItems.get(0);
        float f27 = gVar.f291661e;
        int size = this.mItems.size();
        int i19 = gVar.f291658b;
        int i27 = this.mItems.get(size - 1).f291658b;
        while (i19 < i27) {
            while (true) {
                i17 = gVar.f291658b;
                if (i19 <= i17 || i18 >= size) {
                    break;
                }
                i18++;
                gVar = this.mItems.get(i18);
            }
            if (i19 == i17) {
                float f28 = gVar.f291661e;
                float f29 = gVar.f291660d;
                f17 = (f28 + f29) * width;
                f27 = f28 + f29 + f19;
            } else {
                float pageWidth = this.mAdapter.getPageWidth(i19);
                f17 = (f27 + pageWidth) * width;
                f27 += pageWidth + f19;
            }
            if (this.mPageMargin + f17 > scrollX) {
                f18 = f19;
                this.mMarginDrawable.setBounds(((int) f17) - 1, this.mTopPageBounds, ((int) ((r11 + f17) + 0.5f)) - 1, this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            } else {
                f18 = f19;
            }
            if (f17 > scrollX + r2) {
                return;
            }
            i19++;
            f19 = f18;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.mIsBeingDragged = false;
            this.mIsUnableToDrag = false;
            this.mIgnoreGutter = false;
            this.mActivePointerId = -1;
            android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.mVelocityTracker = null;
            }
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x17 = motionEvent.getX();
            this.mInitialMotionX = x17;
            this.mLastMotionX = x17;
            float y17 = motionEvent.getY();
            this.mInitialMotionY = y17;
            this.mLastMotionY = y17;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || java.lang.Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                a(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                setScrollState(1);
            }
        } else if (action == 2) {
            int i17 = this.mActivePointerId;
            if (i17 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i17);
                float x18 = motionEvent.getX(findPointerIndex);
                float f17 = x18 - this.mLastMotionX;
                float abs = java.lang.Math.abs(f17);
                float y18 = motionEvent.getY(findPointerIndex);
                float abs2 = java.lang.Math.abs(y18 - this.mInitialMotionY);
                if (f17 != 0.0f && !isGutterDrag(this.mLastMotionX, f17) && !this.mIgnoreGutter && canScroll(this, false, (int) f17, (int) x18, (int) y18)) {
                    this.mLastMotionX = x18;
                    this.mLastMotionY = y18;
                    this.mIsUnableToDrag = true;
                    return false;
                }
                int i18 = this.mTouchSlop;
                if (abs > i18 && abs * 0.5f > abs2) {
                    this.mIsBeingDragged = true;
                    setScrollState(1);
                    this.mLastMotionX = f17 > 0.0f ? this.mInitialMotionX + this.mTouchSlop : this.mInitialMotionX - this.mTouchSlop;
                    this.mLastMotionY = y18;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i18) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && k(x18)) {
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    n3.u0.k(this);
                }
            }
        } else if (action == 6) {
            i(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.mogic.WxViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.ui.mogic.WxViewPager.LayoutParams layoutParams;
        com.tencent.mm.ui.mogic.WxViewPager.LayoutParams layoutParams2;
        int i19;
        setMeasuredDimension(android.view.View.getDefaultSize(0, i17), android.view.View.getDefaultSize(0, i18));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = java.lang.Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i27 = 0;
        while (true) {
            boolean z17 = true;
            int i28 = 1073741824;
            if (i27 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i27);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (com.tencent.mm.ui.mogic.WxViewPager.LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f209243a) {
                int i29 = layoutParams2.f209244b;
                int i37 = i29 & 7;
                int i38 = i29 & 112;
                boolean z18 = i38 == 48 || i38 == 80;
                if (i37 != 3 && i37 != 5) {
                    z17 = false;
                }
                int i39 = Integer.MIN_VALUE;
                if (z18) {
                    i19 = Integer.MIN_VALUE;
                    i39 = 1073741824;
                } else {
                    i19 = z17 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i47 = ((android.view.ViewGroup.LayoutParams) layoutParams2).width;
                if (i47 != -2) {
                    if (i47 == -1) {
                        i47 = paddingLeft;
                    }
                    i39 = 1073741824;
                } else {
                    i47 = paddingLeft;
                }
                int i48 = ((android.view.ViewGroup.LayoutParams) layoutParams2).height;
                if (i48 == -2) {
                    i48 = measuredHeight;
                    i28 = i19;
                } else if (i48 == -1) {
                    i48 = measuredHeight;
                }
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i47, i39), android.view.View.MeasureSpec.makeMeasureSpec(i48, i28));
                if (z18) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z17) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i27++;
        }
        this.mChildWidthMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i49 = 0; i49 < childCount2; i49++) {
            android.view.View childAt2 = getChildAt(i49);
            if (childAt2.getVisibility() != 8 && (((layoutParams = (com.tencent.mm.ui.mogic.WxViewPager.LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f209243a) && layoutParams != null)) {
                childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f209245c), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.mDecorChildCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.tencent.mm.ui.mogic.WxViewPager$LayoutParams r9 = (com.tencent.mm.ui.mogic.WxViewPager.LayoutParams) r9
            boolean r10 = r9.f209243a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f209244b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r12.mOnPageChangeListener
            if (r0 == 0) goto L72
            r0.onPageScrolled(r13, r14, r15)
        L72:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r12.mInternalPageChangeListener
            if (r0 == 0) goto L79
            r0.onPageScrolled(r13, r14, r15)
        L79:
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r12.listeners
            java.util.Iterator r0 = r0.iterator()
        L7f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r0.next()
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r3 = (androidx.viewpager.widget.ViewPager.OnPageChangeListener) r3
            r3.onPageScrolled(r13, r14, r15)
            goto L7f
        L8f:
            androidx.viewpager.widget.m r13 = r12.mPageTransformer
            if (r13 == 0) goto Lc2
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L9b:
            if (r1 >= r14) goto Lc2
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.tencent.mm.ui.mogic.WxViewPager$LayoutParams r0 = (com.tencent.mm.ui.mogic.WxViewPager.LayoutParams) r0
            boolean r0 = r0.f209243a
            if (r0 == 0) goto Lac
            goto Lbf
        Lac:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.m r3 = r12.mPageTransformer
            hb4.a r3 = (hb4.a) r3
            r3.a(r15, r0)
        Lbf:
            int r1 = r1 + 1
            goto L9b
        Lc2:
            r12.mCalledSuper = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.mogic.WxViewPager.onPageScrolled(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i17, android.graphics.Rect rect) {
        int i18;
        int i19;
        int i27;
        ii5.g infoForChild;
        int childCount = getChildCount();
        if ((i17 & 2) != 0) {
            i19 = childCount;
            i18 = 0;
            i27 = 1;
        } else {
            i18 = childCount - 1;
            i19 = -1;
            i27 = -1;
        }
        while (i18 != i19) {
            android.view.View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f291658b == this.mCurItem && childAt.requestFocus(i17, rect)) {
                return true;
            }
            i18 += i27;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.tencent.mm.ui.mogic.WxViewPager.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.tencent.mm.ui.mogic.WxViewPager.SavedState savedState = (com.tencent.mm.ui.mogic.WxViewPager.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        androidx.viewpager.widget.a aVar = this.mAdapter;
        java.lang.ClassLoader classLoader = savedState.f209251f;
        if (aVar != null) {
            aVar.restoreState(savedState.f209250e, classLoader);
            setCurrentItemInternal(savedState.f209249d, false, true);
        } else {
            this.mRestoredCurItem = savedState.f209249d;
            this.mRestoredAdapterState = savedState.f209250e;
            this.mRestoredClassLoader = classLoader;
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.tencent.mm.ui.mogic.WxViewPager.SavedState savedState = new com.tencent.mm.ui.mogic.WxViewPager.SavedState(super.onSaveInstanceState());
        savedState.f209249d = this.mCurItem;
        androidx.viewpager.widget.a aVar = this.mAdapter;
        if (aVar != null) {
            savedState.f209250e = aVar.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (i17 != i19) {
            int i28 = this.mPageMargin;
            l(i17, i19, i28, i28);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        androidx.viewpager.widget.a aVar;
        int i17;
        int i18;
        if (this.mFakeDragging) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.mAdapter) == null || aVar.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            this.mIsBeingDragged = true;
            setScrollState(1);
            float x17 = motionEvent.getX();
            this.mInitialMotionX = x17;
            this.mLastMotionX = x17;
            float y17 = motionEvent.getY();
            this.mInitialMotionY = y17;
            this.mLastMotionY = y17;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    float x18 = motionEvent.getX(findPointerIndex);
                    float abs = java.lang.Math.abs(x18 - this.mLastMotionX);
                    float y18 = motionEvent.getY(findPointerIndex);
                    float abs2 = java.lang.Math.abs(y18 - this.mLastMotionY);
                    int i19 = this.mTouchSlop;
                    if (abs > i19 && abs > abs2) {
                        this.mIsBeingDragged = true;
                        float f17 = this.mInitialMotionX;
                        this.mLastMotionX = x18 - f17 > 0.0f ? f17 + i19 : f17 - i19;
                        this.mLastMotionY = y18;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                    }
                }
                if (this.mIsBeingDragged) {
                    r2 = 0 | (k(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId))) ? 1 : 0);
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.mLastMotionX = motionEvent.getX(actionIndex);
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    i(motionEvent);
                    this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                n(this.mCurItem, true, 0, false);
                this.mActivePointerId = -1;
                c();
                boolean e17 = this.mLeftEdge.e();
                i18 = this.mRightEdge.e();
                i17 = e17;
                r2 = i17 | i18;
            }
        } else if (this.mIsBeingDragged) {
            android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ii5.g g17 = g();
            if (g17 != null) {
                int i27 = g17.f291658b;
                float f18 = ((scrollX / clientWidth) - g17.f291661e) / g17.f291660d;
                int findPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
                setCurrentItemInternal(b(i27, f18, xVelocity, (int) (motionEvent.getX(findPointerIndex2 >= 0 ? findPointerIndex2 : 0) - this.mInitialMotionX)), true, true, xVelocity);
            }
            this.mActivePointerId = -1;
            c();
            boolean e18 = this.mLeftEdge.e();
            i18 = this.mRightEdge.e();
            i17 = e18;
            r2 = i17 | i18;
        }
        if (r2 != 0) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
        return true;
    }

    public boolean pageLeft() {
        int i17 = this.mCurItem;
        if (i17 <= 0) {
            return false;
        }
        setCurrentItem(i17 - 1, true);
        return true;
    }

    public boolean pageRight() {
        androidx.viewpager.widget.a aVar = this.mAdapter;
        if (aVar == null || this.mCurItem >= aVar.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public void populate() {
        populate(this.mCurItem);
    }

    public void removeOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener) {
        this.listeners.remove(onPageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.mAdapter;
        if (aVar2 != null) {
            aVar2.unregisterDataSetObserver(this.mObserver);
            this.mAdapter.startUpdate((android.view.ViewGroup) this);
            for (int i17 = 0; i17 < this.mItems.size(); i17++) {
                ii5.g gVar = this.mItems.get(i17);
                this.mAdapter.destroyItem((android.view.ViewGroup) this, gVar.f291658b, gVar.f291657a);
            }
            this.mAdapter.finishUpdate((android.view.ViewGroup) this);
            this.mItems.clear();
            int i18 = 0;
            while (i18 < getChildCount()) {
                if (!((com.tencent.mm.ui.mogic.WxViewPager.LayoutParams) getChildAt(i18).getLayoutParams()).f209243a) {
                    removeViewAt(i18);
                    i18--;
                }
                i18++;
            }
            scrollTo(0, 0);
        }
        this.mAdapter = aVar;
        this.mExpectedAdapterCount = 0;
        if (aVar != null) {
            if (this.mObserver == null) {
                this.mObserver = new ii5.j(this, null);
            }
            this.mAdapter.registerDataSetObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z17 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem < 0) {
                if (z17) {
                    requestLayout();
                    return;
                } else {
                    populate();
                    return;
                }
            }
            this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
            setCurrentItemInternal(this.mRestoredCurItem, false, true);
            this.mRestoredCurItem = -1;
            this.mRestoredAdapterState = null;
            this.mRestoredClassLoader = null;
        }
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean z17) {
        if (this.mSetChildrenDrawingOrderEnabled == null) {
            try {
                this.mSetChildrenDrawingOrderEnabled = android.view.ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        try {
            java.lang.reflect.Method method = this.mSetChildrenDrawingOrderEnabled;
            if (method != null) {
                method.invoke(this, java.lang.Boolean.valueOf(z17));
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    public void setCurrentItem(int i17) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i17, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i17, boolean z17, boolean z18) {
        setCurrentItemInternal(i17, z17, z18, 0);
    }

    public void setCurrentItemNotify(int i17, boolean z17) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i17, z17, false, 0, true);
    }

    public androidx.viewpager.widget.ViewPager.OnPageChangeListener setInternalPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener) {
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    public void setLastMotion(float f17, float f18) {
        this.mLastMotionX = f17;
        this.mLastMotionY = f18;
    }

    public void setOffscreenPageLimit(int i17) {
        if (i17 < 1) {
            i17 = 1;
        }
        if (i17 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i17;
            populate();
        }
    }

    public void setOnAdapterChangeListener(ii5.i iVar) {
    }

    public void setOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void setPageMargin(int i17) {
        int i18 = this.mPageMargin;
        this.mPageMargin = i17;
        int width = getWidth();
        l(width, width, i17, i18);
        requestLayout();
    }

    public void setPageMarginDrawable(android.graphics.drawable.Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z17, androidx.viewpager.widget.m mVar) {
        boolean z18 = mVar != null;
        boolean z19 = z18 != (this.mPageTransformer != null);
        this.mPageTransformer = mVar;
        setChildrenDrawingOrderEnabledCompat(z18);
        if (z18) {
            this.mDrawingOrder = z17 ? 2 : 1;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z19) {
            populate();
        }
    }

    public void setScroller(android.widget.Scroller scroller) {
        this.mScroller = scroller;
    }

    public void setUnableDrag(boolean z17, boolean z18) {
        this.mIsUnableToDrag = z17;
        this.mIgnoreGutter = z18;
    }

    public void smoothScrollTo(int i17, int i18) {
        smoothScrollTo(i17, i18, 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f209243a;

        /* renamed from: b, reason: collision with root package name */
        public final int f209244b;

        /* renamed from: c, reason: collision with root package name */
        public float f209245c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f209246d;

        /* renamed from: e, reason: collision with root package name */
        public int f209247e;

        /* renamed from: f, reason: collision with root package name */
        public int f209248f;

        public LayoutParams() {
            super(-1, -1);
            this.f209245c = 0.0f;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f209245c = 0.0f;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.ui.mogic.WxViewPager.LAYOUT_ATTRS);
            this.f209244b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.tencent.mm.ui.mogic.WxViewPager.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r10 == r11) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void populate(int r18) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.mogic.WxViewPager.populate(int):void");
    }

    public void setCurrentItemInternal(int i17, boolean z17, boolean z18, int i18) {
        setCurrentItemInternal(i17, z17, z18, i18, false);
    }

    public void smoothScrollTo(int i17, int i18, int i19) {
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i27 = i17 - scrollX;
        int i28 = i18 - scrollY;
        if (i27 == 0 && i28 == 0) {
            a(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i29 = clientWidth / 2;
        float f17 = clientWidth;
        float f18 = i29;
        float distanceInfluenceForSnapDuration = f18 + (distanceInfluenceForSnapDuration(java.lang.Math.min(1.0f, (java.lang.Math.abs(i27) * 1.0f) / f17)) * f18);
        int abs2 = java.lang.Math.abs(i19);
        if (abs2 > 0) {
            abs = java.lang.Math.round(java.lang.Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((java.lang.Math.abs(i27) / ((f17 * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 3.0f) * 100.0f);
        }
        this.mScroller.startScroll(scrollX, scrollY, i27, i28, java.lang.Math.min(abs, 600));
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.k(this);
    }

    public void setCurrentItem(int i17, boolean z17) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i17, z17, false);
    }

    public void setCurrentItemInternal(int i17, boolean z17, boolean z18, int i18, boolean z19) {
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener;
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener2;
        androidx.viewpager.widget.a aVar = this.mAdapter;
        if (aVar != null && aVar.getCount() > 0) {
            if (!z18 && this.mCurItem == i17 && this.mItems.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i17 < 0) {
                i17 = 0;
            } else if (i17 >= this.mAdapter.getCount()) {
                i17 = this.mAdapter.getCount() - 1;
            }
            int i19 = this.mOffscreenPageLimit;
            int i27 = this.mCurItem;
            if (i17 > i27 + i19 || i17 < i27 - i19) {
                for (int i28 = 0; i28 < this.mItems.size(); i28++) {
                    this.mItems.get(i28).f291659c = true;
                }
            }
            boolean z27 = this.mCurItem != i17;
            if (this.mFirstLayout) {
                this.mCurItem = i17;
                if ((z19 || z27) && (onPageChangeListener = this.mOnPageChangeListener) != null) {
                    onPageChangeListener.onPageSelected(i17);
                }
                if ((z19 || z27) && (onPageChangeListener2 = this.mInternalPageChangeListener) != null) {
                    onPageChangeListener2.onPageSelected(i17);
                }
                if (z19 || z27) {
                    h(i17);
                }
                requestLayout();
                return;
            }
            populate(i17);
            n(i17, z17, i18, z27);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public void setCurrentItem(int i17, boolean z17, boolean z18) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i17, z17, z18);
    }

    public void setPageMarginDrawable(int i17) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i17));
    }

    public WxViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new java.util.ArrayList<>();
        this.mTempItem = new ii5.g();
        this.mTempRect = new android.graphics.Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.enableChildScroll = true;
        this.mEndScrollRunnable = new ii5.f(this);
        this.mScrollState = 0;
        this.listeners = new java.util.ArrayList();
        initViewPager();
    }
}
