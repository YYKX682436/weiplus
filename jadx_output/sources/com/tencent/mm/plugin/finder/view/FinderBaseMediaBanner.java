package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B\u001b\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102B#\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\u0006\u00103\u001a\u00020\u0005¢\u0006\u0004\b1\u00104R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00028\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010$\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010*\u001a\u00020%8&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010,\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0010¨\u00065"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderBaseMediaBanner;", "Landroid/view/View;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/view/z;", "", "d", "I", "getFocusPosition", "()I", "setFocusPosition", "(I)V", "focusPosition", "e", "Landroid/view/View;", "getMediaView", "()Landroid/view/View;", "setMediaView", "(Landroid/view/View;)V", "mediaView", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "f", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "getFinderFeed", "()Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "setFinderFeed", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "finderFeed", "Lr45/fn2;", "value", "g", "Lr45/fn2;", "getRefFeedInfo", "()Lr45/fn2;", "setRefFeedInfo", "(Lr45/fn2;)V", "refFeedInfo", "Lcom/tencent/mm/plugin/finder/view/qr;", "getMediaType", "()Lcom/tencent/mm/plugin/finder/view/qr;", "setMediaType", "(Lcom/tencent/mm/plugin/finder/view/qr;)V", "mediaType", "getFocusView", "focusView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class FinderBaseMediaBanner<V extends android.view.View> extends android.widget.FrameLayout implements com.tencent.mm.plugin.finder.view.z {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int focusPosition;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.view.View mediaView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed finderFeed;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public r45.fn2 refFeedInfo;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f130870h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f130871i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f130872m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderBaseMediaBanner(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        setImportantForAccessibility(1);
        setId(com.tencent.mm.R.id.f484869fs3);
    }

    public abstract android.view.View b();

    @Override // com.tencent.mm.plugin.finder.view.z
    public boolean canScrollHorizontally(int i17, android.view.ViewGroup parent, float f17, float f18) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return false;
    }

    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed getFinderFeed() {
        return this.finderFeed;
    }

    public final int getFocusPosition() {
        return this.focusPosition;
    }

    public android.view.View getFocusView() {
        return b();
    }

    public abstract com.tencent.mm.plugin.finder.view.qr getMediaType();

    public final V getMediaView() {
        V v17 = (V) this.mediaView;
        if (v17 != null) {
            return v17;
        }
        kotlin.jvm.internal.o.o("mediaView");
        throw null;
    }

    public final r45.fn2 getRefFeedInfo() {
        return this.refFeedInfo;
    }

    public final void setFinderFeed(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.finderFeed = baseFinderFeed;
    }

    public final void setFocusPosition(int i17) {
        this.focusPosition = i17;
    }

    public abstract void setMediaType(com.tencent.mm.plugin.finder.view.qr qrVar);

    public final void setMediaView(V v17) {
        kotlin.jvm.internal.o.g(v17, "<set-?>");
        this.mediaView = v17;
    }

    public final void setRefFeedInfo(r45.fn2 fn2Var) {
        java.lang.String str;
        this.refFeedInfo = fn2Var;
        if (fn2Var != null && ((com.tencent.mm.protocal.protobuf.FinderContact) fn2Var.getCustom(2)) != null) {
            r45.fn2 fn2Var2 = this.refFeedInfo;
            if (!(fn2Var2 != null && fn2Var2.getLong(0) == 0)) {
                if (this.f130870h == null) {
                    android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488802ah3, (android.view.ViewGroup) this, false);
                    this.f130870h = inflate;
                    addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    android.view.View view = this.f130870h;
                    this.f130871i = view != null ? view.findViewById(com.tencent.mm.R.id.ctl) : null;
                    android.view.View view2 = this.f130870h;
                    this.f130872m = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ctm) : null;
                }
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = getContext();
                r45.fn2 fn2Var3 = this.refFeedInfo;
                kotlin.jvm.internal.o.d(fn2Var3);
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) fn2Var3.getCustom(2);
                if (finderContact == null || (str = finderContact.getNickname()) == null) {
                    str = "";
                }
                ((ke0.e) xVar).getClass();
                android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
                r45.fn2 fn2Var4 = this.refFeedInfo;
                kotlin.jvm.internal.o.d(fn2Var4);
                if (fn2Var4.getLong(0) != 2) {
                    android.view.View view3 = this.f130871i;
                    if (view3 == null) {
                        return;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                android.view.View view4 = this.f130871i;
                if (view4 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.TextView textView = this.f130872m;
                if (textView != null) {
                    textView.setText(i17);
                }
                android.view.View view5 = this.f130871i;
                if (view5 != null) {
                    view5.setOnClickListener(new com.tencent.mm.plugin.finder.view.t2(this));
                    return;
                }
                return;
            }
        }
        android.view.View view6 = this.f130871i;
        if (view6 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderBaseMediaBanner(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        setImportantForAccessibility(1);
        setId(com.tencent.mm.R.id.f484869fs3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderBaseMediaBanner(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setImportantForAccessibility(1);
        setId(com.tencent.mm.R.id.f484869fs3);
    }
}
