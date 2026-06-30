package vn1;

/* loaded from: classes7.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vn1.m f438203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(vn1.m mVar) {
        super(0);
        this.f438203d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f438203d.f438213a.getSystemService("bluetooth");
        if (systemService instanceof android.bluetooth.BluetoothManager) {
            return (android.bluetooth.BluetoothManager) systemService;
        }
        return null;
    }
}
