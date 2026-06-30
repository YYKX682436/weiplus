package ic;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f290281k = 0;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f290282a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f290283b;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.cloud.huiyan.callback.HuiYanSdkEventCallBack f290287f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.cloud.huiyan.callback.HuiYanSdkCallBack f290288g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.cloud.huiyan.entity.HuiYanSdkConfig f290290i;

    /* renamed from: j, reason: collision with root package name */
    public volatile pc.p f290291j;

    /* renamed from: c, reason: collision with root package name */
    public boolean f290284c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f290285d = false;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent f290286e = com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NONE;

    /* renamed from: h, reason: collision with root package name */
    public boolean f290289h = false;

    static {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("huiyanandroidsdk");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/cloud/huiyan/api/c", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/cloud/huiyan/api/c", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (java.lang.Throwable unused) {
        }
    }

    public final android.content.Context a() {
        java.lang.ref.WeakReference weakReference = this.f290282a;
        if (weakReference == null) {
            return null;
        }
        return (android.content.Context) weakReference.get();
    }

    public final void b(int i17, java.lang.String str) {
        this.f290285d = true;
        mc.q qVar = mc.p.f325531a;
        qVar.b("HuiYanBaseApi", "releaseLivenessSDK!");
        com.tencent.cloud.huiyan.api.HuiYanNativeApi.releaseYtLiveness();
        qVar.e("HuiYanBaseApi", "huiyan failed, code: " + i17 + " msg:" + str);
        if (this.f290288g != null) {
            if (qVar.f325535d != null && qVar.f325537f != null) {
                android.os.Message obtainMessage = qVar.f325537f.obtainMessage();
                obtainMessage.what = 2;
                qVar.f325537f.sendMessage(obtainMessage);
            }
            this.f290288g.onFail(i17, str);
        } else {
            qVar.e("HuiYanBaseApi", "sdk cb2 is null!");
        }
        qVar.e("HuiYanBaseApi", "sdk cb4 is null!");
        qVar.b("HuiYanBaseApi", "after doOnFail call releaseCallBack!");
        f();
        qVar.b("HuiYanBaseApi", "closeCurrentCheckIsHaveResultPage!");
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = this.f290290i;
        if (huiYanSdkConfig == null) {
            qVar.b("HuiYanBaseApi", "want closeCurrentUi!");
            pc.f.b();
        } else {
            if (huiYanSdkConfig.isHaveResultFragment()) {
                return;
            }
            qVar.b("HuiYanBaseApi", "isHaveResultFragment close ui!");
            qVar.b("HuiYanBaseApi", "want closeCurrentUi!");
            pc.f.b();
        }
    }

    public final void c(com.tencent.cloud.huiyan.enums.HuiYanAuthEvent huiYanAuthEvent) {
        com.tencent.cloud.huiyan.callback.HuiYanSdkEventCallBack huiYanSdkEventCallBack = this.f290287f;
        if (huiYanSdkEventCallBack != null) {
            huiYanSdkEventCallBack.onAuthEvent(huiYanAuthEvent);
        }
    }

    public final void d(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent huiYanAuthTipsEvent, boolean z17) {
        java.util.HashMap hashMap;
        int intValue;
        if (huiYanAuthTipsEvent == null || huiYanAuthTipsEvent == com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NONE) {
            return;
        }
        if (z17) {
            if (this.f290286e == huiYanAuthTipsEvent) {
                return;
            } else {
                this.f290286e = huiYanAuthTipsEvent;
            }
        }
        com.tencent.cloud.huiyan.callback.HuiYanSdkEventCallBack huiYanSdkEventCallBack = this.f290287f;
        if (huiYanSdkEventCallBack != null) {
            huiYanSdkEventCallBack.onAuthTipsEvent(huiYanAuthTipsEvent);
        }
        if (this.f290291j != null) {
            pc.r rVar = (pc.r) this.f290291j;
            rVar.getClass();
            com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = ic.c.f290280a.f290290i;
            if (huiYanSdkConfig == null ? false : huiYanSdkConfig.isOpenAudio()) {
                if (rVar.f353223a == null || (hashMap = rVar.f353224b) == null) {
                    mc.p.f325531a.b("SoundPoolHelper", "soundPool or eventIdWithResMap is null");
                } else if (hashMap.containsKey(huiYanAuthTipsEvent) && (intValue = ((java.lang.Integer) rVar.f353224b.get(huiYanAuthTipsEvent)).intValue()) != rVar.f353225c) {
                    rVar.f353225c = intValue;
                    com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil.getInstance().addWork(new pc.q(rVar, intValue));
                }
            }
        }
    }

    public final com.tencent.cloud.huiyan.entity.AuthUiConfig e() {
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = this.f290290i;
        if (huiYanSdkConfig != null) {
            return huiYanSdkConfig.getAuthUiConfig();
        }
        mc.p.f325531a.e("HuiYanBaseApi", "huiYanSdkConfig is null!");
        return null;
    }

    public final void f() {
        if (this.f290288g != null) {
            this.f290288g = null;
        }
        this.f290285d = true;
        this.f290286e = com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NONE;
        com.tencent.cloud.huiyan.api.HuiYanNativeApi.releaseYtLiveness();
        if (this.f290291j == null) {
            mc.p.f325531a.e("HuiYanBaseApi", "soundPlayInterface is null!");
            return;
        }
        pc.r rVar = (pc.r) this.f290291j;
        rVar.getClass();
        mc.p.f325531a.b("SoundPoolHelper", "call release");
        android.media.SoundPool soundPool = rVar.f353223a;
        if (soundPool != null) {
            soundPool.release();
            rVar.f353223a = null;
        }
        rVar.f353225c = -1;
    }
}
