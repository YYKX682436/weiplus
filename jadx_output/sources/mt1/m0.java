package mt1;

/* loaded from: classes12.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final mt1.m0 f331240d = new mt1.m0();

    public m0() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Throwable th6;
        ((java.lang.Number) obj).intValue();
        ot1.j storage = (ot1.j) obj2;
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = (com.tencent.wcdb.support.CancellationSignal) obj3;
        kotlin.jvm.internal.o.g(storage, "storage");
        long b27 = storage.b2(7, -1L);
        long b28 = storage.b2(8, -1L);
        int i17 = 0;
        java.lang.Throwable th7 = null;
        if (b28 < 0) {
            android.database.Cursor f17 = storage.f348849d.f("SELECT max(rowId) FROM WxFileIndex3", null, 0);
            storage.f3(8, f17);
            if (f17.moveToFirst()) {
                b28 = f17.getLong(0);
            }
            f17.close();
        }
        java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue = new java.util.concurrent.ArrayBlockingQueue(32, true);
        java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue2 = new java.util.concurrent.ArrayBlockingQueue(32, false);
        for (int i18 = 1; i18 < 33; i18++) {
            arrayBlockingQueue2.add(new mt1.k0(null, 0L, 0L, 7, null));
        }
        wu5.c a17 = ((ku5.t0) ku5.t0.f312615d).a(new mt1.l0(storage, arrayBlockingQueue, arrayBlockingQueue2));
        try {
            int i19 = 2;
            android.database.Cursor V = storage.f348849d.V("SELECT DISTINCT rowId, msgId, username FROM WxFileIndex3 WHERE rowId > ? AND rowId <= ? ORDER BY rowId", new java.lang.String[]{java.lang.String.valueOf(b27), java.lang.String.valueOf(b28)}, cancellationSignal);
            int i27 = 0;
            while (V.moveToNext()) {
                try {
                    long j17 = V.getLong(i17);
                    long j18 = V.getLong(1);
                    java.lang.String string = V.getString(i19);
                    i27++;
                    if (pt0.f0.f358209b1.n(string, j18).A0() == 1) {
                        java.lang.Object take = arrayBlockingQueue2.take();
                        mt1.k0 k0Var = (mt1.k0) take;
                        kotlin.jvm.internal.o.d(string);
                        k0Var.getClass();
                        k0Var.f331233a = string;
                        k0Var.f331234b = j18;
                        k0Var.f331235c = j17;
                        arrayBlockingQueue.put(take);
                    }
                    if ((i27 & 127) == 0) {
                        try {
                            java.lang.Object take2 = arrayBlockingQueue2.take();
                            mt1.k0 k0Var2 = (mt1.k0) take2;
                            k0Var2.getClass();
                            k0Var2.f331233a = "";
                            k0Var2.f331234b = 0L;
                            k0Var2.f331235c = j17;
                            arrayBlockingQueue.put(take2);
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            b27 = j17;
                            th6 = th;
                            try {
                                throw th6;
                            } finally {
                                vz5.b.a(V, th6);
                            }
                        }
                    }
                    b27 = j17;
                    i19 = 2;
                    i17 = 0;
                    th7 = null;
                } catch (java.lang.Throwable th9) {
                    th = th9;
                }
            }
            th6 = th7;
            java.lang.Object take3 = arrayBlockingQueue2.take();
            mt1.k0 k0Var3 = (mt1.k0) take3;
            k0Var3.getClass();
            k0Var3.f331233a = "";
            k0Var3.f331234b = 1L;
            k0Var3.f331235c = b27;
            arrayBlockingQueue.put(take3);
            a17.get();
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th10) {
            java.lang.Object take4 = arrayBlockingQueue2.take();
            mt1.k0 k0Var4 = (mt1.k0) take4;
            k0Var4.getClass();
            k0Var4.f331233a = "";
            k0Var4.f331234b = 1L;
            k0Var4.f331235c = b27;
            arrayBlockingQueue.put(take4);
            a17.get();
            throw th10;
        }
    }
}
