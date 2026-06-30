package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public final class s8 {
    public s8(com.tencent.mm.sdk.platformtools.o8 o8Var) {
    }

    public static void a(com.tencent.mm.sdk.platformtools.s8 s8Var, java.lang.Throwable th6, com.tencent.mm.sdk.platformtools.r8 r8Var) {
        s8Var.getClass();
        java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
        newSetFromMap.add(th6);
        com.tencent.mm.sdk.platformtools.p8 p8Var = (com.tencent.mm.sdk.platformtools.p8) r8Var;
        p8Var.a(java.lang.String.valueOf(th6));
        java.lang.StackTraceElement[] stackTrace = th6.getStackTrace();
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            p8Var.a("\tat " + stackTraceElement);
        }
        for (java.lang.Throwable th7 : th6.getSuppressed()) {
            s8Var.b(th7, stackTrace, "Suppressed: ", "\t", newSetFromMap, p8Var);
        }
        java.lang.Throwable cause = th6.getCause();
        if (cause != null) {
            s8Var.b(cause, stackTrace, "Caused by: ", "", newSetFromMap, p8Var);
        }
    }

    public final void b(java.lang.Throwable th6, java.lang.StackTraceElement[] stackTraceElementArr, java.lang.String str, java.lang.String str2, java.util.Set set, com.tencent.mm.sdk.platformtools.r8 r8Var) {
        if (set.contains(th6)) {
            ((com.tencent.mm.sdk.platformtools.p8) r8Var).a("\t[CIRCULAR REFERENCE:" + th6 + "]");
            return;
        }
        set.add(th6);
        java.lang.StackTraceElement[] stackTrace = th6.getStackTrace();
        int length = stackTrace.length - 1;
        for (int length2 = stackTraceElementArr.length - 1; length >= 0 && length2 >= 0 && stackTrace[length].equals(stackTraceElementArr[length2]); length2--) {
            length--;
        }
        int length3 = (stackTrace.length - 1) - length;
        com.tencent.mm.sdk.platformtools.p8 p8Var = (com.tencent.mm.sdk.platformtools.p8) r8Var;
        p8Var.a(str2 + str + th6);
        for (int i17 = 0; i17 <= length; i17++) {
            p8Var.a(str2 + "\tat " + stackTrace[i17]);
        }
        if (length3 != 0) {
            p8Var.a(str2 + "\t... " + length3 + " more");
        }
        for (java.lang.Throwable th7 : th6.getSuppressed()) {
            b(th7, stackTrace, "Suppressed: ", str2 + "\t", set, p8Var);
        }
        java.lang.Throwable cause = th6.getCause();
        if (cause != null) {
            b(cause, stackTrace, "Caused by: ", str2, set, p8Var);
        }
    }
}
