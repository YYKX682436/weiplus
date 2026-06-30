package fx4;

/* loaded from: classes11.dex */
public final class i implements com.tencent.wechat.iam.biz.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fx4.a f267155a;

    public i(fx4.a aVar) {
        this.f267155a = aVar;
    }

    @Override // com.tencent.wechat.iam.biz.l
    public final void complete(boolean z17) {
        com.tencent.mars.xlog.Log.i("AudioPlayLaterHelper", "addItemToPlayLaterAsync result " + z17);
        fx4.a aVar = this.f267155a;
        if (z17) {
            com.tencent.wechat.iam.biz.o.f217761b.b(com.tencent.wechat.mm.biz.l4.IAM_BIZ_AUDIO_PLAY_LIST_TYPE_LISTEN_LATER, new fx4.h(aVar));
        } else if (aVar != null) {
            aVar.a(false);
        }
    }
}
