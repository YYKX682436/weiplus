package db5;

/* loaded from: classes11.dex */
public class p6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f228466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.s6 f228467e;

    public p6(db5.s6 s6Var, android.view.View view) {
        this.f228467e = s6Var;
        this.f228466d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f228467e.f228506d.C.h(((android.widget.TextView) this.f228466d).getText().toString());
    }
}
