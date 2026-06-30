package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f143576d;

    public f5(com.tencent.mm.plugin.lite.jsapi.comms.j5 j5Var, android.content.Context context) {
        this.f143576d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f143576d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.fds, 3, -1), 0).show();
    }
}
