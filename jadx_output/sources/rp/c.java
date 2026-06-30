package rp;

/* loaded from: classes12.dex */
public class c implements com.tencent.nativecrash.NativeCrash.CrashCallback {

    /* renamed from: b, reason: collision with root package name */
    public static android.os.ParcelFileDescriptor f398327b;

    /* renamed from: a, reason: collision with root package name */
    public volatile rp.g f398328a = null;

    public c(rp.a aVar) {
        com.tencent.nativecrash.NativeCrash.init(new android.os.ParcelFileDescriptor[]{f398327b}, 1871, 0);
        com.tencent.nativecrash.NativeCrash.resetCustomInfo();
        com.tencent.nativecrash.NativeCrash.customInfo("Client Version: " + com.tencent.mm.sdk.platformtools.z.f193111g);
        com.tencent.nativecrash.NativeCrash.customInfo("Base Version: " + lp0.a.f320249c);
        com.tencent.nativecrash.NativeCrash.crashCallback(this);
    }

    @Override // com.tencent.nativecrash.NativeCrash.CrashCallback
    public boolean onCrashDumped(int i17, java.lang.String str, java.lang.String str2) {
        if (this.f398328a != null) {
            rp.f fVar = new rp.f();
            fVar.f398329a = 0;
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            fVar.f398330b = "isolated process cannot read crash dump file.";
            this.f398328a.a(fVar);
        }
        return false;
    }
}
