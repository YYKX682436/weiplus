package jh;

/* loaded from: classes7.dex */
public final class v implements android.os.Handler.Callback {
    public v(jh.u uVar) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what == 1) {
            oj.j.c("Matrix.WarmUpService", "Suicide.", new java.lang.Object[0]);
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/backtrace/WarmUpService$RecyclerCallback", "handleMessage", "(Landroid/os/Message;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/matrix/backtrace/WarmUpService$RecyclerCallback", "handleMessage", "(Landroid/os/Message;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/matrix/backtrace/WarmUpService$RecyclerCallback", "handleMessage", "(Landroid/os/Message;)Z", "java/lang/System_EXEC_", "exit", "(I)V");
            java.lang.System.exit(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(obj2, "com/tencent/matrix/backtrace/WarmUpService$RecyclerCallback", "handleMessage", "(Landroid/os/Message;)Z", "java/lang/System_EXEC_", "exit", "(I)V");
        }
        return false;
    }
}
