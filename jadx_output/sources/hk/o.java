package hk;

/* loaded from: classes8.dex */
public final class o implements vg3.z4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hk.p f281685a;

    public o(hk.p pVar) {
        this.f281685a = pVar;
    }

    @Override // vg3.z4
    public void a() {
        com.tencent.mars.xlog.Log.i(this.f281685a.f281686h, "flushNotifyAllMsg");
    }

    @Override // vg3.z4
    public void b(com.tencent.mm.storage.f9 f9Var, r45.j4 j4Var) {
        com.tencent.mars.xlog.Log.i(this.f281685a.f281686h, "[notifyNewMsg] msg=" + f9Var + " addMsg=" + j4Var);
        mm.w.e("newMsgMagic");
    }
}
