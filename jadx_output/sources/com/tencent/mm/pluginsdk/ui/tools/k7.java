package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes.dex */
public class k7 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f191753a;

    public k7(android.content.Context context) {
        this.f191753a = context;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        android.content.Context context = this.f191753a;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492304g00, str2), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        android.content.Context context = this.f191753a;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.i87), 1).show();
    }
}
