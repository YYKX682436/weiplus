package g63;

/* loaded from: classes8.dex */
public final class c0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.f0 f269096d;

    public c0(g63.f0 f0Var) {
        this.f269096d = f0Var;
    }

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("GameLife.ConversationPresenter", "onGameLifeContactStorageChange eventId:[%d]", java.lang.Integer.valueOf(w0Var.f316974b));
        if (w0Var.f316974b == 3) {
            java.lang.Object obj = w0Var.f316976d;
            g63.f0 f0Var = this.f269096d;
            f0Var.getClass();
            if (obj instanceof java.lang.String) {
                if (((java.lang.CharSequence) obj).length() > 0) {
                    java.util.LinkedList linkedList = f0Var.f269107b.f269130g;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : linkedList) {
                        z53.i iVar = (z53.i) obj2;
                        if (kotlin.jvm.internal.o.b(iVar.field_selfUserName, obj) || kotlin.jvm.internal.o.b(iVar.field_talker, obj)) {
                            arrayList.add(obj2);
                        }
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        z53.i iVar2 = (z53.i) it.next();
                        com.tencent.mars.xlog.Log.i("GameLife.ConversationPresenter", "[onContactStorageChange] username=" + obj);
                        u45.f a17 = u45.e.a();
                        if (a17 != null) {
                            va3.m0 m0Var = (va3.m0) a17;
                            m0Var.wi(iVar2.field_sessionId);
                            m0Var.wi(iVar2.field_selfUserName);
                        }
                        z53.o.f470261a.b(iVar2, new g63.w(f0Var));
                    }
                }
            }
        }
    }
}
