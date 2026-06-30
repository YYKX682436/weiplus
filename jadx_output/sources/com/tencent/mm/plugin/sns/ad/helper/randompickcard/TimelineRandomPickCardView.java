package com.tencent.mm.plugin.sns.ad.helper.randompickcard;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/helper/randompickcard/TimelineRandomPickCardView;", "Lcom/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TimelineRandomPickCardView extends com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView {

    /* renamed from: q, reason: collision with root package name */
    public android.animation.Animator f162723q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.Animator f162724r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f162725s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimelineRandomPickCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelLastAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
        com.tencent.mars.xlog.Log.i(getTAG(), "cancelLastAnim");
        android.animation.Animator animator = this.f162723q;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.Animator animator2 = this.f162724r;
        if (animator2 != null) {
            animator2.cancel();
        }
        java.util.List list = this.f162725s;
        if (!(list == null || list.isEmpty())) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((android.animation.Animator) it.next()).cancel();
            }
        }
        java.util.List<p44.c0> mItemViewList = getMItemViewList();
        if (!(mItemViewList == null || mItemViewList.isEmpty())) {
            java.util.Iterator<p44.c0> it6 = getMItemViewList().iterator();
            while (it6.hasNext()) {
                a(it6.next());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelLastAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
    }

    @Override // com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView
    public void h(p44.c0 vh6, p44.s itemData, p44.u cardInfo) {
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initItem", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
        kotlin.jvm.internal.o.g(vh6, "vh");
        kotlin.jvm.internal.o.g(itemData, "itemData");
        kotlin.jvm.internal.o.g(cardInfo, "cardInfo");
        android.widget.TextView g17 = vh6.g();
        if (g17 != null) {
            g17.setText(itemData.e());
            if (itemData.g()) {
                if (com.tencent.mm.ui.bk.C()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleColorPickedDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                    i18 = cardInfo.f351857d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleColorPickedDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleColorPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                    i18 = cardInfo.f351856c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleColorPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                }
                g17.setTextColor(i18);
            } else {
                if (com.tencent.mm.ui.bk.C()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleColorAvailableDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                    i17 = cardInfo.f351855b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleColorAvailableDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleColorAvailable", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                    i17 = cardInfo.f351854a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleColorAvailable", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                }
                g17.setTextColor(i17);
            }
        }
        android.widget.ImageView d17 = vh6.d();
        if (d17 != null) {
            d17.setImageResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.sns_ad_random_pick_card_ellipse_dark_icon : com.tencent.mm.R.raw.sns_ad_random_pick_card_ellipse_light_icon);
        }
        android.widget.ImageView e17 = vh6.e();
        if (e17 != null) {
            a84.z.e(itemData.imageUrl, e17);
            e17.setRotationY(0.0f);
        }
        android.widget.ImageView b17 = vh6.b();
        if (b17 != null) {
            a84.z.e(cardInfo.backgroundImageUrl, b17);
            b17.setRotationY(0.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initItem", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
    }

    @Override // com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView
    public int k(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
        int mContainerWidth = (int) ((getMContainerWidth() * i17) / 298.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView");
        return mContainerWidth;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0521 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0543 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(boolean r45) {
        /*
            Method dump skipped, instructions count: 2656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickCardView.n(boolean):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineRandomPickCardView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setTAG("TimelineRandomPickCardView");
    }
}
