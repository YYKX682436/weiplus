package go2;

/* loaded from: classes2.dex */
public final class r implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f274060d;

    public r(go2.z zVar) {
        this.f274060d = zVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            go2.z zVar = this.f274060d;
            g4Var.f(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST, zVar.getString(com.tencent.mm.R.string.ems));
            g4Var.f(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_NEED_REENTER, zVar.getString(com.tencent.mm.R.string.nkq));
        }
    }
}
