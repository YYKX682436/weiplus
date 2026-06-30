package tn4;

/* loaded from: classes11.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f420835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f420836e;

    public m(tn4.o oVar, r45.mm6 mm6Var, android.content.Context context) {
        this.f420835d = mm6Var;
        this.f420836e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.mm6 mm6Var = this.f420835d;
        if (mm6Var != null) {
            int i17 = mm6Var.f380681t;
            if ((i17 == 4 || i17 == 3) && com.tencent.mm.vfs.w6.j(mm6Var.f380669e) && uk.b.a(this.f420835d.f380669e) && c83.e.n(this.f420835d.f380669e)) {
                ((ku5.t0) ku5.t0.f312615d).B(new tn4.l(this));
            }
        }
    }
}
