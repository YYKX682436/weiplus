package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class w5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f164736a;

    /* renamed from: b, reason: collision with root package name */
    public final int f164737b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.u5 f164738c;

    public w5(int i17, com.tencent.mm.plugin.sns.model.u5 u5Var) {
        this.f164736a = null;
        this.f164738c = null;
        this.f164737b = i17;
        this.f164736a = new java.util.HashMap();
        this.f164738c = u5Var;
    }

    public void a() {
        java.lang.String str;
        java.util.Iterator it;
        boolean z17;
        boolean z18;
        android.graphics.Bitmap bitmap;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        com.tencent.mm.plugin.sns.model.w5 w5Var = this;
        java.lang.String str2 = "tryToRecycle";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryToRecycle", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
        java.util.HashMap hashMap = (java.util.HashMap) w5Var.f164736a;
        int size = hashMap.size();
        int i17 = w5Var.f164737b;
        if (size > i17) {
            java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.entrySet());
            java.util.Collections.sort(arrayList, new com.tencent.mm.plugin.sns.model.t5(w5Var));
            int size2 = hashMap.size() - i17;
            if (size2 <= 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryToRecycle", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                return;
            }
            java.util.Iterator it6 = arrayList.iterator();
            int i18 = size2;
            while (it6.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
                java.lang.Object key = entry.getKey();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("remove", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                com.tencent.mm.plugin.sns.model.r1 r1Var = (com.tencent.mm.plugin.sns.model.r1) w5Var.f164738c;
                r1Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeObj", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$3");
                java.lang.String str3 = (java.lang.String) key;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                com.tencent.mm.plugin.sns.model.i1 i1Var = r1Var.f164623a;
                i1Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkRecycle", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = i1Var.f164260i;
                if (copyOnWriteArraySet == null || copyOnWriteArraySet.size() == 0) {
                    it = it6;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkRecycle", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                } else {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) i1Var.f164256e;
                    java.util.Iterator it7 = concurrentHashMap2.keySet().iterator();
                    while (it7.hasNext()) {
                        int intValue = ((java.lang.Integer) it7.next()).intValue();
                        java.util.Iterator it8 = it6;
                        if (((java.lang.ref.WeakReference) concurrentHashMap2.get(java.lang.Integer.valueOf(intValue))).get() == null) {
                            java.util.Iterator it9 = copyOnWriteArraySet.iterator();
                            while (it9.hasNext()) {
                                java.util.Iterator it10 = it9;
                                com.tencent.mm.plugin.sns.model.b2 b2Var = (com.tencent.mm.plugin.sns.model.b2) it9.next();
                                concurrentHashMap = concurrentHashMap2;
                                if (b2Var.f164086b == intValue) {
                                    copyOnWriteArraySet.remove(b2Var);
                                    break;
                                } else {
                                    concurrentHashMap2 = concurrentHashMap;
                                    it9 = it10;
                                }
                            }
                        }
                        concurrentHashMap = concurrentHashMap2;
                        it6 = it8;
                        concurrentHashMap2 = concurrentHashMap;
                    }
                    it = it6;
                    java.util.Iterator it11 = copyOnWriteArraySet.iterator();
                    while (it11.hasNext()) {
                        com.tencent.mm.plugin.sns.model.b2 b2Var2 = (com.tencent.mm.plugin.sns.model.b2) it11.next();
                        if (str3 != null) {
                            b2Var2.getClass();
                            java.util.Iterator it12 = it11;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
                            if (str3.equals(b2Var2.f164085a)) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkRecycle", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                                z17 = false;
                                break;
                            }
                            it11 = it12;
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkRecycle", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                }
                z17 = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                if (z17) {
                    java.util.Map map = com.tencent.mm.plugin.sns.model.i1.a(i1Var).f164736a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("forceRemove", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                    try {
                        java.lang.Object obj = ((com.tencent.mm.plugin.sns.model.v5) ((java.util.HashMap) map).get(str3)).f164720a;
                        if (obj instanceof android.graphics.Bitmap) {
                            bitmap = (android.graphics.Bitmap) obj;
                        } else {
                            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((com.tencent.mm.plugin.sns.model.v5) ((java.util.HashMap) map).get(str3)).f164720a;
                            bitmap = weakReference != null ? (android.graphics.Bitmap) weakReference.get() : null;
                        }
                        if (bitmap != null && !bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                        str = str2;
                    } catch (java.lang.Exception e17) {
                        str = str2;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsLRUMap", e17, "", new java.lang.Object[0]);
                        com.tencent.mars.xlog.Log.e("MicroMsg.SnsLRUMap", "can not recycled forceRemove ");
                    }
                    java.util.HashMap hashMap2 = (java.util.HashMap) map;
                    hashMap2.size();
                    hashMap2.remove(str3);
                    hashMap2.size();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("forceRemove", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("keys ");
                    sb6.append(str3);
                    sb6.append(" deRef ok  Big:size:");
                    com.tencent.mm.plugin.sns.model.w5 a17 = com.tencent.mm.plugin.sns.model.i1.a(i1Var);
                    a17.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSize", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                    int size3 = ((java.util.HashMap) a17.f164736a).size();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSize", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                    sb6.append(size3);
                    sb6.append(" listPaitSize:");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    sb6.append(copyOnWriteArraySet.size());
                    com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", sb6.toString());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeObj", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$3");
                    z18 = true;
                } else {
                    str = str2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeObj", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$3");
                    z18 = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remove", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                if (z18) {
                    java.util.Objects.toString(entry.getKey());
                    i18--;
                }
                if (i18 <= 0) {
                    break;
                }
                w5Var = this;
                str2 = str;
                it6 = it;
            }
        }
        str = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.model.SnsLRUMap");
    }

    public void b(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
        java.util.Map map = this.f164736a;
        if (((com.tencent.mm.plugin.sns.model.v5) ((java.util.HashMap) map).get(obj)) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insert", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
            ((java.util.HashMap) map).put(obj, new com.tencent.mm.plugin.sns.model.v5(this, obj2));
            a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insert", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
        } else {
            ((com.tencent.mm.plugin.sns.model.v5) ((java.util.HashMap) map).get(obj)).a();
            ((com.tencent.mm.plugin.sns.model.v5) ((java.util.HashMap) map).get(obj)).f164720a = obj2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
    }
}
