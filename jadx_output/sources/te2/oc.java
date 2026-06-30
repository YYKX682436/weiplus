package te2;

/* loaded from: classes7.dex */
public final class oc implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f418284a;

    public oc(yz5.l lVar) {
        this.f418284a = lVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        yz5.l lVar = this.f418284a;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(num != null && num.intValue() == 0));
        }
    }
}
