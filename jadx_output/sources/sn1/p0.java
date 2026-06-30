package sn1;

/* loaded from: classes8.dex */
public class p0 extends sn1.i {

    /* renamed from: u, reason: collision with root package name */
    public final wn1.l f410072u;

    /* renamed from: v, reason: collision with root package name */
    public final wn1.m f410073v;

    public p0(java.util.LinkedList linkedList, long j17, long j18) {
        wn1.l lVar = new wn1.l();
        this.f410072u = lVar;
        this.f410073v = new wn1.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupRequestSessionScene", "init sessionName[%d], startTime[%d], endTime[%d]", java.lang.Integer.valueOf(linkedList.size()), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        lVar.f447437d = linkedList;
        lVar.f447438e = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            this.f410072u.f447438e.add(java.lang.Long.valueOf(j17));
            this.f410072u.f447438e.add(java.lang.Long.valueOf(j18));
        }
    }

    @Override // sn1.i
    public com.tencent.mm.protobuf.f M() {
        return this.f410072u;
    }

    @Override // sn1.i
    public com.tencent.mm.protobuf.f N() {
        return this.f410073v;
    }

    @Override // sn1.i
    public void P(int i17) {
        wn1.m mVar = this.f410073v;
        java.util.LinkedList linkedList = mVar.f447439d;
        if (linkedList != null && mVar.f447440e != null && !linkedList.isEmpty() && mVar.f447439d.size() * 2 == mVar.f447440e.size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupRequestSessionScene", "onSceneEnd sessionName size[%d], name:%s", java.lang.Integer.valueOf(mVar.f447439d.size()), mVar.f447439d.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupRequestSessionScene", "onSceneEnd requestsession resp, TimeInterval:%s", mVar.f447440e.toString());
            J(0, 0, "BackupRequestSession success");
        } else {
            java.util.LinkedList linkedList2 = mVar.f447439d;
            if (linkedList2 != null && mVar.f447440e != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupRequestSessionScene", "onSceneEnd sessionName and TimeInterval size error. sessionName size[%d], timeInterval size[%d]", java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(mVar.f447440e.size()));
            }
            J(4, -1, "BackupRequestSession failed");
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 11;
    }
}
