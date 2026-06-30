package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f175055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.k74 f175056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175057g;

    public o(com.tencent.mm.plugin.topstory.ui.home.j jVar, java.lang.String str, android.content.Context context, r45.k74 k74Var) {
        this.f175057g = jVar;
        this.f175054d = str;
        this.f175055e = context;
        this.f175056f = k74Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f175054d;
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175057g;
        jVar.Q = com.tencent.mm.plugin.topstory.ui.home.j.a(jVar, str);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        android.content.Context context = this.f175055e;
        r45.k74 k74Var = this.f175056f;
        e1Var.K(context, k74Var.getString(0), k74Var.getString(1), k74Var.getString(2), k74Var.getString(3));
    }
}
