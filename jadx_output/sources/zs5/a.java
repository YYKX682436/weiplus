package zs5;

/* loaded from: classes13.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.qbar.QbarNative$QBarPoint a(com.tencent.wechat.aff.iam_scan.i0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        java.util.LinkedList points = item.f217059i;
        com.tencent.qbar.QbarNative$QBarPoint qbarNative$QBarPoint = new com.tencent.qbar.QbarNative$QBarPoint();
        int size = points.size();
        qbarNative$QBarPoint.point_cnt = size;
        if (size != 4) {
            if (size != 2) {
                return null;
            }
            kotlin.jvm.internal.o.f(points, "points");
            com.tencent.wechat.aff.iam_scan.v vVar = (com.tencent.wechat.aff.iam_scan.v) kz5.n0.a0(points, 0);
            qbarNative$QBarPoint.f215230x0 = vVar != null ? vVar.f217143d : 0.0f;
            kotlin.jvm.internal.o.f(points, "points");
            com.tencent.wechat.aff.iam_scan.v vVar2 = (com.tencent.wechat.aff.iam_scan.v) kz5.n0.a0(points, 0);
            qbarNative$QBarPoint.f215234y0 = vVar2 != null ? vVar2.f217144e : 0.0f;
            kotlin.jvm.internal.o.f(points, "points");
            com.tencent.wechat.aff.iam_scan.v vVar3 = (com.tencent.wechat.aff.iam_scan.v) kz5.n0.a0(points, 1);
            qbarNative$QBarPoint.f215231x1 = vVar3 != null ? vVar3.f217143d : 0.0f;
            kotlin.jvm.internal.o.f(points, "points");
            com.tencent.wechat.aff.iam_scan.v vVar4 = (com.tencent.wechat.aff.iam_scan.v) kz5.n0.a0(points, 1);
            qbarNative$QBarPoint.f215235y1 = vVar4 != null ? vVar4.f217144e : 0.0f;
            return qbarNative$QBarPoint;
        }
        kotlin.jvm.internal.o.f(points, "points");
        com.tencent.wechat.aff.iam_scan.v vVar5 = (com.tencent.wechat.aff.iam_scan.v) kz5.n0.a0(points, 0);
        qbarNative$QBarPoint.f215230x0 = vVar5 != null ? vVar5.f217143d : 0.0f;
        kotlin.jvm.internal.o.f(points, "points");
        com.tencent.wechat.aff.iam_scan.v vVar6 = (com.tencent.wechat.aff.iam_scan.v) kz5.n0.a0(points, 0);
        qbarNative$QBarPoint.f215234y0 = vVar6 != null ? vVar6.f217144e : 0.0f;
        kotlin.jvm.internal.o.f(points, "points");
        com.tencent.wechat.aff.iam_scan.v vVar7 = (com.tencent.wechat.aff.iam_scan.v) kz5.n0.a0(points, 1);
        qbarNative$QBarPoint.f215231x1 = vVar7 != null ? vVar7.f217143d : 0.0f;
        kotlin.jvm.internal.o.f(points, "points");
        com.tencent.wechat.aff.iam_scan.v vVar8 = (com.tencent.wechat.aff.iam_scan.v) kz5.n0.a0(points, 1);
        qbarNative$QBarPoint.f215235y1 = vVar8 != null ? vVar8.f217144e : 0.0f;
        kotlin.jvm.internal.o.f(points, "points");
        com.tencent.wechat.aff.iam_scan.v vVar9 = (com.tencent.wechat.aff.iam_scan.v) kz5.n0.a0(points, 2);
        qbarNative$QBarPoint.f215232x2 = vVar9 != null ? vVar9.f217143d : 0.0f;
        kotlin.jvm.internal.o.f(points, "points");
        com.tencent.wechat.aff.iam_scan.v vVar10 = (com.tencent.wechat.aff.iam_scan.v) kz5.n0.a0(points, 2);
        qbarNative$QBarPoint.f215236y2 = vVar10 != null ? vVar10.f217144e : 0.0f;
        kotlin.jvm.internal.o.f(points, "points");
        com.tencent.wechat.aff.iam_scan.v vVar11 = (com.tencent.wechat.aff.iam_scan.v) kz5.n0.a0(points, 3);
        qbarNative$QBarPoint.f215233x3 = vVar11 != null ? vVar11.f217143d : 0.0f;
        kotlin.jvm.internal.o.f(points, "points");
        com.tencent.wechat.aff.iam_scan.v vVar12 = (com.tencent.wechat.aff.iam_scan.v) kz5.n0.a0(points, 3);
        qbarNative$QBarPoint.f215237y3 = vVar12 != null ? vVar12.f217144e : 0.0f;
        return qbarNative$QBarPoint;
    }
}
