package ey2;

/* loaded from: classes2.dex */
public final class n0 extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f257436e = new java.util.LinkedList();

    public final ey2.m0 N6(r45.qt2 contextObj) {
        r45.jw2 jw2Var;
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        com.tencent.mars.xlog.Log.i("Finder.GuideConfigVM", "[getConfig] contextId=" + contextObj.getString(1));
        java.lang.String string = contextObj.getString(1);
        boolean z17 = string != null && r26.i0.y(string, "34-", false);
        java.lang.Object obj = null;
        java.util.LinkedList linkedList = this.f257436e;
        if (z17) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.jw2) next).getInteger(0) == 1) {
                    obj = next;
                    break;
                }
            }
            jw2Var = (r45.jw2) obj;
        } else {
            java.lang.String string2 = contextObj.getString(1);
            if (string2 != null && r26.i0.y(string2, "29-", false)) {
                java.util.Iterator it6 = linkedList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it6.next();
                    if (((r45.jw2) next2).getInteger(0) == 2) {
                        obj = next2;
                        break;
                    }
                }
                jw2Var = (r45.jw2) obj;
            } else {
                java.util.Iterator it7 = linkedList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    java.lang.Object next3 = it7.next();
                    if (((r45.jw2) next3).getInteger(0) == 3) {
                        obj = next3;
                        break;
                    }
                }
                jw2Var = (r45.jw2) obj;
            }
        }
        ey2.m0 m0Var = new ey2.m0();
        if (jw2Var != null) {
            m0Var.f257430a = jw2Var.getInteger(0);
            jw2Var.getInteger(1);
            jw2Var.getInteger(4);
            jw2Var.getInteger(5);
            jw2Var.getInteger(2);
            jw2Var.getInteger(6);
            jw2Var.getInteger(3);
            jw2Var.getInteger(7);
        }
        return m0Var;
    }
}
