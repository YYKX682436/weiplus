package w74;

/* loaded from: classes4.dex */
public class d implements c94.a {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f443528e = new android.util.ArrayMap();

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f443529f = {0, 1, 2};

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f443530a;

    /* renamed from: b, reason: collision with root package name */
    public s34.h0 f443531b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f443532c = f443529f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f443533d;

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensureUin", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        if (android.text.TextUtils.isEmpty(this.f443533d)) {
            this.f443533d = gm0.j1.b().j();
        }
        java.lang.String str = this.f443533d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureUin", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        return str;
    }

    public int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        try {
            s34.h0 h0Var = this.f443531b;
            if (h0Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                return 0;
            }
            java.util.List list = h0Var.f402655e;
            if (list == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                return 0;
            }
            int min = java.lang.Math.min(((java.util.ArrayList) list).size(), 3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return min;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("SnsAd.Participants", "getItemCount error ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return 0;
        }
    }

    public void c(com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout stackUpLayout, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("injectAdapter", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        try {
            d(stackUpLayout, snsInfo);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("SnsAd.Participants", "injectAdapter error " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("injectAdapter", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
    }

    public final void d(com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout stackUpLayout, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        s34.h0 h0Var;
        int nextInt;
        int nextInt2;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        if (stackUpLayout == null || snsInfo == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.Participants", "the input layout or sns information is null!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return;
        }
        java.lang.String T = ca4.z0.T(snsInfo);
        if (android.text.TextUtils.isEmpty(T) || T.equals(this.f443530a)) {
            com.tencent.mars.xlog.Log.w("SnsAd.Participants", "the sns id is empty or same as last one!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        if (snsInfo.getAdXml() == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.Participants", "the sns info or ad xml is null!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            h0Var = null;
        } else {
            s34.h0 h0Var2 = snsInfo.getAdXml().adFinderTopicInfo;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            h0Var = h0Var2;
        }
        if (h0Var == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.Participants", "i think you are crazy!!!! Why is the topic-info null?");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return;
        }
        this.f443530a = T;
        this.f443531b = h0Var;
        java.util.List list = h0Var.f402655e;
        int size = list == null ? 0 : ((java.util.ArrayList) list).size();
        a();
        java.lang.String a17 = a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRandomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        boolean isEmpty = android.text.TextUtils.isEmpty(T);
        int[] iArr = f443529f;
        if (isEmpty || android.text.TextUtils.isEmpty(a17) || size < 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRandomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        } else {
            android.util.ArrayMap arrayMap = (android.util.ArrayMap) f443528e;
            int[] iArr2 = (int[]) arrayMap.get(T);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
            int i18 = 1;
            boolean z17 = iArr2 == null || iArr2.length == 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
            if (z17) {
                java.lang.String str = T + a17 + size;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("randomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                if (str == null || size <= 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("randomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                } else {
                    java.util.Random random = new java.util.Random(str.hashCode());
                    int nextInt3 = random.nextInt(size);
                    int i19 = 0;
                    do {
                        nextInt = random.nextInt(size);
                        i19++;
                        if (nextInt3 != nextInt) {
                            break;
                        }
                    } while (i19 < 3);
                    if (i19 >= 3) {
                        nextInt = (nextInt3 + 1) % size;
                    }
                    int i27 = 0;
                    while (true) {
                        nextInt2 = random.nextInt(size);
                        i27 += i18;
                        if (nextInt2 != nextInt && nextInt2 != nextInt3) {
                            i17 = 3;
                            break;
                        }
                        i17 = 3;
                        if (i27 >= 3) {
                            break;
                        } else {
                            i18 = 1;
                        }
                    }
                    if (i27 >= i17) {
                        nextInt2 = (nextInt + 1) % size;
                    }
                    if (nextInt3 == nextInt || nextInt3 == nextInt2 || nextInt == nextInt2) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("randomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                    } else {
                        iArr = new int[]{nextInt3, nextInt, nextInt2};
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("randomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                    }
                }
                arrayMap.put(T, iArr);
            } else {
                iArr = iArr2;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRandomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        }
        this.f443532c = iArr;
        stackUpLayout.setAdapter(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
    }
}
