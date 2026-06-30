package gi;

/* loaded from: classes12.dex */
public final class c extends wh.s {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f271991a = jz5.h.a(jz5.i.f302829d, gi.b.f271987d);

    public static final boolean e(java.lang.String stack) {
        kotlin.jvm.internal.o.g(stack, "stack");
        if (r26.i0.y(stack, "Java ", false) || r26.i0.y(stack, "Java\n", false)) {
            return true;
        }
        return wh.j0.f445808g.a(stack, 3);
    }

    public static final boolean f(java.lang.String stack) {
        kotlin.jvm.internal.o.g(stack, "stack");
        if (r26.i0.y(stack, "Native ", false) || r26.i0.y(stack, "Native\n", false)) {
            return true;
        }
        return wh.j0.f445808g.b(stack, 3);
    }

    @Override // wh.s
    public java.lang.String a(int i17) {
        java.lang.String a17 = super.a(i17);
        if (!android.text.TextUtils.isEmpty(a17)) {
            kotlin.jvm.internal.o.d(a17);
            return d("Java", a17);
        }
        if (com.tencent.matrix.hook.junwind.JUnwindJni.e(false, 1, null)) {
            java.lang.String f17 = com.tencent.matrix.hook.junwind.JUnwindJni.f(i17, null, false, null, 14, null);
            if (!android.text.TextUtils.isEmpty(f17)) {
                kotlin.jvm.internal.o.d(f17);
                return d("Java", f17);
            }
        }
        if (!com.tencent.wxperf.thread.ThreadInspect.init()) {
            return "";
        }
        java.lang.String localCurrentThread = i17 == android.os.Process.myTid() ? com.tencent.wxperf.thread.ThreadInspect.getLocalCurrentThread() : com.tencent.wxperf.thread.ThreadInspect.getLocalThread(i17);
        if (android.text.TextUtils.isEmpty(localCurrentThread)) {
            return "";
        }
        kotlin.jvm.internal.o.d(localCurrentThread);
        return d("Native", localCurrentThread);
    }

    @Override // wh.s
    public boolean c(java.lang.String str) {
        if (str == null) {
            return false;
        }
        if (r26.i0.y(str, "Java ", false) || r26.i0.y(str, "Java\n", false) || r26.i0.y(str, "Native ", false) || r26.i0.y(str, "Native\n", false)) {
            return true;
        }
        return super.c(str);
    }

    public final java.lang.String d(java.lang.String str, java.lang.String str2) {
        if (c(str2)) {
            return str + ' ' + str2;
        }
        return str + '\n' + str2;
    }
}
