package db5;

/* loaded from: classes11.dex */
public class w6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.x6 f228563e;

    public w6(db5.x6 x6Var, java.lang.String str) {
        this.f228563e = x6Var;
        this.f228562d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.x6 x6Var = this.f228563e;
        x6Var.f228573f.F.setText("");
        x6Var.f228573f.F.append(this.f228562d);
    }
}
