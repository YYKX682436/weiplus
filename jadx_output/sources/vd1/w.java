package vd1;

/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final vd1.v[] f435616a = {new vd1.v(vd1.l.f435593g, 3), new vd1.v(vd1.l.f435591e, 3), new vd1.v(vd1.l.f435592f, 1)};

    public java.util.List a(long j17) {
        long j18;
        vd1.v[] vVarArr;
        long j19;
        java.util.List list;
        long j27;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        vd1.v[] vVarArr2 = this.f435616a;
        int length = vVarArr2.length;
        long j28 = 0;
        int i17 = 0;
        long j29 = 0;
        while (i17 < length) {
            vd1.v vVar = vVarArr2[i17];
            synchronized (vVar.f435614c) {
                j18 = vVar.f435615d;
            }
            long j37 = j17 - j29;
            synchronized (vVar.f435614c) {
                if (vVar.f435614c.isEmpty()) {
                    list = kz5.p0.f313996d;
                    vVarArr = vVarArr2;
                    j19 = j28;
                } else {
                    if (j37 < j28) {
                        j37 = ((vd1.y) vVar.f435614c.peekFirst()).f435624c.length();
                    }
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    long j38 = j37;
                    while (!vVar.f435614c.isEmpty() && j38 > 0) {
                        java.lang.Object pollFirst = vVar.f435614c.pollFirst();
                        ((vd1.y) pollFirst).f435628g++;
                        j38 -= r5.f435624c.length();
                        linkedList2.addLast(pollFirst);
                        vVarArr2 = vVarArr2;
                    }
                    vVarArr = vVarArr2;
                    long j39 = vVar.f435615d - (j37 - j38);
                    vVar.f435615d = j39;
                    if (j39 < 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue.BufferQueue", '[' + vVar.f435612a.name() + "] poll(" + j37 + ") final bytesCount becomes minus");
                        j19 = 0;
                        vVar.f435615d = 0L;
                    } else {
                        j19 = 0;
                    }
                    list = linkedList2;
                }
            }
            linkedList.addAll(list);
            synchronized (vVar.f435614c) {
                j27 = vVar.f435615d;
            }
            j29 += j18 - j27;
            i17++;
            vVarArr2 = vVarArr;
            j28 = j19;
        }
        return linkedList;
    }

    public boolean b(vd1.y entry) {
        kotlin.jvm.internal.o.g(entry, "entry");
        for (vd1.v vVar : this.f435616a) {
            if (vVar.f435612a == entry.f435625d) {
                if (entry.f435628g <= vVar.f435613b) {
                    synchronized (vVar.f435614c) {
                        vVar.f435614c.addLast(entry);
                        vVar.f435615d += entry.f435624c.length();
                    }
                    return true;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue.BufferQueue", "push reach TryCountLimit priority[" + vVar.f435612a.name() + "], entry[" + entry.f435627f + ", " + entry.f435622a + ", " + entry.f435623b + ']');
                return false;
            }
        }
        return false;
    }
}
