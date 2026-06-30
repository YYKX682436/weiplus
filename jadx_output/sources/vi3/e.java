package vi3;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f437571a = false;

    /* renamed from: b, reason: collision with root package name */
    public vi3.a f437572b;

    public java.util.LinkedList a() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor s17 = ((com.tencent.mm.storage.m4) tn1.f.f().e().d()).s(1, kn1.k.s(), "*", -1);
        if (s17.getCount() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizePack", "calculateConversationList empty conversation!");
            s17.close();
            return linkedList;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizePack", "calculateConversationList count[%d]", java.lang.Integer.valueOf(s17.getCount()));
        int i17 = 0;
        while (true) {
            if (!s17.moveToNext()) {
                break;
            }
            if (this.f437571a) {
                s17.close();
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizePack", "calculateConversationList is cancel!");
                return linkedList;
            }
            if (i17 >= vi3.b.f437559f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizePack", "calculateConversationList convCount has reach the max, finish. convCount:%d", java.lang.Integer.valueOf(i17));
                break;
            }
            com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
            l4Var.convertFrom(s17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(l4Var.h1())) {
                int j76 = ((com.tencent.mm.storage.g9) tn1.f.f().e().g()).j7(l4Var.h1());
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizePack", "calculateConversationList user:%s convMsgCount:%d, convCount:%d", l4Var.h1(), java.lang.Integer.valueOf(j76), java.lang.Integer.valueOf(i17));
                if (j76 > 0) {
                    linkedList.add(new vi3.d(l4Var.h1()));
                    i17++;
                }
            }
        }
        s17.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizePack", "calculateConversationList loading time:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return linkedList;
    }

    public void b(vi3.f fVar, java.util.LinkedList linkedList, long j17, long j18, int i17) {
        ((ku5.t0) ku5.t0.f312615d).q(new vi3.c(this, linkedList, fVar, j17, j18, i17));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(vi3.f r41, vi3.d r42, long r43, long r45, java.lang.String r47, int r48, com.tencent.mm.pointers.PInt r49, com.tencent.mm.pointers.PLong r50, final int r51) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vi3.e.c(vi3.f, vi3.d, long, long, java.lang.String, int, com.tencent.mm.pointers.PInt, com.tencent.mm.pointers.PLong, int):boolean");
    }
}
