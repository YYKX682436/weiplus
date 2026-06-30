package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes.dex */
public class u8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f191946d;

    public u8(android.content.Context context) {
        this.f191946d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f191946d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f493691lb1), 1).show();
    }
}
