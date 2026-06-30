package vn1;

/* loaded from: classes7.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vn1.m f438202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vn1.m mVar) {
        super(0);
        this.f438202d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.bluetooth.BluetoothAdapter e17 = this.f438202d.e();
        if (e17 != null) {
            return e17.getBluetoothLeScanner();
        }
        return null;
    }
}
