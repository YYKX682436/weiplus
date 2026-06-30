package oc4;

/* loaded from: classes.dex */
public final class w implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final oc4.w f344372d = new oc4.w();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap$1");
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap$1");
        kotlin.jvm.internal.o.d(str);
        int compareTo = ((java.lang.String) obj2).compareTo(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.component.unread.UnreadMap$1");
        return compareTo;
    }
}
