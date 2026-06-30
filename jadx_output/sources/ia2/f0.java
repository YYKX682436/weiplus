package ia2;

/* loaded from: classes2.dex */
public final class f0 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f289920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f289921b;

    public f0(androidx.appcompat.app.AppCompatActivity appCompatActivity, android.content.Intent intent) {
        this.f289920a = appCompatActivity;
        this.f289921b = intent;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    public void onSuccess() {
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Xk(this.f289920a, this.f289921b);
    }
}
