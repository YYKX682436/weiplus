package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class r2 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.b3 f213156a;

    public r2(com.tencent.mm.vfs.b3 b3Var) {
        this.f213156a = b3Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Handler handler = this.f213156a.f212826t;
        handler.sendMessageAtFrontOfQueue(android.os.Message.obtain(handler, 1, intent));
    }
}
