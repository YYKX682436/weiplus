package ew;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ew.m f256985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256986e;

    public k(ew.m mVar, java.lang.String str) {
        this.f256985d = mVar;
        this.f256986e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ew.m mVar = this.f256985d;
        try {
            com.tencent.pigeon.brand_service.BrsConversationListCallbackApi brsConversationListCallbackApi = mVar.f256989e;
            if (brsConversationListCallbackApi != null) {
                brsConversationListCallbackApi.reloadData(new ew.j(this.f256986e));
            }
        } finally {
            mVar.f256991g = null;
        }
    }
}
