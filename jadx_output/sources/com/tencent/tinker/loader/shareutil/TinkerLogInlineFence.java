package com.tencent.tinker.loader.shareutil;

/* loaded from: classes13.dex */
final class TinkerLogInlineFence extends android.os.Handler {
    private static final java.lang.String TAG = "Tinker.TinkerLogInlineFence";

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f215551a = 0;
    private static final android.os.Handler mainThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private static final java.util.List<java.lang.Object[]> pendingLogs = new java.util.ArrayList();

    private static void dummyThrowExceptionMethod() {
        if (com.tencent.tinker.loader.shareutil.TinkerLogInlineFence.class.isPrimitive()) {
            throw new java.lang.RuntimeException();
        }
    }

    private void handleMessageImpl(android.os.Message message) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp defaultImpl = com.tencent.tinker.loader.shareutil.ShareTinkerLog.getDefaultImpl();
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp impl = com.tencent.tinker.loader.shareutil.ShareTinkerLog.getImpl();
        int i17 = message.what;
        if (i17 == 2) {
            java.lang.Object[] objArr = (java.lang.Object[]) message.obj;
            if (impl != null) {
                impl.v((java.lang.String) objArr[2], (java.lang.String) objArr[3], (java.lang.Object[]) objArr[4]);
            }
            if (impl == null || impl == defaultImpl) {
                java.util.List<java.lang.Object[]> list = pendingLogs;
                synchronized (list) {
                    list.add(objArr);
                }
                return;
            }
            return;
        }
        if (i17 == 3) {
            java.lang.Object[] objArr2 = (java.lang.Object[]) message.obj;
            if (impl != null) {
                impl.d((java.lang.String) objArr2[2], (java.lang.String) objArr2[3], (java.lang.Object[]) objArr2[4]);
            }
            if (impl == null || impl == defaultImpl) {
                java.util.List<java.lang.Object[]> list2 = pendingLogs;
                synchronized (list2) {
                    list2.add(objArr2);
                }
                return;
            }
            return;
        }
        if (i17 == 4) {
            java.lang.Object[] objArr3 = (java.lang.Object[]) message.obj;
            if (impl != null) {
                impl.i((java.lang.String) objArr3[2], (java.lang.String) objArr3[3], (java.lang.Object[]) objArr3[4]);
            }
            if (impl == null || impl == defaultImpl) {
                java.util.List<java.lang.Object[]> list3 = pendingLogs;
                synchronized (list3) {
                    list3.add(objArr3);
                }
                return;
            }
            return;
        }
        if (i17 == 5) {
            java.lang.Object[] objArr4 = (java.lang.Object[]) message.obj;
            if (impl != null) {
                impl.w((java.lang.String) objArr4[2], (java.lang.String) objArr4[3], (java.lang.Object[]) objArr4[4]);
            }
            if (impl == null || impl == defaultImpl) {
                java.util.List<java.lang.Object[]> list4 = pendingLogs;
                synchronized (list4) {
                    list4.add(objArr4);
                }
                return;
            }
            return;
        }
        if (i17 == 6) {
            java.lang.Object[] objArr5 = (java.lang.Object[]) message.obj;
            if (impl != null) {
                impl.e((java.lang.String) objArr5[2], (java.lang.String) objArr5[3], (java.lang.Object[]) objArr5[4]);
            }
            if (impl == null || impl == defaultImpl) {
                java.util.List<java.lang.Object[]> list5 = pendingLogs;
                synchronized (list5) {
                    list5.add(objArr5);
                }
                return;
            }
            return;
        }
        if (i17 != 4001) {
            if (i17 == 4002) {
                printPendingLogs(impl);
                return;
            }
            impl.e(TAG, "[-] Bad msg id: " + message.what, new java.lang.Object[0]);
            return;
        }
        java.lang.Object[] objArr6 = (java.lang.Object[]) message.obj;
        if (impl != null) {
            impl.printErrStackTrace((java.lang.String) objArr6[2], (java.lang.Throwable) objArr6[3], (java.lang.String) objArr6[4], (java.lang.Object[]) objArr6[5]);
        }
        if (impl == null || impl == defaultImpl) {
            java.util.List<java.lang.Object[]> list6 = pendingLogs;
            synchronized (list6) {
                list6.add(objArr6);
            }
        }
    }

    private void handleMessage_$noinline$(android.os.Message message) {
        try {
            dummyThrowExceptionMethod();
        } finally {
            handleMessageImpl(message);
        }
    }

    private static void printPendingLogs(final com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp tinkerLogImp) {
        java.util.List<java.lang.Object[]> list = pendingLogs;
        synchronized (list) {
            if (tinkerLogImp != null) {
                if (!list.isEmpty()) {
                    new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.tinker.loader.shareutil.TinkerLogInlineFence.1
                        @Override // java.lang.Runnable
                        public void run() {
                            final java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.ENGLISH);
                            synchronized (com.tencent.tinker.loader.shareutil.TinkerLogInlineFence.pendingLogs) {
                                for (final java.lang.Object[] objArr : com.tencent.tinker.loader.shareutil.TinkerLogInlineFence.pendingLogs) {
                                    com.tencent.tinker.loader.shareutil.TinkerLogInlineFence.mainThreadHandler.post(new java.lang.Runnable() { // from class: com.tencent.tinker.loader.shareutil.TinkerLogInlineFence.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            java.lang.String str = "[PendingLog @ " + simpleDateFormat.format(new java.util.Date(((java.lang.Long) objArr[1]).longValue())) + "] ";
                                            int intValue = ((java.lang.Integer) objArr[0]).intValue();
                                            if (intValue == 2) {
                                                com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp.this.v((java.lang.String) objArr[2], str + ((java.lang.String) objArr[3]), (java.lang.Object[]) objArr[4]);
                                                return;
                                            }
                                            if (intValue == 3) {
                                                com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp.this.d((java.lang.String) objArr[2], str + ((java.lang.String) objArr[3]), (java.lang.Object[]) objArr[4]);
                                                return;
                                            }
                                            if (intValue == 4) {
                                                com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp.this.i((java.lang.String) objArr[2], str + ((java.lang.String) objArr[3]), (java.lang.Object[]) objArr[4]);
                                                return;
                                            }
                                            if (intValue == 5) {
                                                com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp.this.w((java.lang.String) objArr[2], str + ((java.lang.String) objArr[3]), (java.lang.Object[]) objArr[4]);
                                                return;
                                            }
                                            if (intValue == 6) {
                                                com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp.this.e((java.lang.String) objArr[2], str + ((java.lang.String) objArr[3]), (java.lang.Object[]) objArr[4]);
                                                return;
                                            }
                                            if (intValue != 4001) {
                                                return;
                                            }
                                            com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp tinkerLogImp2 = com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp.this;
                                            java.lang.Object[] objArr2 = objArr;
                                            tinkerLogImp2.printErrStackTrace((java.lang.String) objArr2[2], (java.lang.Throwable) objArr2[3], str + ((java.lang.String) objArr[4]), (java.lang.Object[]) objArr[5]);
                                        }
                                    });
                                }
                                com.tencent.tinker.loader.shareutil.TinkerLogInlineFence.pendingLogs.clear();
                            }
                        }
                    }, "tinker_log_printer").start();
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        handleMessage_$noinline$(message);
    }
}
