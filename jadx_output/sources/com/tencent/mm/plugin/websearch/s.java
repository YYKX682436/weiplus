package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f181617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.a0 f181618e;

    public s(com.tencent.mm.plugin.websearch.a0 a0Var, java.util.Map map) {
        this.f181618e = a0Var;
        this.f181617d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.websearch.a0 a0Var = this.f181618e;
        a0Var.f181433p.a(a0Var.b(this.f181617d));
    }
}
