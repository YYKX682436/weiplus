package qz5;

/* loaded from: classes14.dex */
public abstract class a implements kotlin.coroutines.Continuation, qz5.e, java.io.Serializable {
    private final kotlin.coroutines.Continuation<java.lang.Object> completion;

    public a(kotlin.coroutines.Continuation continuation) {
        this.completion = continuation;
    }

    public kotlin.coroutines.Continuation<jz5.f0> create(kotlin.coroutines.Continuation<?> completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        throw new java.lang.UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // qz5.e
    public qz5.e getCallerFrame() {
        kotlin.coroutines.Continuation<java.lang.Object> continuation = this.completion;
        if (continuation instanceof qz5.e) {
            return (qz5.e) continuation;
        }
        return null;
    }

    public final kotlin.coroutines.Continuation<java.lang.Object> getCompletion() {
        return this.completion;
    }

    public java.lang.StackTraceElement getStackTraceElement() {
        int i17;
        java.lang.String str;
        qz5.f fVar = (qz5.f) getClass().getAnnotation(qz5.f.class);
        java.lang.String str2 = null;
        if (fVar == null) {
            return null;
        }
        int v17 = fVar.v();
        if (v17 > 1) {
            throw new java.lang.IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v17 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            java.lang.reflect.Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(this);
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            i17 = (num != null ? num.intValue() : 0) - 1;
        } catch (java.lang.Exception unused) {
            i17 = -1;
        }
        int i18 = i17 >= 0 ? fVar.l()[i17] : -1;
        qz5.h hVar = qz5.i.f367943b;
        qz5.h hVar2 = qz5.i.f367942a;
        if (hVar == null) {
            try {
                qz5.h hVar3 = new qz5.h(java.lang.Class.class.getDeclaredMethod("getModule", new java.lang.Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new java.lang.Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, new java.lang.Class[0]));
                qz5.i.f367943b = hVar3;
                hVar = hVar3;
            } catch (java.lang.Exception unused2) {
                qz5.i.f367943b = hVar2;
                hVar = hVar2;
            }
        }
        if (hVar != hVar2) {
            java.lang.reflect.Method method = hVar.f367939a;
            java.lang.Object invoke = method != null ? method.invoke(getClass(), new java.lang.Object[0]) : null;
            if (invoke != null) {
                java.lang.reflect.Method method2 = hVar.f367940b;
                java.lang.Object invoke2 = method2 != null ? method2.invoke(invoke, new java.lang.Object[0]) : null;
                if (invoke2 != null) {
                    java.lang.reflect.Method method3 = hVar.f367941c;
                    java.lang.Object invoke3 = method3 != null ? method3.invoke(invoke2, new java.lang.Object[0]) : null;
                    if (invoke3 instanceof java.lang.String) {
                        str2 = (java.lang.String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = fVar.c();
        } else {
            str = str2 + '/' + fVar.c();
        }
        return new java.lang.StackTraceElement(str, fVar.m(), fVar.f(), i18);
    }

    public abstract java.lang.Object invokeSuspend(java.lang.Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(java.lang.Object obj) {
        java.lang.Object invokeSuspend;
        kotlin.coroutines.Continuation continuation = this;
        while (true) {
            qz5.a aVar = (qz5.a) continuation;
            kotlin.coroutines.Continuation continuation2 = aVar.completion;
            kotlin.jvm.internal.o.d(continuation2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                obj = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (invokeSuspend == pz5.a.f359186d) {
                return;
            }
            obj = kotlin.Result.m521constructorimpl(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(continuation2 instanceof qz5.a)) {
                continuation2.resumeWith(obj);
                return;
            }
            continuation = continuation2;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Continuation at ");
        java.lang.Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb6.append(stackTraceElement);
        return sb6.toString();
    }

    public kotlin.coroutines.Continuation<jz5.f0> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        throw new java.lang.UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
