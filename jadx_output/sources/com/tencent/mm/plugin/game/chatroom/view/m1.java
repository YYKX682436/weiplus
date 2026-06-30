package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes7.dex */
public class m1 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f139220d;

    /* renamed from: e, reason: collision with root package name */
    public int f139221e;

    /* renamed from: f, reason: collision with root package name */
    public int f139222f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.g3 f139223g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.g3 f139224h;

    /* renamed from: m, reason: collision with root package name */
    public int f139226m;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f139230q;

    /* renamed from: s, reason: collision with root package name */
    public final int f139232s;

    /* renamed from: i, reason: collision with root package name */
    public int f139225i = 0;

    /* renamed from: n, reason: collision with root package name */
    public final float f139227n = android.view.ViewConfiguration.get(com.tencent.mm.sdk.platformtools.x2.f193071a).getScaledTouchSlop();

    /* renamed from: o, reason: collision with root package name */
    public int f139228o = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f139229p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f139231r = false;

    /* renamed from: t, reason: collision with root package name */
    public int f139233t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f139234u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f139235v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f139236w = false;

    public m1(int i17) {
        this.f139232s = i17;
    }

    public final int a(int i17) {
        int i18 = this.f139225i;
        float width = this.f139220d.getWidth();
        int i19 = this.f139225i;
        int i27 = i17 - this.f139222f;
        float f17 = i27;
        float f18 = width / 2.0f;
        int i28 = this.f139232s;
        if (f17 >= f18) {
            i18 = b(this.f139230q.y());
        } else {
            if (i27 >= 0 && f17 < this.f139227n) {
                com.tencent.mars.xlog.Log.i("GameChatRoom.CommonLineViewPagerHelper", "[getOffsetToPosition] targetPage: %s targetPos: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i18 == 0 ? 0 : (this.f139226m * i18) + i28));
                if (i18 == 0) {
                    return 0;
                }
                return (i18 * this.f139226m) + i28;
            }
            if (f17 <= (-width) / 2.0f) {
                i18 = b(this.f139230q.w());
            }
        }
        int itemCount = this.f139220d.getAdapter().getItemCount();
        int i29 = this.f139226m;
        int i37 = itemCount / i29;
        if (itemCount % i29 != 0) {
            i37++;
        }
        int max = java.lang.Math.max(java.lang.Math.min(i18, i37 - 1), -1);
        if (max - i19 > 1) {
            max = i19 + 1;
        } else if (i19 - max > 1) {
            max = i19 - 1;
        }
        com.tencent.mars.xlog.Log.i("GameChatRoom.CommonLineViewPagerHelper", "[getOffsetToPosition] lastPage: %d, targetPage: %d targetPos: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max == 0 ? 0 : (this.f139226m * max) + 1));
        if (max == 0) {
            return 0;
        }
        return (max * this.f139226m) + i28;
    }

    public int b(int i17) {
        if (this.f139232s == 0) {
            return i17 / this.f139226m;
        }
        int i18 = this.f139226m;
        int i19 = i17 / i18;
        return (i17 % i18 != 0 || i17 == 0) ? i19 : i19 - 1;
    }

    public final void c() {
        if (this.f139229p) {
            com.tencent.mars.xlog.Log.i("GameChatRoom.CommonLineViewPagerHelper", "onScrollAnimationEnd");
            this.f139229p = false;
            this.f139231r = false;
            this.f139228o = -1;
        }
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/CommonLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        com.tencent.mars.xlog.Log.i("GameChatRoom.CommonLineViewPagerHelper", "onScrollStateChanged newState: %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0 && this.f139233t != 2) {
            int a17 = a(this.f139221e);
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f139220d;
            if (recyclerView2 != null && this.f139235v) {
                this.f139223g.f12049a = a17;
                this.f139236w = true;
                recyclerView2.getLayoutManager().startSmoothScroll(this.f139223g);
            }
            this.f139234u = true;
        } else if (!this.f139234u && i17 == 2) {
            this.f139234u = true;
        } else if (i17 == 0) {
            this.f139222f = this.f139221e;
            this.f139234u = false;
            int w17 = this.f139230q.w();
            com.tencent.mars.xlog.Log.i("GameChatRoom.CommonLineViewPagerHelper", "onScrollStateChanged firstPos: %d", java.lang.Integer.valueOf(w17));
            if (w17 != -1) {
                int i18 = w17 / this.f139226m;
                this.f139225i = i18;
                com.tencent.mars.xlog.Log.i("GameChatRoom.CommonLineViewPagerHelper", "onScrollStateChanged mCurPage: %d, firstVisible: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(w17));
            } else {
                com.tencent.mars.xlog.Log.e("GameChatRoom.CommonLineViewPagerHelper", "onScrollStateChanged firstPos is -1, invalid, mCurPage: %d", java.lang.Integer.valueOf(this.f139225i));
            }
            this.f139235v = false;
            if (this.f139231r) {
                this.f139220d.getAdapter().notifyItemRangeChanged(this.f139220d.getAdapter().getItemCount(), 5);
                this.f139231r = false;
                int itemCount = this.f139220d.getAdapter().getItemCount();
                int i19 = this.f139226m;
                int i27 = itemCount / i19;
                if (itemCount % i19 == 0) {
                    i27++;
                }
                int i28 = i27 + 1;
                int i29 = i19 * i28;
                if (i29 <= 0) {
                    i29 = 0;
                }
                com.tencent.mars.xlog.Log.i("GameChatRoom.CommonLineViewPagerHelper", "smoothScrollToLastPage allCount: %d, lastPage: %d, targetPos: %d", java.lang.Integer.valueOf(itemCount), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                this.f139229p = true;
                int b17 = b(i29);
                this.f139228o = b17 == 0 ? 0 : (this.f139226m * b17) + 1;
                int b18 = b(this.f139230q.t());
                this.f139225i = b18;
                com.tencent.mars.xlog.Log.i("GameChatRoom.CommonLineViewPagerHelper", "fastScroll curPage: %d, pos: %d, targetPage: %d, targetPos: %d", java.lang.Integer.valueOf(b18), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(this.f139228o));
                if (b17 == this.f139225i) {
                    c();
                } else {
                    int i37 = this.f139228o;
                    androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f139220d;
                    if (recyclerView3 != null) {
                        boolean z17 = this.f139235v;
                        this.f139224h.f12049a = i37;
                        this.f139236w = true;
                        recyclerView3.getLayoutManager().startSmoothScroll(this.f139224h);
                    }
                }
            } else {
                c();
            }
            if (this.f139236w) {
                com.tencent.mars.xlog.Log.i("GameChatRoom.CommonLineViewPagerHelper", "scrollBy x: -1, y: 0");
                this.f139236w = false;
                this.f139220d.scrollBy(-1, 0);
            }
        } else if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("GameChatRoom.CommonLineViewPagerHelper", "SCROLL_STATE_DRAGGING");
            this.f139235v = true;
        }
        this.f139233t = i17;
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/CommonLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/CommonLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        this.f139221e += i17;
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/CommonLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
