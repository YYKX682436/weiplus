package l85;

/* loaded from: classes12.dex */
public class a extends l85.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.service.CommonProcessService f317120d;

    public a(com.tencent.mm.service.CommonProcessService commonProcessService) {
        this.f317120d = commonProcessService;
    }

    @Override // l85.n0
    public void nb(final android.content.Intent intent) {
        com.tencent.mm.service.CommonProcessService commonProcessService = this.f317120d;
        if (intent != null) {
            com.tencent.mm.service.CommonProcessService.a(commonProcessService, java.lang.Boolean.valueOf(intent.getBooleanExtra("isTreadPool", false)), new java.lang.Runnable() { // from class: l85.a$$c
                @Override // java.lang.Runnable
                public final void run() {
                    l85.a aVar = l85.a.this;
                    aVar.getClass();
                    java.lang.ClassLoader classLoader = com.tencent.mm.service.CommonProcessService.class.getClassLoader();
                    android.content.Intent intent2 = intent;
                    intent2.setExtrasClassLoader(classLoader);
                    java.lang.String stringExtra = intent2.getStringExtra("class_name");
                    com.tencent.mm.service.MMService mMService = (com.tencent.mm.service.MMService) com.tencent.mm.service.CommonProcessService.f193198g.get(stringExtra);
                    if (mMService != null) {
                        mMService.a(intent2, "unbind");
                        l85.l1.a(54L, 1L, false);
                    }
                    com.tencent.mars.xlog.Log.i(aVar.f317120d.c(), "unbindService() class_name = %s", stringExtra);
                }
            });
        } else {
            com.tencent.mars.xlog.Log.i(commonProcessService.c(), "unbindService() intent == null");
        }
        l85.l1.a(53L, 1L, false);
    }

    @Override // l85.n0
    public void og(final android.content.Intent intent, final l85.j0 j0Var) {
        com.tencent.mm.service.CommonProcessService commonProcessService = this.f317120d;
        if (intent != null) {
            com.tencent.mm.service.CommonProcessService.a(commonProcessService, java.lang.Boolean.valueOf(intent.getBooleanExtra("isTreadPool", false)), new java.lang.Runnable() { // from class: l85.a$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.service.CommonProcessService commonProcessService2 = l85.a.this.f317120d;
                    java.lang.ClassLoader classLoader = com.tencent.mm.service.CommonProcessService.class.getClassLoader();
                    android.content.Intent intent2 = intent;
                    intent2.setExtrasClassLoader(classLoader);
                    java.lang.String stringExtra = intent2.getStringExtra("class_name");
                    try {
                        android.os.IBinder a17 = com.tencent.mm.service.CommonProcessService.b(commonProcessService2, stringExtra).a(intent2, "bind");
                        l85.j0 j0Var2 = j0Var;
                        if (j0Var2 != null) {
                            try {
                                j0Var2.bd(a17);
                            } catch (android.os.RemoteException e17) {
                                com.tencent.mars.xlog.Log.i(commonProcessService2.c(), "bindService() immserviceConnectionStubAIDL RemoteException: %s", e17.getMessage());
                            }
                        }
                        l85.l1.a(39L, 1L, false);
                        com.tencent.mars.xlog.Log.i(commonProcessService2.c(), "bindService() class_name = %s", stringExtra);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.i(commonProcessService2.c(), "bindService()  Class.forName(%s) Exception: %s", stringExtra, e18.getMessage());
                    }
                }
            });
        } else {
            com.tencent.mars.xlog.Log.i(commonProcessService.c(), "bindService() intent == null");
        }
        l85.l1.a(38L, 1L, false);
    }

    @Override // l85.n0
    public void startService(final android.content.Intent intent) {
        com.tencent.mm.service.CommonProcessService commonProcessService = this.f317120d;
        if (intent != null) {
            com.tencent.mm.service.CommonProcessService.a(commonProcessService, java.lang.Boolean.valueOf(intent.getBooleanExtra("isTreadPool", false)), new java.lang.Runnable() { // from class: l85.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.service.CommonProcessService commonProcessService2 = l85.a.this.f317120d;
                    java.lang.ClassLoader classLoader = com.tencent.mm.service.CommonProcessService.class.getClassLoader();
                    android.content.Intent intent2 = intent;
                    intent2.setExtrasClassLoader(classLoader);
                    java.lang.String stringExtra = intent2.getStringExtra("class_name");
                    try {
                        com.tencent.mm.service.CommonProcessService.b(commonProcessService2, stringExtra).a(intent2, "start");
                        l85.l1.a(8L, 1L, false);
                        com.tencent.mars.xlog.Log.i(commonProcessService2.c(), "startService() class_name = %s", stringExtra);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.i(commonProcessService2.c(), "startService()  Class.forName(%s) Exception: %s", stringExtra, e17.getMessage());
                    }
                }
            });
        } else {
            com.tencent.mars.xlog.Log.i(commonProcessService.c(), "startService() intent == null");
        }
        l85.l1.a(7L, 1L, false);
    }

    @Override // l85.n0
    public void stopService(final android.content.Intent intent) {
        com.tencent.mm.service.CommonProcessService commonProcessService = this.f317120d;
        if (intent != null) {
            com.tencent.mm.service.CommonProcessService.a(commonProcessService, java.lang.Boolean.valueOf(intent.getBooleanExtra("isTreadPool", false)), new java.lang.Runnable() { // from class: l85.a$$b
                @Override // java.lang.Runnable
                public final void run() {
                    l85.a aVar = l85.a.this;
                    aVar.getClass();
                    java.lang.ClassLoader classLoader = com.tencent.mm.service.CommonProcessService.class.getClassLoader();
                    android.content.Intent intent2 = intent;
                    intent2.setExtrasClassLoader(classLoader);
                    java.lang.String stringExtra = intent2.getStringExtra("class_name");
                    com.tencent.mm.service.MMService mMService = (com.tencent.mm.service.MMService) com.tencent.mm.service.CommonProcessService.f193198g.get(stringExtra);
                    if (mMService != null) {
                        mMService.a(intent2, "stop");
                        l85.l1.a(24L, 1L, false);
                    }
                    com.tencent.mars.xlog.Log.i(aVar.f317120d.c(), "stopService() class_name = %s", stringExtra);
                }
            });
        } else {
            com.tencent.mars.xlog.Log.i(commonProcessService.c(), "stopService() intent == null");
        }
        l85.l1.a(23L, 1L, false);
    }
}
