package lr4;

/* loaded from: classes11.dex */
public final class r implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr4.g f320761d;

    public r(kr4.g gVar) {
        this.f320761d = gVar;
    }

    @Override // c01.da
    public boolean a() {
        return false;
    }

    @Override // c01.da
    public void c() {
        com.tencent.mars.xlog.Log.i("W1w.ConversationOnLongClickListener", "longclick delete msg finish");
        kr4.g gVar = this.f320761d;
        if (gVar.field_unReadCount > 0) {
            ((fr4.g0) i95.n0.c(fr4.g0.class)).bj(3011, gVar.field_selfUserName);
        }
    }
}
