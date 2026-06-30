package vn1;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vn1.m f438200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vn1.m mVar) {
        super(0);
        this.f438200d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) ((jz5.n) this.f438200d.f438217e).getValue();
        if (bluetoothManager != null) {
            return bluetoothManager.getAdapter();
        }
        return null;
    }
}
