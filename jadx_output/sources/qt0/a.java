package qt0;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f366490d;

    public a(yz5.a aVar) {
        this.f366490d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        boolean z18;
        boolean z19;
        l75.k0 k0Var;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) qt0.b.f366492b).iterator();
        loop0: while (true) {
            int i17 = 1;
            while (it.hasNext()) {
                qt0.e eVar = (qt0.e) it.next();
                eVar.getClass();
                j62.e g17 = j62.e.g();
                int i18 = com.tencent.mm.sdk.platformtools.z.f193112h;
                boolean l17 = g17.l(eVar.f366503h, (i18 == 788529167 || i18 == 788529166) || z65.c.a(), true, true);
                boolean z27 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) eVar.f366501f).getValue()).getBoolean(eVar.f366502g, false);
                if (!l17 || z27 || (k0Var = eVar.f366496a) == null) {
                    z18 = false;
                } else {
                    synchronized (k0Var) {
                        if (eVar.f366496a.G()) {
                            com.tencent.mars.xlog.Log.i(eVar.f366500e, "createIndex skip: inTransaction");
                            z18 = false;
                            z19 = false;
                        } else {
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            com.tencent.mars.xlog.Log.i(eVar.f366500e, "createIndex: ".concat(kz5.z.d0(eVar.f366497b, null, null, null, 0, null, qt0.d.f366495d, 31, null)));
                            long F = eVar.f366496a.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                            try {
                                for (java.lang.String str : eVar.f366497b) {
                                    eVar.f366496a.A(eVar.f366498c, str);
                                }
                                com.tencent.mars.xlog.Log.i(eVar.f366500e, "createIndex: execSQL done");
                                ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) eVar.f366501f).getValue()).putBoolean(eVar.f366502g, true);
                                if (F > 0) {
                                    eVar.f366496a.w(java.lang.Long.valueOf(F));
                                }
                                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                                com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
                                msgRefactorReportStruct.p("db_lazy_create_index");
                                msgRefactorReportStruct.r(eVar.f366498c);
                                msgRefactorReportStruct.s(r26.i0.t(kz5.z.d0(eVar.f366497b, ",", null, null, 0, null, null, 62, null), ",", ";", false));
                                msgRefactorReportStruct.t("");
                                msgRefactorReportStruct.f59285n = (int) currentTimeMillis2;
                                msgRefactorReportStruct.f59286o = 1;
                                msgRefactorReportStruct.q(com.tencent.mm.sdk.platformtools.z.f193109e);
                                msgRefactorReportStruct.k();
                                com.tencent.mars.xlog.Log.i(eVar.f366500e, "createIndex: costMs=" + currentTimeMillis2);
                                z27 = true;
                            } catch (java.lang.Throwable th6) {
                                try {
                                    com.tencent.mars.xlog.Log.printErrStackTrace(eVar.f366500e, th6, "createIndex: execSQL failed.", new java.lang.Object[0]);
                                    if (F > 0) {
                                        eVar.f366496a.w(java.lang.Long.valueOf(F));
                                    }
                                    long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                                    com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
                                    msgRefactorReportStruct2.p("db_lazy_create_index");
                                    msgRefactorReportStruct2.r(eVar.f366498c);
                                    msgRefactorReportStruct2.s(r26.i0.t(kz5.z.d0(eVar.f366497b, ",", null, null, 0, null, null, 62, null), ",", ";", false));
                                    java.lang.String message = th6.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    msgRefactorReportStruct2.t(message);
                                    msgRefactorReportStruct2.f59285n = (int) currentTimeMillis3;
                                    msgRefactorReportStruct2.f59286o = 0;
                                    msgRefactorReportStruct2.q(com.tencent.mm.sdk.platformtools.z.f193109e);
                                    msgRefactorReportStruct2.k();
                                    com.tencent.mars.xlog.Log.i(eVar.f366500e, "createIndex: costMs=" + currentTimeMillis3);
                                    z27 = false;
                                } catch (java.lang.Throwable th7) {
                                    if (F > 0) {
                                        eVar.f366496a.w(java.lang.Long.valueOf(F));
                                    }
                                    long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                                    com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
                                    msgRefactorReportStruct3.p("db_lazy_create_index");
                                    msgRefactorReportStruct3.r(eVar.f366498c);
                                    msgRefactorReportStruct3.s(r26.i0.t(kz5.z.d0(eVar.f366497b, ",", null, null, 0, null, null, 62, null), ",", ";", false));
                                    java.lang.String message2 = th6.getMessage();
                                    if (message2 == null) {
                                        message2 = "";
                                    }
                                    msgRefactorReportStruct3.t(message2);
                                    msgRefactorReportStruct3.f59285n = (int) currentTimeMillis4;
                                    if (!z27) {
                                        i17 = 0;
                                    }
                                    msgRefactorReportStruct3.f59286o = i17;
                                    msgRefactorReportStruct3.q(com.tencent.mm.sdk.platformtools.z.f193109e);
                                    msgRefactorReportStruct3.k();
                                    com.tencent.mars.xlog.Log.i(eVar.f366500e, "createIndex: costMs=" + currentTimeMillis4);
                                    throw th7;
                                }
                            }
                            z18 = false;
                        }
                    }
                    z17 = (z19 || !z17) ? z18 : true;
                }
                z19 = z27;
                if (z19) {
                }
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i(qt0.b.f366493c, "tryLazyCreateDbIndex done");
            yz5.a aVar = this.f366490d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }
}
