package lx;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx.u f321935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321936e;

    public s(lx.u uVar, java.lang.String str) {
        this.f321935d = uVar;
        this.f321936e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lx.u uVar = this.f321935d;
        try {
            com.tencent.pigeon.biz.ConversationListCallbackApi conversationListCallbackApi = uVar.f321958f;
            if (conversationListCallbackApi != null) {
                conversationListCallbackApi.reloadData(new lx.r(this.f321936e));
            }
        } finally {
            uVar.f321960h = null;
        }
    }
}
