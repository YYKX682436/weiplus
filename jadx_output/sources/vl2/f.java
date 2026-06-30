package vl2;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final vl2.e f437813c = new vl2.e(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f437814a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f437815b;

    public f(java.lang.String str, jz5.l lVar, java.util.HashMap hashMap, vl2.g gVar, boolean z17, kotlin.jvm.internal.i iVar) {
        this.f437814a = str;
        this.f437815b = z17;
    }

    public final boolean a(com.tencent.wechat.aff.udr.x xVar) {
        com.tencent.mars.xlog.Log.i("LiveUdrResource", "checkInnerVersion " + this);
        com.tencent.mars.xlog.Log.i("LiveUdrResource", "checkInnerVersion true");
        return true;
    }

    public java.lang.String toString() {
        return "resourceName:" + this.f437814a + ", isNeedUnZip: " + this.f437815b + "， innerVersion:null, params:" + ((java.lang.String) null);
    }
}
