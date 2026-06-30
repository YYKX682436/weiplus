package ye2;

/* loaded from: classes3.dex */
public final class b extends we2.b0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    @Override // we2.b0
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        java.util.Iterator it = msgList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.t12 t12Var = (r45.t12) it.next();
            int integer = t12Var.getInteger(3);
            gk2.e eVar = this.f445216a;
            if (integer == 10007) {
                i17 = t12Var.getInteger(3);
                ((mm2.c1) eVar.a(mm2.c1.class)).f328896v = false;
                ((mm2.c1) eVar.a(mm2.c1.class)).f328908x = t12Var.getString(2);
            } else if (integer == 10008) {
                i17 = t12Var.getInteger(3);
                ((mm2.c1) eVar.a(mm2.c1.class)).f328896v = true;
                ((mm2.c1) eVar.a(mm2.c1.class)).f328908x = null;
            }
        }
        if (i17 == 10007) {
            ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
            ((ml2.r0) i95.n0.c(ml2.r0.class)).G++;
        }
        com.tencent.mars.xlog.Log.i("MMFinder.LiveMsgSlice", "updateLiveMsg commentType:" + i17);
    }

    @Override // we2.b0
    public int[] f() {
        return new int[]{10008, 10007};
    }
}
