package yk3;

/* loaded from: classes8.dex */
public final class e implements kk3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yk3.i f462818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f462819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.fr4 f462820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f462821d;

    public e(yk3.i iVar, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, r45.fr4 fr4Var, android.view.View view) {
        this.f462818a = iVar;
        this.f462819b = multiTaskInfo;
        this.f462820c = fr4Var;
        this.f462821d = view;
    }

    @Override // kk3.d
    public void b(android.graphics.Bitmap bitmap, int i17) {
        ((ku5.t0) ku5.t0.f312615d).B(new yk3.d(this.f462818a, this.f462819b, this.f462820c, this.f462821d));
    }

    @Override // kk3.d
    public void d(android.graphics.Bitmap bitmap, boolean z17, int i17) {
    }

    @Override // kk3.d
    public void e(int i17) {
        ((ku5.t0) ku5.t0.f312615d).B(new yk3.c(this.f462818a, this.f462819b, this.f462820c, this.f462821d));
    }
}
