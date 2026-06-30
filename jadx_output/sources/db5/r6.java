package db5;

/* loaded from: classes11.dex */
public class r6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f228493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.s6 f228494e;

    public r6(db5.s6 s6Var, android.view.View view) {
        this.f228494e = s6Var;
        this.f228493d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f228494e.f228506d.C.f(((android.widget.TextView) this.f228493d).getText().toString());
    }
}
