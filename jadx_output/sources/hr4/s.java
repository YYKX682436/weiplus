package hr4;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final hr4.q f284270a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f284271b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f284272c;

    public s(hr4.q onGetContact) {
        kotlin.jvm.internal.o.g(onGetContact, "onGetContact");
        this.f284270a = onGetContact;
        this.f284271b = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f284272c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final boolean a(java.lang.String str, java.lang.Boolean bool) {
        if (str == null) {
            return false;
        }
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f284271b;
        if (concurrentLinkedQueue.contains(str)) {
            return false;
        }
        concurrentLinkedQueue.add(str);
        if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            return true;
        }
        b();
        return true;
    }

    public final void b() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f284272c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f284271b;
        if (concurrentLinkedQueue.isEmpty()) {
            com.tencent.mars.xlog.Log.i("W1wPersonalMsg.W1wPersonalMsgContactLooper", "queue empty");
            atomicBoolean.set(false);
            this.f284270a.b();
            return;
        }
        int size = concurrentLinkedQueue.size();
        if (20 <= size) {
            size = 20;
        }
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.String str = (java.lang.String) concurrentLinkedQueue.poll();
            if (str != null) {
                linkedList.add(str);
            }
        }
        r45.cj3 cj3Var = new r45.cj3();
        for (java.lang.String str2 : linkedList) {
            r45.dj3 dj3Var = new r45.dj3();
            dj3Var.f372529d = str2;
            cj3Var.f371594d.add(dj3Var);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 29919;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/zhuge/get_personal_msg_contact_list";
        lVar.f70664a = cj3Var;
        lVar.f70665b = new r45.ej3();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mars.xlog.Log.i("W1wPersonalMsg.W1wPersonalMsgContactLooper", "need get profile contact list: " + linkedList);
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new hr4.r(linkedList, this));
    }
}
