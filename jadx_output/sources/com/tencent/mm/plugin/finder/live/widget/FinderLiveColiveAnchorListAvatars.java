package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002 \u0007B\u001d\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveColiveAnchorListAvatars;", "Landroid/widget/FrameLayout;", "", "", "avatars", "Ljz5/f0;", "setAvatars", "Lcom/tencent/mm/plugin/finder/live/widget/ac;", "value", "d", "Lcom/tencent/mm/plugin/finder/live/widget/ac;", "getScene", "()Lcom/tencent/mm/plugin/finder/live/widget/ac;", "setScene", "(Lcom/tencent/mm/plugin/finder/live/widget/ac;)V", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "", "e", "I", "getMaxCount", "()I", "setMaxCount", "(I)V", "maxCount", "getAvatarCount", "avatarCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/finder/live/widget/zb", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveColiveAnchorListAvatars extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.live.widget.ac scene;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int maxCount;

    /* renamed from: f, reason: collision with root package name */
    public float f117585f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f117586g;

    public /* synthetic */ FinderLiveColiveAnchorListAvatars(android.content.Context context, android.util.AttributeSet attributeSet, int i17, kotlin.jvm.internal.i iVar) {
        this(context, (i17 & 2) != 0 ? null : attributeSet);
    }

    public final void a() {
        removeAllViews();
        java.util.List list = this.f117586g;
        if (((java.util.ArrayList) list).isEmpty()) {
            setContentDescription(null);
            return;
        }
        int a17 = i65.a.a(getContext(), this.f117585f);
        float f17 = 2.0f;
        int a18 = i65.a.a(getContext(), (this.f117585f / 2.0f) * 1.8571428f);
        float a19 = i65.a.a(getContext(), 2.0f);
        boolean z17 = true;
        int size = ((java.util.ArrayList) list).size() - 1;
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str = (java.lang.String) obj;
            boolean z18 = i17 != size ? z17 : false;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.live.widget.zb zbVar = new com.tencent.mm.plugin.finder.live.widget.zb(context);
            zbVar.setId(android.view.View.generateViewId());
            zbVar.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            zbVar.setBackground(null);
            zbVar.setOutlineProvider(null);
            zbVar.f120556d = z18;
            zbVar.f120557e = a17 / f17;
            zbVar.f120558f = a18;
            zbVar.f120559g = a19;
            z17 = true;
            zbVar.f120561i = true;
            zbVar.invalidate();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(a17, a17);
            layoutParams.setMarginStart(i17 * a18);
            layoutParams.gravity = 8388627;
            addView(zbVar, layoutParams);
            if (!r26.n0.N(str)) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.a().c(new mn2.n(str, com.tencent.mm.plugin.finder.storage.y90.X), zbVar, g1Var.h(mn2.f1.f329957h));
            }
            i17 = i18;
            f17 = 2.0f;
        }
        setContentDescription(getContext().getString(com.tencent.mm.R.string.oma, java.lang.Integer.valueOf(((java.util.ArrayList) list).size())));
    }

    public final int getAvatarCount() {
        return ((java.util.ArrayList) this.f117586g).size();
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final com.tencent.mm.plugin.finder.live.widget.ac getScene() {
        return this.scene;
    }

    public final void setAvatars(java.util.List<java.lang.String> avatars) {
        kotlin.jvm.internal.o.g(avatars, "avatars");
        java.util.List K0 = kz5.n0.K0(avatars, this.maxCount);
        java.util.List list = this.f117586g;
        if (kotlin.jvm.internal.o.b(K0, list)) {
            return;
        }
        ((java.util.ArrayList) list).clear();
        kz5.h0.u(list, K0);
        a();
    }

    public final void setMaxCount(int i17) {
        if (this.maxCount == i17) {
            return;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        this.maxCount = i17;
        a();
    }

    public final void setScene(com.tencent.mm.plugin.finder.live.widget.ac acVar) {
        float f17;
        if (this.scene == acVar) {
            return;
        }
        this.scene = acVar;
        int i17 = acVar == null ? -1 : com.tencent.mm.plugin.finder.live.widget.bc.f117861a[acVar.ordinal()];
        if (i17 == -1) {
            f17 = 32.0f;
        } else if (i17 == 1) {
            f17 = 28.0f;
        } else {
            if (i17 != 2) {
                throw new jz5.j();
            }
            f17 = 18.0f;
        }
        this.f117585f = f17;
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveColiveAnchorListAvatars(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.maxCount = 5;
        this.f117585f = 32.0f;
        this.f117586g = new java.util.ArrayList();
        setClipChildren(false);
        setClipToPadding(false);
    }
}
