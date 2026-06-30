package oh1;

/* loaded from: classes4.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f345218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oh1.j2 f345219e;

    public g2(oh1.j2 j2Var, int i17) {
        this.f345219e = j2Var;
        this.f345218d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        oh1.j2 j2Var = this.f345219e;
        if (j2Var.f345243f.get() > this.f345218d) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) j2Var.f345241d).values().iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                break;
            }
            oh1.e2 e2Var = (oh1.e2) it.next();
            if (e2Var.b()) {
                r45.l46 l46Var = new r45.l46();
                l46Var.f379128e = e2Var.f345205b;
                l46Var.f379127d = e2Var.f345204a;
                if (e2Var.f345208e == 1) {
                    linkedList2.add(l46Var);
                } else {
                    linkedList.add(l46Var);
                }
            }
        }
        j2Var.getClass();
        boolean z18 = false;
        if (!linkedList.isEmpty()) {
            linkedList.size();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 2954;
            lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/getupdatablemsginfo";
            r45.tp3 tp3Var = new r45.tp3();
            tp3Var.f386647d = linkedList;
            lVar.f70664a = tp3Var;
            lVar.f70665b = new r45.up3();
            com.tencent.mm.modelbase.z2.d(lVar.a(), new oh1.h2(j2Var, linkedList, linkedList2), false);
            z17 = false;
        }
        if (linkedList2.isEmpty()) {
            z18 = z17;
        } else {
            linkedList2.size();
            com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
            lVar2.f70667d = 17438;
            lVar2.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/getchattoolmsginfo";
            r45.ad3 ad3Var = new r45.ad3();
            ad3Var.f369941d = linkedList2;
            lVar2.f70664a = ad3Var;
            lVar2.f70665b = new r45.bd3();
            com.tencent.mm.modelbase.z2.d(lVar2.a(), new oh1.i2(j2Var, linkedList, linkedList2), false);
        }
        if (z18) {
            j2Var.h();
        }
    }
}
