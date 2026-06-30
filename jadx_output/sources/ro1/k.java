package ro1;

/* loaded from: classes5.dex */
public final class k implements ro1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ro1.h f397987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ po1.d f397988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397989c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f397991e;

    public k(ro1.h hVar, po1.d dVar, java.lang.String str, java.lang.String str2, com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity) {
        this.f397987a = hVar;
        this.f397988b = dVar;
        this.f397989c = str;
        this.f397990d = str2;
        this.f397991e = mMFragmentActivity;
    }

    @Override // ro1.h
    public void a(java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        this.f397987a.a(deviceId);
    }

    @Override // ro1.h
    public void onFailed(int i17) {
        po1.d dVar = this.f397988b;
        dVar.d(this.f397989c);
        java.lang.String str = this.f397990d;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        dVar.f357301g = str;
        com.tencent.mars.xlog.Log.w("UDiskDeviceManager", "[addUDiskDevice] Fail to add direct access disk, rollback and try SAF mode again. device=" + dVar);
        com.tencent.mm.ui.MMFragmentActivity activity = this.f397991e;
        kotlin.jvm.internal.o.g(activity, "activity");
        ro1.h callback = this.f397987a;
        kotlin.jvm.internal.o.g(callback, "callback");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI.class);
        intent.putExtra("deviceInfo", dVar.c());
        ((com.tencent.mm.ui.bd) activity.startActivityForResult(intent)).f197877a = new to1.e(callback);
    }
}
