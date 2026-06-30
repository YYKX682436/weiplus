package mz4;

/* loaded from: classes10.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f333324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333325e;

    public p(mz4.s sVar, android.content.Context context, java.lang.String str) {
        this.f333324d = context;
        this.f333325e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.makeText(this.f333324d, this.f333325e, 0).show();
    }
}
