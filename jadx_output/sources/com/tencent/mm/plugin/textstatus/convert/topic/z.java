package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class z extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.a0 f173400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f173401e;

    public z(com.tencent.mm.plugin.textstatus.convert.topic.a0 a0Var, int i17) {
        this.f173400d = a0Var;
        this.f173401e = i17;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.textstatus.convert.topic.y yVar;
        boolean z17;
        com.tencent.mm.plugin.textstatus.convert.topic.v vVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(e17);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        int x17 = (int) e17.getX();
        int y17 = (int) e17.getY();
        com.tencent.mm.plugin.textstatus.convert.topic.a0 a0Var = this.f173400d;
        androidx.recyclerview.widget.RecyclerView recyclerView = a0Var.f173254d;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        boolean z18 = false;
        if ((layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) && ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w() >= this.f173401e) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = a0Var.f173254d;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("mRecyclerView");
                throw null;
            }
            int itemDecorationCount = recyclerView2.getItemDecorationCount();
            int i17 = 0;
            while (true) {
                if (i17 >= itemDecorationCount) {
                    yVar = null;
                    break;
                }
                androidx.recyclerview.widget.p2 B0 = recyclerView2.B0(i17);
                kotlin.jvm.internal.o.f(B0, "getItemDecorationAt(...)");
                if (B0 instanceof com.tencent.mm.plugin.textstatus.convert.topic.y) {
                    yVar = (com.tencent.mm.plugin.textstatus.convert.topic.y) B0;
                    break;
                }
                i17++;
            }
            if (yVar != null) {
                androidx.recyclerview.widget.RecyclerView recyclerView3 = a0Var.f173254d;
                if (recyclerView3 == null) {
                    kotlin.jvm.internal.o.o("mRecyclerView");
                    throw null;
                }
                a0Var.getClass();
                if (yVar.f173390f != null) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    android.view.View view = yVar.f173390f;
                    kotlin.jvm.internal.o.d(view);
                    view.getGlobalVisibleRect(rect);
                    android.view.View view2 = yVar.f173390f;
                    kotlin.jvm.internal.o.d(view2);
                    android.widget.ImageView imageView = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.r7d);
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    imageView.getGlobalVisibleRect(rect2);
                    int i18 = rect.left;
                    int i19 = rect.top;
                    int i27 = rect.right;
                    int i28 = rect.bottom;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SquareTitleItemDecoration", "[handleItemDecorationClick] left = " + i18 + ", top = " + i19 + ", right = " + i27 + ", bottom = " + i28 + ", ivLeft = " + rect2.left + ", ivTop = " + rect2.top + ", ivRight = " + rect2.right + ", ivBottom = " + rect2.bottom + " x = " + x17 + ", y = " + y17);
                    if (x17 >= i18 && y17 >= i19 && y17 <= i28 && x17 <= i27) {
                        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView3.getLayoutManager();
                        if (layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                            int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).w();
                            android.content.Context context = recyclerView3.getContext();
                            kotlin.jvm.internal.o.f(context, "getContext(...)");
                            pf5.z zVar = pf5.z.f353948a;
                            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.ac.class);
                            kotlin.jvm.internal.o.f(a17, "get(...)");
                            java.util.ArrayList arrayList3 = ((com.tencent.mm.plugin.textstatus.ui.ac) a17).f173727e;
                            int i29 = w17 - yVar.f173388d;
                            if (arrayList3.size() != 0) {
                                java.lang.Object obj = arrayList3.get(i29);
                                kotlin.jvm.internal.o.f(obj, "get(...)");
                                if ((obj instanceof nj4.e) && (vVar = yVar.f173391g) != null) {
                                    nj4.e eVar = (nj4.e) obj;
                                    com.tencent.mm.plugin.textstatus.ui.ce ceVar = com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.f173656z;
                                    com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity = ((com.tencent.mm.plugin.textstatus.ui.de) vVar).f173812a;
                                    androidx.recyclerview.widget.f2 adapter = textStatusOtherTopicFriendsActivity.W6().getAdapter();
                                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
                                    in5.r w07 = wxRecyclerAdapter != null ? wxRecyclerAdapter.w0(0) : null;
                                    com.tencent.mm.plugin.textstatus.convert.topic.a aVar = w07 instanceof com.tencent.mm.plugin.textstatus.convert.topic.a ? (com.tencent.mm.plugin.textstatus.convert.topic.a) w07 : null;
                                    if (aVar != null) {
                                        androidx.appcompat.app.AppCompatActivity context2 = textStatusOtherTopicFriendsActivity.getContext();
                                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                        aVar.n(context2, eVar);
                                    }
                                    com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = textStatusOtherTopicFriendsActivity.f173670t;
                                    ai4.e eVar2 = eVar.f337936d;
                                    if (mvvmList != null && (arrayList = mvvmList.f152065o) != null) {
                                        java.util.Iterator it = arrayList.iterator();
                                        int i37 = 0;
                                        while (it.hasNext()) {
                                            java.lang.Object next = it.next();
                                            int i38 = i37 + 1;
                                            if (i37 < 0) {
                                                kz5.c0.p();
                                                throw null;
                                            }
                                            nj4.i iVar = (nj4.i) next;
                                            if ((iVar instanceof nj4.e) && kotlin.jvm.internal.o.b(eVar2.f5134a, ((nj4.e) iVar).f337936d.f5134a)) {
                                                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager3 = textStatusOtherTopicFriendsActivity.W6().getLayoutManager();
                                                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager3 instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager3 : null;
                                                if (linearLayoutManager != null) {
                                                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                                    arrayList4.add(0);
                                                    arrayList4.add(java.lang.Integer.valueOf(i37));
                                                    java.util.Collections.reverse(arrayList4);
                                                    yj0.a.d(linearLayoutManager, arrayList4.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$addStatusTitle$1", "onClick", "(Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendsItem;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                                                    linearLayoutManager.P(((java.lang.Integer) arrayList4.get(0)).intValue(), ((java.lang.Integer) arrayList4.get(1)).intValue());
                                                    yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$addStatusTitle$1", "onClick", "(Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendsItem;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                                                }
                                            }
                                            i37 = i38;
                                        }
                                    }
                                    mj4.h hVar = (mj4.h) eVar2.f5135b.get(0);
                                    qj4.s sVar = qj4.s.f363958a;
                                    mj4.k kVar = (mj4.k) hVar;
                                    java.lang.String h17 = kVar.h();
                                    java.lang.String o17 = kVar.o();
                                    int size = eVar2.f5135b.size();
                                    z17 = true;
                                    qj4.s.n(sVar, 6L, h17, size, o17, null, null, 0, 0L, 0L, xe0.j0.a(kVar, false, 1, null).f355218i, java.lang.Integer.valueOf(xe0.j0.a(kVar, false, 1, null).f355225s), null, null, null, 14832, null);
                                    z18 = z17;
                                }
                            }
                        }
                        z17 = true;
                        z18 = z17;
                    }
                }
                yj0.a.i(z18, this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return z18;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
