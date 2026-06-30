package qa4;

/* loaded from: classes4.dex */
public abstract class f {
    public static final java.util.List a(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaList", "com.tencent.mm.plugin.sns.model.withta.UtilsKt");
        kotlin.jvm.internal.o.g(timeLineObject, "<this>");
        r45.a90 a90Var = timeLineObject.ContentObj;
        java.util.LinkedList linkedList = a90Var != null ? a90Var.f369840h : null;
        kotlin.jvm.internal.o.d(linkedList);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaList", "com.tencent.mm.plugin.sns.model.withta.UtilsKt");
        return linkedList;
    }
}
