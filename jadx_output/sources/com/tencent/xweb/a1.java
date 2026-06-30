package com.tencent.xweb;

/* loaded from: classes8.dex */
public class a1 implements tx5.e {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.xweb.a1 f220206b;

    /* renamed from: a, reason: collision with root package name */
    public tx5.e f220207a;

    public static synchronized com.tencent.xweb.a1 c() {
        com.tencent.xweb.a1 a1Var;
        synchronized (com.tencent.xweb.a1.class) {
            if (f220206b == null) {
                f220206b = new com.tencent.xweb.a1();
            }
            a1Var = f220206b;
        }
        return a1Var;
    }

    @Override // tx5.e
    public void a() {
        tx5.e eVar = this.f220207a;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // tx5.e
    public void b(java.lang.String str) {
        tx5.e eVar = this.f220207a;
        if (eVar != null) {
            eVar.b(str);
        }
    }
}
