package zm5;

/* loaded from: classes3.dex */
public final class v implements sy3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f474275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zm5.f0 f474276b;

    public v(androidx.appcompat.app.AppCompatActivity appCompatActivity, zm5.f0 f0Var) {
        this.f474275a = appCompatActivity;
        this.f474276b = f0Var;
    }

    @Override // sy3.e
    public void a(android.content.DialogInterface dialogInterface) {
    }

    @Override // sy3.e
    public void b(android.content.DialogInterface dialogInterface) {
        androidx.appcompat.app.AppCompatActivity activity = this.f474275a;
        kotlin.jvm.internal.o.g(activity, "activity");
        zm5.l lVar = (zm5.l) pf5.z.f353948a.a(activity).a(zm5.l.class);
        lVar.f474240n = true;
        com.tencent.mm.ui.base.MMViewPager mMViewPager = lVar.f474234e;
        if (mMViewPager != null) {
            mMViewPager.setEnableGalleryScale(true);
            mMViewPager.setSingleMode(false);
        }
    }

    @Override // sy3.e
    public void c(long j17) {
        androidx.appcompat.app.AppCompatActivity activity = this.f474275a;
        kotlin.jvm.internal.o.g(activity, "activity");
        zm5.l lVar = (zm5.l) pf5.z.f353948a.a(activity).a(zm5.l.class);
        lVar.f474240n = false;
        com.tencent.mm.ui.base.MMViewPager mMViewPager = lVar.f474234e;
        if (mMViewPager != null) {
            mMViewPager.setEnableGalleryScale(false);
            mMViewPager.setSingleMode(true);
        }
    }

    @Override // sy3.e
    public void d(android.content.DialogInterface dialogInterface) {
        zm5.f0 f0Var = this.f474276b;
        f0Var.U6();
        f0Var.f474216r = zm5.x0.f474286d;
    }

    @Override // sy3.e
    public void onError(int i17, int i18) {
        zm5.f0 f0Var = this.f474276b;
        f0Var.U6();
        f0Var.f474216r = zm5.x0.f474286d;
        androidx.appcompat.app.AppCompatActivity activity = this.f474275a;
        kotlin.jvm.internal.o.g(activity, "activity");
        zm5.l lVar = (zm5.l) pf5.z.f353948a.a(activity).a(zm5.l.class);
        lVar.f474240n = true;
        com.tencent.mm.ui.base.MMViewPager mMViewPager = lVar.f474234e;
        if (mMViewPager != null) {
            mMViewPager.setEnableGalleryScale(true);
            mMViewPager.setSingleMode(false);
        }
    }
}
