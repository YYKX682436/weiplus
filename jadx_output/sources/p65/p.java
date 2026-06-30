package p65;

/* loaded from: classes12.dex */
public class p implements com.tencent.shadow.dynamic.host.IHostOpenedFdCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p65.s f352448a;

    public p(p65.s sVar) {
        this.f352448a = sVar;
    }

    @Override // com.tencent.shadow.dynamic.host.IHostOpenedFdCallback
    public void handleFds(java.util.Map map) {
        p65.s sVar = this.f352448a;
        sVar.f352453f.putAll(map);
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) sVar.f352453f.get("javaDump");
        java.util.Objects.requireNonNull(parcelFileDescriptor);
        android.os.ParcelFileDescriptor parcelFileDescriptor2 = (android.os.ParcelFileDescriptor) sVar.f352453f.get("nativeDump");
        java.util.Objects.requireNonNull(parcelFileDescriptor2);
        com.tencent.mm.app.s4.b(com.tencent.mm.sdk.platformtools.x2.f193071a, parcelFileDescriptor, parcelFileDescriptor2);
    }
}
