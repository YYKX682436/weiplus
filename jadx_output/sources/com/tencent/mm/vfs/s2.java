package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class s2 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.b3 f213172a;

    public s2(com.tencent.mm.vfs.b3 b3Var) {
        this.f213172a = b3Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        this.f213172a.f212826t.sendEmptyMessage(3);
    }
}
