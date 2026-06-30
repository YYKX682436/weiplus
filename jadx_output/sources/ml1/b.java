package ml1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f327190a = new ml1.a(this, android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public volatile ml1.d f327191b;

    public void a(java.lang.CharSequence charSequence, boolean z17) {
        if (charSequence == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f327190a;
        android.os.Message obtainMessage = n3Var.obtainMessage(1000, android.text.Selection.getSelectionEnd(charSequence), 0, charSequence.toString());
        n3Var.removeMessages(1000);
        n3Var.sendMessageDelayed(obtainMessage, z17 ? 150L : 0L);
    }
}
