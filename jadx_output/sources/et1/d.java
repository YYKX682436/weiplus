package et1;

/* loaded from: classes8.dex */
public final class d implements vg3.z4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ et1.e f256566a;

    public d(et1.e eVar) {
        this.f256566a = eVar;
    }

    @Override // vg3.z4
    public void a() {
        com.tencent.mars.xlog.Log.i(this.f256566a.t(), "flushNotifyAllMsg");
    }

    @Override // vg3.z4
    public void b(com.tencent.mm.storage.f9 f9Var, r45.j4 j4Var) {
        com.tencent.mars.xlog.Log.i(this.f256566a.t(), "[notifyNewMsg] msg=" + f9Var + " addMsg=" + j4Var);
        mm.w.e("newMsgByp");
    }
}
