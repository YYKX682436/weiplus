package xh3;

/* loaded from: classes12.dex */
public final class h implements xh3.c {

    /* renamed from: a, reason: collision with root package name */
    public xh3.d f454579a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f454580b = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f454581c = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f454582d = new java.util.concurrent.CopyOnWriteArrayList();

    public static final boolean a(xh3.h hVar, java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.Object obj;
        hVar.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.w("MMMarsTaskDistributor", str2 + " by jni " + str3 + " return for invalid mediaId:" + str);
            return false;
        }
        if (!list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = hVar.f454582d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((xh3.f) obj).f454576a, str)) {
                break;
            }
        }
        xh3.f fVar = (xh3.f) obj;
        if (fVar == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.w("MMMarsTaskDistributor", str2 + " by jni " + str3 + " return for not containsKey task:" + fVar.f454577b + " msg:" + str4);
        return false;
    }

    public boolean b(xh3.b task) {
        java.lang.String str;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(task, "task");
        if (!(task instanceof yh3.d)) {
            com.tencent.mars.xlog.Log.w("MMMarsTaskDistributor", "cancelTask failed for unknown task:" + task);
            return true;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f454581c;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = task.f454572h;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((yh3.d) obj).f454572h, str)) {
                break;
            }
        }
        if (((yh3.d) obj) != null) {
            copyOnWriteArrayList.remove(task);
            com.tencent.mars.xlog.Log.i("MMMarsTaskDistributor", "cancelTask success for download task:" + task);
            return true;
        }
        com.tencent.mars.xlog.Log.w("MMMarsTaskDistributor", "cancelTask failed for null download taskId:" + str + " task:" + task);
        return false;
    }

    public java.util.List c(java.lang.String str) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.w("MMMarsTaskDistributor", "getDownloadTaskListByMediaId failed for mediaId:NULL");
            return copyOnWriteArrayList;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = this.f454581c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : copyOnWriteArrayList2) {
            if (kotlin.jvm.internal.o.b(((yh3.d) obj).f454571g, str)) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            copyOnWriteArrayList.add((yh3.d) it.next());
        }
        return copyOnWriteArrayList;
    }

    public java.util.List d(java.lang.String str) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.w("MMMarsTaskDistributor", "getPreloadTaskListByMediaId failed for mediaId:NULL");
            return copyOnWriteArrayList;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = this.f454580b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = copyOnWriteArrayList2.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            android.support.v4.media.f.a(it6.next());
            copyOnWriteArrayList.add(null);
        }
        return copyOnWriteArrayList;
    }

    public boolean e(xh3.b task) {
        java.lang.String str;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(task, "task");
        if (task instanceof yh3.d) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f454581c;
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str = task.f454572h;
                if (!hasNext) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((yh3.d) obj).f454572h, str)) {
                    break;
                }
            }
            if (((yh3.d) obj) != null) {
                com.tencent.mars.xlog.Log.w("MMMarsTaskDistributor", "submitTask failed for duplicated download task:" + task);
                return false;
            }
            java.util.List d17 = d(task.f454571g);
            java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArrayList) d17).iterator();
            while (it6.hasNext()) {
                kotlin.jvm.internal.m0.a(this.f454580b).remove((xh3.b) it6.next());
            }
            if (!r6.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MMMarsTaskDistributor", "submitTask remove same preload task:" + task + " list:" + d17);
            }
            copyOnWriteArrayList.add(task);
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = this.f454582d;
            if (copyOnWriteArrayList2.size() > 200) {
                copyOnWriteArrayList2.remove(0);
            }
            copyOnWriteArrayList2.add(new xh3.f(str, task.toString()));
            com.tencent.mars.xlog.Log.w("MMMarsTaskDistributor", "submitTask success for download task:" + task + " size:" + copyOnWriteArrayList.size() + " downloading:[" + copyOnWriteArrayList + ']');
        } else {
            com.tencent.mars.xlog.Log.w("MMMarsTaskDistributor", "submitTask failed for unknown task:" + task);
        }
        return true;
    }
}
