package db5;

/* loaded from: classes11.dex */
public class q6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f228479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.s6 f228480e;

    public q6(db5.s6 s6Var, android.view.View view) {
        this.f228480e = s6Var;
        this.f228479d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f228480e.f228506d.C.f(((android.widget.TextView) this.f228479d).getText().toString());
    }
}
