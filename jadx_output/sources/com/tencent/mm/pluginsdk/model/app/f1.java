package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f188888d;

    public f1(android.content.Context context) {
        this.f188888d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f188888d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.hf6), 1).show();
    }
}
