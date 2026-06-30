package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.l0 f207698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.o5 f207699e;

    public g5(xg3.l0 l0Var, com.tencent.mm.ui.conversation.o5 o5Var) {
        this.f207698d = l0Var;
        this.f207699e = o5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xg3.l0 l0Var = this.f207698d;
        if (l0Var != null) {
            java.lang.String str = l0Var.f454411b;
            boolean b17 = kotlin.jvm.internal.o.b(str, "insert");
            java.util.ArrayList arrayList = l0Var.f454412c;
            com.tencent.mm.ui.conversation.o5 o5Var = this.f207699e;
            if (b17) {
                int size = arrayList.size();
                for (int i17 = 0; i17 < size; i17++) {
                    com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) arrayList.get(i17);
                    if (f9Var != null) {
                        com.tencent.mm.ui.conversation.o5.a(o5Var, l0Var, f9Var, true);
                    }
                }
                return;
            }
            if (kotlin.jvm.internal.o.b(str, "update")) {
                int size2 = arrayList.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) arrayList.get(i18);
                    if (f9Var2 != null) {
                        com.tencent.mm.ui.conversation.o5.a(o5Var, l0Var, f9Var2, false);
                    }
                }
            }
        }
    }
}
