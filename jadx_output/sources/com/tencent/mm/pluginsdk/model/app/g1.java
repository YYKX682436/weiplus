package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f188907d;

    public g1(android.content.Context context) {
        this.f188907d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f188907d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.hf7), 1).show();
    }
}
