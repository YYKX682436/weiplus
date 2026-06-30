package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f189004d;

    public o(android.content.Context context) {
        this.f189004d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f189004d;
        db5.e1.T(context, context.getString(com.tencent.mm.R.string.b5z));
    }
}
