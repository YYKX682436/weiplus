package com.tencent.mm.plugin.finder.nearby.ui.special.view;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B#\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%R#\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR#\u0010\f\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR#\u0010\u0011\u001a\n \u0004*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0014\u001a\n \u0004*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0010R#\u0010\u0019\u001a\n \u0004*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001c\u001a\n \u0004*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u0018¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/ui/special/view/PlayTogetherActiveMsgLayout;", "Landroid/widget/FrameLayout;", "Lgr2/k;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "h", "Ljz5/g;", "getLayoutLine1", "()Landroid/view/View;", "layoutLine1", "i", "getLayoutLine2", "layoutLine2", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "m", "getActiveMsgIcon1", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "activeMsgIcon1", "n", "getActiveMsgIcon2", "activeMsgIcon2", "Landroid/widget/TextView;", "o", "getActiveMsgText1", "()Landroid/widget/TextView;", "activeMsgText1", "p", "getActiveMsgText2", "activeMsgText2", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class PlayTogetherActiveMsgLayout extends android.widget.FrameLayout implements gr2.k {

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f122131d;

    /* renamed from: e, reason: collision with root package name */
    public long f122132e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f122133f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.y0 f122134g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g layoutLine1;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g layoutLine2;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final jz5.g activeMsgIcon1;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final jz5.g activeMsgIcon2;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final jz5.g activeMsgText1;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final jz5.g activeMsgText2;

    /* renamed from: q, reason: collision with root package name */
    public int f122141q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayTogetherActiveMsgLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.ui.widget.imageview.WeImageView getActiveMsgIcon1() {
        return (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.activeMsgIcon1).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.ui.widget.imageview.WeImageView getActiveMsgIcon2() {
        return (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.activeMsgIcon2).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getActiveMsgText1() {
        return (android.widget.TextView) ((jz5.n) this.activeMsgText1).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getActiveMsgText2() {
        return (android.widget.TextView) ((jz5.n) this.activeMsgText2).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View getLayoutLine1() {
        return (android.view.View) ((jz5.n) this.layoutLine1).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View getLayoutLine2() {
        return (android.view.View) ((jz5.n) this.layoutLine2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(in5.s0 r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherActiveMsgLayout.g(in5.s0, java.util.List):void");
    }

    public final void h(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.TextView textView, r45.q85 q85Var) {
        int i17;
        switch (q85Var.getInteger(0)) {
            case 1:
                i17 = com.tencent.mm.R.raw.icons_filled_me;
                break;
            case 2:
                i17 = com.tencent.mm.R.raw.bubble_filled;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                i17 = com.tencent.mm.R.raw.icons_filled_annocement;
                break;
            default:
                i17 = 0;
                break;
        }
        if (i17 != 0) {
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            if (weImageView != null) {
                weImageView.setImageResource(i17);
            }
        } else if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        if (textView != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String string = q85Var.getString(1);
            if (string == null) {
                string = "";
            }
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
        }
    }

    public void i() {
        com.tencent.mars.xlog.Log.i("PlayTogetherActiveMsgLayout", "unFocus: activeMsgSize=" + this.f122133f.size() + ", itemId=" + pm0.v.u(this.f122132e) + ", loopJob=" + this.f122131d);
        kotlinx.coroutines.r2 r2Var = this.f122131d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f122131d = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayTogetherActiveMsgLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f122133f = new java.util.ArrayList();
        this.layoutLine1 = jz5.h.b(new gr2.u(this));
        this.layoutLine2 = jz5.h.b(new gr2.v(this));
        this.activeMsgIcon1 = jz5.h.b(new gr2.p(this));
        this.activeMsgIcon2 = jz5.h.b(new gr2.q(this));
        this.activeMsgText1 = jz5.h.b(new gr2.r(this));
        this.activeMsgText2 = jz5.h.b(new gr2.s(this));
    }
}
