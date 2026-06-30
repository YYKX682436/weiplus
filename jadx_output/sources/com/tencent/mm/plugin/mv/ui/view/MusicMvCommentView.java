package com.tencent.mm.plugin.mv.ui.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B!\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView;", "Landroid/widget/RelativeLayout;", "Lrm3/a;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setViewEventListener", "", "maxWidth", "setMaxWidth", "count", "setMaxHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/mv/ui/view/m1", "com/tencent/mm/plugin/mv/ui/view/o1", "com/tencent/mm/plugin/mv/ui/view/p1", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvCommentView extends android.widget.RelativeLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final int f151657i = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f151658d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f151659e;

    /* renamed from: f, reason: collision with root package name */
    public int f151660f;

    /* renamed from: g, reason: collision with root package name */
    public rm3.a f151661g;

    /* renamed from: h, reason: collision with root package name */
    public final bm3.b f151662h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvCommentView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f151658d = arrayList;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c4r, (android.view.ViewGroup) this, false);
        addView(inflate);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
        int i18 = com.tencent.mm.R.id.i4b;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(inflate, com.tencent.mm.R.id.i4b);
        if (wxRecyclerView != null) {
            i18 = com.tencent.mm.R.id.f486105k71;
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(inflate, com.tencent.mm.R.id.f486105k71);
            if (relativeLayout != null) {
                i18 = com.tencent.mm.R.id.f486106k72;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f486106k72);
                if (textView != null) {
                    this.f151662h = new bm3.b(frameLayout, frameLayout, wxRecyclerView, relativeLayout, textView);
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$prepareViews$1
                        @Override // in5.s
                        public in5.r getItemConvert(int type) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "getItemConvert, type:" + type);
                            return new com.tencent.mm.plugin.mv.ui.view.o1(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView.this);
                        }
                    }, arrayList, true);
                    this.f151659e = wxRecyclerAdapter;
                    wxRecyclerView.setAdapter(wxRecyclerAdapter);
                    wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
                    wxRecyclerView.N(new com.tencent.mm.plugin.mv.ui.view.t1());
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f151659e;
                    if (wxRecyclerAdapter2 != null) {
                        wxRecyclerAdapter2.f293105o = new com.tencent.mm.plugin.mv.ui.view.u1(this);
                        wxRecyclerAdapter2.f293104n = new com.tencent.mm.plugin.mv.ui.view.v1(this);
                        wxRecyclerView.i(new com.tencent.mm.plugin.mv.ui.view.w1(this));
                        relativeLayout.setOnClickListener(new com.tencent.mm.plugin.mv.ui.view.x1(this));
                        setTag(this);
                        return;
                    }
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public static final void a(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView, java.lang.Boolean bool) {
        musicMvCommentView.getClass();
        boolean b17 = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE);
        bm3.b bVar = musicMvCommentView.f151662h;
        if (b17) {
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = bVar.f22495c;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = musicMvCommentView.f151659e;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            int itemCount = wxRecyclerAdapter.getItemCount() - 1;
            if (itemCount < 0) {
                itemCount = 0;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(itemCount));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView", "commentScrollToEnd", "(Ljava/lang/Boolean;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            wxRecyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView", "commentScrollToEnd", "(Ljava/lang/Boolean;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        } else {
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = bVar.f22495c;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = musicMvCommentView.f151659e;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            int itemCount2 = wxRecyclerAdapter2.getItemCount() - 1;
            if (itemCount2 < 0) {
                itemCount2 = 0;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(itemCount2));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(wxRecyclerView2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView", "commentScrollToEnd", "(Ljava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
            wxRecyclerView2.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(wxRecyclerView2, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView", "commentScrollToEnd", "(Ljava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = musicMvCommentView.f151659e;
        if (wxRecyclerAdapter3 != null) {
            musicMvCommentView.f151660f = wxRecyclerAdapter3.getData().size();
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    public final void b() {
        this.f151662h.f22496d.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        if (r0 == (r5.getItemCount() - 1)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.ArrayList r13) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView.c(java.util.ArrayList):void");
    }

    public final void d(int i17) {
        if (i17 <= 0) {
            b();
            return;
        }
        bm3.b bVar = this.f151662h;
        bVar.f22496d.setVisibility(0);
        android.widget.TextView textView = bVar.f22497e;
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.h3w);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        textView.setText(format);
    }

    public final void setMaxHeight(int i17) {
        if (i17 >= 0) {
            android.view.ViewGroup.LayoutParams layoutParams = this.f151662h.f22494b.getLayoutParams();
            if (i17 < 3 || layoutParams.height >= getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479662c0)) {
                return;
            }
            layoutParams.height = getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479662c0);
        }
    }

    public final void setMaxWidth(int i17) {
        if (i17 > 0) {
            android.view.ViewGroup.LayoutParams layoutParams = this.f151662h.f22494b.getLayoutParams();
            if (i17 > 0) {
                layoutParams.width = i17;
            }
        }
    }

    public final void setViewEventListener(rm3.a listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f151661g = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicMvCommentView(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
