package t41;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f415488a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f415489b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f415490c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f415491d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f415492e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f415493f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f415494g = new java.util.ArrayList();

    public void a(java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.yz4 yz4Var = (r45.yz4) it.next();
            int i17 = yz4Var.f391536e;
            if (i17 == 0) {
                ((java.util.ArrayList) this.f415488a).add(yz4Var.f391535d);
            } else if (i17 == 3) {
                ((java.util.ArrayList) this.f415490c).add(yz4Var.f391535d);
            } else if (i17 == 1) {
                ((java.util.ArrayList) this.f415491d).add(yz4Var.f391535d);
            } else if (i17 == 2) {
                ((java.util.ArrayList) this.f415489b).add(yz4Var.f391535d);
            } else if (i17 == 4) {
                ((java.util.ArrayList) this.f415492e).add(yz4Var.f391535d);
            } else if (i17 != 5) {
                if (i17 == 6) {
                    ((java.util.ArrayList) this.f415493f).add(yz4Var.f391535d);
                } else if (i17 == 10) {
                    ((java.util.ArrayList) this.f415494g).add(yz4Var.f391535d);
                } else {
                    com.tencent.mars.xlog.Log.w("OpenIMChatRoomMember.Classifier", "unknown member status : status = " + i17);
                }
            }
        }
    }
}
