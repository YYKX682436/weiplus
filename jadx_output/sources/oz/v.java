package oz;

/* loaded from: classes12.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.o4 f350196c;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.storage.x9 f350194a = new com.tencent.mm.storage.x9();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f350195b = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f350197d = "tasks";

    public final void a(long j17, java.lang.String talker, boolean z17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        java.util.LinkedList taskList = this.f350194a.f196336d;
        kotlin.jvm.internal.o.f(taskList, "taskList");
        boolean z18 = false;
        if (!taskList.isEmpty()) {
            java.util.Iterator it = taskList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.storage.y9 y9Var = (com.tencent.mm.storage.y9) it.next();
                if (y9Var.f196384d == j17 && kotlin.jvm.internal.o.b(y9Var.f196387g, talker)) {
                    z18 = true;
                    break;
                }
            }
        }
        if (z18) {
            return;
        }
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(j17, talker);
        java.util.LinkedHashMap linkedHashMap = this.f350195b;
        if (linkedHashMap.containsKey(msgIdTalker)) {
            return;
        }
        com.tencent.mm.storage.y9 y9Var2 = new com.tencent.mm.storage.y9();
        y9Var2.f196384d = j17;
        y9Var2.f196387g = talker;
        y9Var2.f196386f = com.tencent.mm.sdk.platformtools.t8.i1();
        if (z17) {
            this.f350194a.f196336d.add(y9Var2);
            d();
        } else {
            linkedHashMap.put(msgIdTalker, y9Var2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoDownloadTaskQueue", "add: done, msgId=" + j17 + ", talker=" + talker + ", isPersistent=" + z17 + ", persistentCount=" + this.f350194a.f196336d.size() + ", nonPersistentCount=" + linkedHashMap.size());
    }

    public final void b(com.tencent.mm.plugin.msg.MsgIdTalker idTalker) {
        kotlin.jvm.internal.o.g(idTalker, "idTalker");
        java.util.Iterator it = this.f350194a.f196336d.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (true) {
            boolean hasNext = it.hasNext();
            long j17 = idTalker.f149480d;
            if (!hasNext) {
                java.util.LinkedHashMap linkedHashMap = this.f350195b;
                if (linkedHashMap.remove(idTalker) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AutoDownloadTaskQueue", "remove: done (non-persistent), msgId=" + j17 + ", talker=" + idTalker.a() + ", nonPersistentCount=" + linkedHashMap.size());
                    return;
                }
                return;
            }
            com.tencent.mm.storage.y9 y9Var = (com.tencent.mm.storage.y9) it.next();
            if (y9Var.f196384d == j17 && kotlin.jvm.internal.o.b(y9Var.f196387g, idTalker.a())) {
                it.remove();
                d();
                com.tencent.mars.xlog.Log.i("MicroMsg.AutoDownloadTaskQueue", "remove: done (persistent), msgId=" + y9Var.f196384d + ", talker=" + y9Var.f196387g + ", persistentCount=" + this.f350194a.f196336d.size());
                return;
            }
        }
    }

    public final void c(com.tencent.mm.storage.y9 task) {
        kotlin.jvm.internal.o.g(task, "task");
        if (this.f350194a.f196336d.remove(task)) {
            d();
        } else {
            this.f350195b.remove(new com.tencent.mm.plugin.msg.MsgIdTalker(task.f196384d, task.f196387g));
        }
    }

    public final void d() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f350196c;
        if (o4Var == null) {
            return;
        }
        try {
            if (o4Var.H(this.f350197d, this.f350194a.toByteArray())) {
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.AutoDownloadTaskQueue", "save: mmkvEncodeFailed, key=" + this.f350197d + ", taskCount=" + this.f350194a.f196336d.size());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AutoDownloadTaskQueue", "save: failed, key=" + this.f350197d + ", error=" + e17);
        }
    }
}
