package dk2;

/* loaded from: classes12.dex */
public final class rb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f234029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.f f234030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f234031f;

    public rb(int i17, com.tencent.mm.protobuf.f fVar, dk2.tb tbVar) {
        this.f234029d = i17;
        this.f234030e = fVar;
        this.f234031f = tbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update req for ");
        int i17 = this.f234029d;
        sb6.append(i17);
        sb6.append(' ');
        com.tencent.mm.protobuf.f fVar = this.f234030e;
        sb6.append(fVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", sb6.toString());
        dk2.tb tbVar = this.f234031f;
        java.util.Iterator it = tbVar.f234120a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((dk2.bb) obj).f233248d == i17) {
                    break;
                }
            }
        }
        dk2.bb bbVar = obj instanceof dk2.bb ? (dk2.bb) obj : null;
        if (bbVar != null) {
            kotlin.jvm.internal.o.g(fVar, "<set-?>");
            bbVar.f233249e = fVar;
        }
        java.lang.Object obj2 = tbVar.f234121b.get(java.lang.Integer.valueOf(i17));
        dk2.bb bbVar2 = obj2 instanceof dk2.bb ? (dk2.bb) obj2 : null;
        if (bbVar2 == null) {
            return;
        }
        kotlin.jvm.internal.o.g(fVar, "<set-?>");
        bbVar2.f233249e = fVar;
    }
}
