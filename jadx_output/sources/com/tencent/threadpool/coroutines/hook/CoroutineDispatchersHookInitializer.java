package com.tencent.threadpool.coroutines.hook;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/tencent/threadpool/coroutines/hook/CoroutineDispatchersHookInitializer;", "", "Ljz5/f0;", "setup", "<init>", "()V", "threadpool-coroutines_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public final class CoroutineDispatchersHookInitializer {
    public static final com.tencent.threadpool.coroutines.hook.CoroutineDispatchersHookInitializer INSTANCE = new com.tencent.threadpool.coroutines.hook.CoroutineDispatchersHookInitializer();

    private CoroutineDispatchersHookInitializer() {
    }

    public static final void setup() {
        if (lu5.c.f321459a == null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            if (!kotlin.jvm.internal.o.b(p0Var, lu5.d.f321462f)) {
                lu5.c.f321459a = p0Var;
            }
        }
        jz5.g gVar = mu5.d.f331467c;
        f06.v[] vVarArr = mu5.d.f331465a;
        f06.v vVar = vVarArr[1];
        java.lang.reflect.Field field = (java.lang.reflect.Field) ((jz5.n) gVar).getValue();
        if (field != null) {
            field.set(null, lu5.b.f321458f);
        }
        jz5.g gVar2 = mu5.d.f331468d;
        f06.v vVar2 = vVarArr[2];
        java.lang.reflect.Field field2 = (java.lang.reflect.Field) ((jz5.n) gVar2).getValue();
        if (field2 != null) {
            field2.set(null, lu5.d.f321462f);
        }
    }
}
