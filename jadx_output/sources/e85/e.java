package e85;

/* loaded from: classes10.dex */
public final class e implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public static final e85.e f250306d = new e85.e();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        d85.f0 f0Var;
        int i17;
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.LinkedList linkedList = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193186i;
        synchronized (linkedList) {
            d85.f0 f0Var2 = null;
            r5 = null;
            d85.f0 f0Var3 = null;
            f0Var2 = null;
            if (!(msg.obj instanceof e85.c)) {
                msg = null;
            }
            if (msg != null) {
                java.lang.Object obj = msg.obj;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.sensitive.business.BusinessStackRecorder.MsgData");
                e85.c cVar = (e85.c) obj;
                java.lang.String str = cVar.f250298a;
                e85.b bVar = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f;
                if (kotlin.jvm.internal.o.b(str, "com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER")) {
                    java.util.LinkedList linkedList2 = linkedList.contains(cVar) ^ true ? linkedList : null;
                    if (linkedList2 != null) {
                        linkedList2.add(cVar);
                    }
                    java.lang.String str2 = cVar.f250303f;
                    if ((str2.length() > 0) == false) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = (java.lang.String) com.tencent.mm.sensitive.business.BusinessStackRecorder.f193184g.get(cVar.f250299b);
                    }
                    if (str2 != null) {
                        try {
                            d85.f0[] values = d85.f0.values();
                            int length = values.length;
                            while (true) {
                                if (r9 >= length) {
                                    break;
                                }
                                d85.f0 f0Var4 = values[r9];
                                if (r26.i0.p(f0Var4.f227176d, str2, true)) {
                                    f0Var3 = f0Var4;
                                    break;
                                }
                                r9++;
                            }
                        } catch (java.lang.IllegalArgumentException unused) {
                        }
                        if (f0Var3 != null) {
                            cVar.f250304g = f0Var3;
                            com.tencent.mars.xlog.Log.i("BusinessStackRecorder", "enter business:" + f0Var3);
                            com.tencent.mm.sensitive.business.BusinessStackRecorder.f193187m.add(cVar);
                            e85.b.a(bVar);
                        }
                    }
                } else if (kotlin.jvm.internal.o.b(str, "com.tencent.mm.sensitive.SENSITIVE_PAGE_RESUME")) {
                    java.util.LinkedList linkedList3 = linkedList.contains(cVar) ^ true ? linkedList : null;
                    if (linkedList3 != null) {
                        linkedList3.add(cVar);
                    }
                    java.lang.String str3 = cVar.f250303f;
                    if ((str3.length() > 0) == false) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = (java.lang.String) com.tencent.mm.sensitive.business.BusinessStackRecorder.f193184g.get(cVar.f250299b);
                    }
                    if (str3 != null) {
                        try {
                            d85.f0[] values2 = d85.f0.values();
                            int length2 = values2.length;
                            for (int i18 = 0; i18 < length2; i18++) {
                                f0Var = values2[i18];
                                if (r26.i0.p(f0Var.f227176d, str3, true)) {
                                    break;
                                }
                            }
                        } catch (java.lang.IllegalArgumentException unused2) {
                        }
                        f0Var = null;
                        if (f0Var != null) {
                            cVar.f250304g = f0Var;
                            com.tencent.mars.xlog.Log.i("BusinessStackRecorder", "resume business:" + f0Var);
                            java.util.LinkedList linkedList4 = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193187m;
                            if (kotlin.jvm.internal.o.b(kz5.n0.k0(linkedList4), cVar)) {
                                java.util.ListIterator listIterator = linkedList4.listIterator(linkedList4.size());
                                while (true) {
                                    if (!listIterator.hasPrevious()) {
                                        i17 = -1;
                                        break;
                                    }
                                    if (kotlin.jvm.internal.o.b(((e85.c) listIterator.previous()).f250299b, cVar.f250299b)) {
                                        i17 = listIterator.nextIndex();
                                        break;
                                    }
                                }
                                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                                java.lang.Integer num = (valueOf.intValue() != -1 ? 1 : 0) != 0 ? valueOf : null;
                                if (num != null) {
                                    int intValue = num.intValue();
                                    e85.b bVar2 = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f;
                                    com.tencent.mars.xlog.Log.i("BusinessStackRecorder", "already exist，move to Top");
                                    java.util.LinkedList linkedList5 = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193187m;
                                    linkedList5.remove(intValue);
                                    linkedList5.add(cVar);
                                } else {
                                    e85.b bVar3 = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f;
                                    com.tencent.mars.xlog.Log.i("BusinessStackRecorder", "resume not exist，do nothing");
                                }
                            } else {
                                linkedList4.add(cVar);
                                e85.b.a(bVar);
                            }
                        }
                    }
                } else if (kotlin.jvm.internal.o.b(str, "com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT")) {
                    linkedList.remove(cVar);
                    java.lang.String str4 = cVar.f250303f;
                    if ((str4.length() > 0) == false) {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = (java.lang.String) com.tencent.mm.sensitive.business.BusinessStackRecorder.f193184g.get(cVar.f250299b);
                    }
                    if (str4 != null) {
                        try {
                            d85.f0[] values3 = d85.f0.values();
                            int length3 = values3.length;
                            while (true) {
                                if (r9 >= length3) {
                                    break;
                                }
                                d85.f0 f0Var5 = values3[r9];
                                if (r26.i0.p(f0Var5.f227176d, str4, true)) {
                                    f0Var2 = f0Var5;
                                    break;
                                }
                                r9++;
                            }
                        } catch (java.lang.IllegalArgumentException unused3) {
                        }
                        if (f0Var2 != null) {
                            com.tencent.mars.xlog.Log.i("BusinessStackRecorder", "exit business:" + f0Var2);
                            pm0.v.d0(com.tencent.mm.sensitive.business.BusinessStackRecorder.f193187m, new e85.d(cVar));
                            e85.b.a(bVar);
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("BusinessStackRecorder", "handle illegal msg, do nothing");
                }
            }
        }
        return true;
    }
}
