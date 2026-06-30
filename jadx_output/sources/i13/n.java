package i13;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final i13.l f287297c = new i13.l(null);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f287298d = jz5.h.b(i13.k.f287295d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f287299a = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f287300b = new java.util.HashSet();

    public n(kotlin.jvm.internal.i iVar) {
    }

    public final void a(i13.c item) {
        kotlin.jvm.internal.o.g(item, "item");
        java.util.HashSet hashSet = this.f287300b;
        java.lang.String str = item.f287275d;
        if (!hashSet.contains(str)) {
            this.f287299a.offer(item);
            hashSet.add(str);
        } else {
            com.tencent.mars.xlog.Log.i("ForceNotifyItemMgr", "add info failed, historyIdSet contains " + str);
        }
    }
}
