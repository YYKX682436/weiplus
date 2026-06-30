package com.tencent.mm.plugin.profile;

/* loaded from: classes5.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153591e;

    public q1(java.lang.String str, java.lang.String str2) {
        this.f153590d = str;
        this.f153591e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean k17 = r21.w.wi().k1(this.f153590d, 1);
        if (!k17) {
            k17 = r21.w.wi().k1(this.f153591e, 1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtils", "processModContact, update state(ADDED) FMessageConversation, ret = " + k17);
    }
}
