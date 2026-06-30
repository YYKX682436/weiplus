package ir2;

/* loaded from: classes2.dex */
public class d {
    public void a(java.util.List dataList, java.util.List increment) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(increment, "increment");
        if (increment.isEmpty()) {
            return;
        }
        java.util.Iterator it = increment.iterator();
        while (it.hasNext()) {
            so2.j5 incrementItem = (so2.j5) it.next();
            java.util.Iterator it6 = dataList.iterator();
            int i17 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i17 = -1;
                    break;
                } else {
                    if (((so2.j5) it6.next()).d(incrementItem) == 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (i17 != -1) {
                kotlin.jvm.internal.o.g(incrementItem, "incrementItem");
                dataList.set(i17, incrementItem);
            } else {
                dataList.add(incrementItem);
            }
        }
    }
}
