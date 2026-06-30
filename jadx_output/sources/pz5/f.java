package pz5;

/* loaded from: classes14.dex */
public abstract class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.coroutines.Continuation a(yz5.p pVar, java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(pVar, "<this>");
        kotlin.jvm.internal.o.g(completion, "completion");
        if (pVar instanceof qz5.a) {
            return ((qz5.a) pVar).create(obj, completion);
        }
        oz5.l context = completion.getContext();
        return context == oz5.m.f350329d ? new pz5.d(completion, pVar, obj) : new pz5.e(completion, context, pVar, obj);
    }

    public static final kotlin.coroutines.Continuation b(kotlin.coroutines.Continuation continuation) {
        kotlin.coroutines.Continuation<java.lang.Object> intercepted;
        kotlin.jvm.internal.o.g(continuation, "<this>");
        qz5.d dVar = continuation instanceof qz5.d ? (qz5.d) continuation : null;
        return (dVar == null || (intercepted = dVar.intercepted()) == null) ? continuation : intercepted;
    }
}
