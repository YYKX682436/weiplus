package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f206282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.f7 f206283e;

    public z6(com.tencent.mm.ui.chatting.f7 f7Var, android.content.Intent intent) {
        this.f206283e = f7Var;
        this.f206282d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = this.f206282d;
        if (intent != null) {
            intent.putExtra("curPageId", 1);
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        android.content.Context context = this.f206283e.f200489b;
        java.lang.String string = context.getString(com.tencent.mm.R.string.azq);
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.w.v(context, intent, string, null, null);
    }
}
