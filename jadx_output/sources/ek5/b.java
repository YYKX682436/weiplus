package ek5;

/* loaded from: classes.dex */
public abstract class b {
    public boolean a(int i17, boolean z17, boolean z18) {
        return i().contains(java.lang.Integer.valueOf(i17));
    }

    public boolean b(int i17, boolean z17, boolean z18) {
        return j().contains(java.lang.Integer.valueOf(i17));
    }

    public android.content.Intent c(android.content.Context context, int i17, java.lang.String content, android.content.Intent retransmitIntent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(retransmitIntent, "retransmitIntent");
        return ((qd0.q0) ((rd0.e1) i95.n0.c(rd0.e1.class))).Ui(context, retransmitIntent.getBooleanExtra("Multi_Retr", retransmitIntent.getIntExtra("Retr_Scene", 0) == 0), false, !kz5.c0.i(30, 33, 37).contains(java.lang.Integer.valueOf(i17)));
    }

    public co.a d(android.content.Intent intent, n50.i param) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(param, "param");
        return null;
    }

    public abstract java.lang.Class e();

    public abstract java.lang.Class f();

    public int g() {
        return 0;
    }

    public abstract java.lang.Class h();

    public java.util.List i() {
        return kz5.p0.f313996d;
    }

    public java.util.List j() {
        return kz5.p0.f313996d;
    }

    public void k(android.content.Intent retransmitIntent) {
        kotlin.jvm.internal.o.g(retransmitIntent, "retransmitIntent");
    }
}
