package ky2;

/* loaded from: classes.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f313565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f313567f;

    public n(android.widget.EditText editText, ky2.w wVar, int i17) {
        this.f313565d = editText;
        this.f313566e = wVar;
        this.f313567f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f313567f;
        ky2.w wVar = this.f313566e;
        android.widget.EditText editText = this.f313565d;
        editText.postDelayed(new ky2.m(i17, wVar, editText), 300L);
        wVar.getClass();
    }
}
