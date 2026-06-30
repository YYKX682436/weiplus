package u52;

/* loaded from: classes13.dex */
public final class a implements yj0.b {
    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        if (obj != null) {
            if (((obj instanceof android.app.Activity) || (obj instanceof androidx.fragment.app.Fragment) || (obj instanceof android.app.Fragment)) && objArr != null && objArr.length >= 2) {
                java.lang.Object obj2 = objArr[1];
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((java.lang.Integer) obj2).intValue();
                u52.b.f424795a = intValue;
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.PermissionMonitor", "PermissionListener, args: %d", java.lang.Integer.valueOf(intValue));
                u52.b.f424797c = true;
            }
        }
    }
}
