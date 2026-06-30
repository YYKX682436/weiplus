package ky2;

/* loaded from: classes.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f313572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313573e;

    public p(android.widget.EditText editText, ky2.w wVar) {
        this.f313572d = editText;
        this.f313573e = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f313572d.requestFocus();
        this.f313573e.f313591n = false;
    }
}
