package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes.dex */
public abstract class r8 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f191881a = new java.util.ArrayList();

    public static void a(com.tencent.mm.pluginsdk.ui.tools.q8 q8Var) {
        if (q8Var != null) {
            q8Var.getName();
            java.util.List list = f191881a;
            if (((java.util.ArrayList) list).contains(q8Var)) {
                return;
            }
            ((java.util.ArrayList) list).add(q8Var);
        }
    }
}
